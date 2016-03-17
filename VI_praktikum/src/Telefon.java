
public abstract class Telefon implements Comparable<Telefon> 
{
	private String _number;
	
	public String getNumber() 
	{
		return _number;
	}
	
	private String _helin;
	
	public String getHelin() 
	{
		return _helin;
	}
	
	public abstract String tähtisInfo();
	
	Telefon(String number, String helin)
	{
		_number = number;
		_helin = helin;
	}
	
	public String viimasedNumbrid(int n)
	{
		if(n<_number.length())
		{
			return _number.substring(_number.length()-n);
		}
		else return null;
	}
	
	public int compareTo(Telefon telefon)
	{
		if(Integer.parseInt(viimasedNumbrid(3)) < Integer.parseInt(telefon.viimasedNumbrid(3))) return -1;
		
		else if(Integer.parseInt(viimasedNumbrid(3)) > Integer.parseInt(telefon.viimasedNumbrid(3))) return 1;
		
		else return 0;
		
	}
}
