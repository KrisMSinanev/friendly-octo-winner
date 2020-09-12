package shabloni2020zad;

public class IdleState implements State {

	private String stateName = "Idle";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
