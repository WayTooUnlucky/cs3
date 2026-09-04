

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.lang.IndexOutOfBoundsException;

public class MyArrayList<T> implements Iterable<T>
{
   private T[] list;
   private int count;
	
   public MyArrayList() {
      this(10);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(int initSize) {
      list = (T[])new Object[initSize];
      count = 0;
   }
	
   public void add(T value)
   {
      add(count, value);
   }
	
   public void add(int index, T value)
   {
      if(index < 0 || index > count)
         throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
      
      //resize if needed
      if(count + 1 == list.length)
         resizeArray();
      
      //move over elements
      if(index <= count) {
         for(int i = count; i > index; i--) {
            list[i] = list[i - 1];
         }
      }
      
      //put in new element
      list[index] = value;
      count++;
   }
	
   public void clear()
   {
      for(int i = 0; i < count; i++)
         list[i] = null;
      count = 0;
   }
	
   public T get(int index) {
      return list[index];
   }
	
   public int indexOf(T value)
   {
      if(count == 0)
         return -1;
      
      for(int i = 0; i < count; i++)
         if(list[i] == value || list[i].equals(value)) //supports nulls now :D
            return i;
      return -1;
   }
	
   public boolean remove(T value)
   {
      int index = indexOf(value);
      if(index == -1)
         return false;
      removeAt(index);
      return true;
   }
	
   public boolean isEmpty() {
      return count == 0;
   }
   
   public T removeAt(int index)
   {
      if(index < 0 || index >= count)
         throw new IndexOutOfBoundsException(String.format("Index %d is out of bounds", index));

      T removed = (T)list[index];
      
      for(int i = index; i < count; i++) 
         list[i] = list[i + 1];
      
      list[count] = null;
      count--;
      return removed;
   }
	
   public void set(int index, T element) {
      if(index < 0 || index >= count)
         throw new IndexOutOfBoundsException(String.format("Index %d is out of bounds", index));
      try {
      list[index] = element;
      }
      catch (Exception e) {
         throw e;
      }
   }
	
   public int size() {
      return count;
   }
	
   public int capacity() {
      return list.length;
   }
	
   public Object[] toArray() {
      Object[] ray = new Object[count];
      for(int i = 0; i < count; i++)
         ray[i] = list[i];
      return ray;
   }
	
   @Override
   public String toString()
   {
      if(count == 0)
         return "[]";
      
      String output = "[";
      for(int i = 0; i < count - 1; i++)
         output += list[i] + ", ";
      output += list[count - 1] + "]";
      return output;
   }
	
   public Iterator<T> iterator() {
      return new LinkedListIterator();
   }
	
   private class LinkedListIterator implements Iterator<T> //check remove method (doesnt work :(((((((((((((((((((((((()
   {
      private int expectedCount;
      private int last;
      private int next;
   	
      public LinkedListIterator() {
      
         expectedCount = count;
         last = -1;
         next = 0;
      }
   	
      public boolean hasNext() {
         return next < expectedCount;
      }
   	
      public T next() {
         checkForComodification();
         last = next;
         next = next + 1;
         return list[last];
      }
   	
      public void remove() {
         checkForComodification();
         for(int i = last; i < count - 1; i++)
            list[i] = list[i + 1];
         list[count - 1] = null;
         count--;
         expectedCount--;
      }
   	
      private void checkForComodification() {
         if(expectedCount != count)
            throw new ConcurrentModificationException();
      }
   }
	
	// ****************** Private Helper Methods ********************
	
   @SuppressWarnings("unchecked")
   private void resizeArray()
   {
      T[] temp = (T[])new Object[list.length + 10];
      for (int index = 0; index < list.length; index++)
         temp[index] = list[index];
      list = temp;
   }
   
	
}