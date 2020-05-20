package char0202;
import java.util.*;
/*
假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，
然后按照下面的规则判定用户是否能赢。
1)如果用户输入的数匹配彩票的实际顺序，奖金10000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。

提示：使用Math.random() 产生随机数
Math.random() 产生[0,1)范围的随机值
Math.random() * 90：[0,90) 
Math.random() * 90 + 10：[10,100) 即得到  [10,99]
使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数。

 */
public class CaiPiao {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int bonus=0;
		System.out.print("请输入一个两位数");
		int random=(int)(Math.random()*90+10);
		int yh=input.nextInt();
		if(yh==random) {
			bonus=10000;
		}
		else if(yh/10==random%10&&yh%10==random/10){
			bonus=3000;
		}
		else if(yh/10==random/10||yh%10==random%10) {
			bonus=1000;
		}
		else if(yh/10==random%10||yh%10==random/10) {
			bonus=500;
		}
		
		System.out.print("中奖号码是："+random+"\n奖金是："+bonus+"美金");
		
	}

}
