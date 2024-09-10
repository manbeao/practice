public class teacher {

/* 객체 : 나 선생님

요구사항

1. 선생님은 강의 시작하기, 설명하기, 이해시키기, 강의 끝내기를 할 수 있다.
2. 나는 강의 시작하기, 설명듣기, 이해하기, 강의 끝내기를 할 수 있다.
3. 나는 강의를 시작하지 않은 채로 대기하고 있는다.
4. 선생님은 강의를 시작한다. 이미 강의가 시작되어 있는 경우 다시 강의를 시작할 수 없다
5. 나는 강의를 시작한다.
6. 선생님이 설명을 한다. 내가 강의를 시작하지 않으면 선생님이 강의 시작하라고 말씀하신다.
7. 나는 설명을 듣는다. 설명을 듣지 않는 경우 선생님이 이해시키기를 진행하지 않는다.
8. 선생님은 이해시킨다. 선생님이 이해시키기를 하지 않으면 질문한다.
9. 나는 이해를 한다. 만약 내가 이해 못할 경우 선생님께 질문을 한다.
10. 선생님은 강의를 끝낸다. 강의가 끝난 상태에서는 강의를 끝낼 수 없다.
11. 나는 강의를 끝낸다. 강의를 끝낸 상태에서는 강의를 끝낼 수 없다.

객체간 상호작용

- 선생님이 수신할 수 있는 메세지
1. 강의를 시작하라
2. 설명을 해라
3. 이해를 시켜라
4. 강의를 끝내라

- 내가 수신할 수 있는 메세지
1. 강의를 시작해라
2. 설명을 들어라
3. 이해를 해라
4. 강의를 끝내라*/


    private boolean startClass;
    private boolean description;
    private boolean Understand;
    private boolean endClass;

    public void StartClass(){
        if (startClass){
            System.out.println("이미 강의가 시작되었습니다.");
        }else {
            System.out.println("강의를 시작하겠습니다. 모두 수업할 준비를 해주세요.");
            this.startClass=false;

        }
    }

    public void explain(){
        if (!startClass){
            if (!description){
                System.out.println("선생님께서 설명을 하십니다.");
                this.description=true;
            } else if (description){
                System.out.println("이미 설명을 하시고 계십니다");
            }else {
                System.out.println("먼저 강의를 시작해주세요.");
            }

        }else {
            System.out.println("강의가 시작되지 않았습니다. 먼저 강의를 시작해주세요.");
        }
    }

    public void understanding(){
        if (!startClass){

            if(!description){
                System.out.println("먼저 설명을 들어주세요");}
             else {
                if (!Understand) {
                    System.out.println("선생님이 이해시키기를 시작합니다.");
                    this.Understand=true;

                }else{
                    System.out.println("이미 설명중이십니다");
                }
            }

            }else {
            System.out.println("강의가 시작되지 않았습니다. 먼저 강의를 시작해주세요.");
            }
        }


        public void EndClass(){
        if (startClass){
            if (!endClass){
            System.out.println("선생님께서 강의를 끝내셨습니다");
            this.endClass=false;
        }else {
                System.out.println("강의가 이미 끝나있습니다.");
            }

        } else {
            if (Understand) {
                System.out.println("강의가 끝났습니다");
            }else {
                System.out.println(" 먼저 강의를 수강해야 끝낼수 있습니다");
            }
        }
        }



}
