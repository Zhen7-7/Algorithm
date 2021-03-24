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
        System.out.println(i3 == i4);//false ��Ϊ==�Ƚϵ�����������ĵ�ַ
        boolean flag = i3.equals(i4);
        System.out.println(flag);
        
        Integer i5=20;
        Integer i6=20;
        System.out.println(i5==i6);
        System.out.println("------------------------");

        //intValue() :���ý�Integer--->int
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
        
        //Calendar��һ�������࣬������ֱ�Ӵ�������
        //GregorianCalendar()���� extends Calendar��������һ�������ࣩ
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal.toString());
        //���õķ�����
        // get���������������Calendar�ж���ĳ���
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));//��ȡ�������ڵ��������
        System.out.println(cal.getActualMinimum(Calendar.DATE));//��ȡ�������ڵ���С����
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
        //ѧϰRandom��
        //��1�����ô������Ĺ�������������
        Random r1 = new Random(System.currentTimeMillis());
        int iy4 = r1.nextInt();
        System.out.println(iy4);
        //��2�����ÿղι�������������
        Random r2 = new Random();//�������ڵ����޲�����������ʵ�ʵײ㻹�ǵ����˴��ι�����
        System.out.println(r2.nextInt(10));//�� 0����������ָ��ֵ����������֮����ȷֲ��� int ֵ��
        System.out.println(r2.nextDouble());//�� 0.0 �� 1.0 ֮����ȷֲ��� double ֵ��
        
	}

}
