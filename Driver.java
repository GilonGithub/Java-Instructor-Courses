import java.util.ArrayList;
import java.util.Scanner;
//
//Create ArrayList of Course called courses
//Create four Course Object 
//Add these four course object to the courses arrayList
//Create three Instructor Object 
//Print (ArrayList<> courses) —————> Course name is ….. which takes. …… weeks. The Instructor of this course is  ………… who is (Junior Senior or something ) with ……..year of experience. The Phone number of Instructor is ……..
//After Printing all Courses, Ask User to give the name of Instructor and then you should return the name of course which this Instructor teaches. If we don`t have any courses Just Print” This Instructor does not teach any courses” (edited) 	
public class Driver {
	
	public static void print(ArrayList<Course> courses) {
		
		for(Course i: courses) {
			System.out.println("\nThe course name is " + i.getCourseName() +
								" which takes " + i.getDuration() + " weeks." + 
								"\nThe instructor of this course is " + i.getInstructorName().getFirstName() + " " + i.getInstructorName().getLastName() +
								" who is " + i.getInstructorName().getStatus(i.getInstructorName().getYearOfExperience()) +
								" with " + i.getInstructorName().getYearOfExperience() + " year(s) of experience." + 
								"\nThe phone number of instructor is " + i.getInstructorName().getPhoneNumber());
		}
	}
	
	public static void print(ArrayList<Course> courses, String instructor) {
		
		byte counter = 0;
		
		for(Course i: courses) {
			
			if((i.getInstructorName().getFirstName() + " " + i.getInstructorName().getLastName()).equalsIgnoreCase(instructor)) {
			
				System.out.println("\nThe course name is " + i.getCourseName() +
								" which takes " + i.getDuration() + " weeks." + 
								"\nThe instructor of this course is " + i.getInstructorName().getFirstName() + " " + i.getInstructorName().getLastName() +
								" who is " + i.getInstructorName().getStatus(i.getInstructorName().getYearOfExperience()) +
								" with " + i.getInstructorName().getYearOfExperience() + " year(s) of experience." + 
								"\nThe phone number of instructor is " + i.getInstructorName().getPhoneNumber());
				counter--;
			}
		counter++;	
		}
		
		if(counter == courses.size())
			System.err.println("This instructor does not teach any courses.");
			
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Instructor inst1 = new Instructor("Leo", "Lei", "1234567890", (byte)2);
		Instructor inst2 = new Instructor("Lea", "Lex", "1234567898", (byte)1);
		Instructor inst3 = new Instructor("Lee", "Lev", "1234567899", (byte)6);
		
		Course c1 = new Course("English", (byte) 9, inst1);
		Course c2 = new Course("Math", (byte) 8, inst2);
		Course c3 = new Course("Science", (byte) 5, inst3);
		Course c4 = new Course("History", (byte) 5, inst1);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		courses.add(c1); courses.add(c2); courses.add(c3); courses.add(c4);
		print(courses);
		
		System.out.println("\nEnter the name of instructor: ");
		print(courses, input.nextLine());
		
	}

}
