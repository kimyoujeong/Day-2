package org.javaro.lecture;
public class Ex_1{
	public static void main(String[] args) {
		System.out.printf("%d %% %d = %d%n",10,4,10%4);
		System.out.printf("%b%n",true);
		System.out.printf("%8.2f,%.2f%n",123.236,123.236);
		System.out.printf("%x %X %#8X %n",456,456,456);
		System.out.printf("%o %#8X %n",10,10);
		System.out.printf("%c %n",'\u0041');
		System.out.printf("%c %C %c %n",'a','a',65);
		System.out.printf("%10s%n","Korea");
		System.out.printf("%10.3s %S %n","Korea","Korea");
		
		float PI=3.141592f;
		int radius=20;
		System.out.printf("0을 포함한 5자리 반지름 길이=%05s\n",radius);
		System.out.printf("0을 포함한 소수 2째자리 전체 7자리 원둘레=%07.2f\n",2*PI*radius);
		int unitPrice=45000; int ea=1000;		
		System.out.printf("단가:%,d원%n",unitPrice);
		System.out.printf("갯수:%,d개%n",ea);
		System.out.printf("총액:%,d원%n",unitPrice*ea);
		System.out.printf("단가:%,d원X갯수:%,d개=총액:%,d원\n",unitPrice,ea,unitPrice*ea);
	}
}