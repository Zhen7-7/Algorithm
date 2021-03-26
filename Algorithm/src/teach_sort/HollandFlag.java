package teach_sort;

public class HollandFlag {

	/*
	 * ������������ ����һ�����飬ָ��һ�������ñ������С�ķ������棬���������ķ������棻���������ȵ������м�
	 * 
	 * 1.��� [i]= num ��ôi++ �������� 2.��� [i]<num��ô[i]��<������һ�������н����� <������ i++ 3. ���
	 * [i]>num ��ô[i]��>������һ�������н����� >������ i����
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 6, 8, 7, 5, 6, 4, 5, 4, 5, 8, 6, 9, 2, 4, 8, 2, 5, 7, 8 };
		deal(arr, 6);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void deal(int[] arr, int num) {
		int lp = -1; // <����
		int rp = arr.length; // >����
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
