package observer_Pattern_Solution;

import java.util.ArrayList;

public class PetSeller implements Subject {

	private ArrayList<Observer> customers;

	public PetSeller(){
		customers = new ArrayList<>();
	}
	
	@Override
	public void registerCustomer(Observer observer) {
		// TODO Auto-generated method stub
		customers.add(observer);
	}

	@Override
	public void removeCustomer(Observer observer) {
		// TODO Auto-generated method stub
		customers.remove(observer);
	}

	@Override
	public int getRegCustomerCount() {
		// TODO Auto-generated method stub
		return customers.size();
	}

	@Override
	public void registerPet(AnimalType type) {
		// TODO Auto-generated method stub
		notifyRegPetToCustomer(type);
	}

	@Override
	public void notifyRegPetToCustomer(AnimalType type) {
		for(Observer customer:customers){
			//관심 동물이 모두일 경우,
			if(AnimalType.ALL == customer.getInterestAnimalType())
				customer.update();
			//관심 동물이 동일할 경우,
			else if(type == customer.getInterestAnimalType())
				customer.update();
		}
	}

}
