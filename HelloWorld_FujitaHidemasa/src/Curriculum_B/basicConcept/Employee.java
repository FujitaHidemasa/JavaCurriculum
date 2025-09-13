package Curriculum_B.basicConcept;

/************************************
 * 　[概要] オブジェクト思考の基本概念
 * 　[詳細] プログラムを作成し実行
 ***********************************/

public class Employee {

	//フィールド
	
	 String name;
	
	//コンストラクタ
	
	public Employee (String name) {
		
		this.name = name;
	}
	
	//メソッド
	
	public void work() {
		
		System.out.println(this.name + "は働いています");
	}
	
}
