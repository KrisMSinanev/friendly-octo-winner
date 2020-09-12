package shabloni2020zad;

public class SleepState implements State  {

	private String stateName = "S";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

	
	
}
