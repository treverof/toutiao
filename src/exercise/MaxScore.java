package exercise;

import java.util.Scanner;

public class MaxScore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] score = new int[n];
            for(int i=0;i<n;i++){
                score[i] = scanner.nextInt();
            }
            int result = 0;
            int begin = 0;
            int end = 0;
            int i =0;
            for(i=0;i<n;i++){
                if(score[i]!=0){
                    end++;
                }else{
                    result += maxScore(score,begin,end);
                    begin = i+1;
                    end = i+1;
                }
            }
            System.out.println(result);
            System.out.println(begin+":"+end);
            if(end == n){
                result += maxScore(score,begin,n-1);
            }
            System.out.println(result);
        }
    }
    public static int maxScore(int[] nums,int begin,int end) {
        int n = end-begin+3;
        int[] newnums = new int[n];
        for (int i = begin;i <=end; i++){
            newnums[i+1-begin] = nums[i];
        }
        newnums[0] = newnums[n - 1] = 1;
        int[][] DP = new int[n][n];
        for (int k = 2; k < n; k++){
            for (int l = 0; l + k < n; l++){
                int h = l + k;
                for (int m = l + 1; m < h; m++){
                    DP[l][h] = Math.max(DP[l][h],newnums[l] * newnums[m] * newnums[h] + DP[l][m] + DP[m][h]);
                }
            }
        }
        return DP[0][n - 1];
    }
}
