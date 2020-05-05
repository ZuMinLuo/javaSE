package com.luo.HomeWork;
/**
 * 
 * @author Luo
 * @date 2020年5月5日
 *
 */
public class TrainTest {
	public static void main(String[] args) {
		String [] Site = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};//站点
		double[] firstPrice={0,44.5,64.5,99.5,129.5,159.5,219.5};//一等座价格
		double[] secondPrice={0,29.5,39.5,64.5,79.5,99.5,139.5};//二等座价格
		run1(firstPrice, Site, secondPrice);
	}
	public static void run1(double[] firstPrice,String [] Site,double[] secondPrice) {
		for (int i = 0; i < firstPrice.length; i++) {		
			if (Site[i] == "丹阳") {
				System.out.println("去"+Site[i]+"的G7029的一等座价格："+firstPrice[i]+"元"+"二等座价格："+secondPrice[i]+"元");						
			}																
		}
	}
}
