package cn.zhen77.sort;

public class ShellSort {
	/*算法思想:shell算法是insertion的升级版;
	 * 首先将数组按照间隔为4去按照插入排序去排列
	 * 
	 * */
	public static void main(String[] args) {
		DataChecker.check();
	}
	static void shellSort(int[] arr) {
		//间隔为4
		
	}
	static void middle(int[] arr ) {
		//间隔为4 int m  m+=4;  
		for (int m=4;m<arr.length;m+=4) {
			
		}
		
	}
	
	static void insertionSort(int[] arr) {
		for(int n=0;n<arr.length;n++) {
			for(int i=n;i>0;i--) {
				if(arr[i]>arr[i-1]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					
				}
			}
		}
	}
	
}
