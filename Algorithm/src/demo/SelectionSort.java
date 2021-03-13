package demo;

import java.util.Arrays;
import java.util.Random;



public class SelectionSort {
	/*
	 * 选择排序     时间复杂度O(n的平方)  空间复杂度O(1)  不稳定
	 * 思想:使用一个索引minPtr默认指向arr[0]遍历数组,当遇见比arr[minPtr]小的将minPtr指针指向新位置,
	 * 最后和arr[0]交换  之后依次将较小的选出进行交换 
	 * 
	 * */
	public static void main(String[] args) {
		check();
		
	}
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minPtr = i;
			for(int j=i+1;j<arr.length;j++) {
				minPtr = arr[j]<arr[minPtr]? j:minPtr;
			}
			if(minPtr!=i) swap(arr,i,minPtr);//这里加不加判断都可以
		}
	}
	
	//交换数组中的两个值
	static void swap(int[] arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//随机生成一个长度为1000的数组
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
			
			Arrays.sort(arr);//使用数组给我们封装好的排序
			selectionSort(arr2);
			
			
			for (int i = 0; i < arr2.length; i++) {
				if(arr[i] != arr2[i]) same = false;
			}
		}
		System.out.println(same == true ? "right" : "wrong");
	}
	
}
