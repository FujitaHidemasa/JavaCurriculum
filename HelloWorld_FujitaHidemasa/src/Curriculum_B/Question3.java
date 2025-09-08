package Curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	/************************************
	 * 　[概要] 繰り返しを行う反復処理
	 * 　[詳細] for文を使って反復処理を行う
	 ***********************************/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//問１
		for(int i = 1;i <= 10;i++) {
			System.out.println(i);
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問２
		for(int i = 2;i <= 20;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問３
		for(int i = 10;i >= 1;i--) {
			System.out.println(i);
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問４
		int total = 0;
		
		for(int i = 0;i <= 100;i++) {
			total +=i;
		}
		System.out.println(total);
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問５
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");//見やすいように改行を入れています。
		
		//・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・
		
		/************************************
		 * 　[概要] 繰り返しを行う反復処理
		 * 　[詳細] while文を使って反復処理を行う
		 ***********************************/
		
		//問６
		int a = 1;
		
		while(a <= 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問７
		int b = 2;
		while(b <= 20) {
			if(b%2 == 0) {
				System.out.println(b);
				b++;
			}else {
				b++;
			}
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問８
		int c = 10;
		while(c > 0) {
			System.out.println(c);
			c--;
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問９
		Scanner sc = new Scanner(System.in);
		int count ;
		
		do {
			System.out.print("回数を入力してください：");
			count = sc.nextInt();
		}while(count != 0);
		
		sc.nextLine();
		System.out.println("終了します");
		System.out.println("");//見やすいように改行を入れています。
		
		
		
		//問１０
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				
				if(j == 9) {
					System.out.printf("%02d × %02d = %02d",i,j,(i*j));
				}else {
				System.out.printf("%02d × %02d = %02d || ",i,j,(i*j));
				}
			}
			System.out.println("");
		}
		System.out.println("");//見やすいように改行を入れています。
		
		
		//問１１
		Random rand = new Random();
		
		System.out.println("在庫を確認した商品を「、」区切りで入力してください");
		
		String name = sc.nextLine();
		String[] items = name.split("、");
				
		int tv = rand.nextInt(11);
		int dis = 11 - tv;
		
		for(String item : items) {
			switch(item) {
			case "パソコン":
			case "冷蔵庫": 
			case "洗濯機":
			case "扇風機":
			case "加湿器":
				int stock = rand.nextInt(12);
				System.out.println(item + "の残り台数は" + stock + "台です。");
				break;
				
			case "テレビ":
			case "ディスプレイ":
				if(item.equals("テレビ")) {
					System.out.println("テレビの残り台数は" + tv + "台です。");
				}else {
				System.out.println("ディスプレイの残り台数は" + dis + "台です。");
				}
				break;
				
			default:
				System.out.println("『受け取った値』は指定の商品ではありません");
				break;
			}
		}
		sc.close();
		
	}
}
