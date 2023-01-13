package ch12;

public class LocalOuter {
    private int data = 30;
    void display(){
        class LocalInner{
            void meg(){
                System.out.println(data);
            }
        }// end Inner class
        LocalInner li =new LocalInner();
        li.meg();
    }// end display

    public static void main(String[] args) {
        LocalOuter lo = new LocalOuter();
        lo.display();
    }
}
