package shabloni2020zad;

import java.util.Observable;

public class Context extends Observable {

	private String name;
	private State state;
	
	public Context(String name) {
		this.name = name;
		System.out.println("Animal is " + name);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		setChanged();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		setChanged();
		notifyObservers(state);
	}
}
