package test;

import sort.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        Random rand = new Random(1);

        int[] numbers = new int[200];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(500);
        }

        BubbleSort sort = new BubbleSort();
        System.out.println(Arrays.toString(sort.sort(numbers)));

//        BucketSort sort1 = new BucketSort();
//        System.out.println(Arrays.toString(sort1.sort(numbers)));
    }
}
