package Curriculum_B.objectSample;

public class FullTimeEmployee extends Employee {
	
	
	//正社員の時給は1200円
	private final int hourlyRate = 1200;
	
	public FullTimeEmployee(String id, String name) {
		
		super(id, name);
	}

	@Override
	public int alaryCalculator(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		int regularTime = Math.min(8, hoursWorked);
		int overTime = Math.max(0,(hoursWorked - 8));
		
		return (int)((regularTime * hourlyRate) + (overTime * hourlyRate * 1.25));
	}

}
