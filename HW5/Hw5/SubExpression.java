package Hw5;

public class SubExpression extends MathBinaryExpression {
	public SubExpression(MathExpression left, MathExpression right){
		super(left, right);
	}
	public double evaluate(){
		return super.getLeft().evaluate() - super.getRight().evaluate();
	}
	
	public String toString(){
		String str = "( " + super.getLeft() + " - " + super.getRight() + " )";;
		return str;
		
	}


}
