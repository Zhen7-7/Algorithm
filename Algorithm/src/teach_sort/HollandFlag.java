package teach_sort;

public class HollandFlag {

	/*
	 * 荷兰国旗问题 给定一个数组，指定一个数，让比这个数小的放在左面，比这个数大的放在右面；和这个数相等的数放中间
	 * 
	 * 1.如果 [i]= num 那么i++ 其他不动 2.如果 [i]<num那么[i]和<区的下一个数进行交换， <区右移 i++ 3. 如果
	 * [i]>num 那么[i]和>区的上一个数进行交换， >区左移 i不动
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 6, 8, 7, 5, 6, 4, 5, 4, 5, 8, 6, 9, 2, 4, 8, 2, 5, 7, 8 };
		deal(arr, 6);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void deal(int[] arr, int num) {
		int lp = -1; // <区域
		int rp = arr.length; // >区域
		int i = 0;
		while (i <= rp) {
			if (arr[i] == num) {
				i++;
			} else if (arr[i] < num) {
				swap(arr, i++, ++lp);
			}
			// if(arr[i]>num)
			else {
				swap(arr, i, --rp);
				
			}
		}

	}

	static void swap(int[] arr, int a, int b) {
		arr[a]=arr[a] ^ arr[b];
		arr[b]=arr[a] ^ arr[b];
		arr[a]=arr[a] ^ arr[b];
		
		
	}

}
