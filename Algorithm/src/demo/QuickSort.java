package demo;

public class QuickSort {
	/*
	  �㷨˼��: ����ָ��,һ������ʼ,һ�����ҿ�ʼ;ȷ��һ���м������,�������������RS(reference substance)��ָ��ֹͣ
	  		    ���Ҳ��ҵ�һ����С��rsʱ ,ָ��ֹͣ,�漴���н���;
	  		    ���� һ�����������ͻ�������ߵ���<rs  �ұߵ���>rs
	  		    ����:��һ��ָ��ָ����rsʱ,����һ�໹������������Ҫ����ô��,ֱ����rs�Ͳ�����Ҫ���������,��һ��ָ�������
	  		    ֱ����ָ������Ϊֹ
	 version1.0.1
	 */
	//�������������Ϸ�������ʵ��
	public static void main(String[] args) {
		int[] arr = {8,3,2,9,6,2,3,5,4,1,6};
		sort1(arr,4);
		print(arr);
	}
	static void sort1(int[] arr,int rs) {
		//��������ָ��
		int i = 0;
		int j = arr.length-1;
		while(i!=j) {
			while(arr[i]<arr[rs]) {
				i++;					//0-8   4-6
			}
			while(arr[j]>=arr[rs]&&j!=rs) {
				j--;
			}
			if(j==rs && arr[i]>arr[rs]) {
				swap(arr,i,rs);
				rs=i;
			}else if(i==rs && arr[j]<arr[rs]) {
				swap(arr,j,rs);
				rs=j;
			}else swap(arr,i,j);
		}
	}
	static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i+"  ");
		}
	}
}