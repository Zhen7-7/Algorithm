package cn.zhen77.Tools;
	
public class Swap {
	//���������������5�ַ�ʽ
	public static void main(String[] args) {
		int a=1,b=2;
		System.out.println("a="+a+",b="+b);
		swap1(a, b);
		swap2(a, b);
		swap3(a, b);
		swap4(a, b);
		swap5(a, b);
	}
	//�������4�ֽ����������ķ�ʽ
	static  void  swap1(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
	}
	static void swap2(int a,int b) {
		//ԭ������������0^x=x  x^x=0   a=a^b^a=b
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
		//�����ֲ�����  ��0���� ��������
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a="+a+",b="+b);
	}
	static void swap5(int a,int b) {
		//����ֱ�ӷ������ ,����һ��.������
		System.out.println("a="+b+",b="+a);
	}
	
}
