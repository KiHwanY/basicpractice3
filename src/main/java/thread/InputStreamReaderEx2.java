package thread;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx2 {

    public static void main(String[] args) {

        InputStreamReader isp = new InputStreamReader(System.in);
        try {
            System.out.print("글자 내용을 입력하세요 : ");
            int code = isp.read();
            while (code != 13) {
                System.out.println((char) code + " code : " + code + " 입니다.");
                code = isp.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}