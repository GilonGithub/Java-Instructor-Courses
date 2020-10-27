//Instructor Class 
//      first name 
//      Last name 
//      Phone number 
//      Experience year
//getStatus () (With switch and case)————> if Experience year < 2 we have Junior Instructor 
//                    If Experience year is between 2 and 4 we have Intermediate Instructor
//                    More than 4 we have Senior Instructor 

                    
public class Instructor {
	
	private String firstName, lastName, phoneNumber;
	private byte yearOfExperience;

	public Instructor(String firstName, String lastName, String phoneNumber, byte yearOfExperience) {
		setFirstname(firstName);
		setLastname(lastName);
		setPhoneNumber(phoneNumber);
		setYearOfExperience(yearOfExperience);
	}
	public void setYearOfExperience(byte yearOfExperience) {
		if(yearOfExperience < 1) System.out.println("Not enough experience.");
		else this.yearOfExperience = yearOfExperience;
	}
	
	public void setFirstname(String firstName) {
		if(!firstName.isEmpty() || !firstName.equalsIgnoreCase(null))
			this.firstName = firstName;
		else this.firstName = "Unknown";
	}

	public void setLastname(String lastName) {
		if(!lastName.isEmpty() || !lastName.equalsIgnoreCase(null))
			this.lastName = lastName;
		else this.lastName = "Unknown";
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(!phoneNumber.isEmpty() || !phoneNumber.equalsIgnoreCase(null))
			this.phoneNumber = phoneNumber;
		else this.phoneNumber = "Unknown";
	}

	public byte getYearOfExperience() {
		return this.yearOfExperience;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getStatus(byte yearOfExperience) {
		String status = "Invalid value";
		
		switch (yearOfExperience) {
		case 0: case 1: status = "Junior"; break;
		case 2: case 3: case 4: status = "Intermediate"; break;
	
		default:
			if(yearOfExperience > 4) status = "Senior"; 
			else status = "Unknown"; break;
		}
		
		return status;
	}
	
}
