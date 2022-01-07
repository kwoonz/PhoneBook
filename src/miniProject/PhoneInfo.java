package miniProject;


interface INIT_MENU {
	int INPUT=1, OUTPUT=2, UPDATE=3, DELETE=4, FILESAVE=5, FILEIMPORT=6, EIXT=7;
}

class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice = choice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice + "해당하는 선택은 존재하지 않습니다.");
	}
}




// Phone Info
// 개인정보 저장, 수정, 삭세
public class PhoneInfo {
	// 고유 번호
	private int no;
	
	// 이름
	private String name;
	
	// 나이
	private int age;
	
	// 핸드폰 번호
	private String phonenumber;

	
	public PhoneInfo() {
	}
	
	// 생성자
	public PhoneInfo(int no, String name, String num) {
		this.no = no;
		this.name = name;
		phonenumber = num;
	}

	
	
	// 각 필드 set/get 메소드
	
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
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("핸드폰번호 : " + phonenumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
