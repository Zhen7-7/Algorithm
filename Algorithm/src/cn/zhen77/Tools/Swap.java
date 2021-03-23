package cn.zhen77.Tools;
	
public class Swap {
	//交换输出两个数的5种方式
	public static void main(String[] args) {
		int a=1,b=2;
		System.out.println("a="+a+",b="+b);
		swap1(a, b);
		swap2(a, b);
		swap3(a, b);
		swap4(a, b);
		swap5(a, b);
	}
	//今天介绍4种交换两个数的方式
	static  void  swap1(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
	}
	static void swap2(int a,int b) {
		//原理是两个数的0^x=x  x^x=0   a=a^b^a=b
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+",b="+b);
	}
	static void swap3(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+",b="+b);
	}
	static void swap4(int a, int b ) {
		//第四种不常用  有0不行 还丢精度
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a="+a+",b="+b);
	}
	static void swap5(int a,int b) {
		//老子直接反向输出 ,秀你一脸.哈哈哈
		System.out.println("a="+b+",b="+a);
	}
	
}
