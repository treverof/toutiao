package acmcoder;


import java.util.*;

public class SetCombine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int size_a = sc.nextInt();
            int size_b = sc.nextInt();
            Set<Integer> set = new TreeSet<>();
            for(int i=0;i<size_a+size_b;i++){
                set.add(sc.nextInt());
            }
            List<Integer> list = new ArrayList<>();
            list.addAll(set);
            for(int i=0;i<list.size()-1;i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println(list.get(list.size()-1));
        }
    }
}
