package Curriculum_B.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		List< Employee > employees = new ArrayList<>();
		
		employees.add (new FullTimeEmployee("E001", "山田太郎"));
		employees.add (new FullTimeEmployee("E002", "佐藤二郎"));
		employees.add (new ContractEmployee("E003", "伊東三郎"));
		
		int workTime = 9;
		
		for (Employee emp : employees) {
            System.out.println(emp.getName() + " の給料 "
                               + emp.calculateDailyWage(workTime) + "円");
        }
		
		
	}

}
