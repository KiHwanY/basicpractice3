package ch13;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
    public static void main(String[] args) {
        Integer arr[] = {3,29,46,15,89,-20};
        System.out.println("배열 데이터 : ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("오름차순 정렬 : ");
        Arrays.sort(arr);// 오름차순 정렬을 자동으로 해준다 (sort())
        for (int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        //내림차순 정렬
        System.out.println("내림차순 정렬 : ");
        Arrays.sort(arr, Collections.reverseOrder());
        // 내림차순 정렬을 하려면 Collections.reverseOrder() 사용해야 한다.
        for (int i: arr){
            System.out.print(i+"\t");
        }
    }

}
