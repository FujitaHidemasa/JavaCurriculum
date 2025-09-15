package Curriculum_D;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
//playerとdeamonを作る
		System.out.println("プレイヤーの名前を入力してください");
		String name = sc.nextLine();
		
		int hp = rand.nextInt(51) + 50;  // 50〜100
		
		int at = rand.nextInt(11) + 10;  // 10〜20
		
		int sp = rand.nextInt(8) + 3;    // 3〜10
		
		
		Character player = new Character(name, hp, at, sp);
		
		player.showStatus();
		
		Character daemon = DaemonLoader.loadDeamon();

		if (daemon != null) {
		    daemon.showStatus();
		} else {
		    System.out.println("敵データの読み込みに失敗しました");
		}

		
//バトル
		
		//テキストファイル（battle_log.txt）に書き込む
		 try (PrintWriter writer = new PrintWriter(new FileWriter("battle_log.txt", false))) {
		
			 System.out.println("");
			 
			 writer.println("戦闘開始！！");
			 System.out.println("戦闘開始！");
			 
			 
			 //hpが０になるまで繰り返す
			 while (player.getHp() > 0 && daemon.getHp() > 0) {
				 
				 Character first;  //先攻
				 Character second; //後攻
				 
				 //spが高い方が先攻
				 if(player.getSp() > daemon.getSp()) {
					 
					 first = player;
					 second = daemon;
					 //先攻プレイヤー・後攻デーモン
					 
				 }else if(daemon.getSp() > player.getSp()) {
					 
					 first = daemon;
					 second = player;
					 //先攻デーモン・後攻プレイヤー
				 }else {
					 //spが同値の場合ランダム
					 if (rand.nextBoolean()) {
				            first = player;
				            second = daemon;
				        } else {
				            first = daemon;
				            second = player;
				        }
				 }
				 
				 //先攻の攻撃
				 first.attack(second);
				 
				 int secondHp = Math.max(second.getHp(), 0);
					 writer.println( first.getName() + "の攻撃！" + second.getName() + " は " + first.getAt() + " のダメージを受けた!");
					 writer.println(second.getName() + "残HP：" + secondHp);
					 writer.println("");
				 
				 System.out.println( first.getName() + "の攻撃！" + second.getName() + " は " + first.getAt() + " のダメージを受けた!");
				 System.out.println( second.getName() + " 残HP：" + secondHp);
				 System.out.println("");
				 
				 
				 //相手のHPが０になれば終了
				 if(second.getHp() <= 0) {
					 writer.println("戦闘終了！");
					 writer.println( first.getName() + "の勝利！");
					 
					 System.out.println("戦闘終了！");
					 System.out.println(first.getName() + "の勝利！");
					 break;
				 }
				 
				 //後攻の攻撃
				 second.attack(first);
				 
				 int firstHp = Math.max(first.getHp(), 0);
				 writer.println( second.getName() + "の攻撃！" + first.getName() + "は" + second.getAt() + "のダメージを受けた！");
				 writer.println( first.getName() + "　残HP：" + firstHp);
				 writer.println("");
				 
				 System.out.println( second.getName() + "の攻撃！" + first.getName() + "は" + second.getAt() + "のダメージを受けた！");
				 System.out.println(first.getName() + "　残HP：" + firstHp);
				 System.out.println("");
				 
				
				 if(first.getHp() <= 0) {
					 writer.println("戦闘終了！");
					 writer.println( second.getName() + "の勝利！");
					 
					 System.out.println("戦闘終了！");
					 System.out.println( second.getName() + "の勝利！");
				 }
			 }
		 }catch (Exception e) {
			   e.printStackTrace();
		 }
	}
}
