import java.util.Random;

public class MonMain {

	public static void main(String[] args) {
		
		Straten straten = new Straten();
		Straten jordaan = new Straten();
		
		Stad amsterdam = new Stad();
		amsterdam.naamStad = "Amsterdam";
		
		Stad rotterdam = new Stad();
		rotterdam.naamStad = "Rotterdam";
		
		Stad utrecht = new Stad();
		utrecht.naamStad = "Utrecht";
				
		Spel spel = new Spel();
		
		
		spel.bord.add(amsterdam.naamStad + ": " + amsterdam.straatnamen[0] + " (€" + straten.getPrijs(20) + ")");
		spel.bord.add(amsterdam.naamStad + ": " + amsterdam.straatnamen[1] + " (€" + straten.getPrijs(20) + ")");
		spel.bord.add(amsterdam.naamStad + ": " + amsterdam.straatnamen[2] + " (€" + straten.getPrijs(50) + ")");
		spel.bord.add(rotterdam.naamStad + ": " + rotterdam.straatnamen[0] + " (€" + rotterdam.getPrijs(20) + ")");
		spel.bord.add(rotterdam.naamStad + ": " + rotterdam.straatnamen[1] + " (€" + straten.getPrijs(30) + ")");
		spel.bord.add(rotterdam.naamStad + ": " + rotterdam.straatnamen[2] + " (€" + straten.getPrijs(50) + ")");
		spel.bord.add(utrecht.naamStad + ": " + utrecht.straatnamen[0] + " (€" + straten.getPrijs(20) + ")");
		spel.bord.add(utrecht.naamStad + ": " + utrecht.straatnamen[1] + " (€" + straten.getPrijs(30) + ")");
		spel.bord.add(utrecht.naamStad + ": " + utrecht.straatnamen[2] + " (€" + straten.getPrijs(50) + ")");
		
		
		System.out.println(spel.bord.get(0));
		System.out.println(spel.startPos);
		
		spel.starten();
	
		/*
		Stad amsterdam = new Stad();
		Straten dorpsstraat = new Straten();
		amsterdam.naamStad = "Amsterdam";
		amsterdam.straten.add(dorpsstraat.Dorpsstraat("Dorpsstraat", 20));
		
		dorpsstraat.prijsStraat = 20;
		System.out.println(dorpsstraat.prijsStraat);
		
		dorpsstraat.
		*/
		/*
		Stad rotterdam = new Stad();
		rotterdam.naamStad = "Rotterdam";
		rotterdam.straten.add("Dorpsstraat");
		rotterdam.straten.add("Stationsstraat"); 
		System.out.println(rotterdam.naamStad + " heeft de volgende straten: " + rotterdam.straten.get(1));
		
		Stad utrecht = new Stad();
		utrecht.naamStad = "Utrecht";
		utrecht.straten.add("Dorpsstraat");
		System.out.println(utrecht.naamStad+ " heeft ook een " + utrecht.straten.get(0));
		Spel spel = new Spel();
		spel.starten();
		*/
	}
	
	
}
