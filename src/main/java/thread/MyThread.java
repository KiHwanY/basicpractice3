package thread;

import ch10.T;

public class MyThread extends Thread{

    public MyThread(){}

    @Override
    public void run() {
        for (int i =1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);

        }
    }
}
