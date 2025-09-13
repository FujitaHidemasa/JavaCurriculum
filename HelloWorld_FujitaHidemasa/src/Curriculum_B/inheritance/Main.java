package Curriculum_B.inheritance;

/************************************
 * 　[概要] オブジェクト指向　継承
 * 　[詳細] 継承を使ったプログラミングの作成
 ***********************************/

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee ("E003", "正社員");
		
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee ("E004", "パート社員");
		
		
		System.out.println("正社員の給料：" + fullTimeEmployee.calculateDailyWage(9));
		
		System.out.println("パート社員の給料：" + partTimeEmployee.calculateDailyWage(9));
		
		
	}

}
