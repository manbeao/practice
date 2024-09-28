package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /*메소드란 ?*/
        /*메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할수있다
        * 자세한 메소드 사용법은 객체부분에서 다루게 되니 지금은 호출 흐름에 대해 이해할수있도록 하자
        *
        * */

        /*1.먼저 main() 메소드가 동작하는지 확인하기 위한 간략한 출력 구문을 작성한다*/
        System.out.println("main() 시작됨...");


        /*2.main method 밖에 하단에 methodA라는 메소드를 추가해 보자*/

        /*5.작성한 메서드를 호출하는 부분*/
        /*클래스명 사용할 이름 = new 클래스명();     //객체 생성
        * 사용할 이름.메소드명();        //메소드 호출
        * */

        Application1 app1 = new Application1();
        app1.methodA();

        /*6. 코드 동작 흐름을 더 이해하기 위해 main()메소드가 종료할때 출력하는 구문을 간단히 작성한다*/
        System.out.println("main() 종료됨...");

        /*7. 메소드 실행 흐름을 확인하고 methodB()를 추가한다*/

    }

    /*3. 호출 확인을 위한 메소드*/
    public void methodA(){
        /*4.호출 확인을 위해 간단히 출력 구문을 작성하고 다시 메인메소드 내부에서 코드를 계속 작성한다*/
        System.out.println("methodA() 호출함...");

        /*12. methodB() 작성후 호출구문 작성*/
        methodB();


        /*13. methodB()를 호출한 이후 methodA()가 언제 종료 되는지 확인할수있도록 출력구문 추가*/
        System.out.println("methodA() 종료됨...");
    }

    public void methodB(){

        /*9. methodA와 같은 방식으로 동작하는지 확인하는 용도의 출력구문을 작성한다*/
        System.out.println("methodB() 호출함 ...");

        /*10. 작성만 해두고 다시 main()을 실행하면 methodB는 동작하지 읺는다
        * 메소드 호출을 해야반 메소드 내부에 있는 구현부가 실행된다.
        * */

        /*11. methodA()내부에서 methodB()를 호출하는 구문을 작성해보자*/

        /*16. methodC ()호출*/
        methodC();

        /*17. methodB()가 종료되는 시점도 확인하기 위해 출력구문 추가*/
        System.out.println("methodB() 종료됨...");
    }


    /*14.호출 확인을 위한 메소드*/
    public void methodC(){
        /*15.methodB와 같은 방식으로 동작하는지 확인하는 용도의 출력 구문을 작성한다*/
        System.out.println("methodC() 호출함...");

        /*18. methodC()가 종료되는 시점도 확인하기 위해 출력구문 추가*/
        System.out.println("methodC() 종료됨...");
    }
}
