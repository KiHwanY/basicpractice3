package ch19;

import java.net.InetAddress;

public class InetAddressExam2 {
    public static void main(String[] args) {
        try {
            //getAllByName(url) ==> 여러개의 ip주소를 배열로 저장
            InetAddress[] addresses = InetAddress.getAllByName("naver.com");
            for (int i=0; i<addresses.length; i++){
                System.out.println(addresses[i]);
            }
        }catch (Exception e){
         e.printStackTrace();
        }
    }
}
