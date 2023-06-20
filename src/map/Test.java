package map;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	HashMap<String,String>map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	int i=0,num=0;
	
	String a,b;
	while(true) {
		System.out.println("1.메뉴등록 \n 2.메뉴별 가격 보기\n3.종료\n>>> :");
		num = sc.nextInt();
		switch(num) {
		
		case 1: {
			int z=i+1;
			System.out.println("메뉴등록 ,가격 등록 : ");
			a = sc.next();
			b = sc.next();			
			map.put(a, b);

		}
		case 2: {
			if(map==null) {
				System.out.println("메뉴가 없습니다");
			}
			else {
				System.out.println(map);
			}
		}
	}
		
}
}
}
