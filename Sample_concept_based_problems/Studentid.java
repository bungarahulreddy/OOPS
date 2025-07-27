package datatypes;

import java.util.Scanner;

public class Studentid {

	public static void main(String[] args) {
      
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student's name=");
		String name = scanner.nextLine();
		System.out.println("Enter students id=");
		int id = scanner.nextInt();
		System.out.println("Enter age=");
		int age = scanner.nextInt();
		System.out.println("Enter Gender (M/F) =");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter percentage=");
		double percentage = scanner.nextDouble();
		
		System.out.println("--------student details-------- ");
		System.out.println("Name:-"+name);
		System.out.println("Roll no:-"+id);
		System.out.println("Age:-"+age);
		System.out.println("Gender:-"+gender);
		System.out.println("Percentage:-"+percentage);
		
		scanner.close();
		
		
	}

}
