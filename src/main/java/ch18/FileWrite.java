package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWrite {
    public static void main(String[] args) {
        //프로그램 ==> 파일 (출력 스트림이 필요)
        OutputStream os = null;
        try {
            os = new FileOutputStream("C:\\test\\aa.txt");
            System.out.println("입력하세요 : ");
            while (true){
                int ch = System.in.read(); // 1byte 읽음
                if (ch == 13)break;
                os.write(ch);
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
