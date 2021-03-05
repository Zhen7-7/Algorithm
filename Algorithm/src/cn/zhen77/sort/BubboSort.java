package cn.zhen77.sort;

public class BubboSort {
	public static void main(String[] args) {
		
		/*for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}*/
		
		DataChecker.check();
		
	}
	static int[] sort(int[] arr) {
		for(int n=0; n<arr.length-1;n++) {
			for(int i=0;i<n;i++) {
				if(arr[i]>arr[i+1]) swap(arr,i,i+1);
			}
		}
		return arr;
	}
	//生成随机数组
	static int[] getRandom() {
		int[] arr = new int[100];
		
		for(int i = 0;i<100;i++) {
		 int num = (int)(Math.random()*100);
		 arr[i] = num;
		}
		return arr;
	}
	//交换器
	static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
}

