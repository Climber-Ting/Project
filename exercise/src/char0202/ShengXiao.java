package char0202;
import java.util.*;
/*
编写一个程序，为一个给定的年份找出其对应的中国生肖。
中国的生肖基于12年一个周期，每年用一个动物代表：
	rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
    horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
提示：2019年：猪   2019 % 12 == 3 
 */
public class ShengXiao {
	public static void main(String[] args) {
		System.out.print("请输入一个年份：");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		String y="";
		switch(year%12) {
		case 3:y="猪年";break;
		case 2:y="狗年";break;
		case 1:y="鸡年";break;
		case 0:y="猴年";break;
		case 11:y="羊年";break;
		case 10:y="马年";break;
		case 9:y="蛇年";break;
		case 8:y="龙年";break;
		case 7:y="兔年";break;
		case 6:y="虎年";break;
		case 5:y="牛年";break;
		case 4:y="鼠年";break;
		}
		
		System.out.print(year+"年是"+y);
	}
}
