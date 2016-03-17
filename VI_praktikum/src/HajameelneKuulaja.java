
public class HajameelneKuulaja extends RaadioKuulaja 
{
	private int counter = 0;
	
	public void kuula(String saade) 
	{
		if (counter%2==0)
		{
			saated.add(saade);
		}
		counter++;
	}
}
