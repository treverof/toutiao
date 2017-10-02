package hiho;

import java.util.*;

public class Huangshi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<Person> list = new LinkedList<>();
            for(int i=0;i<n;i++){
                String s1 = sc.next();
                String s2 = sc.next();
                list.add(new Person(s1,s2));
            }
            Collections.sort(list, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if(o1.name.compareTo(o2.name)!=0){
                        return o1.name.compareTo(o2.name);
                    }else{
                        if(romacompare(o1.order)>romacompare(o2.order)){
                            return 1;
                        }else if(romacompare(o1.order)==romacompare(o2.order)){
                            return 0;
                        }else{
                            return -1;
                        }
                    }
                }
            });

            for(Person person:list){
                System.out.println(person.name+" "+person.order);
            }
        }
    }

    public static int romacompare(String s){
        if (s == null || s.length() == 0)
            return 0;
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(s.charAt(len - 1));
        int pivot = result;
        for (int i = len - 2; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr >= pivot) {
                result += curr;
            } else {
                result -= curr;
            }
            pivot = curr;
        }
        return result;
    }
}

class Person{
    String name;
    String order;
    public Person(String name,String order){
        this.name = name;
        this.order = order;
    }
}