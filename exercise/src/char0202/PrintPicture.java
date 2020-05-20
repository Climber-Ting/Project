package char0202;
import java.util.*;
/*
	 打印1-100之间13的倍数，使用for循环
	使用双重循环打印20 * 8的矩形，使用for循环实现
	用for循环计算1000以内偶数的和
 */

import org.junit.Test;

public class PrintPicture {
	@Test
	//打印1-100之间13的倍数，使用for循环
	public void test1() {
		for(int i=1;i<=100;i++) {
			if(i%13==0) {
				System.out.print(i+" ");
			}
		}
	}
	@Test
	//使用双重循环打印20 * 8的矩形，使用for循环实现
	public void test2() {
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=20;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	//用for循环计算1000以内偶数的和
	public void test3() {
		int sum=0;
		for(int i=0;i<=1000;i+=2) {
			sum+=i;
		}
		System.out.print(sum);
	}
}

