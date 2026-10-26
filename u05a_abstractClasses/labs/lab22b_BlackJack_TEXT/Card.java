// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package BlackJack;

public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
   public Card() {
      suit = ""; 
      face = 0;
   }
   public Card(int num, String symbol) {
      setFace(num);
      setSuit(symbol);
   }
	// modifiers
   public void setSuit(String sym) {
      if(sym == null)
         throw new NullPointerException();
      suit = sym;
   }
   public void setFace(int num) {
      face = num;
   }
  	//accessors
   public String getSuit() {
      return suit;
   }
   public String getFace() {
      return FACES[face];
   }

  	public abstract int getValue();

	public boolean equals(Object obj)
	{
      if(!(obj instanceof Card))
         return false;
      Card other = (Card)obj;
      if(other.getSuit().equals(getSuit()) && other.getFace().equals(getFace()))
         return true;
		return false;
	}

  	//toString
   public String toString() {
  	   return getFace() + " of " + getSuit() + " | value = " + getValue();
   }
 }