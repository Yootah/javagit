
public class McDonaldsiPersonal 
{
	protected String nimi;
	
	protected int tööstaaž;
	
	protected int vanus; 
	
	protected boolean onTööl;
	
	public void viibutaKaarti()
	{
		if (!onTööl) 
		{ 
			onTööl = true; 
			System.out.println(nimi + " tuli tööle"); 
		}
		else
		{
			onTööl = false;
			System.out.println(nimi + " lahkus töölt"); 
		}
	}
	
	public void teeTööd() 
	{
		if (onTööl) System.out.println(nimi + " teeb mingit tööd");
		else System.out.println(nimi+" ei saa tööd teha, sest teda pole kohal");
	}
	
	public McDonaldsiPersonal(String n, int a, int v) 
	{
		nimi = n;
		tööstaaž = a;
		vanus = v;
		onTööl = false;
	}
}
