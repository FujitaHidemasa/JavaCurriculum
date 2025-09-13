package Curriculum_B.objectSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("E001", "山田太郎"));
		employees.add(new FullTimeEmployee("E002", "佐藤二郎"));
		employees.add(new ContractEmployee("E003", "伊東三郎"));
		
		
		for(Employee emp : employees) {
			
			System.out.print(emp.getName() + "の勤務時間を入力してください：");
			int hoursWorked = sc.nextInt();
			
			System.out.println(emp.getId() + ":" + emp.getName() + " 日給：" + emp.alaryCalculator( hoursWorked ));
		}
		sc.close();
	}

}
