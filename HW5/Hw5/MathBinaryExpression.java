package Hw5;

public abstract class MathBinaryExpression implements MathExpression{
	protected MathExpression leftExpression;
	protected MathExpression rightExpression;
	
	public MathBinaryExpression(MathExpression l, MathExpression r){
		if(l != null)
			leftExpression = l;
		if(r != null)
			rightExpression = r;
	};
	
	public MathExpression getRight(){
		return rightExpression;
	}
	public MathExpression getLeft(){
		return leftExpression;
	}
}
