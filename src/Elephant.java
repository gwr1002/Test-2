
public class Elephant {
	
	//atttributes
	private String trunk;
	private int legs;
	private String ears;
	private int tusks;
	private String color;
	private boolean fly;
	
	public Elephant ()
	{
		trunk = "Medium";
		legs = 4;
		ears = "Large";
		tusks = 0;
		color = "Gray";
		fly = false;
	}
	
	public Elephant (String colorVal)
	{
		trunk = "Medium";
		legs = 4;
		ears = "Large";
		tusks = 0;
		color = colorVal;
		fly = false;
	}
	
	
	
	public void setTrunk(String trunkVal)
	{
		trunk = trunkVal;
	}
	
	public String getTrunk()
	{
		return trunk;
	}
	
	
	public void setLegs (int noLegs)
	{
		legs = noLegs;
	}
	
	public int getLegs()
	{
		return legs;
	}
	
	public void setFly(boolean flyVal)
	{
		fly = flyVal;
	}
	
	public boolean getFly()
	{
		return fly;
	}
	
	

	
	public static void main (String [] args)
	{
		Elephant clyde = new Elephant();
		clyde.setLegs(4);
		clyde.setTrunk("Large");
		clyde.setFly(false);
		System.out.println("Clyde has " + clyde.getLegs() + " legs");
		System.out.println("Clyde has " + clyde.getTrunk() + " trunk");
		if (clyde.getFly())
		{
			System.out.println("Clyde can fly");
		}
		else
		{
			System.out.println("Clyde cannot fly");
		}
		System.out.println();
		
		Elephant brewster = new Elephant();
		brewster.setLegs(6);
		brewster.setTrunk("Medium");
		brewster.setFly(false);
		System.out.println("Brewster has " + brewster.getLegs() + " legs");
		System.out.println("Brewster has " + brewster.getTrunk() + " trunk");
		if (brewster.getFly())
		{
			System.out.println("Brewster can fly");
		}
		else
		{
			System.out.println("Brewster cannot fly");
		}
		System.out.println();
		
		Elephant dumbo = new Elephant("Pink");
		dumbo.setLegs(4);
		dumbo.setTrunk("Small");
		dumbo.setFly(true);
		System.out.println("Dumbo has " + dumbo.getLegs() + " legs");
		System.out.println("Dumbo has " + dumbo.getTrunk() + " trunk");
		if (dumbo.getFly())
		{
			System.out.println("Dumbo can fly");
		}
		else
		{
			System.out.println("Dumbo cannot fly");
		}
		
	}

}
