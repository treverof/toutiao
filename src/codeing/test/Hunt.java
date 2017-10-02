package codeing.test;

import java.util.Scanner;

public class Hunt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int speed1 = sc.nextInt();//怪物速度
            int speed2 = sc.nextInt();//角色速度
            int time = sc.nextInt();//运动时间
            int d1 = 0;//怪物移动距离
            int d2 = 0;//角色移动距离
            int t = length/Math.min(speed1,speed2);
            int i = t;
            int count = 0;
            while(i<=time){
                d1 += (speed1*i);
                d2 += (speed2*i);
                if(d1%length==0&&d2%length==0){
                    if((d1/length)%2==0&&(d2/length)%2!=0||(d1/length)%2!=0&&(d2/length)%2==0){
                        count++;
                    }
                }
                i+=t;
            }
            System.out.println(count);
        }

    }
}
