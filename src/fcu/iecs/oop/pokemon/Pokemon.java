package fcu.iecs.oop.pokemon;

public class Pokemon
{
	private final String name;
	private int cp;
	public Pokemon(String name,int cp)
	{
		super();
		this.name=name;
		this.cp=cp;
	}
	public String getName()
	{
		return name;
	}
	public void setCp(int cp)
	{
		this.cp=cp;
	}
	public int getCp()
	{
		return cp;
	}
	
}
