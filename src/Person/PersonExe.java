package Person;

public class PersonExe { // ��ɱ���(1.�߰� 2.��ȸ 3. ���� ���)\
	
	private static PersonExe singleton = new PersonExe();
	private Person[] persons;
	
	private PersonExe() {
		persons = new Person[10];
		persons[0] = new Person("�ڼҿ�", "010-1111-1111", Gender.WOMEN);
	}
	
	public static PersonExe getInstance() {
		return singleton;
	}
	
	public void execute() {
		while(true) {
			System.out.println("----------");
			System.out.println("1.�߰� 2.��ȸ 3.���� 4.����");
			System.out.println("----------");
			ScanUtil.readInt("�޴��� �����ϼ���");
			
			int menu = ScanUtil.readInt(null);
			if(menu == 1) {
				System.out.println("�߰�");
			} else if(menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if(menu == 3) {
				System.out.println("����");
			} else if(menu == 4) {
				System.out.println("����");
				break;
			}
		}
		
		private void addPerson() {
			System.out.println();
		}
	}
}
