package com.pig20190610.home;



public class excise {

    public static void main(String[] args) {
        test1();
        //BubbleSort();

       /* int[] array = new int[]{12,14,5,45,4};

        int[] newArray = new int[array.length];

        int[] newArray1 =

        newArray = BubbleSort(array);*/

      // test2();
    }

    private static void test2() {

        for (int i=0; i<5; i++){
            System.out.println("*");
        }
    }

    private static int[] BubbleSort(int[] array) {
        for(int i=0; i<array.length; i++){

        }
        return array;
    }


    public static void test1(){
        for(int i=5; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
