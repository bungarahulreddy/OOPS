package datatypes;

import java.util.Scanner;
public class Datanarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		double d=s.nextDouble();
		int i;
	    i=(int)d;
	    System.out.println("Double value: "+d);
	    System.out.println("Integer value after casting:  "+i);
	    
	    s.close();

	}

}
