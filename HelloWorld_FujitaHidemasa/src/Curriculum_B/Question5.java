package Curriculum_B;

public class Question5 {

	/************************************
	 * 　[概要] メソッドを使用したコード作成
	 * 　[詳細] メソッドを作成し、指定のコードを作成する
	 ***********************************/
	
	
	//問１
	public static void helloWorld() {
		
		System.out.println("Hello, World!");
	}
	
	
	//問２
	public static int doubleValue (int num) {
		
		int doubleValue = num * 2;
		
		return doubleValue;
	}
	
	//問３
	public static boolean isEven (int num) {
		
		return num % 2 == 0;
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		//問１確認用
		helloWorld();
		
		//問２確認用
		int num = 10;
		System.out.println( num + "を2倍すると" + doubleValue(num) + "です。");
		
		//問３確認用
		int num1 = 7;
		int num2 = 10;
		
		if(isEven(num1)) {
		System.out.println(num1 + "は偶数です");
		}else {
			System.out.println(num1 + "は奇数です");
		}
		
		if(isEven(num2)) {
			System.out.println(num2 + "は偶数です");
			}else {
				System.out.println(num2 + "は奇数です");
			}	
		
		
		

	}
}
