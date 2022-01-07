package miniProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager {
	
	// �������� ������ List
	List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();
	
	// ���κ� ������ȣ
	private int NO =0;
	
	// @return
	public List<PhoneInfo> getInfoList() {
		return this.InfoList;
	}
	
	// @param InfoList
	public void setInfoList(List<PhoneInfo> infoList) {
		this.InfoList = infoList;
	}
	
	// @param personInfo
	// @return
	public int addInfo(PhoneInfo phoneInfo) {
		// �������� return ����
		int ret = 0;
		
		try {
			// ������ȣ ����
			phoneInfo.setNo(++this.NO);
			
			// List�� ��ü�� �߰� �� �ش�.
			this.InfoList.add(phoneInfo);
			
		} catch (Exception e) {
			System.out.println("���� �߰� �� ������ �߻��Ͽ����ϴ�.\n" + e.getMessage());
			// return�� ����(0 : ����, 1: ����)
			ret = 1;
		}
		return ret;
	}
	
	// @param PN
	// @return
	public int removeInfo(int NO) {
		// �������� return ����
		int ret = 0;
		
		
		try {
			// List������ŭ for��
			for(int idx=0; idx < this.InfoList.size(); idx++) {
				PhoneInfo curPhoneInfo = this.InfoList.get(idx);
				
				// ������ȣ�� ���Ͽ� ���� ��ȣ�� ������ �����Ѵ�.
				if(NO == curPhoneInfo.getNo()) {
					this.InfoList.remove(idx);
					break;
				}
				// �ش���������
				if(idx == this.InfoList.size()-1) {
					ret = 2;
				}
			}
			
		} catch (Exception e) {
			System.out.println("���� ���� �� ������ �߻��Ͽ����ϴ�.\n" + e.getMessage());
			// return�� ����(0 : ����, 1: ����, 2: �ش���������)
			ret = 1;
		}
		
		return ret;
		
	}
	
	// @param PN
	// @param phoneInfo
	// return
	
	public int updateInfo(PhoneInfo phoneInfo, int NO) {
		int ret = 0;
		
		try {
			// List������ŭ for��
			for(int idx=0; idx < this.InfoList.size(); idx++) {
				PhoneInfo curPhoneInfo = this.InfoList.get(idx);
				
				// ������ȣ�� ���Ͽ� ���� ��ȣ�� ������ �����Ѵ�.
				if(NO == curPhoneInfo.getNo()) {
					phoneInfo.setNo(NO);
					this.InfoList.remove(idx);
					this.InfoList.add(idx, phoneInfo);
					break;
				}
				
				// �ش����� ����
				if(idx == this.InfoList.size()-1) {
					ret=2;
				}
				
			}
		} catch (Exception e) {
			System.out.println("���� ������ ������ �߻��Ͽ����ϴ�.\n" + e.getMessage());
			
			// return�� ����(0: ����, 1: ����, 2: �ش����� ����)
			ret = 1;
		}
		return ret;
	}
	
	public void showpPhoneInfo() {
		for(int idx=0; idx<this.InfoList.size(); idx++) {
			System.out.println(":::::::::::::::::::::::");
			System.out.println("������ȣ : "+ InfoList.get(idx).getNo());
			System.out.println("\n�̸� : " + InfoList.get(idx).getName());
			System.out.println("\n���� : "+ InfoList.get(idx).getAge());
			System.out.println("\n��ȭ��ȣ : "+ InfoList.get(idx).getPhonenumber());
			System.out.println(":::::::::::::::::::::::");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
