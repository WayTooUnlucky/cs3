//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Part implements Comparable<Part>
{
	private String make, mode, part;
	private int partNumber, year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
      part = list[0];
      int i = 1;
      for( ; i < list.length; )
         if(Character.isDigit(list[i].charAt(0)))
            break;
         else
            part += " " + list[i++];
      partNumber = Integer.parseInt(list[i++]);
      make = list[i++];
      mode = list[i++];
      year = Integer.parseInt(list[i++]);
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part other )
	{
      int comp = 0;
         comp = make.compareTo(other.make);
      if(comp == 0)
         comp = mode.compareTo(other.mode);
      if(comp == 0)
         comp = year - other.year;
      if(comp == 0)
         comp = part.compareTo(other.part);
		return comp;
	}

	public String toString()
	{
		return String.format("%s %s %d  %s %d", make, mode, year, part, partNumber);
	}
}