

public interface Observable {

	
	public void addObservator(Observator object);
	public void deleteObservator(Observator object);
	abstract void notifyObservator();
}
