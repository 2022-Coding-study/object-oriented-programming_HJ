package week11_2;
import java.util.*;
public class Test11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 3�� �Է��ϼ���. (��: Korea 5000)");
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ". ���� �̸�, �α� >> ");
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
		String name = "����";
		for (String key : dic.keySet()) {
			if(big.equals(dic.get(key))) {
				name = key;
			}				
		}
		System.out.println("���� �α��� ���� ����� (" + name + ", " + big + ")");
		
		
	}

}
