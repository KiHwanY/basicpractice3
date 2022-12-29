package ch08;

public class MyManagerUse {
    public static void main(String[] args) {
        //1) getInstance() 호출해서 처음 호출이면 score멤버 변수에 10을 초기화
        MyManager mgrobj =MyManager.getInstance();
        System.out.println(mgrobj);
        System.out.println("mgrobj.getScore() : "+ mgrobj.getScore());
        mgrobj.setScore(100);
        System.out.println("mgrobj.getScore() : "+ mgrobj.getScore());

        //2) 두번째 호출이기 때문에 기존 객체의 주소값을 리턴 받아옴
        MyManager newmgr= MyManager.getInstance();
        System.out.println(newmgr);
        System.out.println("newmgr : "+ newmgr.getScore());
    }
}
