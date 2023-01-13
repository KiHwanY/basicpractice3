package thread;

public class MyThread_Im implements Runnable{

    public MyThread_Im(){}

    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);

        }
    }
}
