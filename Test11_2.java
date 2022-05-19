package week11_2;
import java.util.*;
public class Test11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 3개 입력하세요. (예: Korea 5000)");
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ". 나라 이름, 인구 >> ");
			String country = sc.next();
			Integer pop = sc.nextInt();
			dic.put(country, pop);
		}
		
		Integer big = 0;
		for (String key : dic.keySet()) {
			Integer num = dic.get(key);
			if(num > big)
				big = num;
		}
		String name = "나라";
		for (String key : dic.keySet()) {
			if(big.equals(dic.get(key))) {
				name = key;
			}				
		}
		System.out.println("제일 인구가 많은 나라는 (" + name + ", " + big + ")");
		
		
	}

}
