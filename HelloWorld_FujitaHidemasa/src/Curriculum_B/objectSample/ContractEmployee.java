package Curriculum_B.objectSample;

public class ContractEmployee extends Employee {
	
	//契約社員の時給は1000円；
	private final int hourlyRate = 1000;
	
	public ContractEmployee (String id, String name) {
		
		super(id, name);
		
	}

	@Override
	public int alaryCalculator(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		return hourlyRate * hoursWorked;
	}

}
