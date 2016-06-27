package strategy_Pattern_Problem;

public class Duck implements FlyBehavior, QuackBehavior{

	@Override
	public String performQuack() {
		// TODO Auto-generated method stub
		return "I can quack!";
	}

	@Override
	public String performFly() {
		// TODO Auto-generated method stub
		return "I can quack!";
	}
	
}
