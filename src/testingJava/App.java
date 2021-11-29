package testingJava;

import java.util.Random;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Random rnd = new Random();
        double d2 = rnd.nextInt(6);
        int number = (int)d2 + 1;

        // String[] array = { "Tic", "Tac", "Toe" };
        // int l = array.length;
        // System.out.println(l);

        // for (int i = 0; i < 10; i++) {
        // System.out.println(getRandomDiceNumber2());
        // }

        // printNumbers();
        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);

        TwoSums tw = new TwoSums();
        int[] array = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 2 };
        tw.twoSum(array, 1);
        // ghbdtnnn

    }

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 6);
    }

    public static int getRandomDiceNumber2() {
        Random r = new Random();
        return r.nextInt(8);
    }

    public static void printNumbers() throws InterruptedException {
        // напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1, 300_000);

        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }



}
