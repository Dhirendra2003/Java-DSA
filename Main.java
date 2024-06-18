package javaFiles;


import java.util.Scanner;

public class Main {
    public static int fact(int n){

        if(n==0 || n==1) {
        return 1;
        }
        else {
            return n*(fact(n-1));
        }
        }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

//int m=5;
//int n=8;
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j< n; j++) {
//                if (i==0 || i==m-1){
//                    System.out.print("* ");
//                }
//                else {
//                    if (j==0 || j==n-1){
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//                }
//        }
//            System.out.print("\n");
//        }
//        First f1=new First();
//        f1.printfourpatt(8);
//int m=fact(0);
//        System.out.println(m);
int[][] arr=new int[2][3];
        Scanner sc=new Scanner(System.in);
for (int i=0;i<2;i++){
    System.out.println("enter value for row"+i);
    for (int j=0;j<3;j++){
        arr[i][j]=sc.nextInt();

    }
}

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.println(arr[i][j]);

            }
        }
    }}