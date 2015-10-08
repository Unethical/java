import java.util.*;
import java.util.Map.Entry;



public class Ex11_1 {
	public static void main(String [] args){
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(); 
		lhm.put(new Integer(0xFF0000), "RED");
		lhm.put(new Integer(0x008000), "GREEN");
		lhm.put(new Integer(0x0000FF), "BLUE");
		lhm.put(new Integer(0x000000), "WHITE");
		lhm.put(new Integer(0x800080), "PURPLE");
		Set<Entry<Integer, String>> set = lhm.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
	/*


output:
16711680=RED
32768=GREEN
255=BLUE
0=WHITE
8388736=PURPLE
*/