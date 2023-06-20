package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Testclass04 {

public static void main(String[] args) {
	//HashMap<String, Integer> map = new HashMap<>();
	LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	//Linked 내가 넣었던 순서대로
	map.put("선풍기", 100);
	map.put("자동차", 200);
	map.put("에어컨", 300);
	System.out.println(map);
	
	//Set<String> set = map.keysSet();
	//Iterator<String> it = set.iterator();
	Iterator<String> it =map.keySet().iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
