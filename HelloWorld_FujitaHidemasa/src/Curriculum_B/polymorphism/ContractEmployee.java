package Curriculum_B.polymorphism;

/************************************
 * 　[概要] オブジェクト指向　継承
 * 　[詳細] 継承を使ったプログラミングの作成
 ***********************************/

public class ContractEmployee extends Employee {
	
	
	//コンストラクタ
	
	public ContractEmployee(String id, String name ) {
		
		super( id, name );
		
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}

}
