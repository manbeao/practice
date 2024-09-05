package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /*수업 목표 . 메소드 리턴 값을 이해하고 활용할수있다*/
        /*필기
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는것을 의미한다.
        * 복귀를 할때 그냥 복귀를 할수도 있지만, 값을 가지고 복귀 할수도있다
        * 이때 가지고 가는 값을 리턴값이라고 한다
        *
        *
        *
        * return값울 반환 받기 위해서는 메서도 선언부에 리턴 타입을 명사해주어야한다
        * void는 아무 반환 값도 가지지 않겠다는 리턴타입에 사용할수있는 키워드 이다
        * 반환값이 없는 경우 return 구문은 생략해도 컴파일러가 자동으로 추가해주지만,
        * 반환값이 있는 경우는 return 구문을 반드시 명시적으로 작성해야한다
        * 또한 메소드 선언부에 선언한 리턴 타입 반환 값의 자료형은 반드시 일치해야한다
        * */

        System.out.println("main() 메소드 시작함 ...");

        /*메소드 리턴 값 확인*/
        Application6 app6 = new Application6();
        app6.testMethod();
        
        String reurnText = app6.testMethod();
        System.out.println("reurnText = " + reurnText);     //변수에 넣은뒤 출력

        System.out.println(app6.testMethod());      //바로 출력

        System.out.println("main() 메소드 종료됨...");
    }

    public String testMethod(){
        /*필기
        * public 뒤에 바로 return 으로 가지고 갈 타입을 명시한다
        * 아무값도 리턴하지 않는 경우 void,
        * 값을 반환하는 경우에는 반환값의 자료형을 작성해야한다
        * */
        return "hello world";
    }
}
