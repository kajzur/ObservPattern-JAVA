import java.util.ArrayList;


public class Mezczyzna implements Observator, Observable {
	String name;
	private ArrayList<Observator> observators= new ArrayList<Observator>();
	public Mezczyzna(String name) {
		this.name=name;
	}
	@Override
	public void update() {
		
		System.out.println(name+" wlasnie zauwazyl, ze Kobieta zmienila spodnie na spodniczke.");

	}
	@Override
	public void addObservator(Observator object) {
		if(object!=null)
			observators.add(object);
		
	}
	@Override
	public void deleteObservator(Observator object) {
		this.observators.remove(object);
		
	}
	@Override
	public void notifyObservator() {
		
		for(Observator ob:observators)
			ob.update();
		
	}
	
	public void changeBlouseToShirt(){
		
		System.out.println(name+" zmienia bluzke na koszule.");
		notifyObservator();
	}

}
