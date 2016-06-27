package observer_Pattern_Solution;

public interface Observer {
	void update();
	AnimalType getInterestAnimalType();
	void setInterestAnimalType(AnimalType dog);
	boolean getMessageFlag();
}
