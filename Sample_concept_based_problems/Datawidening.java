package datatypes;

import java.util.Scanner;
public class Datawidening {

 public static void main(String[] args) {
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter Number");
	 int n=s.nextInt();
	 long ln=n;
	 float f=n;
	 System.out.println("Long value after implicit casting: "+ln);
	 System.out.println("Float after implicit casting: "+f);
	 
	s.close();
 }

}
