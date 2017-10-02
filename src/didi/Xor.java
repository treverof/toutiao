package didi;

import java.util.Scanner;

public class Xor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]==0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
