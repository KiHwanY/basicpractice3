package thread;

public class BankUse {
    public static void main(String[] args) {
        MyBank bank = new MyBank();

        BankPlayer hong = new BankPlayer(1, bank);
        BankPlayer sa = new BankPlayer(2, bank);
        BankPlayer lee = new BankPlayer(3, bank);
        hong.setName("홍길동");
        sa.setName("사임당");
        lee.setName("이몽룡");
        hong.start();
        lee.start();
        sa.start();


    }

}
