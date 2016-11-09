package com.company;

import java.util.Random;

/**
 * Created by Dom on 08/11/2016.
 */


public class PrefixAverages {
    private static int[] generateArray(int n) {
        int[] rArray;
        rArray = new int[n];
        Random r = new Random();
        for (int i = 0;i<=n;i++) {
            rArray[i] = r.nextInt();
        }
        return rArray;
    }

    private static double StartTimer; {

    }


    public static double[] prefixAverages2(){
        double[] A;
        int[] X;
        A = new double[10];
        int s = 0;
        X = generateArray(10);
        for (int i = 0;i < 9;i++) {
            s = s + X[i];
            A[i] = s / (i+1);
        }
        return A;
    }

    public static double[] prefixAverages1(){
        double[] A;
        int[] X;
        A = new double[10];
        int s;
        int j;
        X = generateArray(10);
        for (int i = 0;i < 9;i++) {
            s = X[0];
            for (j = 1; j < 9; j++) ;
            {
                if (j <= i) {
                    s = s + X[j];
                }
            }
            A[i] = s /(i+1);
        }
    return A;
    }


}
