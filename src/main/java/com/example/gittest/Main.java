package com.example.gittest;

public class Main {
    //cmd + D : 라인 복제
    //cmd + delete : 라인 삭제
    //cmd + x : 라인 잘라내기
    //control + shift + J : 라인 합치기
    public static void main(String[] args) {
        String profile = "안녕하세요. " +
                "IntelliJ 강의에 오신것을 " +
                "환영합니다.";
    }

    // opt + shift + up/down : 단순 라인 절대적 위아래 이동
    // cmd + shift + up/down : 라인 이동(함수나 클래스 내 범위 안에서)
    public void moveLineAndStatemnet(){
        System.out.println("라인 혹은 구문 단위로 이동합니다.");

        for (int i = 0; i < 10; i++) {

        }
    }

    // cmd + opt + shift + left/right : 엘리먼트 단위 좌우 이동
    public void moveElementOrParameter(int a, String b){

    }

    // cmd + p : 파라미터 즉시보기
    // option + space : 코드 구현부 즉시보기
    // f1 : document 정의 보여주기
    public void viewArguments(){
        EmailSender emailSender = new EmailSender(1L, "holeman79", "holeman79@gmail.com");
        emailSender.receive("holeman79@gmail.com", "david@gmail.com");

        emailSender.send("test.gmail.com");

        double random = Math.random();
        System.out.println();
    }

    static class EmailSender {
        private Long id;
        private String name;
        private String email;

        public EmailSender(Long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public void receive(String from, String to){

        }

        public void send(String to){
            System.out.println(this.email + "님이 "+ to + "님에게 메일을 보냅니다. ");
        }
    }
}
