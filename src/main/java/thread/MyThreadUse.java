package thread;

public class MyThreadUse {
    public static void main(String[] args) {

        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();


        m1.setName("스레드1");
        m2.setName("스레드2");

        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
    }
}
