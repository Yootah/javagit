
public class LotoNumbriTeataja extends Raadiosaatja {
	
	String numbrid;
	
	void loosiJaEdasta() 
	{
		numbrid = new String();
		for(int i = 0; i<10; i++) 
		{
			numbrid+=Math.round(Math.random()*100+1)+" ";
			if(i<9) numbrid+=" ";
		}
		kuulajad.forEach(x -> x.kuula(numbrid));
	}
}
