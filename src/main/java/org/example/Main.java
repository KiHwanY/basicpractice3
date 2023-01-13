package org.example;


import ch10.T;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String str = "Hello 1234";

        for(int i= 0; i< str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))){
                System.out.println(str.charAt(i)+ "는 대문자 입니다.");
            } else if (Character.isLowerCase(str.charAt(i))) {
                System.out.println(str.charAt(i)+ "는 소문자 입니다.");

            } else if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i)+"는 숫자입니다.");

            }else {
                System.out.println("입력된 값이 없습니다.");
            }
        }
        System.out.println("문자" + str.substring(6));
        String i ="1234";
        int si = Integer.parseInt(str.substring(6));
        System.out.println(i.equals(str.substring(6)));
        System.out.println("숫자 "+Integer.parseInt(str.substring(6)));
        System.out.println("숫자 "+si +"+ 2 = "+ (si+2));



    }
}