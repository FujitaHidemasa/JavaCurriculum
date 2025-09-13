package Curriculum_B.Class_object;

/************************************
 * 　[概要] クラスとオブジェクト
 * 　[詳細] プログラムを作成し実行
 ***********************************/

public class Employee {
	
	//フィールド
	
	 String employeeId;
	
	 String name;
	
	//コンストラクタ
	
	public Employee ( String employeeId, String name) {
		
		this.employeeId = employeeId;
		this.name = name;
	}
	
	
	//メソッド
	
	public void showInfo() {
		
		System.out.println("社員ID：" + this.employeeId + ", 名前：" + this.name );
	}

}
