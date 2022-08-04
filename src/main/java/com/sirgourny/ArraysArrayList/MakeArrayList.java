package src.main.java.com.sirgourny.ArraysArrayList;

import java.util.*;

/*
ArrayList   [implements -->>    List    [extends -->>   Collection
 (Class)                     (Interface)
 */
class MakeArrayList {
    public static void main(String[] args) {

        int n = 5;                                  //Assign variable for [Size Of ArrayList]

        ArrayList<Integer> arlit
                = new ArrayList<Integer>(n);        //Declare the ArrayList with the initial [size n]

        for (int i = 1; i <= n; i++)                //Creating ArrayList to print
            arlit.add(i);
                System.out.println(arlit);          //This line will print the elements of the ArrayList

        arlit.add(6);
        System.out.println(arlit);                  //Adding new index at the end of the list with <<arlit.add(6);>>

        arlit.remove(0);                            //This line will remove the element at index 3 with <<arlit.remove(3)>>
            System.out.println(arlit);              //This line will print the ArrayList after removing index 3

        for (int i = 0; i < arlit.size(); i++)      //This statement will allow us to print the elements one by one
        System.out.println(arlit.get(i) + " ");
    }
}
