
public class ValiRaadiosaatja extends Raadiosaatja 
{
	void edasta(String saade) 
	{
		kuulajad.forEach(x -> x.kuula(saade.toUpperCase()));
	}
}
