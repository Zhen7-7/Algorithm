package teach_sort;

public class selectionSort_plus {
	public static void main(String[] args) {
		DataChecker.check();

		
	}
	static void sort(int[] arr) {
		
		
		for(int i=0;i<=(arr.length)/2;i++) {
			int minPtr = i;
			int maxPtr = arr.length-1-i;
			for(int j=i; j<=arr.length-1-i;j++) {
				minPtr = arr[j]<arr[minPtr] ? j:minPtr;
				
			}
			swap(arr,i,minPtr);
			for(int k=arr.length-1-i;k>=i;k--) {
				maxPtr = arr[k]>arr[maxPtr] ? k:maxPtr;
			}
			swap(arr,arr.length-1-i,maxPtr);
		}
		
	}
	//交换数组中的两个值
		static void swap(int[] arr,int a, int b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
	
}
