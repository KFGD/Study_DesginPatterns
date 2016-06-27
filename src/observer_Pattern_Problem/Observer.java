package observer_Pattern_Problem;

public interface Observer {

	AnimalType getInterestAnimalType();

	boolean getMessageFlag();

	void setInterestAnimalType(AnimalType dog);
	
	void update();
}
