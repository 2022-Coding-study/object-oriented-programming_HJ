package week11_3;
import java.util.*;
public class Test11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��Ϸ��� �������� ���� : ");
		int num = sc.nextInt();
		
		HashMap<String, String> dic = new HashMap<String, String>();
		System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���.(��: ȫ�浿 010-111-1212)");
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + ". �̸�, ��ȭ��ȣ >> ");
			String name = sc.next();
			String number = sc.next();
			dic.put(name, number);
		}

		System.out.print("��ȭ��ȣ�� ã������ ȸ���� �̸���: ");
		String find = sc.next();
		
		String person = dic.get(find);
		if(person == null)
			System.out.println("�ش��ϴ� �̸��� ȸ���� ����Ʈ�� �����ϴ�.");
		else
			System.out.println(find + "�� ��ȭ��ȣ�� : " + person);
		
		
		
	}

}
