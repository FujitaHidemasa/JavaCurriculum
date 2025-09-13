package Curriculum_B.Interface;

public abstract class Employee implements Billable {

	
	//フィールド
	
	String id;
	
	String name;
	
	//コンストラクト
	
	public Employee (String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public abstract int costForDay(int hoursWorked);
	
	public String getName() {
		
		return this.name;
	}

	

}
