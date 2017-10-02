package pinduoduo;

import java.util.*;

public class Suger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<m;i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            List<Xiong> xiongs = new LinkedList<>();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                xiongs.add(new Xiong(a,b));
            }
            for(int k=0;k<xiongs.size();k++){
                Xiong xiongMax = Collections.max(xiongs, new Comparator<Xiong>() {
                    @Override
                    public int compare(Xiong o1, Xiong o2) {
                        if (o1.fight>=o2.fight)
                            return 1;
                        return -1;
                    }
                });
                while(true) {
                    int max = 0;
                    int index = 0;
                    boolean flag =false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) <= xiongMax.starve && max <= list.get(i)) {
                            max = list.get(i);
                            index = i;
                            flag = true;
                        }
                    }
                    if(flag==true) {
                       // xiong.starve -= max;
                        list.remove(index);
                    }
                    else
                        break;
                }
            }
            for(Xiong xiong:xiongs){
                System.out.println(xiong.starve);
            }
        }
    }
}

class Xiong{
    int fight;
    int starve;
    public Xiong(int fight,int starve){
        this.fight = fight;
        this.starve = starve;
    }
}
