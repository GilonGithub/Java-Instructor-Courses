//Course Class
//   Course name 
//   Duration 
//   Instructor 
//All the String should check for null and empty if it is null or empty put “Unknown”
//Duration of course should be more than 4 

public class Course {
	private String courseName;
	private byte duration, yearOfExperience;
	private Instructor instructorName;

	public Course(String courseName, byte duration, Instructor instructorName) {
		
		setCourseName(courseName);
		setDuration(duration);
		setInstructorName(instructorName);
		
	}
	
	public void setCourseName(String courseName) {
		if(!courseName.isEmpty() || !courseName.equalsIgnoreCase(null))
			this.courseName = courseName;
		else this.courseName = "Unknown";

	}
	
	public void setDuration(byte duration) {
		if(duration < 4) System.out.println("Enter more than 4.");
		else this.duration = duration;	
	}
	
	public void setInstructorName(Instructor instructorName) {
		this.instructorName = instructorName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public Instructor getInstructorName() {
		return this.instructorName;
	}
	public byte getDuration() {
		return this.duration;
	}
	
	public byte getYearOfExperience() {
		return this.yearOfExperience;
	}
}
