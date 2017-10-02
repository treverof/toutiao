package codeing.test;

import java.util.Scanner;
import java.util.LinkedList;

public class Main{
    private static LinkedList<Integer> list = new LinkedList<Integer>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        list.add(0);
        list.add(1);
        while(sc.hasNext()){
            int n = sc.nextInt();
            while(list.get(list.size()-1)<n){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            int index = 0;
            for(int i=list.size()-1;i>=0;i--){
                if(list.get(i)<n){
                    index = i;
                    break;
                }
            }
            int result = Math.min(list.get(index+1)-n,n-list.get(index));
            System.out.println(result);
        }
    }
}
