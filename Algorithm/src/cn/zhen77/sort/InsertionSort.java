package cn.zhen77.sort;

public class InsertionSort {
	 public static void main(String[] args) {
		 DataChecker.check();
	}
	static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++)
		charu(arr,i);
	}
	static void charu(int[] arr,int i) {
		for(int j=i;j>0 && arr[j]<arr[j-1];j--) {
//			if(arr[j]<arr[j-1]) 
			swap(arr, j, j-1);
		}
		
	}
	
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
