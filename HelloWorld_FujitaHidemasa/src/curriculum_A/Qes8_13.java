package curriculum_A;

public class Qes8_13 {
	
	/************************************
	 * 　[概要] 変数に値を代入　変数を使用し出力
	 * 　[詳細] 宣言した変数に指定の値を代入、その後値を加算させ出力
	 ***********************************/
	
	public static void main(String[]args) {
		
		//(8)
		double price = 99.99;
		int price2 = (int) price;
		
		System.out.println("整数価格：" + price2);
		
		//(9)
		String numStr = "123";
		int afterNum = Integer.parseInt(numStr);
		System.out.println("変換後の値:" + (afterNum + 10));
		
		//(10)
		int num = 50;
		String score = String.valueOf(num);
		System.out.println("得点：" + score + "点");
		
		
		
		
		/************************************
		 * 　[概要] 変数に値を代入　条件式を使用し出力
		 * 　[詳細] 宣言した変数に指定の値を代入、条件式を使用し出力する
		 ***********************************/	
		
		//(11)
		int a = 10;
		int b = 20;
		
		boolean result = (a < b);
		System.out.println(result);
		
		//(12)
		int x = 15;
		String c = (x > 10) ? "OK" : "NG";
		System.out.println(c);
		
		//(13)
		String text = "私はJavaが好きです。Javaは楽しい！";
		String replace = text.replaceAll("Java" , "Python");
		
		System.out.println(replace);
	}

}
