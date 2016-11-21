package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("初始進位");
		int x=scn.nextInt();
		System.out.println("轉換進位");
		int y=scn.nextInt();
		float n = scn.nextFloat();
		String b = "";
		int a=0;
		int z=0;
		int s=0;
		while(n>0){
			a=(int)n%10;
			z=(int) (a*Math.pow(x,s));
			s++;
			n=n/10;
		}System.out.println(n);System.out.println(a);System.out.println(z);
		while(z>=1){
			b=Integer.toString((int)(z%y))+b;
			z=z/y;
		}
		System.out.println(z);System.out.println(b);
	}

}
