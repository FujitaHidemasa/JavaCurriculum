package Curriculum_B.Interface;

public class ContractEmployee extends Employee {
	
	public ContractEmployee (String id, String name) {
		
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		int hourlyRate = 1000;
		
		return hourlyRate * hoursWorked;
	}
	
	


}
