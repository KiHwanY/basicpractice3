package ch17;

import javax.swing.*;

public class JFrameEx extends JFrame {
    // main메소드에서 GUI 작성보다는 기본생성자에서 GUI 코드 처리를 권장한다.
    public JFrameEx() {
        super("JFrame 예제");// 제목처리 , JFrame 은 닫기 기능이 자동으로 들어가 있음
        setSize(300, 200); // 프레임 사이즈
        setVisible(true);

    }

    public static void main(String[] args) {
        new JFrameEx();
    }
}
