package source.main.source.main.java.com.ArraysMinMax;

import java.util.Arrays;
/*
OTHER LIBRARIES I COULD HAVE USED: <java.applet> <java.lang> <java.io> <java.net> I chose to use <java.util>
 */

public class FindMinMax {

    static int max;
    static int min;

//  I could have combined max & min, but I'm working them separately for the practice.
        public static void max(int my_array[]) {
            max = my_array[0];
            int len = my_array.length;

            for (int i = 1; i < len - 1; i = i + 2) {
                if (i + 1 > len) {
                    if (my_array[i] > max) max = my_array[i];
                }
                if (my_array[i] > my_array[i +1]) {
                    if (my_array[i] > max) max = my_array[i];
                }
                if (my_array[i] < my_array[i + 1]) {
                    if (my_array[i + 1] > max) max = my_array[i + 1];
                }
            }
        }

        public static void min(int my_array[]) {
            min = my_array[0];
            int len = my_array.length;

            for (int i = 1; i < len - 1; i = i + 2) {
                if (i + 1 > len) {
                    if (my_array[i] < min) min = my_array[i];
                }
                if (my_array[i] > my_array[i + 1]) {
                    if (my_array[i + 1] < min) min = my_array[i + 1];
                }
                if (my_array[i] < my_array[i + 1]) {
                    if (my_array[i] < min) min = my_array[i +1];
                }
            }
        }

//        public static void main(String[] args) {
              // Declaring my array
//            int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//
//            max(my_array);
//            min(my_array);
//
//            System.out.println(" Original Array: "+ Arrays.toString(my_array));
//            System.out.println(" Maximum value for the above array = " + max); // 77
//            System.out.println(" Minimum value for the above array = " + min); // 14
//        }


        public static void main(String[] args){
            // Declaring my array
            int[] my_array= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

            max(my_array);
            min(my_array);

            System.out.println("Array : "+Arrays.toString(my_array));
            Arrays.sort(my_array);
            System.out.println("Min: "+my_array[0]+"\nMax: "+my_array[my_array.length-1]);
    }
}
