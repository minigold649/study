package a;

import java.util.Scanner;
import java.util.Arrays;

public class a_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		boolean valid = false;
		while (valid == false) {
			System.out.println("비밀번호를 입력하세요.");
			System.out.print("-> ");
			String input = s.next();
			char pwd[] = new char[input.length()];

			for (int i = 0 ; i < input.length() ; i++) {
				pwd[i] = input.charAt(i);
			}

			System.out.println(Arrays.toString(pwd));
			int n = 0; // 숫자 갯수
			int smallA = 0; // 소문자(알파벳) 갯수
			int bigA = 0; // 대문자(알파벳) 갯수
			for (int i = 0 ; i < input.length() ; i++) { 
				if (pwd[i] >= 48 && pwd[i] <= 57) {
					n = n + 1;
				}else if (pwd[i] >= 97 && pwd[i] <= 122) {
					smallA = smallA + 1;
				}else if (pwd[i] >= 65 && pwd[i] <= 90) {
					bigA = bigA + 1;
				}
			}

			/*System.out.println("n의 갯수 " + n);
		System.out.println("bigA의 갯수 " + bigA);
		System.out.println("smallA의 갯수 " + smallA); */

			if (n >= 1 && smallA >= 1 && bigA >= 1) {
				valid = true;
				System.out.println("성공적으로 비밀번호가 만들어졌습니다.");
			} else {
				System.out.println("비밀번호를 다시 입력해주시기 바랍니다.");
			}
		}
		s.close();
	}
}
