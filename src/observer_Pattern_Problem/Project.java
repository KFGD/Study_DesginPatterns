package observer_Pattern_Problem;

public interface Project {

	void registerCustomer(Observer customer);

	int getRegCustomerCount();

	void registerPet(AnimalType cat);

	void notifyRegPetToCustomer(AnimalType type);
}
