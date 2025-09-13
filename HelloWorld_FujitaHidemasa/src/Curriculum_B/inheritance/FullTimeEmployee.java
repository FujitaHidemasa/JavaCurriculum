package Curriculum_B.inheritance;

/************************************
 * 　[概要] オブジェクト指向　継承
 * 　[詳細] 継承を使ったプログラミングの作成
 ***********************************/

public class FullTimeEmployee extends Employee {
	
	
	private static final int HOURLY_RATE = 1200;
	
	
	public FullTimeEmployee (String employeeId, String name ) {
		
		super( employeeId, name);
		
	}

	//８時間までの給料と８時間を超えた給料(1.25倍）を足した金額を返すメソッド
	@Override
	public int calculateDailyWage(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		int regularHour = Math.min( 8, hoursWorked );
		
		int overHour = Math.max( 0, hoursWorked - 8 );
		
		return ( regularHour * HOURLY_RATE ) + (int)( overHour * HOURLY_RATE * 1.25);
		
	}

}
