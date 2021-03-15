package teach_sort;



/*算法思想:就是插扑克牌,
内循环:(针对1张牌)每次新来的扑克牌,依次和前面的牌进行比较,比前面小,就和其交换
	   结果就是最小的 牌会到适合他的位置
外循环 :对剩下的牌进行如上操作
时间复杂度:O(n²)
空间复杂度:O(1)
是稳定的
*/
public class InsertionSort {
	public static void main(String[] args) {
		DataChecker.check();
	}

	static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>=1 && arr[j]<arr[j-1];j--) {
				swap(arr,j,j-1); 
			}
		}
	}
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; 
	}

}
