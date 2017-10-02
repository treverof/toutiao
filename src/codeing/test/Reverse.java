package codeing.test;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            int reverseX = Integer.valueOf(sb.append(x).reverse().toString());
            sb = new StringBuffer();
            int reverseY = Integer.valueOf(sb.append(y).reverse().toString());
            sb = new StringBuffer();
            System.out.println(sb.append((reverseX+reverseY)).reverse());
        }
    }
}
