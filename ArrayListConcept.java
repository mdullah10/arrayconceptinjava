package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[]=new int[3];
	//dynamic array-- ArrayList
	// can contain duplicate value
	//Maintains insertion ordering
		
		ArrayList ar = new ArrayList();
		
		ar.add(20);//0
		ar.add(30);//1
		ar.add(12.21);//2
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		//to print all the values from ArrayList --use for loop
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		
		ArrayList<String> ar1 = new ArrayList<>();
		
		ar1.add("java world"); //0
		ar1.add("md Ullah");   //1
		
		System.out.println(ar1.size());
		System.out.println(ar1.get(1));
		System.out.println(ar1.remove(0));
		System.out.println(ar1.size());
	
	
		//Employee class object
		Employee e1 = new Employee("md ullah", 32, "selenium");
		Employee e2 = new Employee("riaz", 20, "dev");
		Employee e3 = new Employee("riya", 25, "qa");
		
		//create ArrayList
		
		ArrayList<Employee>ar4 = new ArrayList<>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee em = it.next();
			System.out.println(em.name);
			System.out.println(em.age);
			System.out.println(em.dept);
			
		}
		
		
	}
	

}
