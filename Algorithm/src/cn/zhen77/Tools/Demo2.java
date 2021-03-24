package cn.zhen77.Tools;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		int m = Integer.valueOf(180);
		System.out.println(m);
		Integer i1 = new Integer(6);
		Integer i2 = new Integer(12);
		System.out.println(i1.compareTo(i2));
		Integer i3 = new Integer(12);
        Integer i4 = new Integer(12);
        System.out.println(i3 == i4);//false 因为==比较的是两个对象的地址
        boolean flag = i3.equals(i4);
        System.out.println(flag);
        
        Integer i5=20;
        Integer i6=20;
        System.out.println(i5==i6);
        System.out.println("------------------------");

        //intValue() :作用将Integer--->int
        Integer i7 = 130;
        int i = i7.intValue();
        System.out.println(i);
        //parseInt(String s) :String--->int:
        int i8 = Integer.parseInt("129");
        System.out.println(i8);
        //toString:Integer--->String
        Integer i10 = 130;
        System.out.println(i10.toString());
        System.currentTimeMillis();
        
        //Calendar是一个抽象类，不可以直接创建对象
        //GregorianCalendar()子类 extends Calendar（父类是一个抽象类）
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal.toString());
        //常用的方法：
        // get方法，传入参数：Calendar中定义的常量
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));//获取当月日期的最大天数
        System.out.println(cal.getActualMinimum(Calendar.DATE));//获取当月日期的最小天数
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
      //LocalDateTime-->String:
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);
        
        System.out.println("------------------");
        //学习Random类
        //（1）利用带参数的构造器创建对象：
        Random r1 = new Random(System.currentTimeMillis());
        int iy4 = r1.nextInt();
        System.out.println(iy4);
        //（2）利用空参构造器创建对象：
        Random r2 = new Random();//表面是在调用无参数构造器，实际底层还是调用了带参构造器
        System.out.println(r2.nextInt(10));//在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        System.out.println(r2.nextDouble());//在 0.0 和 1.0 之间均匀分布的 double 值。
        
	}

}
