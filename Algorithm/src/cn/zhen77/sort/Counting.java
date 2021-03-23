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
			count[arr[i]-min]++;  //��Сֵ��10  �������15 ��ô15-10=5  �����ǵ�6��λ��
		}

		//ΪʲôҪע�͵�,����Ϊʹ�����ַ�ʽ�õ���ԭ���鲻�ȶ�,�����ʱ��������Ҫһ���ȶ����㷨
//		for(int i=0,j=0;i<count.length;i++) {
//			while(count[i]-->0) {
//				arr[j++] =i+min;
//			}
//		}   
		
		//���Ϊ��һ���ȶ����������ô����?
		//1.����һ���ۼ�����
		for(int i=1;i<count.length;i++) {
			count[i]=count[i]+count[i-1];
		}
		//2.����  ��λ��
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
	//�����
	static void print(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}