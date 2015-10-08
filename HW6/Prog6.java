/*
 	Object Roman Numeral Converter rev. II
 	
  	Jose Sepulveda
  	
  	6/16/15
  	
  	Java version: 1.7.0_51 - Eclipse 64bit - Linux Mint
  	
  	THis is a revised version of the ROMAN NUMERAL lab, we are now
  	incorporating exception handling and txt file i/o
  	 
   
 
 */

package HW6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Prog6{
	public static void main (String [] args){
	   
	   RomanNumeral romNum = new RomanNumeral();
		ArrayList<RomanNumeral> romList = new ArrayList<RomanNumeral>();
		romList = loadList();
		Collections.sort(romList);
		writeToFile(romList);
		
	}
	static <E> boolean writeToFile(ArrayList<E> arrList){
		System.out.println("Enter a filename to write to: ");
		Scanner scanner = new Scanner(System.in);
		FileOutputStream outFile = null;
		try{
			outFile = new FileOutputStream(scanner.nextLine());
			
		}catch(FileNotFoundException e){
			System.err.println(e);
			return false;
		}
		Iterator<E> it = (Iterator<E>) arrList.iterator();
		PrintWriter prtW = new PrintWriter(outFile, true);
		while(it.hasNext()){
			prtW.println(it.next());
		}
		return true;
		
		
	}
	static ArrayList<RomanNumeral> loadList(){
		Scanner scanner = new Scanner(System.in);
		ArrayList<RomanNumeral> list = new ArrayList<RomanNumeral>();
		System.out.println("Enter a filename to read from: ");
		java.io.File file = new java.io.File(scanner.next());
		Scanner fileScanner = null;
		try{
			fileScanner = new Scanner(file);
			while(fileScanner.hasNext()){
				String str = new String(fileScanner.next());
				try{
					list.add(new RomanNumeral(str));
				}catch(IllegalArgumentException e){
					System.err.println(str + " is not a valid Roman #");
				}
					
			}
			fileScanner.close();
		}catch(FileNotFoundException fe){
			System.out.println("File not found.");
			return list;
		}

		return list;
		
	}
}

//OUTPUT:

//Enter a filename to read from: 
//HW6-TestInput1.txt
//Enter a filename to write to: 
//output1.txt

//Enter a filename to read from: 
//HW6-TestInput2.txt
//MILK is not a valid Roman #
//XXWIII is not a valid Roman #
//bcd is not a valid Roman #
//Enter a filename to write to: 
//output2.txt

//Enter a filename to read from: 
//HW6-TestInput3.txt
//NotValid is not a valid Roman #
//Enter a filename to write to: 
//output3.txt
