package Curriculum_D;

public class Character {
	
	private String name;
	
	private int hp;
	
	private int at;
	
	private int sp;
	
	
	
	public Character (String name, int hp, int at, int sp) {
		
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}


	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getAt() {
		return at;
	}



	public void setAt(int at) {
		this.at = at;
	}



	public int getSp() {
		return sp;
	}



	public void setSp(int sp) {
		this.sp = sp;
	}
	
	
	//攻撃メソッド
	public void attack(Character target) {
        System.out.println(this.name + " の攻撃！ " + target.getName() + " は " + this.at + " のダメージを受けた!");
        
        //攻撃力分相手のHPを減らす
        target.setHp(target.getHp() - this.at);
	}
	
	
	//ステータスを表示するメソッド
	public void showStatus() {
		
		System.out.println( name + "| HP:" + hp +" |　攻撃力：" + at + " | スピード：" + sp);
	}

}
