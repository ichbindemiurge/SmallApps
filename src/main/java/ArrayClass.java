import java.util.*;

public class ArrayClass {

    /*
        Application that accepts an integer array and
        - prints it out in reverse
        - prints every item that is contained in the array more than once and the number of it's occurences
        - also accepts a size and splits the array into sub-arrays of that size
     */

    public static void reverseArray(int[] arr){
        System.out.println("This is reversed array:" + "\n" );
        for(int i = 0; i < arr.length/2 ; ++i){
            int tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("###################");
    }

    public static void repeatedElements(int[] arr){
        //  - prints every item that is contained in the array more than once and the number of it's occurences

        Map<Integer, Integer> reps = new HashMap<>();

        System.out.println("----------------------------");
        for(int i=0; i <= arr.length-1; i++){
            if(reps.containsKey(arr[i])){
                int count = reps.get(arr[i]);
                reps.put(arr[i], ++count);
            } else {
                reps.put(arr[i], 1);
            }
        }
        System.out.println(reps);
        System.out.println("----------------------------");
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
        int[] nums = {1,4,2,6,4,8,4};
        reverseArray(nums);
        repeatedElements(nums);
        //splitArray(3, nums);
    }
}
