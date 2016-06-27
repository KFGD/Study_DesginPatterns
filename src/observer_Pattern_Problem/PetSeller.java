package observer_Pattern_Problem;

import java.util.ArrayList;

public class PetSeller implements Project{

	private ArrayList<Observer> customers;

	public PetSeller(){
		customers = new ArrayList<>();
	}

	@Override
	public void registerCustomer(Observer customer) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		for(Observer customer:customers){
			customer.update();
		}
	}
}
