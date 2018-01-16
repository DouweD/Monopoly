
public class MonMain {

	public static void main(String[] args) {

		Stad amsterdam = new Stad();
		amsterdam.naamStad = "Amsterdam";
		amsterdam.straten.add("Dorpsstraat");
		System.out.println(amsterdam.straten);
		
		Stad rotterdam = new Stad();
		rotterdam.naamStad = "Rotterdam";
		System.out.println(rotterdam.naamStad);
		
		Stad utrecht = new Stad();
		utrecht.naamStad = "Utrecht";
		System.out.println(utrecht.naamStad);

	}

}
