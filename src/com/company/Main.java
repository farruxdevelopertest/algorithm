package com.company;

import java.util.Scanner;

class Main {
    // private static Integer binarySearch(int[] list, int item){
    //
    // int low = 0;
    // int high = list.length -1;
    //
    // while (low<= high){
    // int mid = (low+high)/2;
    // int guess = list[mid];
    //
    // if(guess == item) {
    // return mid;
    // }
    //
    // if(guess>item){
    // high = mid-1;
    // }else {
    // low = mid+1;
    // }
    // }
    //
    // return null;
    // }
    //
    // private static Integer linearSearch(int[] list, int item){
    // int i;
    // for(i = 0; i<list.length; i++)
    // if(list[i] == item)
    // return i;
    //
    // return null;
    // }

    public static void main(String[] arg) {

        var scanner = new Scanner(System.in);

        // int[] list = {1,4,6,9, 55, 79, 100};
        //
        // System.out.println("Binary: "+ binarySearch(list, 9));
        // System.out.println("Linear: "+linearSearch(list, 9));

        // double a,b,c ,d,x1, x2;

        // while (true){

        // System.out.print("a ni kiriting (a 0 ga teng emas): ");
        // a = scanner.nextDouble();

        // System.out.print("b ni kiriting: ");
        // b = scanner.nextDouble();
        // System.out.print("c ni kiriting: ");
        // c = scanner.nextDouble();

        // d = Math.pow(b,2)-4*a*c;

        // if(a != 0 && d>0)
        // break;

        // if(a == 0)
        // System.out.println("a 0 ga teng bolishi mumkin emas");
        // else
        // System.out.println("deskriminant 0 dan katta chiqmadi: " + d);
        // }

        // x1 = (-b+Math.sqrt(d))/(2*a);
        // x2 = (-b-Math.sqrt(d))/(2*a);

        // System.out.println("Yechim: " + "x1: "+x1+" x2: " + x2);

        // double a1,a2,b1,b2, c1,c2, d, x,y;

        // System.out.println("Qiymatlarni bering: a1,a2,b1,b2,c1,c2");

        // System.out.print("a1: ");
        // a1 = scanner.nextDouble();
        // System.out.print("a2: ");
        // a2 = scanner.nextDouble();
        // System.out.print("b1: ");
        // b1 = scanner.nextDouble();
        // System.out.print("b2: ");
        // b2 = scanner.nextDouble();
        // System.out.print("c1: ");
        // c1 = scanner.nextDouble();
        // System.out.print("c2: ");
        // c2 = scanner.nextDouble();

        // d = a1*b2-a2*b1;
        // x = (c1*b2-c2*b1)/d;
        // y = (c2*a1-c1*a2)/d;

        // System.out.println("x: "+x );
        // System.out.println("y: "+y );

        // double x,a,y,b,d,x1,y1;

        // System.out.print("shokalad (kg): ");
        // x = scanner.nextDouble();
        // System.out.print("narxi (so'm) : ");
        // a = scanner.nextDouble();
        // System.out.print("konfet (kg): ");
        // y = scanner.nextDouble();
        // System.out.print("b (so'm): ");
        // b = scanner.nextDouble();

        // x1 = a/x;
        // y1 = b/y;

        // d= x1 - y1;

        // System.out.println("1kg shokolad 1 kg knfetdan "+d+" so'm qimmat");

        // double v1,v2,s,t, ds1, ds2 , dst;

        // System.out.print("v1 (km/soat): ");
        // v1 = scanner.nextDouble();
        // System.out.print("v2 (km/soat): ");
        // v2 = scanner.nextDouble();
        // System.out.print("s (km): ");
        // s = scanner.nextDouble();
        // System.out.print("t (soat): ");
        // t = scanner.nextDouble();

        // ds1 = v1*t;
        // ds2 = v2*t;
        // dst = s-ds1-ds2;

        // System.out.println("t vaqtdan keyin oradagi masofa: " +dst);

        double N, M, S, dm, ds;

        System.out.print("sekund: ");
        N = scanner.nextDouble();

        M = N / 60;
        S = N / 60 / 60;

        dm = (N / 60) % 60;
        ds = (N % 60);

        System.out.println("minut: " + (int) M);
        System.out.println("soat: " + (int) S);
        System.out.println("sekund: " + (int) N);
        System.out.println("vaqt: " + (int) S + " : " + (int) dm + " : " + (int) ds);
    }
}