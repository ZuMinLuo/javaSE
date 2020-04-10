package HomeWork;
/**
 * 
 * @author Luo
 * @date 2020年4月10日
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		String trainNum = "G8888次";//车次
		String travellerName = "张三";//旅客姓名
		String travellerNum = "320423********4520";//旅客身份证号
		String starting = "南京";//出发站
		String finishing = "北京";//终点站
		String departureTime = "15:00";//发车时间
		char seat = '硬';//硬座/软座
		double cost = 666.66;//票价
		int peopleNum = 1200;//乘客人数
		
		System.out.println("车次:"+trainNum);
		System.out.println("旅客姓名:"+travellerName);
		System.out.println("旅客身份证号:"+travellerNum);
		System.out.println("出发站:"+starting);
		System.out.println("终点站:"+finishing);
		System.out.println("发车时间:"+departureTime);
		System.out.println("硬座/软座:"+seat);
		System.out.println("票价:"+cost);
		System.out.println("乘客人数:"+peopleNum);
	}

}
