package map;

import java.util.HashMap;

public class Testclass01 {
public static void main(String[] args) {
	/*
	 Map - HashMap
	 - key, value 형식으로 만들어진다.
	 -key의 중복은 허용되지않으며 value 중복은 가능하다
	 */
	HashMap<String,String>map = new HashMap<>();
	map.put("num", "100");
	map.put("name", "홍길동");
	System.out.println("map : "+map);
	System.out.println(map.get("num"));
	System.out.println(map.get("name"));
	System.out.println(map.get("없는 키"));
}
}
