import java.util.*;

public class Ex_10_3 {
	public static void main(String[] args){
		//Initialized a stack and PriorityQueue of Integers
		Stack<Integer> skInt = new Stack<Integer>();
		PriorityQueue<Integer> pqInt = new PriorityQueue<Integer>();
		//Populate the stack and PriorityQueue with 2, 4, 6, 8, 10
		populateCollection(skInt);
		populateCollection(pqInt);
		//Print the Stack and PriorityQueue
		printCollection(skInt);
		printCollection(pqInt);
		
		
	}
	
	public static void populateCollection(Stack<Integer> sk){
		for(int i = 1; i <= 5; i++){
			sk.push(i*2);
		}		
	}
	public static void populateCollection(PriorityQueue<Integer> pq){
		for(int i = 1; i <= 5; i++){
			pq.offer(i*2);
		}
	}
	public static void printCollection(Stack<Integer> sk){
		System.out.println("\n"+sk.getClass().getName() + ": ");
		while(!sk.empty()){
			System.out.print(sk.pop() + " ");
		}
		
	}
	public static void printCollection(PriorityQueue<Integer> pq){
		System.out.println("\n\n"+pq.getClass().getName() + ": ");
		while(pq.size() != 0){
			System.out.print(pq.poll() + " ");
		}
		
	}
	
}
