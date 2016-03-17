import java.util.ArrayList;

public class RaadioKuulaja {

	public void kuula(String saade) 
	{
		saated.add(saade);
	}
	
	RaadioKuulaja() 
	{
		saated = new ArrayList<String>();
	}
	
	public ArrayList<String> saated;
	
	public ArrayList<String> meenuta() 
	{
		return saated;
	}
	
}
