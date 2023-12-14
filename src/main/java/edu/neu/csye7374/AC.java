package edu.neu.csye7374;

public class AC extends AutoDecorator {
	

	public AC(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return autoAPI.getPrice()+150.90;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  autoAPI.getDescription() +"\nAir Conditioning";
	}

}
