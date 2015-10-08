/*
  	Jose Sepulveda
  	6/05/15
  	Java version: 1.7.0_51 - Eclipse 64bit - Linux Mint
  	This program is a prefix math notation evaluator.
  	It uses inheritance and recursion.
  	 
   
 
 */


package Hw5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Hw5_main {
	public static void main(String [] args){
		MathExpression[] marr2 = getUserExp();
		MathExpression[] marr = getTestMathExpressions();
		printArr(marr2);
		printArr(marr);
		System.out.println("Simple binary expression count: " + simpleExpCount(marr2));
		System.out.println("Simple binary expression count: " + simpleExpCount(marr));
		
	}
	public static MathExpression [] getTestMathExpressions(){
		MathExpression [] mathExpArray = new MathExpression[] {
			new SubExpression(new MathValue(123.456), new MathValue(7.8)),
			new DivExpression( new MathValue(9.8),
				new AddExpression( new MathValue(12.3), new MathValue(7.6))),
			new MathValue(1928.3746),
			new AddExpression(new MathValue(3.0), new MathValue(2.0)),
			new MultExpression(new SubExpression(new MathValue(78.), new MathValue(901.)),
				new AddExpression(new MathValue(234.), new MathValue(56.)))
		};
		return mathExpArray;
	} // end getTestMathExpressions
	public static MathExpression [] getUserExp(){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("How many expressions will you enter?: ");
		int i = scanner.nextInt();
		scanner.nextLine();
		if(i <= 0)
			i = 1;
		MathExpression[] arr = new MathExpression[i];
		for(int j = 0; j<i; j++){
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			arr[j] = makeExpression(st);
		}
		return arr;
	}
	
	public static MathExpression makeExpression(StringTokenizer s){
		if(s.hasMoreTokens()){
			String str = s.nextToken();
			if(str.length() == 1 && str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")){
				MathExpression left = makeExpression(s);
				MathExpression right = makeExpression(s);
				switch(str){
					case "+": return new AddExpression(left, right);
					case "-": return new SubExpression(left, right);
					case "*": return new MultExpression(left, right);
					case "/": return new DivExpression(left, right);				
				}
			}else{
				double operand = Double.parseDouble(str);			
				return new MathValue(operand);
			}
		}else{
			return null;
		}
		return null;

	}
	public static void printArr(MathExpression[] arr){
		for(MathExpression e : arr){
			if(e instanceof MathBinaryExpression){
				MathBinaryExpression temp = (MathBinaryExpression)e;
				if(temp.getLeft() != null && temp.getRight() != null){
					System.out.println(e.toString() + " = " + e.evaluate());
				}else{
					System.out.println("Invalid Expression");
				}
			}
		}
		
	}
	public static int simpleExpCount(MathExpression [] arr){
		int i = 0;
		for(MathExpression e: arr){
			if(e instanceof MathBinaryExpression){
				MathBinaryExpression temp = (MathBinaryExpression)e;
				if(temp.getLeft() instanceof MathValue && temp.getRight() instanceof MathValue)
					i++;
			}
		}
		return i;
		
	}
	
}
/*
How many expressions will you enter?: 9
* 5.0 -7.0
+ 4.0 / 30. 2
- / 25. 5. * 3. 3.
54.32
/ 3.5 0.
+ - * 11.1 22.2
/ -100. 20.
- 78.9 45.6 12.3
* + 5.0 2.5 3.0
( 5.0 * -7.0 ) = -35.0
( 4.0 + ( 30.0 / 2.0 ) ) = 19.0
( ( 25.0 / 5.0 ) - ( 3.0 * 3.0 ) ) = -4.0
( 3.5 / 0.0 ) = Infinity
Invalid Expression
( -100.0 / 20.0 ) = -5.0
( 78.9 - 45.6 ) = 33.300000000000004
( ( 5.0 + 2.5 ) * 3.0 ) = 22.5
Simple binary expression count: 4
( 123.456 - 7.8 ) = 115.656
( 9.8 / ( 12.3 + 7.6 ) ) = 0.492462311557789
( 3.0 + 2.0 ) = 5.0
( ( 78.0 - 901.0 ) * ( 234.0 + 56.0 ) ) = -238670.0
Simple binary expression count: 2
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
