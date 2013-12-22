import java.util.ArrayList;


public class Kobieta implements Observable, Observator {

	private String name;
	private ArrayList<Observator> observators= new ArrayList<Observator>();
	
	public Kobieta(String name) {
		this.name=name;
	}

	public void changeTrousersToSkirt(){
		
		System.out.println(name+" zmienia spodnie na spodniczke :) ");
		notifyObservator();
		
	}

	@Override
	public void deleteObservator(Observator object) {
		
		observators.remove(object);

	}

	@Override
	public void addObservator(Observator object) {
		
		if(object!=null)
			observators.add(object);
		
	}

	@Override
	public void notifyObservator() {
		
		for(Observator ob:observators)
			ob.update();
		
	}

	@Override
	public void update() {
		
		System.out.println(name+" zauwaza ze ktos zmienil bluzke na koszule, mrr.. :)");
		
	}

}
