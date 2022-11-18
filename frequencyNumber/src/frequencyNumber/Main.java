package frequencyNumber;


import java.util.Arrays;

public class Main {
    static boolean ignore(int[] arr, int value, int c) {
        for (int i = 0; i < c; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
        return true;
    }

    static int equalCount(int[] arr, int value) {//we find out how many of the same number there are
        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] list = {10,30,40,50, 20, 2010, 40, -30, 22, 5, 20, -2, 10};
        System.out.println("Array is  : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            if (ignore(list, list[i], i)) {
                System.out.println("The number "+list[i]+" in the series has been repeated "+ equalCount(list, list[i]));
            }
        }
    }
}