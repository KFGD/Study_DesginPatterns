package strategy_Pattern_Solution;

public class Quack implements QuackingBehavior{
	@Override
	public String performQuack(){
		return "I can quack!";
	}
}
