package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("初始進位");
		int x=scn.nextInt();
		System.out.println("轉換進位");
		int y=scn.nextInt();
		int n = scn.nextInt();
		System.out.println(test(x,y,n));
	}
	public static String test(int x,int y,int n){
		String b = "";
		int a=0;
		int z=0;
		String st = Integer.toString(n);
		for(int i=0;i<st.length();i++){
			a=n%10;
			z=(int)(a*Math.pow(x,i));
			n=n/10;
		}System.out.println(z);
		while(z>=1){
			b=Integer.toString((int)(z%y))+b;
			z=z/y;
		}
		return b;
	}
}


