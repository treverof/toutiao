package meituan;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            int sum = 0;
            int result = 0;
            loop:
            for(int length=a.length;length>=1;length--){
                sum = 0;
                for(int i=0;i+length<=a.length;i++){
                    if(i==0)
                        sum = thisSum(a,i,length);
                    else
                        sum = sum - a[i-1]+a[i+length-1];
                    if(sum%k==0){
                        result = length;
                        break loop;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static int thisSum(int[] a,int i,int length){
        int sum = 0;
        for(int j=0;j<i+length;j++){
            sum+=a[j];
        }
        return sum;
    }
}
