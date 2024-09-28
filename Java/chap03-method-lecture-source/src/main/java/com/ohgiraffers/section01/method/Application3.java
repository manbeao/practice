package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        /*수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출시 활용할수있다*/
        /*필기
        *전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        * 지금까지 우리가 배운 변수는 지역변수에 해당한다
        *  */

        /*필기
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)
        * 4. 클래스 (static) 변수
        * */

        /*필기
        * 지연변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        * 다른 메소드간 서로 공유해야하는 값이 존재하는 경우 메소드 호출시 사용하는 괄호를 이용해서 값을 전달 할수있다
        * 이때 전달 하는 값을 전달인자 (argument)라고 부르고,
        * 메소드 선언부 괄호안에 전달인자를 잗기위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */

        Application3 app3 = new Application3();

        /*목차 1. 전달인자로 값 전달 테스트*/
        app3.testMethod(22);    //호출하고 안에 변수의 값을 넣어야함
//        app3.testMethod("20");  //매개변수가 int로 정수형이기 때문에 문자열은 출력 불가능하다
//        app3.testMethod(20,21,22);  //매개변수가 1개라서 그 이상의 값들은 담으면 에러가 난다
//        app3.testMethod();  //매개변수 선언 후 아무것도 전달하지 않으면 호출할수없다


        /*목차 2. 변수에 저장한 값 전달 테스트*/
        /*목차 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다*/
        int age = 40;   //아래의 매개변수와는 다른 변수이다
        app3.testMethod(age);


        /*목차 2-2. 자동형변환을 이용하여 값 전달을 할 수 있다*/
        byte byteAge = 10;
        app3.testMethod(byteAge);


        /*목차 2-3. 강제 형변환을 이ㅛㅇㅇ해서 값 전달을 할수있다*/
        long longAge=80;
//        app3.testMethod(longAge);   //자동 형변환을 할수없어서 오류
        app3.testMethod((int)longAge);  //강제 형변환시 데이터 손실 주의


        /*목차 2-4. 연산 결과를 이용해서 값 전달을 할수있다*/
        app3.testMethod(age*3);
    }

    public void testMethod(int age){        //매개변수 안에 무슨값으로 받아올지 변수를 써야함 예) int age

        System.out.println("당신의 나이는 " + age + "세 입니다");
    }


}
