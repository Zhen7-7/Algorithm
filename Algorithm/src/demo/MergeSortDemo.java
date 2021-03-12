package demo;

import cn.zhen77.sort.DataChecker;

public class MergeSortDemo {
	public static void main(String[] args) {
//		int n=9;
//		System.out.println(n/2);
		// {1,4,6,7,10,2,3,5,8,9} {8,7,6,5,4,3,2,1}
//		int[] arr ={1,4,6,7,10,2,3,5,8};
//		demo2(arr);
//		print(arr);
		DataChecker.check();
	}
	//��֪һ����˳�������(ǰ����˳��)�������:����һ�������������ָ��;
	static void demo2(int[] arr) {
		int mid = arr.length/2;
		int temp[] = new int[arr.length];
		
		int i=0;
		int j=mid+1;
		int k=0;
		while(i<= mid && j<arr.length) {
			if(arr[i]<=arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid) temp[k++] =arr[i++];
		while(j<arr.length) temp[k++]=arr[j++];
		
		for(int n=0;n<arr.length;n++) {
			arr[n] = temp[n];
		}
	}
	
	
	//��ν�����һ��Ϊ��
	/*static int[] demo1(int[] arr) {
		int[] arr1a=new int[arr.length/2];
		int[] arr1b=new int[arr.length-arr1a.length];
		return arr1a;
		
		
		
	}*/
	
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	static void print(int[] arr) {
		for(int n=0;n<arr.length;n++)
			System.out.print(arr[n]+"  ");
	}
}