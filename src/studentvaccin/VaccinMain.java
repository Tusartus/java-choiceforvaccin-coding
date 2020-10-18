/**
 * select students
 * ----------------
 * determine who are above 15 years old to receive a vaccine
 * Enter number of students
 * Input student name and ages
 * use arrays
 * 
 * 
 * 
 */

package studentvaccin;

import java.util.Scanner;


public class VaccinMain {
	
	public static void main(String[] args ) {
		System.out.println("Enter number of studnets: ");
		Scanner scan = new Scanner(System.in);
		int numStudents = scan.nextInt();
		
		String[] student = new String[numStudents];
		int[] age = new int[numStudents];
		
		Scanner scanName = new Scanner(System.in);
		Scanner scanAge = new Scanner(System.in);
		
		for(int i = 0; i <numStudents; i++) {
			System.out.println("Enter name: ");
			student[i] =scanName.nextLine();
			
			System.out.println("Enter age: ");
			age[i] = scanAge.nextInt();
			
		}
		for(int i = 0; i <numStudents; i++) {
			 if(age[i] >= 15){
					System.out.println(student[i] + "  can receive a vaccine.");
					System.out.println("The student is now  " + age[i]);
			 }
		}
		/*
		 * this scanNAME VARIABLE REPRESENT VARIABLE 
		 */
		scan.close();
		scanName.close();  
		scanAge.close();
		
		
		
		
		
	}

}
