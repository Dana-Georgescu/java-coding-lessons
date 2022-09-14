package com.coding.lesson2;


import java.util.Arrays;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 public int solution(int[] A);
 *
 * that, given an array A, returns the value of the MISSING element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 * * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing.
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */
public class MissingElement {

    public int solution(int[] array) {
        int numberOfIntegers = array.length;
        int sumArray = 0;
        int min = 1;
        int max = 1;
        int result;


        for(int i = 0; i < numberOfIntegers; i++){

            int number = array[i];

            if(number==0) {
                numberOfIntegers--;
                continue;
            }

            sumArray += number;

            if(number > max){
                max = number;
            }
            if(number < min)
               min = number;

        }

        if(min == 1 && max == numberOfIntegers ) { result = numberOfIntegers + 1;}

        else {
            int pairs = min + max;
            int sizeOfArrayWithMissing = numberOfIntegers + 1;
            int sumIncludingMissing = (pairs * sizeOfArrayWithMissing / 2) + (pairs * sizeOfArrayWithMissing % 2);
            System.out.println(sumArray);
            System.out.println(sumIncludingMissing);
            result = sumIncludingMissing - sumArray;
        }


        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        int[] correct = new int[] {3,5,1,2,4,7,9,10,6};
        int[] testArray1 = new int[] {3,5,1,2,4,7,9,10};

        int sum=0;
        int sumcorrect=0;

        for(int element: testArray1){
            sum+= element;
        }
        System.out.println(sum);

        for(int element: testArray1){
            sumcorrect+= element;
        }
        System.out.println(sumcorrect);

//        solution(testArray1);
    }


}
