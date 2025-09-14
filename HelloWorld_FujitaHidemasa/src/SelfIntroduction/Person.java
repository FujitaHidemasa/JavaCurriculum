package SelfIntroduction;



public class Person {
	
	
	// インスタンスフィールドを定義
	 String name;
	
	 int age;
	
	 double height;
	
	 double weight;
	
	
	//コンストラクタを定義しインスタンスフィールドに値をセット
	
	public Person ( String name, int age, double height, double weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	//各フィールドのgetter、setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	//BMIを計算し結果を返すメソッド
	public double bmi() {
		double result = weight / (height * height);
		
		return Math.floor(result);
	}
	
	
	//表示メソッド
	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "です。");
		System.out.println("BMIは" + bmi() + "です。");
	}
 
}
