package demo;

import java.util.Arrays;
import java.util.Random;



public class SelectionSort {
	/*
	 * ѡ������     ʱ�临�Ӷ�O(n��ƽ��)  �ռ临�Ӷ�O(1)  ���ȶ�
	 * ˼��:ʹ��һ������minPtrĬ��ָ��arr[0]��������,��������arr[minPtr]С�Ľ�minPtrָ��ָ����λ��,
	 * ����arr[0]����  ֮�����ν���С��ѡ�����н��� 
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
			if(minPtr!=i) swap(arr,i,minPtr);//����Ӳ����ж϶�����
		}
	}
	
	//���������е�����ֵ
	static void swap(int[] arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//�������һ������Ϊ1000������
	static int[] generaterRandomArray() {
		Random r = new Random();
		int[] arr = new int[1000];
		for (int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(1000000);//�������1000000���ڵ������
		}
		return arr;
	}
	public static void check() {
		boolean same = true;
		for(int times = 0; times < 1000; times++) {
			int[] arr = generaterRandomArray();
			int[] arr2 = new int[arr.length];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			
			Arrays.sort(arr);//ʹ����������Ƿ�װ�õ�����
			selectionSort(arr2);
			
			
			for (int i = 0; i < arr2.length; i++) {
				if(arr[i] != arr2[i]) same = false;
			}
		}
		System.out.println(same == true ? "right" : "wrong");
	}
	
}