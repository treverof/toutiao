package codeing.test;

import java.util.*;

public class KthNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
           // s = sc.nextLine();
            //int k = sc.nextInt();
            List<Integer> list = new LinkedList<>();
           // String[] str = s.split(" ");
            while(sc.hasNextInt()){
                int x = sc.nextInt();
                list.add(x);
            }
            int k = list.remove((list.size()-1));

            //int[] a = new int[str.length];
//            for(int i=0;i<str.length;i++){
//                a[i] = Integer.valueOf(str[i]);
//            }
            Collections.sort(list);
            System.out.println(list.get(k));
            //sc.close();
            sc = new Scanner(System.in);
           // int result = findKth(a,0,a.length-1,k);
          //  System.out.println(result);
        }
        sc.close();
    }

    public static int findKth(int[] a,int left,int right,int k){
        if(left==right){
            return a[left];
        }
        int i = left;
        int j = right;
        int key = a[i];
        while(j>i){
            for(;j>i&&a[j]>key;j--);
            a[i] = a[j];
            for(;j>i&&a[i]<key;i++);
            a[j] = a[i];
        }
        a[i] = key;
        if(i==k){
            return a[i];
        }else if(k<i){
            return findKth(a,left,i-1,k);
        }else{
            return findKth(a,i+1,right,k-i);
        }
    }
}
