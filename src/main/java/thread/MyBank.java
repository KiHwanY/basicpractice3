package thread;

public class MyBank {
    public MyBank() {
    }
    public synchronized void playerA() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "님의 통장잔고는 " + (i * 10) + "만원 입니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }

    public synchronized void playerB() {
        for (int i = 2; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName() + "님의 통장잔고는 " + (i * 10) + "만원 입니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }

    public synchronized void playerC() {
        for (int i = 3; i <= 7; i++) {
            System.out.println(Thread.currentThread().getName() + "님의 통장잔고는 " + (i * 10) + "만원 입니다.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();

    }
}
