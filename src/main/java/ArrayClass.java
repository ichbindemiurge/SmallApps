import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayClass {

    /*
        Application that accepts an integer array and
        - prints it out in reverse
        - prints every item that is contained in the array more than once and the number of it's occurences
        - also accepts a size and splits the array into sub-arrays of that size
     */
    public static void reverseArray(int[] arr){
        System.out.println("This is normal array:" );
        for(int i = 0; i <= arr.length - 1; ++i){
            System.out.println(arr[i]);
        }

        System.out.println("This is reversed array:" );
        for(int j=arr.length-1; j >=0; --j) {
            System.out.println(arr[j]);
        }
    }

    public static void repeatedElements(int[] arr){
      //  - prints every item that is contained in the array more than once and the number of it's occurences
        int count = 0;
        System.out.println("----------------------------");
        for(int i=0; i <= arr.length-1; i++){
            for(int j = i+1; j <= arr.length-1; j++){
                if(j!=i && arr[i] == arr[j]){
                    count++;
                    System.out.println("ELEMENT: " + arr[j] + " REPEATED: " + count);
                } else {
                    count=0;
                }
            }
        }
    }

    public static void splitArray(int size, int[] arr){
        //- also accepts a size and splits the array into sub-arrays of that size

        System.out.println("Sub Array 1");
        for (int i=0; i < size; i++){
            System.out.println(arr[i]);
        }
        System.out.println("############################");
        System.out.println("Sub Array 2");
        for (int j = size; j <= arr.length-1; j++){
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,6,7,8,8};
        reverseArray(nums);
        repeatedElements(nums);
        splitArray(3, nums);
    }



}
