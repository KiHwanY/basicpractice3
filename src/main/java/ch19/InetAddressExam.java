package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
    public static void main(String[] args) {
        // net도 Try ~ catch 문 활용
        try {
            InetAddress address = InetAddress.getByName("google.com");
            System.out.println(address);//호스트이름과 ip주소
            System.out.println(address.getHostName());//호스트이름(도메인이름)
            System.out.println(address.getHostAddress());//ip 주소값
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
