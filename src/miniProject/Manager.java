package miniProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager {
	
	// 개인정보 저장할 List
	List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();
	
	// 개인별 고유번호
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
		// 성공여부 return 변수
		int ret = 0;
		
		try {
			// 고유번호 지정
			phoneInfo.setNo(++this.NO);
			
			// List에 객체를 추가 해 준다.
			this.InfoList.add(phoneInfo);
			
		} catch (Exception e) {
			System.out.println("정보 추가 중 에러가 발생하였습니다.\n" + e.getMessage());
			// return값 변경(0 : 정상, 1: 에러)
			ret = 1;
		}
		return ret;
	}
	
	// @param PN
	// @return
	public int removeInfo(int NO) {
		// 성공여부 return 변수
		int ret = 0;
		
		
		try {
			// List개수만큼 for문
			for(int idx=0; idx < this.InfoList.size(); idx++) {
				PhoneInfo curPhoneInfo = this.InfoList.get(idx);
				
				// 고유번호를 비교하여 같은 번호의 정보를 삭제한다.
				if(NO == curPhoneInfo.getNo()) {
					this.InfoList.remove(idx);
					break;
				}
				// 해당정보없음
				if(idx == this.InfoList.size()-1) {
					ret = 2;
				}
			}
			
		} catch (Exception e) {
			System.out.println("정보 삭제 중 에러가 발생하였습니다.\n" + e.getMessage());
			// return값 변경(0 : 정상, 1: 에러, 2: 해당정보없음)
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
			// List개수만큼 for문
			for(int idx=0; idx < this.InfoList.size(); idx++) {
				PhoneInfo curPhoneInfo = this.InfoList.get(idx);
				
				// 고유번호를 비교하여 같은 번호의 정보를 수정한다.
				if(NO == curPhoneInfo.getNo()) {
					phoneInfo.setNo(NO);
					this.InfoList.remove(idx);
					this.InfoList.add(idx, phoneInfo);
					break;
				}
				
				// 해당정보 없음
				if(idx == this.InfoList.size()-1) {
					ret=2;
				}
				
			}
		} catch (Exception e) {
			System.out.println("정보 수정중 에러가 발생하였습니다.\n" + e.getMessage());
			
			// return값 변경(0: 정상, 1: 에러, 2: 해당정보 없음)
			ret = 1;
		}
		return ret;
	}
	
	public void showpPhoneInfo() {
		for(int idx=0; idx<this.InfoList.size(); idx++) {
			System.out.println(":::::::::::::::::::::::");
			System.out.println("고유번호 : "+ InfoList.get(idx).getNo());
			System.out.println("\n이름 : " + InfoList.get(idx).getName());
			System.out.println("\n나이 : "+ InfoList.get(idx).getAge());
			System.out.println("\n전화번호 : "+ InfoList.get(idx).getPhonenumber());
			System.out.println(":::::::::::::::::::::::");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
