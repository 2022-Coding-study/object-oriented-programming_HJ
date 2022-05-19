package week11_1;
import java.util.*;

public class Test11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("java", "�ڹ�");
		dic.put("school", "�б�");
		dic.put("map", "����");
		
		System.out.println("*** keySet() ***");
		for (String key : dic.keySet()) {
			String value = dic.get(key);
		    System.out.println("�ܾ� :" + key + ", �ǹ� : " + value);
		}    
		System.out.println("*** entrySet() ***");
		for (Map.Entry<String, String> entry : dic.entrySet()) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ã�� ���� �ܾ� : ");
			String word = sc.next();
			if(word.equals("quit")) {
				System.out.println("���α׷� ����");
				break;
			}
			
			String mean = dic.get(word);
			if(mean == null)
				System.out.println("ã�� �ܾ �����ϴ�.");
			else
				System.out.println("ã�� ���� �ܾ� : " + mean);
			
				
		}
		
	}
}
