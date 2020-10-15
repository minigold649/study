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
		int signCount = 0; // 특수문자 갯수
		int numberCount = 0; // 소문자(알파벳) 갯수
		int upperCase = 0; // 대문자(알파벳) 갯수
		for (int i = 0 ; i < 10 ; i++) { 
			if(pwd[i] >=33 && pwd[i]<48) {
				signCount++;
			}else if(pwd[i] >= 48 && pwd[i] < 58) {
				numberCount++;
			}
		}
		s.close();
	}
}
