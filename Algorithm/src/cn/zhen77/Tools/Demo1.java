package cn.zhen77.Tools;

import java.util.Arrays;

public class Demo1 {

	  public static void main(String[] args){
          //method01(10);
          //method01();
          //method01(20,30,40);
          method01(30,40,50,60,70);
          method01(1,new int[]{11,22,33,44});
          int[] arr5 = {1,3,7,2,4,8};
          Arrays.fill(arr5,10);
          System.out.println(Arrays.toString(arr5));
	  }
	 static void method01(int num2,int...num){
          System.out.println("-----1");
          for(int i:num){
                  System.out.print(i+"\t");
          }
          System.out.println();
          
          System.out.println(num2);
  }
	  

}
