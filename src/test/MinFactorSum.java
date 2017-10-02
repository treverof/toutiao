package test;

import java.util.Scanner;

public class MinFactorSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int sum = 0;
            if(n == 1){
                System.out.println(1);
            }else{
                int m = n;
                for(int i=2;i<=Math.sqrt(m);i++){
                    if(n%i==0&&isPrime(i)){
                        while(n%i==0) {
                            sum += i;
                            n = n/i;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }

    public static boolean isPrime(int x){
        boolean flag = true;
        if(x<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
