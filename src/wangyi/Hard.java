package wangyi;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]>max){
                    max = a[i];
                }
                if(a[i]<min){
                    min = a[i];
                }
            }

            int x = 0;
            int y = 0;
            int result = 0;
            for(int i=0;i<a.length;i++){
                if(Math.abs(max-a[i])>=Math.abs(min-a[i])){
                    if(x != 0)
                        result += Math.abs(a[i]-x);
                    x = a[i];
                }else{
                    if(y != 0)
                        result += Math.abs(a[i]-y);
                    y= a[i];
                }
            }
            System.out.println(result);
        }
    }
}
