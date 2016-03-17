import java.util.Random;

public class McDonaldsiKokk extends McDonaldsiLihtpersonal {

	private boolean kannabPõlle;
	
	public McDonaldsiKokk(String n, int a, int v) {
		super(n, a, v);
		Random rand = new Random();
		kannabPõlle = rand.nextBoolean();
	}

	public void teeTööd() 
	{
		if(onTööl)
		{
			if (kannabPõlle) 
				System.out.println(nimi+" küpsetas 8 burgerit");
			else
				System.out.println(nimi + " ei saa midagi küpsetada, sest ta unustas põlle ette panna"); 
		}
		else super.teeTööd();
	}
	
	public void panePõllEtte()
	{
		kannabPõlle = true;
	}

}
