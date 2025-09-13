package Curriculum_B.polymorphism;

/************************************
 * 　[概要] オブジェクト指向　ポリモーフィズム
 * 　[詳細] ポリモーフィズムを使ったプログラミングの作成
 ***********************************/

public abstract class Employee {

	//フィールド
	
	String id;
	
	String name;
	
	//コンストラクタ
	
	public Employee ( String id,String name) {
		
		this.id = id;
		
		this.name = name;
	}

	
	//メソッド

	

	public abstract int calculateDailyWage(int hoursWorked);


	public String getName() {
		return name;
	}
		
}
