package Curriculum_C;

import java.util.Scanner;

public class Player extends Hand {
	
	Scanner sc = new Scanner(System.in);
	
	
	public Player (int hand) {
		
		super( hand );
	}
	
	
	public void playerHand() {
		
		System.out.println("出す手を選んで入力してください。（グー：0　チョキ：１　パー：２）");
	
		int choiceHand = sc.nextInt();
		
		setHand( choiceHand );
		
	}

}
