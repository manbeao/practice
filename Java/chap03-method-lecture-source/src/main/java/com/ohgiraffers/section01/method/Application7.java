package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /*수업목표. 매개변수와 리턴값을 복합적으로 활용하는것을 이해하고 활용할수있다*/
        /*필기
        * 매개변수와 리턴값 복합 활용
        * 매개변수도 존재하고 리터값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
        * */
        int frist = 20;
        int second = 10;
        //처음 초기화 값은 넣어야함


        Application7 app7 = new Application7();
        System.out.println("두수를 더한 결과 : " + app7.pulsTwoNumbers(frist,second));
        System.out.println("두수를 뺀 결과 : " + app7.minusTwoNumbers(frist,second));
        System.out.println("두수를 곱한 결과 : " + app7.multipleTwoNumbers(frist,second));
        System.out.println("두수를 나눈 결과 : " + app7.divideTwoNumbers(frist,second));

    }


    public int pulsTwoNumbers(int frist, int second){
        return frist+second;
    }

    public int minusTwoNumbers(int frist, int second){
        return frist-second;
    }

    public int multipleTwoNumbers(int frist, int second){
        return frist*second;
    }


    public int divideTwoNumbers(int frist, int second){
        return frist/second;
    }

}
