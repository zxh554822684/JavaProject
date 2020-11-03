package LeetCode.Test;

import LeetCode.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 9, 3, 7, 16, 4, 2, 0};
        _21 v = new _21();
        int[] exchange = v.exchange(arr);
        for(int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();


        for (int i = 0; i < 10; i++) {
            System.out.println(i + "aaa");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("bbb");
        }
    }
}
