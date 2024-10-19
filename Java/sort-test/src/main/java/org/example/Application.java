package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String name[] = new String[5];
            int age[] = new int[5];
            int r =(int)(Math.random() * 100) +1;
            Random random = new Random();

            for(int i=0; i<5; i++) {
                System.out.print("이름을 입력하세요 : " );
                name[i] = sc.nextLine();
                age[i]= random.nextInt(90) + 10;
            }


            System.out.println("=====참가번호 정렬 전=====");

            for(int i=0; i<5; i++) {
                System.out.println("name ="+ name[i] +", num = " + age[i]);
            }
            System.out.println("=====참가번호 정렬 후=====");

            for(int i=0; i<5; i++) {
                Arrays.sort(age);
                System.out.println("name ="+ name[i] +", num = " + age[i]);

        }
    }
}
