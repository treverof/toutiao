package codeing.test;

import java.util.Arrays;
import java.util.Scanner;

public class Dragon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] dn = new int[n];
            int[] wa = new int[m];
            for(int i=0;i<n;i++){
                dn[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                wa[i] = sc.nextInt();
            }
            Arrays.sort(dn);
            Arrays.sort(wa);
            int total = 0;
            boolean flag = false;
            int index = 0;
            for(int i=0;i<dn.length;i++){
                flag = false;
                for(int j=index;j<m;j++){
                    if(wa[j]>=dn[i]){
                        total += wa[j];
                        flag = true;
                        index = j;
                        break;
                    }
                }
                if(flag==false)
                    break;
            }
            if(flag==false){
                System.out.println(-1);
                continue;
            }
            System.out.println(total);
        }
    }
}
