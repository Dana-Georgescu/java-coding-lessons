package com.coding.lesson1;


import java.util.*;


/**
 *  @An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 *
 * For example, consider array A such that
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 *
 * Write a function
 *
 public int solution(int[] A);
 *
 * that, given an array A consisting of N integers, returns index of the FIRST element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 *
 * For example, given array A such that
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * the function should return 0
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].     }
 */

public class Dominator {

    public static int solution(int[] array) {

        Map<Integer, Integer> numberCounterMap = new HashMap<>();
        Map<Integer, Integer> indexPositionMap = new HashMap<>();

        if(array.length == 1 || array[0] == array[1]) {
            return array[0];
        }

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (!numberCounterMap.containsKey(currentNumber)) {
                numberCounterMap.put(currentNumber, 1);
                indexPositionMap.put(currentNumber, i);
            }
            else {
                numberCounterMap.put(currentNumber, numberCounterMap.get(currentNumber) + 1);
                if(numberCounterMap.get(currentNumber) > array.length / 2){
                    return indexPositionMap.get(currentNumber);
                }
            }
        }
        return -1;

        //WRONG ANSWER, got -1, but dominator exists, for example on position 0
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,1,1,2,2,2,8,8,8,8,8,8,8,8,9};
        System.out.println(solution(arr));
    }

}
