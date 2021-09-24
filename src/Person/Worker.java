package Person;

public class Worker extends Person {
	private String company;
	
	public Worker(String name, String phone, Gender gender, String company) {
		super(name, phone, gender);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Worker [company=" + company + ", getName()=" + getName() + ", getPhone()=" + getPhone()
				+ ", getGender()=" + getGender() + "]";
	}
	

}
