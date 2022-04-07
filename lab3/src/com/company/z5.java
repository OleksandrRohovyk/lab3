package com.company;
import java.util.Scanner;
public class z5 {
    public static void main(String[] args) {

        System.out.print("введіть 3 числа:");
        Scanner z = new Scanner(System.in);
        int q = z.nextInt();
        Scanner x = new Scanner(System.in);
        int w = x.nextInt();
        Scanner c = new Scanner(System.in);
        int e = c.nextInt();
        if((q>w)&(q>e)&(w>e)){
            System.out.println(q);
            System.out.println(w);
            System.out.println(e);
        }else if((q>w)&(q>e)&(e>w)){
            System.out.println(q);
            System.out.println(e);
            System.out.println(w);
        }else if((w>q)&(w>e)&(q>e)){
            System.out.println(w);
            System.out.println(q);
            System.out.println(e);
        }else if((w>q)&(w>e)&(e>q)){
            System.out.println(w);
            System.out.println(e);
            System.out.println(q);
        }else if((e>q)&(e>w)&(q>w)){
            System.out.println(e);
            System.out.println(q);
            System.out.println(w);
        }else if((e>q)&(e>w)&(w>q)) {
            System.out.println(e);
            System.out.println(w);
            System.out.println(q);
        }else{
            System.out.println("щось не то:)");
        }
    }
}