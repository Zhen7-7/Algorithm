package cn.zhen77.sort;
//内啡肽

public class QuickSort{
	public static void main(String[] args) {
//		int[] arr = {8,4,6,2,6,7,4,2,3,1,3,1,10,6,5,6};
//		sort(arr,0,arr.length-1);
//		TestTool.print(arr);
		DataChecker.check();	
	}
	static void sort(int[] arr,int leftBound,int rightBound) {
		if(leftBound>=rightBound) return;
		int mid = partition(arr, leftBound,rightBound);
		sort(arr,leftBound,mid-1);
		sort(arr,mid+1,rightBound);
	}
	
	/*关键词partition:分区   pivot:轴*/
	static int partition(int arr[],int leftBound,int rightBound) {
		int left = leftBound;
		int right = rightBound-1;
		int pivot = arr[rightBound];
		while(left <= right) {
			while(left<=right && arr[left]<=pivot) left++;//避免出现right和rightBound交换
			while(left<=right && arr[right]>pivot) right--;
			if(left<right)swap(arr,left,right);
		}
		swap(arr,left,rightBound);

		return left;
	}
	static void swap(int[] arr ,int a ,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
