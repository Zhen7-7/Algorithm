package teach_sort;

public class BubbleSort {
	//�㷨˼��: 
	/*
	 * ��ѭ��˼·:ÿ������һ�αȽ�,ǰ��>����,���н���,֮�������������,�����Ƚ�.ֱ���Ƚϵ����������
	 * ���:��һ����ѭ��������,�Ὣ�������ŵ����;
	 * ��ѭ��:֮��ÿ����ѭ���Ὣ�Ƕ�λԪ������Խϴ���ŵ��Ƕ�λԪ��֮��(��λԪ��֮ǰ)
	 * ֱ����2����������;�������;
	 * */
	public static void main(String[] args) {
		DataChecker.check();
	}
	static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int  j=0 ;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) swap(arr,j,j+1);
			}
		}
	}
	//����
	static void swap(int[] arr ,int a ,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//���
	static void print(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}