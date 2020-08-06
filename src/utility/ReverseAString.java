package utility;

import java.util.ArrayList;

public class ReverseAString {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);  // autoBoxing  ==> 0
        list.add(20);  // 1
        //  list.add(3, 30);  // cannot skip indexes
        list.add(2, 30);  //2

        list.add(40); // 3
        list.add(50); // 4

        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {


            System.out.print(list.get(i) + " ");


        }

    }


}
