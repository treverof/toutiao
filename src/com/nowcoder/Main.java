package com.nowcoder;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lizhiwei
 */
public class Main {

    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj));
    }

    public static void demoControlFlow() {
        int score = 60;
        if (score > 80) {
            print(1, "A");
        } else if (score > 60) {
            print(2, "B");
        } else {
            print(3, "C");
        }

        String grade = "B";
        switch (grade) {
            case "A":
                print(1, "score>80");
                break;
            case "B":
                print(2, "{60,80}");
                break;
            default:
                print(3, "{0,60}");
                break;
        }

        for (int i = 0; i < 6; i++) {
            print(4, i);
            if (i == 1) {
                continue;
            }
            if (i == 5) {
                break;
            }

            if (i % 2 == 1) {
                print(5, i + "%2=1");
            }
        }

        String s = "hello";
        for (char c : s.toCharArray()) {
            print(6, c);
        }

        int target = 20;
        int current = 0;
        while (current < target) {
            current += 5;
            print(3, current);
        }
    }

    public static void demoString() {
        String s = "hello nowcoder";
        print(1, s.indexOf('e'));
        print(1, s.indexOf(1));
        print(1, s.charAt(6));
        print(1, s.codePointAt(1));
        print(1, s.compareTo("hello lowcoder"));//strcmp()
        print(1, s.compareTo("hello oowcoder"));
        print(1, s.compareToIgnoreCase("Hello Nowcoder"));
        print(1, s.contains("hello"));
        print(1, s.concat("!!"));
        print(1, s.startsWith("!!"));
        print(1, s.endsWith("!!"));
        print(1, s);
        print(1, s.lastIndexOf('o'));
        print(1, s.toUpperCase());
        print(1, s.replace('o', 'a'));
        print(1, s.replaceAll("o|l", "a"));
        print(1, s.replaceAll("hello", "hi"));

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append("1");

        print(1, sb);
        print(1, "a" + "b" + "c" + String.valueOf(1));

    }

    public static void demoOperation() {
        print(2, 5 + 2);
        print(3, 5 - 2);
        print(4, 5 * 2);
        print(5, 5 / 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 & 2);
        print(9, 5 | 2);
        print(10, 5 ^ 2);
        print(11, 5 == 2);
        print(12, 5 != 2);
    }

    public static void demoList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strList.add(String.valueOf(i));
        }

        List<String> strListB = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strListB.add(String.valueOf(i * i));
        }
        print(2, strListB);
        strList.addAll(strListB);
        print(2, strList);
        strList.remove(0);
        print(2, strList);
        strList.remove(String.valueOf(1));
        print(2, strList);
        print(2, strList.get(1));
        Collections.sort(strList);
        print(12, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.valueOf(o1) < Integer.valueOf(o2)) {
                    return 1;
                } else if (Integer.valueOf(o1) > Integer.valueOf(o2)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        Collections.reverse(strList);
        print(12, strList);

        int[] arrays = new int[]{1, 2, 3};
        print(1, arrays[1]);

    }

    public static void demoSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(String.valueOf(i));
            set.add(String.valueOf(i));
            set.add(String.valueOf(i));
        }
        set.remove("1");
        print(11, set);
        print(13, set.contains("4"));
        set.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(14, set);

        for (String s : set) {
            print(15, s);
        }

        print(14, set.isEmpty());
        print(14, set.size());

    }

    public static void demoKeyValue() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(15, map);
        for (Map.Entry entry : map.entrySet()) {
            print(16, entry.getKey() + ":" + entry.getValue());
        }
        print(15, map.keySet());
        print(15, map.values());
        print(15, map.containsKey("2"));
        print(15, map.get("2"));
        map.replace("1", "A");
        print(15, map);
    }

    public static void demoException() {
        try {
            int a = 2;
            a =  a/0;
            String b = null;
            b.indexOf('a');
        } catch (NullPointerException npe) {
            print(1, npe.toString());
        } catch (Exception e) {
            print(1, e.toString());
        } finally {
            //清理工作
            //异常的处理一般加log就行，用log输出异常
            print(1, "关闭流等");
        }
    }

    public static void demoCommon() {
        Random random = new Random();
        random.setSeed(100);
        for(int i = 0; i < 4;i++) {
            print(1,random.nextInt(100));
            print(1,random.nextDouble()*100);
        }

        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,99999});
        Collections.shuffle(list);
        print(1111,list);
        Collections.shuffle(list,random);
        print(111,list);

        Date date = new Date();
        print(5,date);
        print(6,date.getTime());

        //习题，计算未来的日子是星期几

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        print(7,df.format(date ));
        print(8,DateFormat.getDateInstance(DateFormat.FULL).format(date));

        //保证唯一性的一个数
        print(9,UUID.randomUUID());

        print(10, Math.max(1,2));
        print(10, Math.ceil(1.2));
        print(10, Math.floor(1.2));
        print(10, Math.log(1.2));

    }

    public static void main(String[] args) {
//        System.out.println("Hello world");
//        print(1,"hello");
//        demoOperation();
//        demoControlFlow();
//        demoString();
//        demoList();
//        demoSet();
//        demoKeyValue();
//        demoException();
//        demoCommon();
    }
}
