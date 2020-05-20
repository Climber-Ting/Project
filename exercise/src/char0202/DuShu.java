package char0202;
import java.util.*;
/*  赌数游戏
	提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
	如果三个骰子点数和，小于或等于9，则为“小”。
	如果三个骰子点数和，大于9，则为“大”。
	用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
*/
public class DuShu {
	public static void main(String[] args) {
		int a=(int)(Math.random()*6+1);
		int b=(int)(Math.random()*6+1);
		int c=(int)(Math.random()*6+1);
		int sum=a+b+c;
		String result="";
		Scanner input=new Scanner(System.in);
		System.out.print("请押宝：（大、小、豹子）：");
		String guess=input.next();
		if(a==b&&b==c) {
			result="豹子";
		}
		if(sum<=9) {
			result="小";
			
		}else if(sum>9) {
			result="大";
		}
		System.out.println(a+" "+b+" "+c+" "+sum);
		if(result.equals(guess)) {
			System.out.print("正确");
		}else {
			System.out.print("错误");
		}
		
	}
		
}


