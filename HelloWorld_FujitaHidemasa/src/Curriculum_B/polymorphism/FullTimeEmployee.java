package Curriculum_B.polymorphism;

/************************************
 * 　[概要] オブジェクト指向　継承
 * 　[詳細] 継承を使ったプログラミングの作成
 ***********************************/

public class FullTimeEmployee extends Employee {
	
	
	public FullTimeEmployee (String id, String name ) {
		
		super( id, name);
		
	}

	//８時間までの給料と８時間を超えた給料(1.25倍）を足した金額を返すメソッド
	@Override
	public int calculateDailyWage(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		int hourlyRate = 1250;
		
		int overtime = Math.max(0, hoursWorked - 8);
		
		int regularHours = hoursWorked - overtime;
		
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
		
	}

}
