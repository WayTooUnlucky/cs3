

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
      //resize
      resizeArray();
      
      //move over elements
      if(index <= count) {
         for(int i = index; i < count; i++)
            list[i+1] = list[i];
      }
      
      //check if index is in bounds
      if(index > count)
         index = count;
      
      //put in new element
      list[index] = value;
   }
	
   public void clear()
   {
      list = (T[])new Object[10];
   }
	
   public T get(int index) {
      return (T)list[index];
   }
	
   public int indexOf(T value)
   {
      if(count == 0)
         return -1;
      
      for(int i = 0; i < count; i++)
         if(list[i] == value)
            return i;
      return -1;
   }
	
   public boolean remove(T value)
   {
      if(value == null)
         return false;
      boolean shiftUp = false;
      for(int i = 0; i < count; i++) {
         if(value.equals(list[i]))
            shiftUp = true;
         if(shiftUp && i < count - 1)
            list[i] = list[i + 1];
         if(shiftUp && i == count - 1)
            list[i] = null;
      }
      count--;
      return shiftUp;
   }
	
   public boolean isEmpty() {
      return count == 0;
   }
   
   public T removeAt(int index)
   {
      if(index < 0 || index >= count)
         throw new IndexOutOfBoundsException();
      T removed = (T)list[index];
      for(int i = index; i < count; i++)
         if(i < count - 1)
            list[i] = list[i + 1];
         else { //does this even need to be here?
            list[i] = null;
            count--;
         }
      return removed;
   }
	
   public void set(int index, T element) {
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
      String output = "[";
      for(int i = 0; i < count; i++)
         output += list[i] + ", ";
      output += "]";
      return output;
   }
	
   public Iterator<T> iterator() {
      return new LinkedListIterator();
   }
	
   private class LinkedListIterator implements Iterator<T>
   {
      private int expectedCount;
      private int last;
      private int next;
   	
      public LinkedListIterator() {
      
         expectedCount = list.length;
         last = -1;
         next = 0;
      }
   	
      public boolean hasNext() {
         return next < expectedCount;
      }
   	
      public T next() {
         checkForComodification();
         if(next + 1 > count)
            throw new NoSuchElementException();
         last = next;
         next++;
         return list[last];
      }
   	
      public void remove() {
         
      }
   	
      private void checkForComodification() {
      
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