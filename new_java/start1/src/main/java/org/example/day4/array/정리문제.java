package org.example.day4.array;

import java.util.Random;
import java.util.Scanner;

public class 정리문제 {
    public static void main(String[] args) {
        // 1. 성적 변동 문제
        System.out.println("=============== 성적 변동 문제 ===============");
        int[] terms1 = {77, 88, 99, 55, 70};
        int[] terms2 = {99, 100, 88, 80, 70};

        int grow = 0;
        int same = 0;

        for (int i = 0; i < terms1.length; i++) {
            if (terms1[i] < terms2[i]) {
                grow++;
            } else if (terms1[i] == terms2[i]) {
                same++;
            }
        }

        System.out.println("성적 향상된 학생 수 = " + grow);
        System.out.println("성적 동일한 학생 수 = " + same);

        System.out.println("\n==================== 2번 =================");

        /*
            2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
               숫자 입력 : 55
               숫자 입력 : 77
               숫자 입력 : 11
               ----------------
               합계 143
               평균 47.666666667
         */

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("숫자 입력 : ");
            sum += sc.nextInt();
        }

        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.9f", ((double)sum / 3));

        System.out.println("\n\n==================== 3번 =============================");
        /*
            3. int[] n = new int[1000];
               random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
               3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
               3-2. 전체 합계와 평균 출력
         */

        int[] n = new int[1000];

        Random r = new Random(44);

        sum = 0;
        int result = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
            System.out.print(n[i] + " ");

            if (i == 0 || i == 2 || i == 4 || i == 99 || i == 989){
                result += n[i];
            }

            sum += n[i];
        }

        System.out.println("\n");

        System.out.println("첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 = " + result);
        System.out.println("전체 합계 = " + sum);
        System.out.println("평균 = " + sum / 1000);


        System.out.println("\n======================== 4번 =====================");
        /*
            다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
            (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)

               가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
               당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.
         */

        String[] locations = {"백두산", "한라산", "후지산"};
        String[] transportation = {"열차", "배", "비행기"};

        System.out.println("가고 싶은 곳을 입력해주세요.(보기 : 1)백두산, 2)한라산, 3)후지산)");
        System.out.println("예) 후지산을 가고 싶을 경우 \"3\" 입력");
        System.out.print("입력 : ");
        int num = sc.nextInt();

        System.out.println("당신이 가고 싶은 곳인 " + locations[num - 1] + "은 " + transportation[num - 1] + "를 타고 가야합니다.");

        System.out.println("\n========================== 5번 ================================");
        /*
            5. random한 값 1부터 100까지 배열(크기 1000)에 넣어 전체 출력(씨앗값 : 555)
                80 이상인 수의 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
         */
        int[] nums = new int[1000];

        Random r2 = new Random(555);

        int count1 = 0; // 80 ~
        int count2 = 0; // 70 ~ 79
        int count3 = 0; // 50 ~ 69
        int count4 = 0; // ~ 49


        for (int i = 0; i < nums.length; i++) {
            int random = r.nextInt(100) + 1;
            nums[i] = random;
            System.out.print(random + " ");

            if (random <= 49){
                count4++;
            } else if (random <= 69){
                count3++;
            } else if (random <= 79){
                count2++;
            } else {
                count1++;
            }
        }

        System.out.println("\n");

        System.out.println("80 이상인 수의 갯수 = " + count1);
        System.out.println("70 이상 79 이하인 수의 갯수 = " + count2);
        System.out.println("50 이상인 69 이하인 수의 갯수 = " + count3);
        System.out.println("49 이하인 수의 갯수 = " + count4);
    }
}
