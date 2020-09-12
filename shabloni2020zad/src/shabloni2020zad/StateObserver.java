package shabloni2020zad;

import java.util.Observable;
import java.util.Observer;

public class StateObserver implements Observer{

	private String pname;
	private State state;
	
	public StateObserver() {
		pname = null;
		System.out.println("Observer created: Name is " + pname);
	}
	
	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof State) {
			state = (State) arg;
			System.out.println("Player sees horse " + state.getStateName());
		} else {
			System.out.println("Player does not see");
		}
		
	}

	
}
