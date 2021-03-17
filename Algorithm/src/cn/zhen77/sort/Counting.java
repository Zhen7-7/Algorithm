package cn.zhen77.sort;

import javax.tools.Tool;

public class Counting {
	public static void main(String[] args) {
		// 1 = arr[0] 
		int[] arr = {1,5,2,3,6,8,5,7,8,9,7,4};
		int[] result = counting(arr);
		print(result);
	}
	static int[] counting(int[] arr) {
		int[] result = new int[arr.length];
		int min= findMin(arr);
		int range = getRange(arr);
		int[] count = new int[range];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]-min]++;  //最小值是10  这个数是15 那么15-10=5  正好是第6个位置
		}

		//为什么要注释掉,是因为使用这种方式得到的原数组不稳定,更多的时候我们需要一个稳定的算法
//		for(int i=0,j=0;i<count.length;i++) {
//			while(count[i]-->0) {
//				arr[j++] =i+min;
//			}
//		}   
		
		//如果为了一个稳定的数组该怎么做呢?
		//1.创建一个累加数组
		for(int i=1;i<count.length;i++) {
			count[i]=count[i]+count[i-1];
		}
		//2.倒叙  找位置
		for(int i=arr.length-1;i>=0;i--) {
			result[--count[arr[i]-min]]=arr[i];
		}
		
	
		return result;
	}
		
	
	
	static int getRange(int[] arr) {
		int range = findMax(arr)-findMin(arr)+1;
		return  range;
	}
	static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			min= arr[i]<min? arr[i]:min;
		}
		return min;
	}
	static int findMax(int[] arr) {
		int max = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			max= arr[i]>max? arr[i]:max;
		}
		return max;
	}
	//输出器
	static void print(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
