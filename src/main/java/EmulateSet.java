import java.util.ArrayList;


public class EmulateSet {

    public static ArrayList<Integer> set = new ArrayList<>();

    public static void emulateSet(){

    }

    public static void iterate(ArrayList<Integer> arr) {
        for (int i = 0; i <= arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void contains(ArrayList<Integer> arr) {
        for (int i = 0; i <= arr.size(); i++){
            for(int j = 0; j <= arr.size(); j++){
                if(j!=i && arr.get(i).equals(arr.get(j))) {
                    System.out.println("CONTAINS");
                } else {
                    System.out.println("DOES NOT EXIST");
                }
            }
        }
    }

    public static void add(int num) {
        for (int i = 0; i <= set.size(); i++) {
            int temp = set.size()+1;
            set.set(temp, num);
        }
    }

    public static void addAll(int [] nums) {
        for (int i = 0; i <= set.size(); i++) {
            for (int j = 0; j <= nums.length-1; j++) {
                set.set(i,nums[j]);
            }
        }
    }

    public static void main(String[] args) {

    }
}
