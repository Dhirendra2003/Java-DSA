package javaFiles;

public class First {
    public  void printstartPatt() {
        int n=1;
for(int i=5;i>=0;i--){
    for(int j=0;j<=i;j++){
        System.out.print("*");

    }

    System.out.println();
}

    }

    public void printinverted(int s){
        int n=1;
        for(int i=s;i>=0;i--){
            for(int j=0;j<=i;j++){

                System.out.print("  ");
            }
            for(int k=0;k<n;k++){
                System.out.print(" *");
            }
            n++;
            System.out.println();
        }

    }
    public void printnum(int s) {
        int n = 1;
        int numtp=1;
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numtp +" ");

                numtp++;
            }

            System.out.println();
        }
    }

    public void printnumrev(int s) {
        int n = 1;
        for (int i = s; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }

            System.out.println();
        }
    }

    public void printnumbinary(int s) {
        int n = 1;
        boolean numtp=true;
        for (int i = 1; i <= s; i++) {
            if(i%2==0){
                numtp=false;
            for (int j = 1; j <= i; j++) {
                if(numtp){
                System.out.print(1 +" ");}
                else System.out.print(0 +" ");

                numtp=!numtp;
            }
            }
            else {
                numtp=true;
                for (int j = 1; j <= i; j++) {
                    if(numtp){
                        System.out.print(1 +" ");}
                    else System.out.print(0 +" ");

                    numtp=!numtp;
                }}

            System.out.println();
        }
    }

    public void printfourpatt(int s){
        int n=s;
        int m=n;

        for(int i=s+1;i>=0;i--){

            for(int k=s-n;k>=0;k--){
                System.out.print(" *");
            }
            for(int j=0;j<=n;j++){

                System.out.print("    ");
            }
            for(int k=s-n;k>=0;k--){
                System.out.print(" *");
            }
n--;
            System.out.println();
        }
        for(int i=s;i>=0;i--){

            for(int k=0;k<=m;k++){
                System.out.print(" *");
            }
            for(int j=0;j<=s-i;j++){

                System.out.print("    ");
            }
            for(int k=0;k<=m;k++){
                System.out.print(" *");
            }
            m--;
            System.out.println();
        }

    }

}

