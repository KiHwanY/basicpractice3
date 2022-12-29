package assignment;

public class PersonUse2 {
    String name;
    int age;
    String email;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println("-------------------------------------------");
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("이메일 : " + getEmail());
        System.out.println("주소 : " + getAddress());
        System.out.println("-------------------------------------------");

    }
}
