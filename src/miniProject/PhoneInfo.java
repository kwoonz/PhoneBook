package miniProject;


interface INIT_MENU {
	int INPUT=1, OUTPUT=2, UPDATE=3, DELETE=4, FILESAVE=5, FILEIMPORT=6, EIXT=7;
}

class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("�߸��� ������ �̷������ϴ�.");
		wrongChoice = choice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice + "�ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}




// Phone Info
// �������� ����, ����, �輼
public class PhoneInfo {
	// ���� ��ȣ
	private int no;
	
	// �̸�
	private String name;
	
	// ����
	private int age;
	
	// �ڵ��� ��ȣ
	private String phonenumber;

	
	public PhoneInfo() {
	}
	
	// ������
	public PhoneInfo(int no, String name, String num) {
		this.no = no;
		this.name = name;
		phonenumber = num;
	}

	
	
	// �� �ʵ� set/get �޼ҵ�
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	public void showPhoneInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ڵ�����ȣ : " + phonenumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
