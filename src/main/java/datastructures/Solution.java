package datastructures;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long xor(long num) {
        long i = num % 4 == 0 ? num : num - (num%4);
        long x = 0;
        for (long j = i; j <= num ; j++) {
            x = x^j;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            long L = in.nextLong();
            long R = in.nextLong();
            if(L == R) {
                System.out.println(xor(L));
                break;
            }

            long x;
            if((L - R + 1) % 2 == 0) {
                x = 0;
                for(long i = L+1; i <= R; i = i+2) {
                    x = x^i;
                }
            } else {
                x = xor(L);
                for(long i = L+2; i <= R; i = i+2) {
                    x = x^i;
                }
            }
            System.out.println(x);
        }
    }
}