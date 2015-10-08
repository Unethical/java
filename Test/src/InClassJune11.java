import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class InClassJune11 {
	public static void main(String [] args){
		System.out.println(isInSet('f'));
		System.out.println(isInSet('z'));
		System.out.println(isInSet('2'));

		
	}
	static boolean isInSet(char c){
		return hs.contains(c);
		
	}
	static HashSet<Character> hs = new HashSet<Character>();
	static Character[] chArr = {'a', 'b', 'c', 'd', 'e', 'f'};
	static Character[] numArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	static {
		for(Character c : numArr){
			hs.add(c);
		}
		for(Character c: chArr){
			hs.add(Character.toUpperCase(c));
		}
		for(Character c: chArr){
			hs.add(c);
		}
		
		
	}

}

/*
true
false
true

 * */

