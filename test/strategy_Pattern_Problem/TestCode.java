package strategy_Pattern_Problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCode {

	//날 수 있는 오리 만들기
	@Test
	public void createFlyingDuck() {
		Duck duck = new Duck();
		assertEquals("I can fly!", duck.performFly());
	}
	
	//날 수 없는 오리 만들기
	@Test
	public void createNonFlyingDuck(){
		Duck duck = new Duck();
		assertEquals("I can't fly!", duck.performFly());
	}
	
	//소리 낼 수 있는 오리 만들기
	@Test
	public void createQuackingDuck(){
		Duck duck = new Duck();
		assertEquals("I can quack!", duck.performQuack());
	}
	
	//소리 낼 수 없는 오리 만들기
	@Test
	public void createNonQuackingDuck(){
		Duck duck = new Duck();
		assertEquals("I can't quack!", duck.performQuack());
	}
	
	//날 수 없는 오리였는데 날 수 있게 만들기
	public void changeFlyingFromNonFlying(){
		Duck duck = new Duck();
		assertEquals("I can't fly!", duck.performFly());
		//duck.setFlyBehavior();
		assertEquals("I can fly!", duck.performFly());
	}
	
	//소리 낼 수 없는 오리였는데 소리 낼 수 있게 만들기
	public void changeQuackingFromNonQuacking(){
		Duck duck = new Duck();
		assertEquals("I can't quack!", duck.performQuack());
		//duck.setFlyBehavior();
		assertEquals("I can quack!", duck.performQuack());
	}
}
