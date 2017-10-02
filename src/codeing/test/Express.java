package codeing.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Express {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            Stack<String> str = new Stack<>();
            Stack<Integer> num = new Stack<>();
            StringBuffer result = new StringBuffer();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    if(s.charAt(i+1)>='0'&&s.charAt(i)<='9'){
                        int x = 0;
                        x = (s.charAt(i)-'0')*10+s.charAt(i+1)-'0';
                        i++;
                        num.push(x);
                    }else
                        num.push(s.charAt(i)-'0');
                }else{
                    if(s.charAt(i)!='}'){
                        str.push(String.valueOf(s.charAt(i)));
                    }else{
                        StringBuffer sb = new StringBuffer();
                        while(!str.peek().equals("{")){
                            sb.append(str.pop());
                        }
                        sb = sb.reverse();
                        str.pop();
                        int length = num.pop();
                        for(int j=0;j<length;j++){
                            result.append(sb);
                        }
                        str.push(result.toString());
                        result = new StringBuffer();
                    }
                }
            }
            List<String> list= new LinkedList<>();
            while(!str.empty()){
                list.add(str.pop());
            }
            for(int i=list.size()-1;i>=0;i--){
                result.append(list.get(i));
            }
            System.out.println(result);
        }
    }
}
