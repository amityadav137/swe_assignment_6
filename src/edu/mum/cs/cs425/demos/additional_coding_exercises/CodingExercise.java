package edu.mum.cs.cs425.demos.additional_coding_exercises;

public class CodingExercise {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 8, 20, 21, 70};
        printHelloWorld(array1);
        System.out.println();
        int secondBiggest = findSecondBiggest(array1);
        for(Integer i : array1)
            System.out.println(i +" ");
        System.out.println("The Second Largest Number is " +secondBiggest);
    }

    public static void printHelloWorld(int[] numbers) {
        for (int number : numbers) {
            if (number % 35 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static int findSecondBiggest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        return secondMax;
    }

}
