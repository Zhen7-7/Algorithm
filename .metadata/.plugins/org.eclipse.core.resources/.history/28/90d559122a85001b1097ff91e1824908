package teach_sort;

import java.util.Arrays;
import java.util.Random;

public class DataChecker {
	static int[] generaterRandomArray() {
		Random r = new Random();
		int[] arr = new int[1000];
		for (int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(1000000);//随机生成1000000以内的随机数
		}
		return arr;
	}
	public static void check() {
		boolean same = true;
		for(int times = 0; times < 1000; times++) {
			int[] arr = generaterRandomArray();
			int[] arr2 = new int[arr.length];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			
			Arrays.sort(arr);
			BubbleSort.sort(arr2);
//			BubbleSort_plus.sort(arr2);
			InsertionSort.sort(arr2);
//			ShellSort.insertionSort(arr2);
//			ShellSort.shellSort(arr2);

//			MergeSort.sort(arr2, 0, arr2.length-1);
//			selectionSort_plus.sort(arr2);
//			QuickSort.sort(arr2,0,arr2.length-1);
			
			
			for (int i = 0; i < arr2.length; i++) {
				if(arr[i] != arr2[i]) same = false;
			}
		}
		
		
		
		System.out.println(same == true ? "right" : "wrong");
	}
}
