package com.coding.lesson2;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class MissingElementTest {

    MissingElement missingElement = new MissingElement();

    @Test
    public void solutionTest11() {
        int A[] = new int[]{3,5,1,2};
        assertEquals(4, missingElement.solution(A));
    }

    @Test
    public void solutionTest21() {
        int A[] = new int[]{3,4,5,1,2};
        assertEquals(6, missingElement.solution(A));
    }

    @Test
    public void solutionTest221() {
        int A[] = new int[]{3,4,5,2,6};
        assertEquals(1, missingElement.solution(A));
    }

    @Test
    public void solutionTest31() {
        int A[] = new int[100000];
        for(int i = 0; i< 99999;i++){ //99998
            A[i] = i+1;//99999
        }
       // +  100000, 100001

        // * numberOfIntegers is an integer within the range [0..100,000]; // 100001
        // * the elements of A are all distinct;
        //* each element of array A is an integer within the range [1..(N + 1)]. [1...100001]
        System.out.println("bubu");
        System.out.println(("number of integers in the array    " + A.length));
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[99997]);
        System.out.println(A[99998]);
        System.out.println(A[99999]);
        System.out.println("rubu");

        assertEquals(100000, missingElement.solution(A));
    }

    @Test
    public void solutionTest1() {
        int A[] = new int[]{3,5,1,2};
        assertEquals(4, missingElement.solution(A));
    }

    @Test
    public void solutionTest2() {
        int A[] = new int[]{1,3,4};
        assertEquals(2, missingElement.solution(A));

    }

    @Test
    public void solutionTest3() {
        int A[] = new int[]{1,3,4,7,5,2};
        assertEquals(6, missingElement.solution(A));

    }

    @Test
    public void solutionTest4() {
        int A[] = new int[]{0,2};
        assertEquals(1, missingElement.solution(A));

    }

    @Test
    public void solutionTest5() {
        int A[] = new int[]{0,2};
        assertEquals(1, missingElement.solution(A));

    }

    @Test
    public void solutionTest6() {
        int A[] = new int[]{1,5,4,3,2,8,7};
        assertEquals(6, missingElement.solution(A));

    }

    @Test
    public void solutionTest7() {
        int A[] = new int[]{1,5,4,3,2,8,7,11,6,9};
        assertEquals(10, missingElement.solution(A));

    }


    @Test
    public void solutionTest12() {
        int A[] = new int[]{3,5,1,2};
        assertEquals(4, missingElement.solution(A));
    }

    @Test
    public void solutionTest22() {
        int A[] = new int[]{1,2,3,4,6};
        assertEquals(5, missingElement.solution(A));
    }

    @Test
    public void solutionTest32() {
        int A[] = new int[]{1,2,3,4};
        assertEquals(5, missingElement.solution(A));
    }

    @Test
    public void solutionTest42() {
        int A[] = new int[]{2,3,4};
        assertEquals(1, missingElement.solution(A));
    }

    @Test
    public void solutionTest52() {
        int[] A = IntStream.rangeClosed(1, 99999)
                .boxed().mapToInt(Integer::intValue).toArray();
        assertEquals(100000, missingElement.solution(A));
    }

    @Test
    public void solutionTest13() {
        int A[] = new int[]{3,5,1,2};
        assertEquals(4, missingElement.solution(A));
    }

    @Test
    public void solutionTest23() {
        int A[] = new int[]{3,5,1,2,4,7,9, 8,10};
        assertEquals(6, missingElement.solution(A));
    }

    @Test
    public void solutionTest33() {
        int A[] = new int[]{3,5,1,2,4,10,12,6,9,8,7,11};
        assertEquals(13, missingElement.solution(A));
    }

    @Test
    public void solutionTest43() {
        int A[] = new int[]{};
        assertEquals(1, missingElement.solution(A));
    }

    @Test
    public void solutionTest53() {
        int A[] = new int[99999];
        for (int i = 0; i < 99999; i ++)
            A[i] = i + 2;
        assertEquals(1, missingElement.solution(A));
    }

    @Test
    public void solutionTest63() {
        int A[] = new int[99999];
        for (int i = 99998; i >= 1; i --)
            A[i] = i + 2;
        System.out.println("cucu");
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[99997]);
        System.out.println(A[99998]);
        System.out.println("mimi");
        assertEquals(1, missingElement.solution(A));
    }

    @Test
    public void solutionTest73() {
        int A[] = new int[99999];
        for (int i = 99997; i >= 1; i --)
            A[i] = i + 3;
        A[99998] = 2;
        assertEquals(1, missingElement.solution(A));
    }


}