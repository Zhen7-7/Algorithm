package cn.zhen77.sort;

public class BubbleSort_plus {
	public static void main(String[] args) {
		DataChecker.check();
	}
	static void sort(int[] arr) {
		
		for(int n=0;n<arr.length;n++) {
			for(int i=0;i<arr.length-n-1;i++) {
				if(arr[i]>arr[i+1]) BubbleSort.swap(arr, i, i+1);
			}
		}
	}
}
