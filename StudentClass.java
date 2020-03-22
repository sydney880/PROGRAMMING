// bsc/mat/19/18

/** 
The program aims at getting a name of a student, total number of students and three grades then compute the average of the grades and return the result to a 
printing method. This StudentClass class implements the blue print class StudentObject class.

**/

import java.util.Scanner;

public class StudentClass{
	
	public static void main(String[] args){
		
	   // creating a scanner object with the name input
		Scanner input = new Scanner(System.in);
		
          //creating  an object of the StudentObject class with the name student
		StudentObject student = new StudentObject();
	
	// prompting user to enter name
		System.out.println(" Enter your name : ");
		String name = input.nextLine();
	
	//creating an array grade to store 3 grades but the prompt to enter grades is in the StudentObject class
		double[] grade = new double[3];
    
       
         //invoking the setGrades method in StudentObject class and assigning grade as actual parameter
		student.setGrades(grade);

        //invoking the getGrades method in StudentObject Class but it requires no parameters
                student.getGrades();
		student.setName(name);
	//prompting user to enter number of students 	
 		System.out.println(" Enter your total number of students :");
		int numberOfStudents = input.nextInt();
	

	//getting the number of students entered by the user  to the method getNumberOfStudents in the StudentObject class
		student.getNumberOfStudents(numberOfStudents);

          // printing name, total number of students and average grade by invoking the printStudentDetails method in StudentObject
		student.printStudentDetails();
		
		
		
		
	}
	
	
	
}