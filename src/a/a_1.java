package a;

import java.util.Scanner;
import java.util.Arrays;

public class a_1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("���� 4�ڸ� �Է����ּ��� -> ");
    int input = s.nextInt();
    int nums[] = new int[4];

    for (int i = 3 ; i >= 0 ; i--) {
      nums[i] = input % 10;
      input = input / 10;
    }
    System.out.println("�迭 nums -> " + Arrays.toString(nums));
    int result = nums[0] * nums[1] - nums[2] + nums[3];

    result = result % 10;
    System.out.println("��� -> " + result);
    s.close();
  }
}
