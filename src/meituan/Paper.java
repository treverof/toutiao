package meituan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Paper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            int result = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(a[a.length-1]);
            int x = a[a.length - 1];
            boolean flag = true;
           for(int i=a.length-2;i>=0;i--){
               int m = queue.poll();
               m = m - a[i];
               if(m<0){
                   flag = false;
                   break;
               }
               m = m + a[i];
               queue.offer(m);
               if(i==0&&x>0){
                   flag = false;
                   break;
               }
               x = x - a[i];
           }
           if(flag==false){
               System.out.println("No");
           }else{
               System.out.println("Yes");
           }
        }
    }
}
