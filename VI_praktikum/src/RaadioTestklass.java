import java.util.ArrayList;
import java.util.List;

public class RaadioTestklass {

	public static void main(String[] args) 
	{
		LotoNumbriTeataja loto = new LotoNumbriTeataja();
		ValiRaadiosaatja kisakõri = new ValiRaadiosaatja();
		UudisteRaadio uudised = new UudisteRaadio();
		
		RaadioKuulaja kuulaja1 = new RaadioKuulaja();
		RaadioKuulaja kuulaja2 = new RaadioKuulaja();
		
		HajameelneKuulaja kuulaja3 = new HajameelneKuulaja();
		HajameelneKuulaja kuulaja4 = new HajameelneKuulaja();

		loto.lisaKuulaja(kuulaja1);
		loto.lisaKuulaja(kuulaja2);
		loto.lisaKuulaja(kuulaja3);
		
		kisakõri.lisaKuulaja(kuulaja1);
		kisakõri.lisaKuulaja(kuulaja4);
		
		uudised.lisaKuulaja(kuulaja1);
		uudised.lisaKuulaja(kuulaja2);
		uudised.lisaKuulaja(kuulaja3);
		uudised.lisaKuulaja(kuulaja4);
		
		
		kisakõri.edasta("Tere, rahvas, täna me rokime!");
		loto.loosiJaEdasta();
		List<String> u = new ArrayList<String>(); 
		u.add("Täna on erakordselt fantastiline ilm");
		u.add("Eripakkumine McDonald'sis: tavaliselt maksab Big Tasty burger 5.90 €, kuid täna, AINULT TÄNA, on teil v�imalus saada see kõigest 9.99 € eest! Kiirustage! *Parapa-pa-paa*");
		u.add("Hirmus Preatados põgenes hullumajast");
		
		uudised.uuendaAktuaalsedUudised(u);
		uudised.edastaUudised();
		kisakõri.edasta("Kõik kuulsid?! Napakas Preat on jälle vabaduses!");
		
		System.out.println("Esimene kuulaja mäletab: ");
		System.out.println(kuulaja1.meenuta()+"\n");
		System.out.println("Teine kuulaja mäletab: ");
		System.out.println(kuulaja2.meenuta()+"\n");
		System.out.println("Kolmas kuulaja mäletab: ");
		System.out.println(kuulaja3.meenuta()+"\n");
		System.out.println("Neljas kuulaja mäletab: ");
		System.out.println(kuulaja4.meenuta()+"\n");
	}

}
