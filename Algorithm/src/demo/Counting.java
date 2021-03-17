package demo;

public class Counting {
	//范围从1-5  需要一个长度为5的数组
	public static void main(String[] args) {
		int[] arr= {1,1,3,3,5,5,8,9};
		counting(arr,1,9);
		
	}

	static void counting(int[] arr,int min,int max) {
		int range = max - min +1;
		int[] a = new int[range];
		for(int j = 0;j<arr.length;j++) {
			a[arr[j]-min] +=1;
		}
		
		giving(arr, a, min, max);
		
	}
	static void giving(int[] arr,int[] a,int min,int max) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=a[i];j++) {
				if(a[i]>0)arr[count++]=min+i;
			}
		}
		print(arr);
		System.out.println();
		print(a);
		
	}
	static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i+"  ");
		}
	}
}
