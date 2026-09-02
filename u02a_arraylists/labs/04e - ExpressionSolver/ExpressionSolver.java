//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables
   ArrayList<String> expression;
   {
      expression = new ArrayList<String>();
   }

	public ExpressionSolver(String s)
	{  setExpression(s);
	}

	public void setExpression(String s)
	{  
      
	}

	public void solveExpression()
	{
      while(expression.contains("(")) {
         String exp = "";
         int i = expression.indexOf("(");
         while(expression.contains(")")) {
            if(expression.get(i).equals("[)(]"))
               expression.remove(i);
            else
               exp += expression.remove(i);
         }
         ExpressionSolver nested = new ExpressionSolver(exp);
         nested.solveExpression();
         expression.add(i, nested.toString());
      }
      while(expression.contains("^"); {
         
      }
      while(expression.contains("[*/]")) {
         int loc = expression.indexOf("[*/]");
         int left = Integer.parseInt(expression.get(loc - 1));
         int right = Integer.parseInt(expression.get(loc + 1));
         if(expression.get(loc).equals("*"))
            multiply(loc, left, right);
         else
            divide(loc, left, right);
      }
      while(expression.contains("[+-]")) {
         int loc = expression.indexOf("[+-]");
         int left = Integer.parseInt(expression.get(loc - 1));
         int right = Integer.parseInt(expression.get(loc + 1));
         if(expression.get(loc).equals("+"))
            add(loc, left, right);
         else
            subtract(loc, left, right);
      }
	}
   
   private void multiply(int loc, int left, int right) {
      int product = left * right;
      answerHandler(loc, product);
   }
   private void divide(int loc, int left, int right) {
      int quotient = left / right;
      answerHandler(loc, quotient);
   }
   private void add(int loc, int left, int right) {
      int sum = left + right;
      answerHandler(loc, sum);
   }
   private void subtract(int loc, int left, int right) {
      int difference = left - right;
      answerHandler(loc, difference);
   }
   private void 
   private void answerHandler(int loc, int answer) {
      expression.set(loc - 1, "" + answer);
      expression.remove(loc);
      expression.remove(loc);
   }

	public String toString( )
	{
		return expression.get(0);
	}
}
