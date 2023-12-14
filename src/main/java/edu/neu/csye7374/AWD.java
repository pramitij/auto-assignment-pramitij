package edu.neu.csye7374;

public class AWD extends AutoDecorator {

	public AWD(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return autoAPI.getPrice()+70.90;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return autoAPI.getDescription() +"\nAll Wheel Drive";
	}

}
