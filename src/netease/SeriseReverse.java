package netease;

import java.util.Scanner;

public class SeriseReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            for(int i=0;i<n;i++){
                str[i] = sc.next();
            }
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<n;i++){
                if(i>0)
                    sb.append(" ");
                sb.append(str[i]).reverse();
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
