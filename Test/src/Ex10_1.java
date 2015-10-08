import java.util.Arrays;
import java.util.Collections;


public class Ex10_1 {
	static public void main(String [] args){
		Double [] dArr = { 1., 5.2, 8.1, 4., 8.6};
		String [] sArr = {"Jose", "Apple", "Sam", "Jen","Car","Letter","Stawhat"};
		printReverseArray(dArr);
		printReverseArray(sArr);
		
	}
	
	
	
	public static <T> void printReverseArray(T[] a) {
		for(int i = a.length - 1; i>=0; i--){
			System.out.println(a[i]);
		}
	}
}
/*

8.6
4.0
8.1
5.2
1.0
8
2
1
Stawhat
Letter
Car
Jen
Sam
Apple
Jose




*/