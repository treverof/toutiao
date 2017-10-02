package acmcoder;

import java.util.*;

public class Buy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            Map<String,Integer> map = new TreeMap<>();
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            for(int i=0;i<m;i++){
                String s = sc.next();
                if(null != map && !map.containsKey(s)){
                    map.put(s,1);
                }else{
                    map.put(s,map.get(s)+1);
                }
            }
            List<Map.Entry<String, Integer>> listx = new ArrayList<>(map.entrySet());
            Collections.sort(listx, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());

                }
            });
            int min = 0;
            int max = 0;
            int index = 0;
            for(Map.Entry<String,Integer> entry:listx){
                min += list.get(index++)*entry.getValue();
            }


            index = list.size()-1;
            for(Map.Entry<String,Integer> entry:listx){
                max += list.get(index--)*entry.getValue();;
            }
            System.out.println(min+" "+max);
        }
    }
}
