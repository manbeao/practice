package com.ohgiraffers.level02.normal;

public class Application1 {

    public static void main(String[] args) {

        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         *
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */

        double score = 85.9;
        int grade = (int) score;
        System.out.println((grade<=100 && grade >= 90)? "홍길동의 이번 점수 등급은 A입니다": (grade<90 && grade >=80)? "홍길동의 이번 점수 등급은 B입니다":
                        (grade<80 && grade >=70)? "홍길동의 이번 점수 등급은 C입니다" : (grade<70 && grade >=60)? "홍길동의 이번 점수 등급은 D입니다" : "홍길동의 이번 점수 등급은 F입니다"
                );
    }
}
