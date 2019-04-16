package secretsanta;

import java.util.ArrayList;
import java.util.Random;

public class TestSanta {

	public static void main(String[] args) {

		ArrayList <String> list = new ArrayList<>();
		
		list.add("md");
		list.add("ullah");
		list.add("shachi");
		list.add("abani");
		list.add("arnob");
		list.add("moin");
		list.add("omit");
		
		System.out.println("Family member are :" + list);
		
		String secretsantaOf = "abani";
		
		list.remove(secretsantaOf);
			
			System.out.println("Family member are :" + list);
		
		Random rom = new Random();
		
		System.out.println(list.size());
		
		int index = rom.nextInt(list.size());
		
		String secretsanta = list.get(index);
		System.out.println(secretsantaOf + "'s secret santa of this year is :"+ secretsanta);

	}

}
