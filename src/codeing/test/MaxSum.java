package codeing.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            for(int i=0;i<str.length;i++){
                list.add(Integer.valueOf(str[i]));
            }

            int maxSum = 0;
            int thisSum = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)+thisSum <= 0) {
                    thisSum = 0;
                } else {
                    thisSum += list.get(i);
                    if (thisSum > maxSum) {
                        maxSum = thisSum;
                    }
                }
            }
            if (maxSum == 0) {
                maxSum = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (maxSum < list.get(i)) {
                        maxSum = list.get(i);
                    }
                }
            }
            System.out.println(maxSum);
        }
    }
}
