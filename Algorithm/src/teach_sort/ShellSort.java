package teach_sort;

public class ShellSort {
/*
	ShellSort：希尔排序
		ShellSort是InsertionSort插入排序的一种又称“缩小增量排序”（Diminishing Increment Sort）
		是直接插入排序算法的一种更高效的改进版本。
		是由D.L.Shell 于 1959 年提出而得名
	算法思想：ShellSort打破传统的按部就班的插牌规则，代替的是通过设置间隔（gap），隔一个gap插一次。
	 		如 ：2,3,4,5,6,1想要插入到【0】位置需要交换5次这是间隔为0的情况
	 		而是用2位间隔就可以先和5交换在和3交换到达了3的位置【1】
	 		之后通过最后一个以1为间隔再和2交换到了【0】上 只需要3次
	 		
	 		
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
