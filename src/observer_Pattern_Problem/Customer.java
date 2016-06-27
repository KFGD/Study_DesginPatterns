package observer_Pattern_Problem;

public class Customer implements Observer {
	private boolean messageFlag;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		messageFlag = false;
	}

	public Customer(AnimalType cat) {
		// TODO Auto-generated constructor stub
		messageFlag = false;
	}

	@Override
	public AnimalType getInterestAnimalType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getMessageFlag() {
		// TODO Auto-generated method stub
		return messageFlag;
	}

	@Override
	public void setInterestAnimalType(AnimalType dog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
