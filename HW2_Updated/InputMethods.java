import java.util.*;
public class InputMethods {
	public static Scanner scanner = new Scanner( System.in );
	
	public static boolean wantsToRepeat(){
		// YOU FILL IN HERE AS DESCRIBED BELOW:
		System.out.println("Do you want to repeat? (y or Y)");
		String choice;
		choice = scanner.next();
		boolean a = true;
		if((choice.toUpperCase() == "Y")){
			a = false;
		}
		return a;
	} // end wantsToRepeat
	
	public static int readInt(String prompt,
					int min,
					int max){
		int inputInt;
		
		System.out.print(prompt);
		inputInt = scanner.nextInt();
		while( inputInt < min || inputInt > max ){
			System.out.println("Input out of range, must be >= "
					+ min + " and <= " + max);
			System.out.print(prompt);
			inputInt = scanner.nextInt();
		}
		return inputInt;
	} // end readInt

}
