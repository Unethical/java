package Hw5;

public class MathValue implements MathExpression {
	private double doubValue;
	
	public MathValue(double d){
		doubValue = d;		
	}
	
	public double evaluate(){
		return doubValue;
	}
	
	public String toString(){
		
		return Double.toString(doubValue);
	}
	
}
