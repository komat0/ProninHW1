import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();

    }

    // Change 1 to 0 in array
    private static void exercise1() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("First array:");
        System.out.println(Arrays.toString(numbers));
        int uno = 1;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = numbers[i] == 0 ? uno : zero;
//            if (numbers[i] == 0) {
//                numbers[i] = uno;
//            } else {
//                numbers[i] = zero;
//            }
        }
        System.out.println("Changed array:");
        System.out.println(Arrays.toString(numbers));
    }

    // Add new array and fill it using loop. Ended array need to be: 0 3 6 9 12 15 18 21
    private static void exercise2() {
        int[] secondArray = new int[8];
        for (int i = 0; i < secondArray.length; i++) {
            int sec = i * 3;
            secondArray[i] = sec;
        }
        System.out.println("Second Array:");
        System.out.println(Arrays.toString(secondArray));
    }

    // Set an array [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], loop through it and multiply numbers less than 6 by 2.
    private static void exercise3() {
        System.out.println("Third Array:");
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(thirdArray));
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6) {
                int less = thirdArray[i] * 2;
                thirdArray[i] = less;
            }
        }
        System.out.println("Third Array after changes:");
        System.out.println(Arrays.toString(thirdArray));
    }

    // Create a square 2D integer array and use a loop(s) to fill its diagonal elements with ones.
    private static void exercise4() {
        System.out.println("Fourth Array:");
        int[][] foursArray = new int[10][10];
        int a = 1;
        int b = 0;

        for (int i = 0; i < foursArray.length; i++) {
            for (int j = 0; j < foursArray.length; j++) {
                if ((i + j) == (foursArray.length - 1) | i == j) {
                    foursArray[i][j] = a;
                } else {
                    foursArray[i][j] = b;
                }
                System.out.print(foursArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Find min and max number in array
    private static void exercise5() {
        int[] fifthArray = {1, 3, 10, 8, 15, 0, 2, 30, -4, -2, 55};
        System.out.println("Fifth Array: \n" + Arrays.toString(fifthArray));
        int maxi = 0;
        int mini = 0;
        for (int j : fifthArray) {
            if (j > maxi) {
                maxi = j;
            } else if (j < mini) {
                mini = j;
            }
        }
        System.out.println(maxi + " - The biggest number");
        System.out.println(mini + " - The smallest number");
    }

}
