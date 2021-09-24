package Person;

public class Person {

	// 필드
	private String name;
	private String phone;
	private Gender gender;

	// 생성자
	public Person(String phone) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}
	
	
	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", gender=" + gender + "]";
	}
	
	


}
