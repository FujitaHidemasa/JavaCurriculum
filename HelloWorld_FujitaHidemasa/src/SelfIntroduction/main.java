package SelfIntroduction;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int countPerson = 0;
		
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		
		System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    
	    List<Person> persons = new ArrayList<>();
	    
	    persons.add(person1);
	    
	    for(Person per : persons) {
	    	
	    	per.print();
	    	
	    	countPerson++;
	    	
	    	System.out.println("合計" + countPerson + "人です。");
	    }
	}

}
