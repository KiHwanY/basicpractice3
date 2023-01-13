package interface_assignment;

public class StrBuildEx {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("I am a ");
        String str2 = "Java programmer";
        System.out.println("--------------------------------------");
        System.out.println("append()  : "+ str1.append(str2));
        System.out.println("replace() : "+ str1.replace(7,11,"JSP"));
        System.out.println("subString() : "+str1.substring(6));
        System.out.println("--------------------------------------");

    }
}
