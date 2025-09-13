package Curriculum_B.objectSample;

public abstract class Employee implements calculator {
	
	//フィールド
	
	private String id;
	private String name;
	private int workingHours;
	
	
	//コンストラクタ
	public Employee (String id, String name) {
		
		setId(id);
		setName(name);
	}

	

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getWorkingHours() {
		return workingHours;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}



	@Override
	public abstract int alaryCalculator(int hoursWorked);

}
