package week11_1;
import java.util.*;

public class Test11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("java", "자바");
		dic.put("school", "학교");
		dic.put("map", "지도");
		
		System.out.println("*** keySet() ***");
		for (String key : dic.keySet()) {
			String value = dic.get(key);
		    System.out.println("단어 :" + key + ", 의미 : " + value);
		}    
		System.out.println("*** entrySet() ***");
		for (Map.Entry<String, String> entry : dic.entrySet()) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾고 싶은 단어 : ");
			String word = sc.next();
			if(word.equals("quit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String mean = dic.get(word);
			if(mean == null)
				System.out.println("찾는 단어가 없습니다.");
			else
				System.out.println("찾고 싶은 단어 : " + mean);
			
				
		}
		
	}
}
