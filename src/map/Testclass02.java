package map;
import java.util.EnumMap;
import java.util.HashMap;
public class Testclass02 {
public static void main(String[] args) {
	HashMap<String, Integer>Map =new HashMap<>();
	Map.put("num",100);
	Map.put("age",20);
	System.out.println("map : "+Map);
	int num = Map.get("age");
	System.out.println("num :"+num);
	System.out.println("Map.get(num) : "+Map.get("num"));
	
	System.out.println(Map.containsKey("age"));
	System.out.println(Map.containsValue(100111));
	
	Map.put("age", 100); //key 중복 안됨
	System.out.println("map : " + Map);
	
	Map.remove("age");
	System.out.println("remove : " + Map);
	
}
}
