package demo;

public class Recursion {
/*
 * ʲô�ǵݹ�
 * �ݹ�����������е����Լ�
 * 
 * */
	
	public static void main(String[] args) {
		int num = recursion(10);
		System.out.println(num);
		
	}
	static int recursion(int num) {
		if(num>0) {
			System.out.println("+"+(num-1));
		
			num += recursion(num-1);
			return num;
		}else {
			return num;
		}
	}
}