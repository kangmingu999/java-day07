package random;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int i,c;
	String str1 = "정답입니다";
	String str2 = "오답입니다";
	for(i=0;i<=4; i++) {
			int a = r.nextInt(100);
			int b = r.nextInt(100);
			int d=0,e=0;
			System.out.println(a+"+"+b+"=");
			int sum = a+b;
			c = sc.nextInt();
			if(c==sum) {
			System.out.println(str1);
			d=d+1;
			}
			else {
			System.out.println(str2);
			e=e+1;
			}
			if(i==4) {
					System.out.println("끝났습니다\n"+"맞춘문제 : "+d+"개 틀린문제 :"+e);
				
			}
	}
	
	
	
	
	
}
}
