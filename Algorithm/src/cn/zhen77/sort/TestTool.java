package cn.zhen77.sort;

public class TestTool {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for(int i = 0;i<100;i++) {
		 int num = (int)(Math.random()*100);
		 arr[i] = num;
		}
		print(arr);
		System.out.println();
		System.out.println(arr.length);
	}
	//�����
		static void print(int[] arr) {
			for(int i=0 ; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		} 
}
