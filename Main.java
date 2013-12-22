
public class Main {

	public static void main(String[] args) {

		Kobieta ob1 = new Kobieta("Aga");
		Mezczyzna ob2 = new Mezczyzna("Mateusz");
		Mezczyzna ob3 = new  Mezczyzna("Lukasz");
		//========================
		ob1.addObservator(ob2);
		ob1.addObservator(ob3);
		ob1.changeTrousersToSkirt();
		//========================
		ob2.addObservator(ob1);
		ob2.changeBlouseToShirt();
		
		
	}

}
