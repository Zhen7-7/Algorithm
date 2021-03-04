package cn.zhen77.sort;

public class SelectionSort {
	public static void main(String[] args) {
//		int[] arr ={3,6,8,2,1,5,7};
		int[] arr = getRandom();
		
		for(int n = 0;n<arr.length-1 ;n++) {
			int minPos = n;
			for(int j=n+1;j<arr.length;j++) {
//				if(arr[minPos] > arr[j]) {
//					minPos = j;
//				}
				minPos = arr[minPos]>arr[j]? j:minPos;
				System.out.println("minPos =" + minPos);
			}
			
			//交换
//			int temp = arr[n];
//			arr[n] = arr[minPos];
//			arr[minPos] = temp;
			swap(arr , n , minPos);
		}
		
		
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println("排序之后的结果是");
		print(arr);
	}
	//交换器
	static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//输出器
	static void print(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	} 
	//生成随机数组
	static int[] getRandom() {
		int[] arr = new int[100];
		
		for(int i = 0;i<100;i++) {
		 int num = (int)(Math.random()*100);
		 arr[i] = num;
		}
		return arr;
	}
}
