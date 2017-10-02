package codeing.test;

import java.util.Scanner;

public class MaxLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int result = maxCommonLength(s1,s2);
        }
    }

    public static int maxCommonLength(String s1,String s2){
        int[][] array = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<0;i++);
        return array[s1.length()][s2.length()];
    }
}
