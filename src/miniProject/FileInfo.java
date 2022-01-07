package miniProject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileInfo {
	
	// @param file ���������� ����� ����
	// @retrun List<PhoneInfo>
	public static List<PhoneInfo> readFile(File file) throws IOException {
		FileReader fr = null;
		List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();
		
		
		try {
			fr = new FileReader(file);
			// ���Ͽ��� �о�� ������ List�� �����Ѵ�.
			InfoList = readReader(fr);
		} finally {
			if(fr != null)
				fr.close();
		}
		return InfoList;
	}
	
	public static void writeFile(String dir, String name, List<PhoneInfo> InfoList) throws IOException {
		OutputStream os = null;
		
		try {
			File dirent = new File(dir);
			
			// ������ ���丮�� �������� ������ ����
			if(!dirent.exists()) {
				dirent.mkdir();
			}
			
			File outFile = new File(dir, name);
			
			// ������ �����Ѵٸ� �����Ѵ�.
			if(outFile.exists()) {
				outFile.delete();
			}
			
			// ���Ͽ� String���� �Է��� BufferedOutputStram ����
			os = new BufferedOutputStream(new FileOutputStream(outFile));
			for(int idx=0; idx < InfoList.size(); idx++) {
				// List���� ���������� �����´�.
				String writeStr = InfoList.get(idx).getNo() + "," + InfoList.get(idx).getName() + "," + InfoList.get(idx).getAge() + ","
								+ InfoList.get(idx).getPhonenumber() + "\n";
				
				// ������ String���� Byte �迭�� ����
				byte[] b = writeStr.getBytes();
				
				// ���Ͽ� �ش� ������ ����.
				os.write(b);
			}
		} catch (IOException ioe) {
			// ����¿��� ���ܹ߻��� ���� ���� ���
			ioe.printStackTrace();
			throw ioe;
		} finally {
			try {
				// BufferdOutputStream ��ü�� close���ش�.
				if (os != null) os.close();
			}catch (Exception e) {
			}
		}
	}
	
	
	// @param input
	// @return
	// @throws IOEception
	public static List<PhoneInfo> readReader(Reader input) throws IOException {
		
		try {
			// ������ ������ �о���� BufferReader ��ü ����
			BufferedReader br = new BufferedReader(input);
			String line;
			
			List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();
			
			// ������ ���پ� �о��.
			while((line = br.readLine()) != null) {
				// ","�� split�Ͽ� �迭�� ����
				String[] writeStr = line.split(",");
				
				// ��� ������ ����Ǿ� ���� �ʴٸ� skip�Ѵ�.
				if(writeStr.length != 4) continue;
				
				PhoneInfo phoneInfo = new PhoneInfo();
				
				// �� ���������� �����Ѵ�.
				phoneInfo.setNo(Integer.parseInt(writeStr[0]));
				phoneInfo.setName(writeStr[1]);
				phoneInfo.setAge(Integer.parseInt(writeStr[2]));
				phoneInfo.setPhonenumber(writeStr[3]);
				
				//����Ʈ�� ��ü �߰�.
				InfoList.add(phoneInfo);
				
			}
			
			return InfoList;
		} finally {
			input.close();
		}
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
