package zhaohang;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            double result = 0;
            boolean flag = false;
            boolean isTurn = false;
            double other = 0;
            for(int i=0;i<n;i++){
                if(!isTurn) {
                    if (i == n - 1) {
                        result += a[i];
                    } else if (i == n - 2 || i == n - 3) {
                        result += a[i] + a[i + 1];
                    } else {
                        if (a[i + 1] + a[i + 2] >= a[i + 2] + a[i + 3]) {
                            result += a[i] + a[i + 1];
                        } else {
                            result += a[i];
                        }
                    }
                    if (result > sum * 1.0 / 2) {
                        flag = true;
                        break;
                    }
                }else{
                    if (i == n - 1) {
                        other += a[i];
                    } else if (i == n - 2 || i == n - 3) {
                        other += a[i] + a[i + 1];
                    } else {
                        if (a[i + 1] + a[i + 2] >= a[i + 2] + a[i + 3]) {
                            other += a[i] + a[i + 1];
                        } else {
                            other += a[i];
                        }
                    }
                    if (other > sum * 1.0 / 2) {
                        flag = false;
                        break;
                    }
                }
                flag = false ^ flag;
            }
            if(!flag){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }
    }
}
