package thread;

public class BankPlayer extends Thread {
    int type;
    MyBank myBank;
    public BankPlayer(int type, MyBank myBank) {
        this.type = type;
        this.myBank = myBank;

    }

    @Override
    public void run() {
        switch (type) {
            case 1:
                myBank.playerA();
                break;
            case 2:
                myBank.playerB();
                break;
            case 3:
                myBank.playerC();
                break;
        }
    }

}
