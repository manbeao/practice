package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표 . 다른흐름의 메소드 호출 흐름에 대해 이해할수있다*/

        System.out.println("main() 시작함...");

        Application2 app2 =new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨... ");
    }


     public  void  methodA(){

         System.out.println("methodA() 호출됨");

         System.out.println("methodA() 종료됨 ...");
     }


     public  void  methodB(){

         System.out.println("methodB() 호출됨");

         System.out.println("methodB() 종료됨 ...");
     }



     public  void  methodC(){

         System.out.println("methodC() 호출됨");

         System.out.println("methodC() 종료됨 ...");
     }
}
