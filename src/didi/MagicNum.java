package didi;

import java.util.*;

public class MagicNum {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue_2 = new LinkedList<>();
        Queue<Integer> queue_3 = new LinkedList<>();
        Queue<Integer> queue_5 = new LinkedList<>();
        list.add(1);
        queue_2.add(2);
        queue_3.add(3);
        queue_5.add(5);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int min = 0;
            while(list.size()<n){
                min = Math.min(Math.min(queue_2.peek(),queue_3.peek()),queue_5.peek());
                if(min==queue_2.peek()){
                    queue_2.offer(queue_2.poll()*2);
                    if(!queue_3.contains(queue_3.peek()*2))
                        queue_3.offer(queue_3.peek()*2);
                    if(!queue_5.contains(queue_5.peek()*2))
                        queue_5.offer(queue_5.peek()*2);
                    list.add(min);
                }
                if(min==queue_3.peek()){
                    if(!queue_3.contains(queue_3.peek()*3))
                        queue_3.offer(queue_3.poll()*3);
                    if(!queue_5.contains(queue_5.peek()*3))
                    queue_5.offer(queue_5.peek()*3);
                    list.add(min);
                }
                if(min==queue_5.peek()){
                    queue_5.offer(queue_5.poll()*5);
                    list.add(min);
                }
            }
            System.out.println(list.get(n-1));
        }

    }
}
