import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Ex10_2 {
	static public void main(String [] args){

		List intArr = new ArrayList<Integer>();
		List intList = new LinkedList<Integer>();
		populateList(intList);
		populateList(intArr);
		printList(intList);
		printList(intArr);
	}
	
	static public void printList(List<Integer> intList){
		Iterator<Integer> intIt = intList.iterator();
		while(intIt.hasNext()){
			System.out.println(intIt.next());
		}
		
	}
	
	
	static public void populateList(List<Integer> intList) {
		for(int i = 1; i <= 5; i++){
			intList.add(i*2);
		}
		
	}




}
/*

2
4
6
8
10
2
4
6
8
10




*/