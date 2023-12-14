package edu.neu.csye7374;

public class BB extends AutoDecorator{

	public BB(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return autoAPI.getPrice()+90.90;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return autoAPI.getDescription() +"\nBumper to Bumper warrantee";
	}

}
