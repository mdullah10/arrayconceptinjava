package datastructure;

public class ArrayConcept {

	public static void main (String []args) {
	// array- to store similar data type in a array variable 
	// 1.int array 
	// lowest bound/index = 0
	// upper bound/index = n-1 (n is size of array)
	//one dimensional array
	// disadvantage of array- 
	// 1 size is fixed... Static array..
	//To overcome this problem we use we use collections-ArrayList,HashTable-dynamic array  
	//2 Store only smiler data types value
		
		int i[] = new int[4];
		i [0]= 10;
		i [1]= 20;
		i [2]= 30;
		i [3]= 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
	
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException (because array length is 3)
		
		System.out.println(i.length); //Size or Length of array
	
		//print all the values of array using for loop
		for (int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		//String array
		String s []=new String [3];
		s[0]="hello";
		s[1]="world";
		s[2]="Bangladesh";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		//Object array (Object is class)--to store different data Types
		Object obj[] = new Object[5];
		obj[0]=10;
		obj[1]=12.20;
		obj[2]="Md ullah";
		obj[3]=01/07/84;
		obj[4]="Dhaka";
		System.out.println(obj[2]);
		
		
		
	}
}