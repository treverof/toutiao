package exercise;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]<0){
                    a[i] = Math.abs(a[i]);
                }
            }
            Arrays.sort(a);
            BigDecimal x = new BigDecimal(String.valueOf(a[a.length-1]));
            BigDecimal y = new BigDecimal(String.valueOf(a[a.length-2]));
            BigDecimal z = new BigDecimal(String.valueOf(a[a.length-3]));
            System.out.println(x.multiply(y).multiply(z));
        }
    }
}
