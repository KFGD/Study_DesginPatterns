package strategy_Pattern_Solution;

public class Duck {

	private FlyingBehavior flyBehavior;
	private QuackingBehavior quackBehavior;

	public Duck(FlyingBehavior fly) {
		// TODO Auto-generated constructor stub
		flyBehavior = fly;
	}

	public Duck(QuackingBehavior quack) {
		// TODO Auto-generated constructor stub
		quackBehavior = quack;
	}

	public String performFly() {
		// TODO Auto-generated method stub
		return flyBehavior.fly();
	}

	public String performQuack() {
		// TODO Auto-generated method stub
		return quackBehavior.performQuack();
	}

	public void setFlyBehavior(FlyingBehavior fly) {
		// TODO Auto-generated method stub
		flyBehavior = fly;
	}

	public void setFlyBehavior(QuackingBehavior quack) {
		// TODO Auto-generated method stub
		quackBehavior = quack;
	}
	
	
}
