package teach_sort;

public class ShellSort {
/*
	ShellSort��ϣ������
		ShellSort��InsertionSort���������һ���ֳơ���С�������򡱣�Diminishing Increment Sort��
		��ֱ�Ӳ��������㷨��һ�ָ���Ч�ĸĽ��汾��
		����D.L.Shell �� 1959 �����������
	�㷨˼�룺ShellSort���ƴ�ͳ�İ����Ͱ�Ĳ��ƹ��򣬴������ͨ�����ü����gap������һ��gap��һ�Ρ�
	 		�� ��2,3,4,5,6,1��Ҫ���뵽��0��λ����Ҫ����5�����Ǽ��Ϊ0�����
	 		������2λ����Ϳ����Ⱥ�5�����ں�3����������3��λ�á�1��
	 		֮��ͨ�����һ����1Ϊ����ٺ�2�������ˡ�0���� ֻ��Ҫ3��
	 		
	 		
*/
	public static void main(String[] args) {
		DataChecker.check();
	}
	static void shellSort(int[] arr) {
		
		int h=1;
		while(h<=arr.length/3) {
			h=3*h+1;
		}
		for(int gap=h;gap>0;gap=(gap-1)/3) {
			insertionSort(arr, gap);
		}
		
	}
	static void insertionSort(int[] arr,int gap) {
		for(int i=gap;i<arr.length;i++) {
			for(int j=i;j>gap-1;j-=gap) {
				if(arr[j]<arr[j-gap]) swap(arr, j, j-gap);
			}
		}
		
	}
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]= temp;
	}
}
