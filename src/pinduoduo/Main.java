package pinduoduo;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<Dictory> list = new LinkedList<>();
            String str = sc.nextLine();
            for(int i=0;i<n;i++){
                str = sc.nextLine();
                String[] s = str.split(" ");
                list.add(new Dictory(s[0],Integer.valueOf(s[1])));
            }
            Collections.sort(list, new Comparator<Dictory>() {
                @Override
                public int compare(Dictory o1, Dictory o2) {
                    if(o1.parent>o2.parent){
                        return 1;
                    }else if(o1.parent<o2.parent){
                        return -1;
                    }else {
                        return o1.name.compareTo(o2.name);
                    }
                }
            });
            for(Dictory d:list){
                System.out.println(d.name+" "+d.parent);
            }
        }
        sc.close();
    }
}

class Dictory{
    String name;
    int parent;
    public Dictory(String name,int parent){
        this.name = name;

        this.parent = parent;
    }
}
