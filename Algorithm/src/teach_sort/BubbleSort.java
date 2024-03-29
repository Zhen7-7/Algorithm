package teach_sort;

public class BubbleSort {
	//算法思想: 
	/*
	 * 内循环思路:每两个数一次比较,前者>后者,进行交换,之后往后窜两个数,继续比较.直到比较到最后两个数
	 * 结果:第一次内循环结束后,会将最大的数排到最后;
	 * 外循环:之后每次内循环会将非定位元素中相对较大的排到非定位元素之后(定位元素之前)
	 * 直到第2个数排序完;排序结束;
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
	//交换
	static void swap(int[] arr ,int a ,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//输出
	static void print(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
