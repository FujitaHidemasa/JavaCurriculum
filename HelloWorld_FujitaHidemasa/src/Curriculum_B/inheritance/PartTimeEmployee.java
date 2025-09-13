package Curriculum_B.inheritance;

/************************************
 * 　[概要] オブジェクト指向　継承
 * 　[詳細] 継承を使ったプログラミングの作成
 ***********************************/

public class PartTimeEmployee extends Employee {
	
	//フィールド
	
	private static final int HOURLY_RATE = 1000;
	
	
	//コンストラクタ
	
	public PartTimeEmployee(String employeeId, String name ) {
		
		super( employeeId, name );
		
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		return HOURLY_RATE * hoursWorked ;
	}

}
