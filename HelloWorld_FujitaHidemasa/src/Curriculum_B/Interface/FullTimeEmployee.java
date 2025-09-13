package Curriculum_B.Interface;

public class FullTimeEmployee extends Employee {

	
	//コンストラクタ
	public FullTimeEmployee (String id, String name) {
		
		super(id, name);
	}
	
	
	@Override
	public int costForDay(int hoursWorked) {
		// TODO 自動生成されたメソッド・スタブ
		
		int hourlyRate = 1250;
		
		int regularHours = Math.min(8, hoursWorked);
        int overtime = Math.max(0, hoursWorked - 8);
        
        return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
		
	}
	
	public String getName() {
		return name;
	}

}
