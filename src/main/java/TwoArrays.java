public class TwoArrays {
    /*
    Accepts 2 arrays and:
    - merge those arrays in a way that the items go one by one: 1st one from the 1st array,
    last one from the second, second item from the 1st array,
    the previous from the last from the second array and so on.

        1,2,3
        6,7,8,
        -> 1,9,2,8,3,7, ,6
     */

    public static void weirdPrint(int[] arr1, int[] arr2) {

        for (int i = 0; i <= arr1.length - 1; i++) {
            if(arr1.length >= arr2.length) {
                System.out.println(arr1[i]);
                if(arr2.length-i-1 >= 0) {
                    System.out.println(arr2[arr2.length-i-1]);
                }
            }

            if (arr2.length >= arr1.length && arr2.length-i-1 <= 1){
                int tmp = arr2.length - arr1.length;
                System.out.println(arr2[tmp-1]);
            }
        }
    }



    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {6,7,8,9};
        weirdPrint(nums1,nums2);
    }
}
