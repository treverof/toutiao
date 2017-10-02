package test51;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCount {
    private static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            new Thread(){
               @Override
               public void run(){
                   for(int i=0;i<str.length()/3;i++){
                        if(str.substring(i,i+3).equals("u51")){
                            count.incrementAndGet();
                        }

                   }
               }
            }.start();
            new Thread(){
                @Override
                public void run(){
                    for(int i=str.length()/3;i<str.length()*2/3;i++){
                        if(str.substring(i,i+3).equals("u51")){
                            count.incrementAndGet();
                        }
                    }
                }
            }.start();
            new Thread(){
                @Override
                public void run(){
                    for(int i=str.length()*2/3;i<str.length()-3;i++){
                        if(str.substring(i,i+3).equals("u51")){
                            count.incrementAndGet();
                        }
                    }
                }
            }.start();


        }
        System.out.println(count);
    }
}
