package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] array = new int[8];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        String s  = "a";

        for(Integer i:map.keySet()) {
            if (map.get(i) == 1) {
                System.out.println(i);
            }
        }
    }
}
