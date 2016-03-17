
public class McDonalds {

	/*Klassihierarhia (ülem <----- alam): 
	 	Objekt <----- McDonaldsiPersonal <------ McDonaldsiLihtpersonal <------ McDonaldsiKokk
	*/ 
	public static void main(String[] args) {

		McDonaldsiLihtpersonal lihttööline_kokk = new McDonaldsiKokk("Peeter Parukas", 5, 23);
		McDonaldsiLihtpersonal spetsialiseerumata_lihttööline = new McDonaldsiLihtpersonal("Paulo Julio Antonio Andreas Alejandro de la Barcelona Fernando Roberto Jose Rodriguez y Torres", 1, 19);
		McDonaldsiPersonal ebamäärase_rolliga_tööline = new McDonaldsiPersonal("Marta Martini", 10, 35); 		
		
		System.out.println();
		
		//Pärilus: spetsialiseerimata lihttööline ja kokk viibutavad kaarti täpselt nagu iga (üldine/määramata) tööline
		lihttööline_kokk.viibutaKaarti();
		spetsialiseerumata_lihttööline.viibutaKaarti();
		
		System.out.println();
		
		//Meetodite ülekatmine: kokk teeb teistsugust tööd kui spetsialiseerumata või määramata rolliga töölised 
		lihttööline_kokk.teeTööd();
		spetsialiseerumata_lihttööline.teeTööd();
		
		System.out.println();
		
		//Polümorfism: kõik töölised võivad proovida olla instruktoriks... iseasi kas nad selleks ka kvalifitseeruvad
		spetsialiseerumata_lihttööline.teeKoolitust("McDrive", ebamäärase_rolliga_tööline);
		lihttööline_kokk.teeKoolitust("koristaja", spetsialiseerumata_lihttööline);
		spetsialiseerumata_lihttööline.teeKoolitust("kokk", lihttööline_kokk);
		
		System.out.println();
		
		//Viide ülemklassi (super.teeTööd()) meetodile: kui kokka pole t��l, juhtub sama mis iga teise töölise puhul
		ebamäärase_rolliga_tööline.teeTööd();
		lihttööline_kokk.viibutaKaarti();
		lihttööline_kokk.teeTööd();
		
		
		
	}

}
