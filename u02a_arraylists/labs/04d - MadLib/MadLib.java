//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	//add in three ArrayList instance variables
		//1 for nouns, 1 for adjectives, and 1 for verbs
   ArrayList<String> nns;
   ArrayList<String> adj;
   ArrayList<String> vrb;	
   
   {
      nns = new ArrayList<String>();
      adj = new ArrayList<String>();
      vrb = new ArrayList<String>();
      
      try{
         loadNouns();
         loadVerbs();
         loadAdjectives();
      }
      catch(Exception e) {
         throw e;
      }
   }
	public MadLib() {};

	public MadLib(String fileName)
	{
		//load stuff
		
		try{
			Scanner file = new Scanner(new File(fileName));
         String story = "";
			while(file.hasNext()) {
            String next = file.next();
            switch (next) {
               case "#":
                  story += getRandomNoun() + " ";
                  break;
               case "@":
                  story += getRandomVerb() + " ";
                  break;
               case "&":
                  story += getRandomAdjective() + " ";
                  break;
               default:
                  story += next + " ";
                  
            }
         }
         out.println(story);
            
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{		
         Scanner scan = new Scanner(new File("nouns.dat"));
         while(scan.hasNextLine())
            nns.add(scan.nextLine());
		}
		catch(Exception e)
		{
         out.println("nouns.dat does not exist / we got a problem");
		}			
	}
	
	public void loadVerbs()
	{
		try{	
         Scanner scan = new Scanner(new File("verbs.dat"));
         while(scan.hasNextLine())
            vrb.add(scan.nextLine());
		}
		catch(Exception e)
		{
         out.println("verbs.dat does not exist / we got a problem");
		}
	}

	public void loadAdjectives()
	{
		try{	
         Scanner scan = new Scanner(new File("adjectives.dat"));
         while(scan.hasNextLine())
            adj.add(scan.nextLine());
		}
		catch(Exception e)
		{
         out.println("adjectives.dat does not exist / we got a problem");
		}
	}

	public String getRandomVerb()
	{	
		return vrb.get((int)(Math.random() * vrb.size()));
	}
	
	public String getRandomNoun()
	{		
		return nns.get((int)(Math.random() * nns.size()));
	}
	
	public String getRandomAdjective()
	{		
		return adj.get((int)(Math.random() * adj.size()));
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}
