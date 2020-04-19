package HomeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Luo
 * @date 2020年4月19日
 *
 */
public class Hotle {
	public static void main(String[] args) {			
		String[] time={"1号-10号","10号-20号","20号-30号"};
		checkTime(null);
		System.out.println("请选择要入住的酒店");
		order();
		System.out.println("选择你想要的房型");
		homeList();
		System.out.println("输入您想要入住的天数");
		days();
		System.out.println("支付成功 生成订单 您的订单号为:");
		Random x = new Random();
		for(int i = 0  ; i <1; i++){
			int Num = x.nextInt();
			System.out.println(Num);			
		}		
	}
	public static void list() {
		System.out.println("1:格林豪泰酒店");
		System.out.println("2:如家酒店");
		System.out.println("3:速8酒店");		
	}
	public static void list2() {
		System.out.println("1:维也纳酒店");
		System.out.println("2:锦江之星酒店");
		System.out.println("3:7天连锁酒店");
		
	}
	public static void list3() {
		System.out.println("1:全季酒店");
		System.out.println("2:汉庭酒店");
		System.out.println("3:希尔顿酒店");
		
	}
	public static void order() {
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
	}
	public static void homeList() {
		System.out.println("1:大床房 2:双人床 3:单人床4:多床");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch (select) {
		case 1:System.out.println("大床房");
			break;
		case 2:System.out.println("双人床");
			break;
		case 3:System.out.println("单人床");
			break;
		case 4:System.out.println("多床");
			break;
			default:
				System.out.println("输入有误！");
				break;
		}	
	}
	
	public static void checkTime(String time) {
		System.out.println("选择您要入住的时间段");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
        switch(select){
        case 1:
        	System.out.println("1号-10号可以预约的酒店有:");
        	list();
        	break;
        case 2:
        	System.out.println("10号-20号可以预约的酒店有:");
        	list2();
        	break;
        case 3:
        	System.out.println("20号-30号可以预约的酒店有:");
        	list3();
        	break;
        	default:
        		System.out.println("输入有误");
        		break;					
		}						
	}
	public static void days() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("入住天数为："+a+"天");	
		int y = a*100;
    	System.out.println("请支付"+y+"元");	
	}

}
