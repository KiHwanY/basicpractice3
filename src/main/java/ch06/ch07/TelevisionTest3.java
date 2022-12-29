package ch06.ch07;

public class TelevisionTest3 {
    public static void main(String[] args) {

        Television myTv = new Television();

        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOFF = true;
        myTv.print();

        Television youTv = new Television();
        youTv.channel = 9;
        youTv.volume = 12;
        youTv.onOFF = true;
        youTv.print();


    }
}
