
public class MonMain {

	public static void main(String[] args) {

		Stad amsterdam = new Stad();
		amsterdam.naamStad = "Amsterdam";
		amsterdam.straten.add("Dorpsstraat");
		System.out.println(amsterdam.naamStad + " heeft ook een " + amsterdam.straten);
		
		Stad rotterdam = new Stad();
		rotterdam.naamStad = "Rotterdam";
		rotterdam.straten.add("Dorpsstraat");
		rotterdam.straten.add("Stationsstraat"); 
		System.out.println(rotterdam.naamStad + " heeft de volgende straten: " + rotterdam.straten);
		
		Stad utrecht = new Stad();
		utrecht.naamStad = "Utrecht";
		utrecht.straten.add("Dorpsstraat");
		System.out.println(utrecht.naamStad+ " heeft ook een " + utrecht.straten);

	}

}
