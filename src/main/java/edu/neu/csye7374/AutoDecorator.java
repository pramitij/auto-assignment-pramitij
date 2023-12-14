package edu.neu.csye7374;

public abstract class AutoDecorator implements AutoAPI {
	protected AutoAPI autoAPI;

	public AutoDecorator(AutoAPI autoAPI) {
		super();
		this.autoAPI = autoAPI;

	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return autoAPI.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return autoAPI.getDescription();
	}

}
