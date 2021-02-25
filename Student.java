package Assignment2;

import java.util.ArrayList;

import Assignment2.Course;
import Assignment2.InvalidTotalException;

public class Student {
	private String studentID;
	private String name;
	private ArrayList<Course> courseTaken;
	private ArrayList<Double> finalGrade;

	public Student() {
		this.studentID = "";
		this.name = "";
		this.courseTaken = new ArrayList<Course>();
		this.finalGrade = new ArrayList<Double>();
	}

	public String getStudentID() {
		return this.studentID;
	}

	public String getName() {
		return this.name;
	}

	public Student(String studentID, String name, ArrayList<Course> courseTaken) {
		this.studentID = studentID;
		this.name = name;
		this.courseTaken = new ArrayList<>();
		this.finalGrade = new ArrayList<>();
	}

	public void addGrade(ArrayList<Double> g, ArrayList<Integer> w) {
		double finalgrade = 0.0;
		int w1 = 0;
	}

}
