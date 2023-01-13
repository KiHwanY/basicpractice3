package ch16;

public class DaemonThread implements Runnable{
    @Override
    public void run() {
        while (true){ // while(true)지만 main 스레드가 종료되면 자동 종료됨.
            System.out.println("데몬 스레드가 실행중입니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;//Exception 발생시 while문 빠져나가도록
            }
        }//while문
    }//run

    public static void main(String[] args) {
        Thread th = new Thread(new DaemonThread());
        th.setDaemon(true);//데몬스레드 설정
        th.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드가 종료됩니다.");
    }
}
