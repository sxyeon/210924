package Person;

public class PersonExe { // 기능구현(1.추가 2.조회 3. 삭제 기능)\
	
	private static PersonExe singleton = new PersonExe();
	private Person[] persons;
	
	private PersonExe() {
		persons = new Person[10];
		persons[0] = new Person("박소연", "010-1111-1111", Gender.WOMEN);
	}
	
	public static PersonExe getInstance() {
		return singleton;
	}
	
	public void execute() {
		while(true) {
			System.out.println("----------");
			System.out.println("1.추가 2.조회 3.수정 4.삭제");
			System.out.println("----------");
			ScanUtil.readInt("메뉴를 선택하세요");
			
			int menu = ScanUtil.readInt(null);
			if(menu == 1) {
				System.out.println("추가");
			} else if(menu == 2) {
				System.out.println("조회");
				showList();
			} else if(menu == 3) {
				System.out.println("수정");
			} else if(menu == 4) {
				System.out.println("삭제");
				break;
			}
		}
		
		private void addPerson() {
			System.out.println();
		}
	}
}
