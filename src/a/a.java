package a;

import java.util.Scanner;
import java.util.Arrays;

public class a {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("숫자 4자리를 입력해주세요 -> ");
    int input = s.nextInt();
    int nums[] = new int[4];

    for (int i = 3 ; i >= 0 ; i--) {
      nums[i] = input % 10;
      input = input / 10;
    }
    System.out.println("배열 nums -> " + Arrays.toString(nums));
    int result = nums[0] * nums[1] - nums[2] + nums[3];

    System.out.println(nums[0] + " x " + nums[1] + " - " + nums[2] + " + " + nums[3] + " = " + result);
    result = result % 10;
    System.out.println("일의 자리 숫자 -> " + result);
    s.close();
  }
}
