package cn.zhen77.sort;

public class MergeSort {
	public static void main(String[] args) {
//		int[] arr ={1,4,6,7,10,2,3,5,8};
//		
//		sort(arr, 0, arr.length -1);
//		print(arr);
		DataChecker.check();
	}
	static void sort(int[] arr,int left,int right) {
		if(left==right) return;  //˵��ֻ��һ��Ԫ�ػ���ɶ˳��;
		//�ֳ�����
//		int mid = (left+right)/2  Ϊʲô�������Ǹ� int��left+right����Խ��
		int mid = left+(right-left)/2;
		//�������
		sort(arr,left,mid);
		//�ұ�����
		sort(arr,mid+1,right);
		//��������ϲ�
		merge(arr,left,mid+1,right);
	}
	
	
	
	//��֪һ������ǰ�����θ����Ѿ����ź�˳����ν��кϲ�
	static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound) {
		int mid = rightPtr-1;
		int[] temp = new int[rightBound-leftPtr+1];//����һ�����Ⱥ�r-f+1��ͬ������
		//��������ָ��
		int i = leftPtr;//���ָ��
		int	j = rightPtr;//�Ҳ�ָ��
		int k = 0;//ָ��temp�����ָ��
		//������ָ��ָ���ֵС�Ĵ���temp
		//ע�ⲻҪ����+1
		while(i<=mid && j<=rightBound) {
			temp[k++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
		}
		//��һ��ĸ���Զ������һ�����ʱ,�ͽ�ʣ�µ�ֵȫ������temp��
		while(i<=mid) temp[k++]=arr[i++];
		while(j<=rightBound) temp[k++]=arr[j++];
		//��temp�������¸�ֵ��arr
		//��������� 
		for(int m=0;m<temp.length;m++) {
			arr[leftPtr+m]=temp[m];
		}
	}
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
}