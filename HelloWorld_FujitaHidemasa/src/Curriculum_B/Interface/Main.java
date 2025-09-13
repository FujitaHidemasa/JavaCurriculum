package Curriculum_B.Interface;

import java.util.ArrayList;
import java.util.List;

/************************************
 * 　[概要] オブジェクト指向　インターフェイスと抽象クラス
 * 　[詳細] プログラムを作成し実行
 ***********************************/

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Billable> Employees = new ArrayList<>();
		Employees.add( new FullTimeEmployee( "E001", "山田太郎" ));
		Employees.add( new FullTimeEmployee ("E002", "鈴木二郎" ));
		Employees.add( new ContractEmployee( "E003", "佐藤三郎" ));
	
		int  hoursWorked = 9 ;
	
		for(Billable emp : Employees) {
			System.out.println(emp.getName() + " 日給：" + emp.costForDay(hoursWorked));
		}
		
		
	}

}
