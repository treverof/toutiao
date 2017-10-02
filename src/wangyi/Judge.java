package wangyi;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int m = sc.nextInt();
                int[] a = new int[m];
                int count = 0;
                for(int j=0;j<m;j++){
                    a[j] = sc.nextInt();
                    if(a[j]%2!=0){
                        count--;
                    }else if(a[j]%4==0){
                        count++;
                    }
                    if(count>=m-j-1){
                        break;
                    }
                }
                if(count>=0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
