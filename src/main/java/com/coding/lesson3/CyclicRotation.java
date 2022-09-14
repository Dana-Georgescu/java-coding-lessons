package com.coding.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CyclicRotation {

    public static int[] solution(int[] array, int K) {
        if(array.length == 0 || K % array.length == 0){
            return array;
        }
        int shift = array.length > K
                ? K
                : K % array.length;

        int [] shiftedArray = new int[array.length];
        // move last slice to beginning
        for(int i = array.length - shift, j = 0; i < array.length; i++, j++){
           shiftedArray[j] = array[i];
        }
        //move first slice to end
        for( int i = 0, j = shift; i < array.length - shift; i++, j++ ){
            shiftedArray[j] = array[i];
        }
        return shiftedArray;
    }


    public static void main(String[] args) {
//        int [] array = new int[]{1,2,3,4,5,6};
//        System.out.println(array);
//        System.out.println(solution(array, 1));
        //WRONG ANSWER (got [3, 8, 9, 7, 3] expected [9, 7, 6, 3, 8])

        List<String> revocableMandateIds = List.of("bubu", "bibi", "bobo");


        if(revocableMandateIds.size() == 3){
            StringBuffer stringBuffer = new StringBuffer("");
            revocableMandateIds.stream().forEach(mandateId -> stringBuffer.append(mandateId +"*"));
            System.out.println(stringBuffer.toString());

        }
    }

}
