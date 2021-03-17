package cn.zhen77.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class CountingChecker {
	static boolean checker() {
		Random random = new Random();
		int[] arr=new int[1000];
		for(int i =0; i<arr.length;i++ ) {
			arr[i]=random.nextInt(10);
		}
		
//		int[] arr1 = Arrays.copyOf(arr,aArr.length);
		int[] result = Counting.counting(arr);
		Arrays.sort(arr);
		boolean equality = false;
		for(int i=0;i<result.length;i++) {
			equality = result[i]!=arr[i]?false:true;
		}
//		if(equality==true) {
//			System.out.println("right");
//		}else {
//			System.out.println("wrong");
//		}
		return equality;
	}
	@Test
	public void test() {
		boolean equ = true;
		for(int i=0;i<1000;i++) {
			boolean equality = checker();
			if(equality==false) {
				equ=false;
			}
		}
			if(equ==true) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}

}
