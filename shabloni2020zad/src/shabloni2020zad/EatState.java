package shabloni2020zad;

public class EatState implements State {

	private String stateName = "Eating";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

	
}
