package Curriculum_B.inheritance;

/************************************
 * 　[概要] オブジェクト指向　継承
 * 　[詳細] 継承を使ったプログラミングの作成
 ***********************************/

public abstract class Employee {
	
	//フィールド
	
	String employeeId;
	
	String name;
	
	//コンストラクタ
	
	public Employee ( String employeeId,String name) {
		
		this.employeeId = employeeId;
		
		this.name = name;
	}

	
	//メソッド
	
	public String getEmployeeId() {
		return employeeId;
	}

	

	public String getName() {
		return name;
	}

	
	public abstract int calculateDailyWage(int hoursWorked);
		
}
