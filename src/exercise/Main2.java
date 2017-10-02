package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        List<Integer> sum = new LinkedList<Integer>();
        for(int i=s[0].length()-1;i>=0;i--){
            list1.add(s[0].charAt(i)-'0');
        }
        for(int i=0;i<s[1].length();i++){
            list2.add(s[1].charAt(i)-'0');
        }
        for(int i=0;i<list2.size();i++){
            sum = add(mul(mul(list2,list1.get(i)),10),sum);
        }
    }

    public static List<Integer> mul(List<Integer> list,int a){
        int flag = 0;
        for(int i=0;i<list.size();i++){
            list.set(i,(list.get(i)*a+flag)%10);
            flag = (list.get(i)*a+flag)%10;
        }
        return list;
    }

    public static List<Integer> add(List<Integer> listA,List<Integer> listB){
        List<Integer> list = new LinkedList<Integer>();
        int flag = 0;
        int i = 0;
        for(i=0;i<listA.size()&&i<listB.size();i++){
            list.set(i,(listA.get(i)+listB.get(i)+flag)%10);
            flag = (list.get(i)+listB.get(i)+flag)%10;
        }
        if(i == listA.size()){
            while(i<listB.size()){
                list.set(i,(listB.get(i)+flag)%10);
                flag = (listB.get(i)+flag)%10;
                i++;
            }
            if(flag != 0){
                list.set(i,flag);
            }
        }
        if(i == listB.size()){
            while(i<listA.size()){
                list.set(i,(listA.get(i)+flag)%10);
                flag = (listA.get(i)+flag)%10;
                i++;
            }
            if(flag != 0){
                list.set(i,flag);
            }
        }
        return list;
    }

}
