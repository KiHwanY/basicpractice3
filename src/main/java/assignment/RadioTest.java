package assignment;

public class RadioTest {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");

        Radio britsRadio = new Radio();
        britsRadio.setChannel(89.1);
        britsRadio.setVolume(12);
        britsRadio.radioOnOff=true;
        britsRadio.brits();

        System.out.println("=============================================");

        Radio iRiverRadio = new Radio();
        iRiverRadio.setChannel(95.1);
        iRiverRadio.setVolume(9);
        iRiverRadio.radioOnOff = false;
        iRiverRadio.iRiver();

        System.out.println("---------------------------------------------");

    }
}
