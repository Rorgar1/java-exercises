package exercises;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
       int[] testNumb = {1, 1, 2, 3, 5, 8};

       System.out.println("loop over an array using  a loop");
       for (int i=0; i < testNumb.length; i++) {
           System.out.println("current item is: " + testNumb[i]);
       }

    }
}
