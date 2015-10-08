/*
 * Object Roman Numeral Converter
 * 
 * Jose Sepulveda
 * 
 * 5/27/15
 * 
 * Windows 7 64bit Eclipse Java SE 1.8
 * 
 * This program is an converter between integers and roman numerals.
 * 
 * This program is based around a static Roman numeral array and some clever algorithms.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/
import java.util.*;

public class HW4 {
	public final static int MIN=1;
	public final static int MAX=3000;
	public final static int [] minVals = {35, 495, 995};
	public final static int [] maxVals = {64, 544, 1055};
	
	public static void main( String [] args )
	{
		RomanNumeral roman1=null, roman2=null, roman3=null;
	
		testRomanNumeral();
		testMoreRomNums();
		roman1=new RomanNumeral((int)(Math.random()*(MAX-MIN+1))+1);
		roman2=new RomanNumeral(roman1.getValue()*2);
		roman3= roman1.addRomanNumerals(roman2); 
		// MAY CHANGE TO WHAT YOU CALLED THE ADD METHOD
		printRomanNumerals(roman1, roman2, roman3);
	}
	
	public static void printRomanNumerals(RomanNumeral r1,
			RomanNumeral r2,
			RomanNumeral r3)
	{
		// FINISH THIS SO IT CALLS toString FOR r1, r2, and r3
		//   with labels as shown in the TEST RUNS
	}
	
	public static void testRomanNumeral()
	{
		RomanNumeral roman = new RomanNumeral();
		
		System.out.println("\nValue          Roman Numeral String\n");
		for( int i = 0; i < minVals.length ; ++i ){
			for( int val = minVals[i]; val < maxVals[i]; ++val ){
				roman.setValue(val);
				System.out.printf("%5d           %s\n", 
					roman.getValue(), roman.getStr());//*
	//* you may CHANGE to what you called your accessors for the value and the string
			}
			System.out.println();
		}
	}

	public static void testMoreRomNums(){
		RomanNumeral roman;
		
		roman = new RomanNumeral("INVALID");
		System.out.println("\nWhen creating with INVALID, "+roman);
		roman = new RomanNumeral("cd");
		System.out.println("When creating with cd, "+roman);
		roman.setValue(0);
		System.out.println("After trying to change cd to 0, "+roman);
		roman = new RomanNumeral("CAD");
		System.out.println("After trying to change cd to CAD, "+roman);
	}
} // class HW4

/*
Value          Roman Numeral String

   35           XXXV
   36           XXXVI
   37           XXXVII
   38           XXXVIII
   39           XXXIX
   40           XL
   41           XLI
   42           XLII
   43           XLIII
   44           XLIV
   45           XLV
   46           XLVI
   47           XLVII
   48           XLVIII
   49           XLIX
   50           L
   51           LI
   52           LII
   53           LIII
   54           LIV
   55           LV
   56           LVI
   57           LVII
   58           LVIII
   59           LIX
   60           LX
   61           LXI
   62           LXII
   63           LXIII

  495           CDXCV
  496           CDXCVI
  497           CDXCVII
  498           CDXCVIII
  499           CDXCIX
  500           D
  501           DI
  502           DII
  503           DIII
  504           DIV
  505           DV
  506           DVI
  507           DVII
  508           DVIII
  509           DIX
  510           DX
  511           DXI
  512           DXII
  513           DXIII
  514           DXIV
  515           DXV
  516           DXVI
  517           DXVII
  518           DXVIII
  519           DXIX
  520           DXX
  521           DXXI
  522           DXXII
  523           DXXIII
  524           DXXIV
  525           DXXV
  526           DXXVI
  527           DXXVII
  528           DXXVIII
  529           DXXIX
  530           DXXX
  531           DXXXI
  532           DXXXII
  533           DXXXIII
  534           DXXXIV
  535           DXXXV
  536           DXXXVI
  537           DXXXVII
  538           DXXXVIII
  539           DXXXIX
  540           DXL
  541           DXLI
  542           DXLII
  543           DXLIII

  995           CMXCV
  996           CMXCVI
  997           CMXCVII
  998           CMXCVIII
  999           CMXCIX
 1000           M
 1001           MI
 1002           MII
 1003           MIII
 1004           MIV
 1005           MV
 1006           MVI
 1007           MVII
 1008           MVIII
 1009           MIX
 1010           MX
 1011           MXI
 1012           MXII
 1013           MXIII
 1014           MXIV
 1015           MXV
 1016           MXVI
 1017           MXVII
 1018           MXVIII
 1019           MXIX
 1020           MXX
 1021           MXXI
 1022           MXXII
 1023           MXXIII
 1024           MXXIV
 1025           MXXV
 1026           MXXVI
 1027           MXXVII
 1028           MXXVIII
 1029           MXXIX
 1030           MXXX
 1031           MXXXI
 1032           MXXXII
 1033           MXXXIII
 1034           MXXXIV
 1035           MXXXV
 1036           MXXXVI
 1037           MXXXVII
 1038           MXXXVIII
 1039           MXXXIX
 1040           MXL
 1041           MXLI
 1042           MXLII
 1043           MXLIII
 1044           MXLIV
 1045           MXLV
 1046           MXLVI
 1047           MXLVII
 1048           MXLVIII
 1049           MXLIX
 1050           ML
 1051           MLI
 1052           MLII
 1053           MLIII
 1054           MLIV


When creating with INVALID, RomanNumeral  0
When creating with cd, RomanNumeral CD 400
After trying to change cd to 0, RomanNumeral CD 400
After trying to change cd to CAD, RomanNumeral  0
*/