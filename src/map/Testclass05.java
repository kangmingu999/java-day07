package map;

public class Testclass05 {

public static void main(String[] args) {
	
	float fl =(float)1.11;
	int num = 100;
	String sNum = num+"";
	System.out.println(sNum+100);
	System.out.println(num+100);
	//"100" 가느. "안녕" 변환안됨
	int n = Integer.parseInt(sNum);
	System.out.println(n+123);
}

}
