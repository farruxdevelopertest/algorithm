package com.company;

import java.util.Scanner;

class  Main {
//    private static Integer binarySearch(int[] list, int item){
//
//        int low  = 0;
//        int high = list.length -1;
//
//        while (low<= high){
//            int mid = (low+high)/2;
//            int guess = list[mid];
//
//            if(guess == item) {
//                return  mid;
//            }
//
//            if(guess>item){
//                high = mid-1;
//            }else  {
//                low = mid+1;
//            }
//        }
//
//        return null;
//    }
//
//    private  static  Integer linearSearch(int[] list, int item){
//        int i;
//        for(i = 0; i<list.length; i++)
//            if(list[i] == item)
//                return  i;
//
//        return  null;
//    }

    public static void  main(String[] arg){

        var scanner = new Scanner(System.in);

//        int[] list = {1,4,6,9, 55, 79, 100};
//
//        System.out.println("Binary: "+ binarySearch(list, 9));
//        System.out.println("Linear: "+linearSearch(list, 9));

        double a,b,c ,d,x1, x2;

        while (true){

            System.out.print("a ni kiriting (a 0 ga teng emas): ");
            a = scanner.nextDouble();

            System.out.print("b ni kiriting: ");
            b = scanner.nextDouble();
            System.out.print("c ni kiriting: ");
            c = scanner.nextDouble();

            d = Math.pow(b,2)-4*a*c;

            if(a != 0 && d>0)
                break;

            if(a == 0)
              System.out.println("a 0 ga teng bolishi mumkin emas");
            else
                System.out.println("deskriminant 0 dan katta chiqmadi: " + d);
        }

        x1 = (-b+Math.sqrt(d))/(2*a);
        x2 = (-b-Math.sqrt(d))/(2*a);

       System.out.println("Yechim: " + "x1: "+x1+" x2: " + x2);


        // double a1,a2,b1,b2,c1,c2, x,y;

    }
}