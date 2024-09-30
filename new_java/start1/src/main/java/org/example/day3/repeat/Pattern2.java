package org.example.day3.repeat;

public class Pattern2 {
    public static void main(String[] args) {
        //1. 1부터 499까지 누적해서 프린트
        //2. 1부터 100까지 중 4의 배수만 누적해서 프린트
        //3. 500부터 1까지 2씩 감소하면서 5의 배수는 빼고,
        //   누적해서 프린트.
        //1증가 ==> for(int i = 0; i < 100; i++)
        //2증가                         i = i + 2
        //2감소                         i = i - 2
        int sum = 0;
        for(int i = 1; i < 500; i++){
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for(int i = 1; i < 500; i++){
            if(i % 4 != 0) continue;
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for(int i = 500; i > 0; i -= 2){
            if(i % 5 == 0) continue;
            sum += i;
        }
        System.out.println(sum);

    }
}