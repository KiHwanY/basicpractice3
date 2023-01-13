package interface_assignment;

interface Member {
    void id(int id);
    void name(String name);
    void email(String email);
}
class MemberAnony {
    public static void main(String[] args) {
        Member mem = new Member() {
            @Override
            public void id(int id) {
                System.out.println("고객번호 : " + id);
            }

            @Override
            public void name(String name) {
                System.out.println("이름 : " + name);
            }

            @Override
            public void email(String email) {
                System.out.println("이메일 : " + email);
            }
        };
        System.out.println("=================================");
        mem.id(2);
        mem.name("김길동");
        mem.email("kim@gmail.com");
        System.out.println("=================================");
    }
}

