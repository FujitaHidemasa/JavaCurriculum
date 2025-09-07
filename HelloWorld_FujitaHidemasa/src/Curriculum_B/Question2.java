package Curriculum_B;

public class Question2 {
	
	/************************************
	 * 　[概要] 条件式を使った表示
	 * 　[詳細] 条件式を使用し条件に応じた処理を行い表示する
	 ***********************************/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問１
		int score = 75;
		
		if(score >= 60) {
			System.out.println("合格です！");
		}
		
		
		//問２
		int age = 25;
		if(age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		}else {
			System.out.println("対象外です");
		}
		
		
		//問３
		 age = 18;
		 
		 if(age >= 20) {
			 System.out.println("成人です");
		 } else if (age >= 13 && age <= 19) {
			 System.out.println("ティーンエイジャーです");
		 } else {
			 System.out.println("子供です");
		 }
		
		 
		 //問４
		 int x = 30;
		 int y = 15;
		 int z = 50;
		 
		int max = x;
		
		if(y > max) {
			max = y;
		}
		
		if(z > max) {
			max = z;
		}
		
		System.out.println(max);
		 
		 
		//問５
		int num = 0;;
		
		if(num > 0) {
			System.out.println("正の数です");
		}else if(num < 0){
			System.out.println("負の数です");
		}else {
			System.out.println("0です");
		}
		
		
		//問６
		int value = 2;
		
		if(value%2 == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}
		
		
		//問７
		score = 49;
		
		if(score >= 90) {
			System.out.println("優");
		}else if(score >= 70 && score < 90 ) {
			System.out.println("良");
		}else if(score >= 50 && score <70) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		
		//問８
		String name =" ";
		
		if(name == null || name.equals(" ")) {
			System.out.println("入力が無効です");
		}
		
		//・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・・
		
		
	//　switch型条件分岐
		
		//問９
		int day = 3;
		
		switch(day) {
		case 1:
		 System.out.println("月曜日です");
		 break;
		 
		case 2:
		 System.out.println("火曜日です");
		 break;
		
		case 3:
		 System.out.println("水曜日です");
		 break;
		
		case 4:
		 System.out.println("木曜日です");
		 break;
		 
		case 5:
		 System.out.println("金曜日です");
		 break;
		
		case 6:
		 System.out.println("土曜日です");
		 break;
		
		case 7:
		 System.out.println("日曜日です");
		 break;
		
		default:
		 System.out.println("無効な入力です");
		}
		
		
		//問１０
		int month = 13;
		
		switch(month) {
		
		case 12:  case 1:  case 2:
			System.out.println("冬");
			break;
			
		case 3:  case 4:  case 5:
			System.out.println("春");
			break;
			
		case 6:  case 7:  case 8:
			System.out.println("夏");
			break;
			
		case 9:  case 10:  case 11:	
			System.out.println("秋");
			break;
			
		default:
			System.out.println("無効な月です");
			break;
		}
	}
}
