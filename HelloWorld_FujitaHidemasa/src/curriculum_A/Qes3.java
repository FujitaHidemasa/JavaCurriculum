package curriculum_A;

public class Qes3 {
	/************************************
	 * 　[概要] 変数を用いて出力
	 * 　[詳細] 値を代入した変数を用いて出力する
	 ***********************************/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		byte byteNum = 10;
		short shortNum = 100;
		int intNum = 1000;
		long longNum = 10000;
		float floatNum = 9.5f;
		double doubleNum = 10.5;
		char letter = 'a';
		String letters = "ハロー";
		boolean isBoolean = true;
		
		
		//(1)
		long a = (byteNum + shortNum + intNum + longNum);
		System.out.println(a);
		
		//(2)
		int b = byteNum * 2;
		System.out.println(b);
		
		//(3)
		String c = (letter + " " + letters + " " + isBoolean);
		System.out.println(c);
		
		//(4)
		int d = (int)(floatNum + doubleNum);
		long e = a + d;
		System.out.println(e);
		
		//(5)
		long f = (byteNum * shortNum * intNum * longNum);
		System.out.println(f);
		
		//(6)
		double g = doubleNum / 100;
		System.out.println(g);
		
		//(7)
		int h = byteNum - 100;
		System.out.println(h);
		
	}

}
