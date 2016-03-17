
public class McDonaldsiLihtpersonal extends McDonaldsiPersonal {
	
	protected String[] läbitudKoolitused;
		public String[] getLäbitudKoolitused() 
	{ 
		return läbitudKoolitused; 
	}

	public McDonaldsiLihtpersonal(String n, int a, int v) {
		super(n, a, v);
		läbitudKoolitused = new String[a];
	}
	
	public void teeKoolitust(String koolituseNimi, McDonaldsiPersonal instruktor) 
	{
		for(int i = 0; i<läbitudKoolitused.length; i++)
		{
			if (läbitudKoolitused[i]==null)
			{
				if (instruktor.onTööl) 
				{
					if(instruktor.tööstaaž > tööstaaž)
					{
						läbitudKoolitused[i] = koolituseNimi;
						System.out.println(nimi+" sai koolituse "+koolituseNimi+" instruktorilt "+instruktor.nimi);
						break;
					}
					else 
					{
						System.out.println("Töötaja "+instruktor.nimi+" ei sobi "+nimi+"-le instruktoriks, ta on "+nimi+"-st vähem töötanud");
						break;
					}
				}
				else 
				{
					System.out.println("Töötaja "+instruktor.nimi+" ei sobi "+nimi+"-le instruktoriks, sest teda pole töölgi");
					break;
				}
			}
			else if (läbitudKoolitused[i]!=null && i == läbitudKoolitused.length-1)
			{
				System.out.println("Töötajat "+nimi+" ei saa sel aastal rohkem koolitada");
			}
		}	
	}


}
