package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int courseCost = 600;
	private static int id = 1000;
	
	//Constructor: prompts user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senoir\nEnter student class level: ");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (0 to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance += courseCost;
			}
			else { break; }
		} while (1 != 0);
		
		System.out.println("ENROLL IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);	
	}
		
	
	
	//View balance
	
	//Pay tuition
	
	//Show status

}
