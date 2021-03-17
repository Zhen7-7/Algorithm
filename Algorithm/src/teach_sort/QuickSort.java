package teach_sort;

/*
  	算法思想:
  	1.找到一个轴(pivot)(第一部分排序之后,会让轴的左侧的值全部小于轴,让轴的右侧部分全部大于轴)
  	2.左右两指针遇见满足要求的不断移动,直到遇到了违规行为,定位且交换
  	3.递归方式:以轴为分界不断的拆分,小数组依然用同样的方式
  	4.处理边界和极端情况
  	5.平均时间复杂度O(nlogn) 最差O(n²)
	什么时候最差:本身有顺序:n+(n-1).....
	如何优化? 判断是否是顺序增长(降低)趋势  或者不仅仅局限在最右侧,每次随机取个数和最右侧交换
	6.空间复杂度:每次递归需要一些额外的变量的空间,取决于分了多少层O(logN)
 
 */
public class QuickSort {
	public static void main(String[] args) {
		DataChecker.check();
		int arr[] = {1,5,8,9,4,5,3};
		sort(arr, 0, arr.length-1);
		print(arr);
	}
	static void sort(int[] arr,int leftBound,int rightBound) {
		if(leftBound>=rightBound) return;
		int mid = partition(arr, leftBound, rightBound);
		sort(arr,leftBound,mid-1);
		sort(arr,mid+1,rightBound);
	}
	//分区
	static int partition(int[] arr,int leftBound,int rightBound) {
		int left = leftBound;
		int right = rightBound-1;
		int pivot = arr[rightBound];
		
		while(left<=right) {
			while(arr[left]<=pivot && left<=right) left++;
			
			while(arr[right]>=pivot && left<right) right--;
			
			if(left<right) swap(arr,left,right);
		}
		swap(arr,left,rightBound);
		return left;
		
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
