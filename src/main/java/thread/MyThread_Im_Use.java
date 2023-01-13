package thread;

public class MyThread_Im_Use {
    public static void main(String[] args) {
        MyThread_Im i1 = new MyThread_Im();
        MyThread_Im i2 = new MyThread_Im();

        Thread t1 = new Thread(i1,"스레드1");
        Thread t2 = new Thread(i2,"스레드2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

    }
}
