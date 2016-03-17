
public class Lauatelefon extends Telefon {

	private String _asukoht;
		
	Lauatelefon(String number, String helin, String asukoht) {
		super(number, helin);
		_asukoht = asukoht;
	}

	@Override
	public String tähtisInfo() {
		return _asukoht;
	}
	
	@Override
	public String toString()
	{
		return "Lauatelefon numbriga "+super.getNumber()+", helin: "+super.getHelin()+", asukoht: "+tähtisInfo();
	}

}
