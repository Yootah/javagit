import java.util.ArrayList;

public class Raadiosaatja 
{
	protected ArrayList<RaadioKuulaja> kuulajad;
	
	Raadiosaatja()
	{
		kuulajad = new ArrayList<RaadioKuulaja>();
	}
	
	void lisaKuulaja(RaadioKuulaja kuulaja) 
	{
		kuulajad.add(kuulaja);
	}
	
	void edasta(String saade) 
	{
		kuulajad.forEach(x -> x.kuula(saade));
	}
}
