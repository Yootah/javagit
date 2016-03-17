import java.util.List;

public class UudisteRaadio extends Raadiosaatja 
{
	private List<String> aktuaalsedUudised;
	void uuendaAktuaalsedUudised(List<String> uudised)
	{
		aktuaalsedUudised = uudised;
	}
	
	void edastaUudised()
	{
		aktuaalsedUudised.forEach(y -> kuulajad.forEach(x -> x.kuula(y)));
	}
}
