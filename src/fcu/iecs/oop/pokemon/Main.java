package fcu.iecs.oop.pokemon;

public class Main
{

	public static void main(String[] args)
	{
		Pokemon p1=new Pokemon("Psyduck",100);
		Pokemon p2=new Pokemon("Pikachu",300);
		
		System.out.println(p1.getName()+"'s Cp is "+p1.getCp());
		System.out.println(p2.getName()+"'s Cp is "+p2.getCp());
		
		GYM.fight(p1, p2);
		
		System.out.println(p1.getName()+"'s Cp is "+p1.getCp());
		System.out.println(p2.getName()+"'s Cp is "+p2.getCp());
		
	}

}
