package assignment;

public class Radio {

    double channel;
    int volume;
    boolean radioOnOff;

    public double getChannel() {
        return channel;
    }

    public void setChannel(double channel) {
        this.channel = channel;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

   public void brits(){
        System.out.println("===[브리츠 라디오]===");

        if (radioOnOff == true){
            System.out.println("라디오가 켜져있습니다.");
        }else {
            System.out.println("라디오가 꺼져있습니다.");
        }
        System.out.println("현재 채널은 "+ channel + "번 입니다.");
        System.out.println("볼륨은 "+volume + "입니다.");
    }

    public void iRiver(){
        System.out.println("===[아이리버 라디오]===");

        if (radioOnOff == true){
            System.out.println("라디오가 켜져있습니다.");
        }else {
            System.out.println("라디오가 꺼져있습니다.");
        }
        System.out.println("현재 채널은 "+ channel + "번 입니다.");
        System.out.println("볼륨은 "+volume + "입니다.");
    }



}
