package test51;

import java.util.Arrays;
import java.util.Scanner;

public class Mysort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer num = new StringBuffer();//数字
            StringBuffer low = new StringBuffer();//小写
            StringBuffer ch = new StringBuffer();//大写
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                    ch.append(str.charAt(i));
                }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                    low.append(str.charAt(i));
                }else{
                    num.append(str.charAt(i));
                }
            }
            char[] lowx = low.toString().toCharArray();
            char[] chx = ch.toString().toCharArray();
            Arrays.sort(lowx);
            Arrays.sort(chx);
            String lowy  = String.valueOf(lowx);
            String chy  = String.valueOf(chx);

            StringBuffer result = new StringBuffer();
            int index = 0;
            int i=0;
            for(i=0;i<lowy.length()&&index<chy.length();){
                if(lowy.toUpperCase().charAt(i)<=chy.toUpperCase().charAt(index)){
                    result.append(lowy.charAt(i++));
                }else{
                    result.append(chy.charAt(index++));
                }
            }
            if(index==chy.length()){
                result.append(lowy.substring(i));
            }else{
                result.append(chy.substring(index));
            }
            result.append(num);
            System.out.println(result);
        }
    }
}
