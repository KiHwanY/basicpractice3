package thread;


import java.io.*;

public class FileCopy2_Write {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("C:\\test\\abc.txt");
            System.out.println("입력하세요 : ");
            while (true) {
                int ch = System.in.read();
                if (ch == 10) {
                    break;
                }
            os.write(ch);
            }
            os.close();
            System.out.println("파일이 저장되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
