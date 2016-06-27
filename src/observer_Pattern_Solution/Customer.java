package observer_Pattern_Solution;

public class Customer implements Observer {

	private AnimalType interestAnimalType;
	private boolean messageFlag;
	
	public Customer(){
		interestAnimalType = AnimalType.ALL;
		messageFlag = false;
	}
	
	public Customer(AnimalType cat) {
		// TODO Auto-generated constructor stub
		interestAnimalType = cat;
		messageFlag = false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		messageFlag = true;
	}

	@Override
	public AnimalType getInterestAnimalType() {
		// TODO Auto-generated method stub
		return interestAnimalType;
	}

	@Override
	public void setInterestAnimalType(AnimalType type) {
		// TODO Auto-generated method stub
		interestAnimalType = type;
	}

	@Override
	public boolean getMessageFlag() {
		// TODO Auto-generated method stub
		return messageFlag;
	}

}
