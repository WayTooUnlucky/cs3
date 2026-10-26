// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package BlackJack;

public class BlackJackCard extends Card
{
  	//constructors
   public BlackJackCard(int num, String sym) {
      super(num, sym);
   }

  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
      int value = -1;
      for(int i = 0; i < FACES.length; i++)
         if(FACES[i].equals(getFace())) {
            value = i;
            break;
         }
      return value;
		
  	}
  	
 }