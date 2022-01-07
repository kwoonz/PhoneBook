package miniProject;

import java.io.File;
import java.io.IOException;

public class PhoneMain {

	public static void main(String[] args) throws IOException {
		// 추가, 삭제, 수정을 위한 객체 생성
		Manager manager = new Manager();
		
		// 저장할 위치 및 파일
		String filepath = "C:\\Users\\USER\\Documents\\test\\";
		String filename = "phone.txt";
		
		
		int choice;
		
		
		while(true) {
			MenuView.showMenu();
			choice = MenuView.sc.nextInt();
			MenuView.sc.nextLine();
			
			switch(choice) {
			case INIT_MENU.INPUT :
				System.out.println(":::::::: 입력 ::::::::");
				manager.addInfo(makeInfo());
				break;
			
			case INIT_MENU.OUTPUT :
				System.out.println(":::::::: 출력 ::::::::");
				manager.showpPhoneInfo();
				break;
			
			case INIT_MENU.UPDATE :
				System.out.println("::::::: 수정할 정보의 고유번호를 입력해주세요. :::::::");
				int NO = MenuView.sc.nextInt();
				manager.updateInfo(makeInfo(), NO);
				break;
			case INIT_MENU.DELETE :
				System.out.println("::::::: 삭제할 정보의 고유번호를 입력해주세요. :::::::");
				manager.removeInfo(MenuView.sc.nextInt());
				break;
			case INIT_MENU.FILESAVE :
				FileInfo.writeFile(filepath, filename, manager.getInfoList());
				break;
			case INIT_MENU.FILEIMPORT :
				manager.setInfoList(FileInfo.readFile(new File(filepath,filename)));
				break;
			case INIT_MENU.EIXT :
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}

	}
	
	public static PhoneInfo makeInfo() {
		MenuView.sc.reset(); // Scanner를 초기화 시켜준다.
		
		PhoneInfo info = new PhoneInfo();
		

		System.out.print("이름 : ");
		info.setName(MenuView.sc.next());
		
		System.out.print("나이 : ");
		info.setAge(MenuView.sc.nextInt());
		
		System.out.println("전화번호 : ");
		info.setPhonenumber(MenuView.sc.next());
		
		System.out.println();
		
		return info;
		
	}
	

}


