package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM
{
	public static void fight(Pokemon p1,Pokemon p2)
	{
		Random getRandom=new Random();
		if(getRandom.nextInt(2)==0)
		{
			System.out.println("The Winner is ["+p1.getName()+"]!");
			p1.setCp(p1.getCp()+500);
		}
		else
		{
			System.out.println("The Winner is ["+p2.getName()+"]!");
			p2.setCp(p2.getCp()+500);
		}
	}
	
}
