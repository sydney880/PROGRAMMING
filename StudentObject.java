import java.util.Scanner;

public class  StudentObject{
	
	private  String name;
	private double[] grades;
	private int totalNumberOfStudents;
	
	Scanner input = new Scanner(System.in);
	
	StudentObject(){
	
	}
	
	public void setName(String name){
			this.name = name;
				}
				
		public String getName(){
					
	 		return this.name;
				}
		public void setGrades(double[] grades){
			this.grades = grades;
		
		}
		
		public double[] getGrades(){
			return this.grades;
		}
		
		
		public int getNumberOfStudents(int number){
			this.totalNumberOfStudents = number;
			return  number;
			
		}
		
		public double getAverageGrade(){
	          double sum = 0;
                    for(int x = 0 ; x <= 2 ; x++){
                      System.out.println("Enter grade "+(x+1));
			grades = new double[3];
			grades[x] = input.nextDouble();
			sum += grades[x];
	              }
			return sum / grades.length;
		}

		public void printStudentDetails(){
	
		System.out.println("Student name is "+this.name+" , average grade is "+ getAverageGrade() +" and the current number of students is "+
		this.totalNumberOfStudents);
		}

		
		
		
	

}