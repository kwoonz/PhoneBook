package miniProject;

import java.io.File;
import java.io.IOException;

public class PhoneMain {

	public static void main(String[] args) throws IOException {
		// �߰�, ����, ������ ���� ��ü ����
		Manager manager = new Manager();
		
		// ������ ��ġ �� ����
		String filepath = "C:\\Users\\USER\\Documents\\test\\";
		String filename = "phone.txt";
		
		
		int choice;
		
		
		while(true) {
			MenuView.showMenu();
			choice = MenuView.sc.nextInt();
			MenuView.sc.nextLine();
			
			switch(choice) {
			case INIT_MENU.INPUT :
				System.out.println(":::::::: �Է� ::::::::");
				manager.addInfo(makeInfo());
				break;
			
			case INIT_MENU.OUTPUT :
				System.out.println(":::::::: ��� ::::::::");
				manager.showpPhoneInfo();
				break;
			
			case INIT_MENU.UPDATE :
				System.out.println("::::::: ������ ������ ������ȣ�� �Է����ּ���. :::::::");
				int NO = MenuView.sc.nextInt();
				manager.updateInfo(makeInfo(), NO);
				break;
			case INIT_MENU.DELETE :
				System.out.println("::::::: ������ ������ ������ȣ�� �Է����ּ���. :::::::");
				manager.removeInfo(MenuView.sc.nextInt());
				break;
			case INIT_MENU.FILESAVE :
				FileInfo.writeFile(filepath, filename, manager.getInfoList());
				break;
			case INIT_MENU.FILEIMPORT :
				manager.setInfoList(FileInfo.readFile(new File(filepath,filename)));
				break;
			case INIT_MENU.EIXT :
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
		}

	}
	
	public static PhoneInfo makeInfo() {
		MenuView.sc.reset(); // Scanner�� �ʱ�ȭ �����ش�.
		
		PhoneInfo info = new PhoneInfo();
		

		System.out.print("�̸� : ");
		info.setName(MenuView.sc.next());
		
		System.out.print("���� : ");
		info.setAge(MenuView.sc.nextInt());
		
		System.out.println("��ȭ��ȣ : ");
		info.setPhonenumber(MenuView.sc.next());
		
		System.out.println();
		
		return info;
		
	}
	

}


