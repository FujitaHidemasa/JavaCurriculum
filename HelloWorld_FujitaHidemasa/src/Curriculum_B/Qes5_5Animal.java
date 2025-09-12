package Curriculum_B;

public class Qes5_5Animal {
	
	
	//フィールド
	private String name;
	
	private double bodyLength;
	
	private int speed;
	
	//コンストラクタ
	public Qes5_5Animal(String name, double d, int speed) {
		
		this.name = name;
		this.bodyLength = d;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
