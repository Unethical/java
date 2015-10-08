import java.lang.StringBuilder;
public class RomanNumeral {
	public static RomanNumeral[] romanArr = {new RomanNumeral("M"),
											 new RomanNumeral("CM"),
											 new RomanNumeral("D"),
											 new RomanNumeral("CD"),
											 new RomanNumeral("C"),
											 new RomanNumeral("XC"),
											 new RomanNumeral("L"),
											 new RomanNumeral("XL"),
											 new RomanNumeral("X"),
											 new RomanNumeral("IX"),
											 new RomanNumeral("V"),
											 new RomanNumeral("IV"),
											 new RomanNumeral("I")};
	private String romNumStr = "";
	private int value = 0;
	
	RomanNumeral(String s){
		setRomNumStr(s);
	}
	RomanNumeral(int i){
		setValue(i);
	}
	RomanNumeral(){};
	
	public boolean setRomNumStr(String str){
		if(str != null){
			romNumStr = str;
			romNumStr.trim();
			romNumStr = romNumStr.toUpperCase();
			calcValue();
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public void setValue(int in){
		if(in > 0){
			value = in;
			generateRomStr();
		}

		
	}
	private void calcValue(){
		int [] digitValues;
		digitValues = new int[romNumStr.length()];
		for(int i : digitValues){
			i = 0;
		}
		for(int i = 0; i < romNumStr.length(); i++){
			char c;
			c = romNumStr.charAt(i);
			switch(c){
			case 'M': digitValues[i] = 1000;
						break;
			case 'D': digitValues[i] = 500;
						break;
			case 'C': digitValues[i] = 100;
						break;
			case 'L': digitValues[i] = 50;
						break;
			case 'X': digitValues[i] = 10;
						break;
			case 'V': digitValues[i] = 5;
						break;
			case 'I': digitValues[i] = 1;
						break;
			default: digitValues[i] = 0;
						romNumStr = "";
						value = 0;
						
			} // end switch
			
		} // end for loop
	
		for(int i = 0; i < digitValues.length; i++){
		if(!romNumStr.equals(""))	
			if(i == digitValues.length - 1){
				value += digitValues[i];
			}else if(digitValues[i] >= digitValues[i+1]){
				value += digitValues[i];
			}else if(digitValues[i] < digitValues[i+1]){
				value -= digitValues[i];
			}
		} // end for loop
		
	
	}
	
	int getValue(){return value;}
	String getStr(){return romNumStr;}
	
	private void generateRomStr(){
		StringBuilder sb = new StringBuilder();
		int val = this.value;
		
		for(int i = 0; i < romanArr.length; i++){
			while(i< romanArr.length && val - romanArr[i].getValue() >= 0){
				sb.append(romanArr[i].getStr());
				val = val - romanArr[i].getValue();
				
			}
		}
		romNumStr = sb.toString();
		
	}
	
	public RomanNumeral addRomanNumerals(RomanNumeral r){
		if(r != null){
			return new RomanNumeral(this.value + r.getValue());
		}else{
			return new RomanNumeral();
		} // end if
				
	}
	public String toString(){
		String s;
		s = this.getClass().getSimpleName() + " " + romNumStr + " " + value;
		return s;
	}
}
