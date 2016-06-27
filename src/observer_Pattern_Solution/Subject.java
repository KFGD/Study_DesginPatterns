package observer_Pattern_Solution;

public interface Subject {
	void registerCustomer(Observer observer);
	void removeCustomer(Observer observer);
	int getRegCustomerCount();
	void notifyRegPetToCustomer(AnimalType type);
	void registerPet(AnimalType type);
}
