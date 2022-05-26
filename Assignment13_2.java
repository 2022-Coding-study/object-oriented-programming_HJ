import java.util.*;
import java.io.*;
public class Assignment13_2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String num; String name;String phone;String mail; int choice;
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\kamja\\Desktop\\자바 객지설\\Assignment13_2\\result.txt"));
			while(true) {
			System.out.print("사용자 번호를 입력하세요 >> ");
			num = sc.next();
			System.out.print("사용자 이름을 입력하세요 >> ");
			name = sc.next();
			System.out.print("사용자 전화번호를 입력하세요 >> ");
			phone = sc.next();
			System.out.print("사용자 이메일을 입력하세요 >> ");
			mail = sc.next();
			
			pw.print(num + ", " + name + "," + phone + "," + mail + ",");
			System.out.print("입력이 끝났으면 0, 계속 입력하려면 1을 입력하세요 >> ");
			choice = sc.nextInt();

			if(choice == 0)
				break;
			
			} pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		String num1; String name1; String phone1; String mail1; String search = "";
		System.out.print("검색할 사용자 번호를 입력하세요 >> "); 
		search = sc.next();
		
		try(Scanner scan = new Scanner(new File("C:\\Users\\kamja\\Desktop\\자바 객지설\\Assignment13_2\\result.txt"))){
			scan.useDelimiter(",");
			while(scan.hasNext()) {
				num1 = scan.next();
				name1 = scan.next();
				phone1 = scan.next();
				mail1 = scan.next();
				
				if(num1.equals(search)) 
				System.out.println("사용자 번호" + num1 + "의 전화번호는 " + phone1	 + "입니다.");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
