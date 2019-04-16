package datastructure;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String [3][5];
		
		System.out.println(x.length); //3--total no of row=3
		System.out.println(x[0].length);//5--total no of columns=5
		
		x[0][0]="md";
		x[0][1]="Dk";
		x[0][2]="Bd";
		x[0][3]="bx";
		x[0][4]="ny";
		
		x[1][0]="md1";
		x[1][1]="Dk1";
		x[1][2]="Bd1";
		x[1][3]="bx1";
		x[1][4]="ny1";
		
		x[2][0]="md2";
		x[2][1]="Dk2";
		x[2][2]="Bd2";
		x[2][3]="bx2";
		x[2][4]="ny2";
		System.out.println(x[0][2]);
		System.out.println(x[1][2]);
		
		//to print all the value of twoDimArray use for loop
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
			System.out.println(x[row][col]);
			}	
		}

	}

}
