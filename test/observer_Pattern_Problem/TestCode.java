package observer_Pattern_Problem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCode {
	
	private Project petSeller;

	//테스트 케이스들을 수행하기 전에 실행
	@Before
	public void init() {
		petSeller = new PetSeller();
	}
	
	//애완동물 판매상 생성
	@Test
	public void createPetSeller() {
		init();
		assertNotNull(petSeller);
	}

	//구매자 한명 등록
	@Test
	public void registerCustomerOne(){
		Observer customer = new Customer();
		petSeller.registerCustomer(customer);
		assertEquals(1, petSeller.getRegCustomerCount());
	}
	
	//구매자의 관심 동물을 확인(Default=All)
	@Test
	public void checkCustomerInterest(){
		Observer customerOne = new Customer();
		Observer customerTwo = new Customer(AnimalType.CAT);
		assertEquals(AnimalType.ALL, customerOne.getInterestAnimalType());
		assertEquals(AnimalType.CAT, customerTwo.getInterestAnimalType());
	}
	
	//구매자의 관심 동물이 동적으로 변경
	@Test
	public void checkCustomerInterestAfterChange(){
		Observer customer = new Customer(AnimalType.CAT);
		assertEquals(AnimalType.CAT, customer.getInterestAnimalType());
		customer.setInterestAnimalType(AnimalType.DOG);
		assertEquals(AnimalType.DOG, customer.getInterestAnimalType());
	}
	
	//분양 가능한 애완동물이 들어올 경우, 해당 동물이 관심 동물로 지정된 구매자들에게만 메시지 전송
	@Test
	public void sendMessageToCustomer(){
		Observer allCustomer = new Customer(AnimalType.ALL);
		Observer catCustomer = new Customer(AnimalType.CAT);
		Observer dogCustomer = new Customer(AnimalType.DOG);
		petSeller.registerCustomer(allCustomer);
		petSeller.registerCustomer(catCustomer);
		petSeller.registerCustomer(dogCustomer);
		petSeller.registerPet(AnimalType.CAT);
		assertTrue(allCustomer.getMessageFlag());
		assertTrue(catCustomer.getMessageFlag());
		assertFalse(dogCustomer.getMessageFlag());
	}
}