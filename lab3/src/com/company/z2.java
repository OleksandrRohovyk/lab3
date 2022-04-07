package com.company;
import java.util.Scanner;
public class z2 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int a = n%10;
        int b = (n%100-a) / 10;
        n = (n-a-b*10) / 100;
        int f = Math.max(n,a);
        System.out.println(Math.max(f,b));
    }
}

