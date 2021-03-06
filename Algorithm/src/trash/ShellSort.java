package trash;

import cn.zhen77.sort.DataChecker;

public class ShellSort {
	/*算法思想:shell算法是insertion的升级版;
	 * 首先将数组按照间隔为4去按照插入排序去排列
	 * 
	 * */
	public static void main(String[] args) {
//		DataChecker.check();
		//		int[] arr = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
//		insertionSort(arr);		
//		shellSort(arr);
//		TestTool.print(arr);
	}
	static void shellSort(int[] arr) {
		for(int j=6;j>0;j--) {
			middle(arr, j);
		}
	}
	static void middle(int[] arr,int a) {
		//间隔为4 int m  m+=3;  
		for(int n=a;n<arr.length;n+=a) {
			for(int i=n;i>0;i-=a) {
				if(arr[i]<arr[i-a]) {
					swap(arr, i, i-a);
				}
			}
		}
		
	}
	
	static void insertionSort(int[] arr) {
		for(int n=1;n<arr.length;n++) {
			for(int i=n;i>0;i--) {
				if(arr[i]<arr[i-1]) {
					swap(arr,i,i-1);
				}
			}
		}
	}
	
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
}
