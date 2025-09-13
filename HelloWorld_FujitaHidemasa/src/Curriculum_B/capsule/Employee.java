package Curriculum_B.capsule;

/************************************
 * 　[概要] カプセル化
 * 　[詳細] プログラムを作成し実行
 ***********************************/

public class Employee {
	
	//フィールド
	
	private String employeeId;
	
	private String name;
	
	
	//コンストラクタ
	
	public Employee (String employeeId, String name) {
		
		setEmployeeId( employeeId );
		
		setName( name );
		
	}
	
	//メソッド
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
