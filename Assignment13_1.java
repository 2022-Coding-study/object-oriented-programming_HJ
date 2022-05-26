package Assignment13_1;
import java.io.*;
import java.util.*;

public class Assignment13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader in = new FileReader("C:\\Users\\kamja\\Desktop\\자바 객지설\\week13_1\\in.txt");
			FileWriter out = new FileWriter("C:\\Users\\kamja\\Desktop\\자바 객지설\\week13_1\\out.txt");
			
			int a;
			while((a=in.read()) != -1) {
				if(a >= 97 && a <= 122) {
					a -= 32;
				}
				out.write((char)a);
			}
			out.flush();
		} catch (IOException e) {
			System.out.println("오류입니다.");
		}
		
		
		
	}

}
