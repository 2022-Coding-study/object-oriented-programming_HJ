package week11_3;
import java.util.*;
public class Test11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하려는 데이터의 수는 : ");
		int num = sc.nextInt();
		
		HashMap<String, String> dic = new HashMap<String, String>();
		System.out.println("이름과 전화번호를 입력하세요.(예: 홍길동 010-111-1212)");
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + ". 이름, 전화번호 >> ");
			String name = sc.next();
			String number = sc.next();
			dic.put(name, number);
		}

		System.out.print("전화번호를 찾으려는 회원의 이름은: ");
		String find = sc.next();
		
		String person = dic.get(find);
		if(person == null)
			System.out.println("해당하는 이름의 회원은 리스트에 없습니다.");
		else
			System.out.println(find + "의 전화번호는 : " + person);
		
		
		
	}

}
