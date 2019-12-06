package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);

        System.out.println("The sum of the array is " + sum(array));
        System.out.println("The min of the array is " + min(array));
        System.out.println("The max of the array is " + max(array));

//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    //    public static void Pattern1(){
//        for(int rows = 0; rows < 6; rows++){
//
//            for(int columns = 0; columns < 6; columns++){
//                System.out.print("*");
//            }
//
//                System.out.println();
//        }
//    }
//    public static void Pattern2(){
//        for(int rows = 1; rows < 7; rows++){
//
//            for(int columns = 1; columns < 7; columns++){
//
//                System.out.print(rows);
//            }
//            System.out.println(rows);
//        }
//    }
//    public static void Pattern3(){
//        for(int rows = 0; rows < 6; rows++){
//
//            for(int columns = 1; columns < 7; columns++){
//
//                System.out.print(columns);
//            }
//            System.out.println();
//        }
//    }
//    public static void Pattern4(){
//        for(int times =1; times <7; times++){
//
//            for(int columns = 1; columns <=times; columns++){
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void Pattern5(){
//        for(int times =1; times <7; times++){
//
//            for(int columns = 1; columns <=times; columns++){
//
//                System.out.print(columns);
//            }
//            System.out.println();
//        }
//    }
    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (min < array[1]) {
                array[1] = min;
            }
            min = array[1];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max > array[1]) {
                array[1] = max;
            }
            max = array[1];
        }
        return max;
    }

}
