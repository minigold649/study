package a;

import java.util.Scanner;
import java.util.Arrays;

public class a_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("비밀번호를 입력하세요.");
		System.out.print("-> ");
		String input = s.next();
		char pwd[] = new char[input.length()];
		
		for (int i = 0 ; i < input.length() ; i++) {
			pwd[i] = input.charAt(i);
		}
		
		System.out.println(Arrays.toString(pwd));
		
		for (int i = 0 ; i < 10 ; i++) { 
			if (pwd[i] == i) {
				System.out.println("test");
			} else {
				System.out.println("a");
			}
		}
		s.close();
	}
}
