package Person;

public class Student extends Person {
	private String school;
	
	public Student(String name, String phone,Gender gender, String school) {
		super(name, phone, gender, school);
		this.school = school;
		
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + ", getName()=" + getName() + ", getPhone()=" + getPhone()
				+ ", getGender()=" + getGender() + "]";
	}
	

}
