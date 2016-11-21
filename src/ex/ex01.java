package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = scn.nextFloat();
		System.out.println(test(n));
	}
	public static String test(float n){
		int a=0;
		String b = "";
		while(n>=1){
			b=Integer.toString((int)(n%2))+b;
			n=n/2;
		}
		return b;
	}
}
