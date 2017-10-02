package youzan;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            Stack<String> stack = new Stack<>();
            for(int i=0;i<line.length();i++){
                int count = 0;
                if(line.charAt(i)== ' '){
                    while(i<line.length()&&line.charAt(i)== ' '){
                        count++;
                        i++;
                    }
                    i--;
                    stack.push(String.valueOf(count));
                }else{
                    int begin = i;
                    while(i<line.length()&&line.charAt(i)!= ' '){
                        count++;
                        i++;
                    }
                    i--;
                    stack.push(line.substring(begin,begin+count));
                }

            }
            while(!stack.empty()){
                if(stack.peek().charAt(0)>='0'&&stack.peek().charAt(0)<='9'){
                    int num = Integer.valueOf(stack.pop());
                    while (num-->0){
                        System.out.print(" ");
                    }
                }else
                    System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
