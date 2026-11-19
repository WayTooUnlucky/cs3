//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class ExpressionSolver
{
   /** Returns the result of applying the given operator 
       to the given operands. Only addition, subtraction,
       multiplication and division are supported.
       
       @throws UnsupportedOperationException if op isn't 
               a supported operator.
   **/
   private static double calc(double two, double one, String op) {
      if(op.equals("+"))
         return one + two; //pop does reverse order
      if(op.equals("-"))
         return one - two;
      if(op.equals("*"))
         return one * two;
      if(op.equals("/"))
         return one / two;
      if(op.equals("^"))
         return Math.pow(one, two);
      throw new UnsupportedOperationException();
   }
   private static double calcReverse(double two, double one, String op) {
      return calc(one, two, op);
   }

   /*** Postfix Evaluator ***/   
   public static double solvePostfix(String expression) {
      Stack<Double> stack = new Stack<>();
      Scanner scan = new Scanner(expression);
      while(scan.hasNext()) {
         String next = scan.next();
         if(isNumber(next))
            stack.push(Double.parseDouble(next));
         else
            stack.push(calc(stack.pop(), stack.pop(), next));
      }
      return stack.pop();
   } 
        
   /*** Prefix Evaluator ***/   
   public static double solvePrefix(String expression) {
      Stack<Double> stack = new Stack<>();
      String[] exp = expression.split(" ");
      for(int i = exp.length - 1; i > -1; i--) {
         if(isNumber(exp[i]))
            stack.push(Double.parseDouble(exp[i]));
         else
            stack.push(calcReverse(stack.pop(), stack.pop(), exp[i]));
      }
      return stack.pop();
   }   
   
   //This catches both kinds of exceptions
   //that parseDouble might throw.
   public static boolean isNumber(String symbol) {
      try {
         Double.parseDouble(symbol);
         return true;
      }
      catch (NullPointerException | NumberFormatException e) {
         return false;
      }
   }
}