//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;
import java.util.Map;
import java.util.HashMap;

public class SyntaxChecker
{
	private String exp;

	public SyntaxChecker()
	{
      setExpression("{}");
	}

	public SyntaxChecker(String s)
	{
      setExpression(s);
	}
	
	public void setExpression(String s)
	{
      exp = s;
	}

	public boolean checkExpression()
	{
      //You can change this to a stack of Strings if you prefer.
   	Stack<String> symbols = new Stack<>();
      Map<String, String> map = new HashMap<String, String>();
      map.put("{","}");
      map.put("(",")");
      map.put("[","]");
      for(int i = 0; i < exp.length(); i++) {
         String curr = exp.substring(i,i+1);
         if(map.containsKey(curr))
            symbols.push(curr);
         else if(map.containsValue(curr)) {
            if(symbols.isEmpty())
               return false;
            else if(!map.get(symbols.pop()).equals(curr))
               return false;
         }
      }
      if(symbols.size() != 0)
         return false;
		return true;
	}
   
   public String toString() {
      return String.format("%s is %scorrect.", exp, checkExpression() ? "" : "in");
   }
      	//write a toString method
}