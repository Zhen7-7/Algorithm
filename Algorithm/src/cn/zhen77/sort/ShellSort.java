package cn.zhen77.sort;

public class ShellSort {
	/*�㷨˼��:shell�㷨��insertion��������;
	 * ���Ƚ����鰴�ռ��Ϊ4ȥ���ղ�������ȥ����
	 * 
	 * */
	public static void main(String[] args) {
		DataChecker.check();
	}
	static void shellSort(int[] arr) {
		//���Ϊ4
		
	}
	static void middle(int[] arr ) {
		//���Ϊ4 int m  m+=4;  
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
