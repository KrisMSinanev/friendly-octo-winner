package shabloni2020zad;

public class Main {

	public static void main(String[] args) {
		
		Context horse = new Context("Horse");
		Context cow = new Context("Cow");
		
		SleepState sleepState = new SleepState();
		EatState eatState = new EatState();
		IdleState idleState = new IdleState();
		
		StateObserver player = new StateObserver();
		
		horse.addObserver(player);
		
		eatState.applyState(horse);
		idleState.applyState(cow);
		
		State horseState = horse.getState();
		String currentState = horseState.getStateName();
		
		player.update(horse, eatState);
		
		System.out.println("Horse is " + currentState);
		
		
	}

}
