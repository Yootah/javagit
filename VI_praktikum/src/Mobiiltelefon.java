
public class Mobiiltelefon extends Telefon {

	String _omanikuNimi;
	
	boolean _saabPildistada;
	
	Mobiiltelefon(	String number, 
					String helin, 
					String omanikuNimi, 
					boolean saabPildistada) 
	{
		super(number, helin);
		_omanikuNimi = omanikuNimi;
		_saabPildistada = saabPildistada;
	}

	@Override
	public String tähtisInfo() 
	{
		return _omanikuNimi;
	}

	@Override
	public String toString()
	{
		return "Mobiiltelefon numbriga "+super.getNumber()+", helin: "+super.getHelin()+", omanik: "+tähtisInfo()+", saab pildistada: "+(_saabPildistada? "jah" : "ei");
	}
}
