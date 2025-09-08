package Curriculum_B;

import java.util.Scanner;

public class Question4 {

	/************************************
	 * 　[概要] 配列を使った処理
	 * 　[詳細] 配列を使用し複数のデータを処理する
	 ***********************************/
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//問１
		int[] a = {1,2,3,4,5};
		
		for(int n : a) {
			System.out.println(n);
		}
		System.out.println("");//見やすい様に改行を入れています
		
		
		
		//問２
		int[] b = {10,20,30,40,50};
		for(int i = b.length -1;i >= 0 ;i--) {
			System.out.println(b[i]);
		}
		System.out.println("");//見やすい様に改行を入れています
		
		
		//問３
		int[] c = {3,5,7,9,11};
		int total = 0;
		
		for(int i = 0;i<c.length;i++) {
			total += c[i];
		}
		System.out.println(total);
		System.out.println("");//見やすい様に改行を入れています
		
		
		//問４
		int[] d = {12,7,9,21,5,18};
		int max = d[0];
		int min = d[0];
		for(int i = 1;i < d.length;i++) {
			
			if(d[i] > max) {
				max = d[i];
			}
			
			if(d[i] < min) {
				min = d[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("");//見やすい様に改行を入れています
		
		
		//問５
		int[] e = {1,2,3,4,5};
		
		for(int x : e) {
			System.out.println(x * 2);
		}
		System.out.println("");//見やすい様に改行を入れています
		
		
		//問6
		
		Scanner sc = new Scanner(System.in);
		int[] f = {4,7,10,15,20};
		System.out.print("値を入力してください：");
		int input = sc.nextInt();
		
		for(int i = 0;i < f.length;i++) {
			if(input == f[i]) {
				System.out.println("入力した値は配列に含まれています");
				break;
			}else {
				System.out.println("入力した値は配列に含まれていません");
				break;
			}
		}
		
		
	}

}
