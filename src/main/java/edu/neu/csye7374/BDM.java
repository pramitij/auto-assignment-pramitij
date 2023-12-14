package edu.neu.csye7374;

public class BDM extends AutoDecorator {

	public BDM(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return autoAPI.getPrice()+ 300.50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return autoAPI.getDescription() +"\nBlind-Side Detection Monitor";
	}

}
