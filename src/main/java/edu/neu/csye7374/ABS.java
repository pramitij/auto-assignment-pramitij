package edu.neu.csye7374;

public class ABS extends AutoDecorator {

	public ABS(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return autoAPI.getPrice()+40.50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return autoAPI.getDescription() +"\nAnti Braking System";
	}

}
