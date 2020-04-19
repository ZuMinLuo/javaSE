package HomeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Luo
 * @date 2020年4月19日
 *
 */
public class Hostipal {
	public static void main(String[] args) {
		Register();
	}
	public static void Register() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1:电话预约");
		System.out.println("2:微信小程序预约");
		System.out.println("3:线上预约");
		System.out.println("请选择您的操作");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("请咨询 8255 -8888 进行预约");
			
			break;
		case 2:
			System.out.println("请关注“苏州市立医院”服务公众号");
			break;
		case 3:
			System.out.println("请选择您要就诊的科室");
			Department();
			System.out.println("请选择专家姓名");
			doctor();
			System.out.println("请选择就诊时间");
			time();
			System.out.println("登记成功");
			System.out.println("请输入身份证号：");
			long id = sc.nextInt();
			System.out.println("请输入手机号码：");
			int phoneNum = sc.nextInt();
			Random x = new Random();
			for(int i = 0  ; i <1; i++){
				int regitNum = x.nextInt();
				System.out.println("您的就诊号码为:"+regitNum);			
			}
			
			break;
			default:System.out.println("输入有误");
			break;
		}		
	}
	public static void time() {
		Scanner sc = new Scanner(System.in);
		int select4 = sc.nextInt();
		switch (select4) {
		case 1:		
			System.out.println("8:30-11:30");
			break;
		case 2:
			System.out.println("13:30-15:30");
			break;
 		}				
	}
	public static void Department() {
		Scanner sc = new Scanner(System.in);
		int select3 = sc.nextInt();
		switch (select3) {
		case 1: System.out.println("外科");			
			break;
		case 2: System.out.println("内科");
		    break;
        case 3: System.out.println("骨科");
            break;
        case 4: System.out.println("儿科");
            break;
		default:System.out.println("输入有误");
			break;
		}	
	}
	public static void doctor() {
		Scanner sc = new Scanner(System.in);
		int select2 = sc.nextInt();
		switch (select2) {
		case 1: System.out.println("赵医生");
		break;
		case 2:	System.out.println("王医生");
		break;
		case 3:	System.out.println("李医生");
		break;
		case 4: System.out.println("宋医生");	
		break;
		case 5:	System.out.println("孙医生");
		break;
		case 6:	System.out.println("高医生");
		break;
		default: System.out.println("输入有误");
		break;		
     	}		
	}
}
