package Curriculum_C;

/************************************
 * 　[概要] じゃんけんプログラム
 * 　[詳細] じゃんけんプログラムを作成
 ***********************************/

public class Question6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		Player player = new Player(0);
		
		Cpu cpu = new Cpu(0);
		
		
		
		
		boolean playerWin = false;
		
		while( !playerWin ) {
		
			player.playerHand();
		
			cpu.CpuHand();	
		
		
			System.out.println("あなたの手：" + player);
			System.out.println("CPUの手：" + cpu);
		
		
		
			//勝敗判定
			if((player.getHand() == 0 && cpu.getHand() == 1) || 
					(player.getHand() == 1 && cpu.getHand() == 2) ||
					player.getHand() == 2 && cpu.getHand() == 0) {
			
				System.out.println("あなたの勝ち！");
				System.out.println("");
				playerWin = true;
			
				
			}else if((player.getHand() == 0 && cpu.getHand() == 2) ||
					(player.getHand() == 1 && cpu.getHand() == 0) ||
					(player.getHand() == 2 && cpu.getHand() == 1)) {
			
				System.out.println("あなたの負け！");
				System.out.println("");
			
				
			}else {
			
				System.out.println("あいこです。");
				System.out.println("");
			}	
		}
	}	

}
