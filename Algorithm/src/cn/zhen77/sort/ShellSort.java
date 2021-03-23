package cn.zhen77.sort;

public class ShellSort {
	public static void main(String[] args) {
		DataChecker.check();
	}
	static void shellSort(int[] arr) {
		int h =1;
		while(h<=arr.length/3) {
			h=h*3 + 1;
		}
		for(int gap=h;gap>0;gap=(gap-1)/3) {
			insertionSort(arr, gap);
		}
	}
	
	
	
	//用gap定义间隔
	static void shellSortDemo(int[] arr) {
		for(int gap=arr.length/2;gap>0;gap/=2) {
			insertionSort(arr, gap);
		}
	}
	static void insertionSort(int[] arr,int gap) {
		
		for(int i=gap;i<arr.length;i++) {
			for(int j=i;j>gap-1 ;j-=gap) {  //j-gap>=0  所以 j>=gap ->j>gap-1
				if(arr[j]<arr[j-gap]) swap(arr, j, j-gap);
			}
		}
	}
	
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
