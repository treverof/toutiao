package zhaohang;

import java.util.Scanner;

public class Common {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int common = a*b/gcd(a,b);
            System.out.println(common);
            if(n<common){
                System.out.println(0);
                continue;
            }
            System.out.println(n/common);
        }
    }

    public static int gcd(int a,int b){
        int temp = 0;
        while(b!=0){
            temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }

}
