package Curriculum_C;

import java.util.Random;

public class Cpu extends Hand {
	
	Random rand = new Random();
	
	
	
	public Cpu ( int hand ) {
		
		super( hand );
	}
	
	
	
	//CPUの手を決めるメソッド
	public void CpuHand() {
		
		int cpuHand = rand.nextInt(3);
		
		setHand(cpuHand);
	}

}
