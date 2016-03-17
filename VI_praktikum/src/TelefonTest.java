import java.util.Arrays;

public class TelefonTest {

	public static void main(String[] args) 
	{
		Lauatelefon laua1 = new Lauatelefon("61894714", "Hit Me Baby One More Time", "Tallinn");
		Lauatelefon laua2 = new Lauatelefon("6308694", "What Do You Mean?", "Tartu");
		
		Mobiiltelefon mobla1 = new Mobiiltelefon("5079248", "Cowboys from Hell", "Phil Anselmo", true);
		Mobiiltelefon mobla2 = new Mobiiltelefon("5378492", "My Little Pony avalaul", "Fag Ott", false);
		
		Telefon[] telod = {laua1, laua2, mobla1, mobla2};
		Arrays.sort(telod);
		for (Telefon telo : telod) {System.out.println(telo);}

	}

}
