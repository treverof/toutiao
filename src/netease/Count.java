package netease;

import java.util.Scanner;

public class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int count = 1;
            int max = 1;
            for(int i=1;i<s.length();i++){
                while(i<s.length()&&s.charAt(i)!=s.charAt(i-1)){
                    count++;
                    i++;
                }
                if(count>max){
                    max = count;
                }
                count = 1;
            }
            System.out.println(max);
        }
    }
}
