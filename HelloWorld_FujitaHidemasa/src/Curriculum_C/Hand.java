package Curriculum_C;

public class Hand {
	
	
	
	private static final int rock = 0;
	
	private static final int scissors = 1;
	
	private static final int paper = 2;
	
	
	private int hand;
	
	
	
	
	public Hand (int hand) {
		
		this.hand = hand;
		
	}
			
	
	public void setHand(int hand) {
		this.hand = hand;
	}


	public int getHand() {
		
		return hand;
	}
	
	
	public String toString() {
		
		switch( hand ) {
			
		case rock : 
			return "グー";
			
		case scissors :
			return "チョキ";
			
		case paper :
			return "パー";
			
		default :
			return "エラー";
		
		}
	}
}
