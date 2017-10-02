package help;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            if(isMatchLength(line) && isCharacter(line) && isContinuous(line)){
                System.out.println(0);
            } else if(isMatchLength(line)){
                if(!isContinuous(line) && !isCharacter(line)){
                    /**
                     * 找到有几个连续的
                     */
                    System.out.println(2);
                }
                if(isContinuous(line) && !isCharacter(line)){
                    int numCount = 0;
                    int numLow = 0;
                    int numCap = 0;
                    for(Character character:line.toCharArray()){
                        if(character>='a'&&character<='z')
                            numLow++;
                        if(character>='A'&&character<='Z')
                            numCap++;
                        if(character>='0'&&character<='9')
                            numCount++;
                    }
                    int count = (numCount==0?1:0)+(numLow==0?1:0)+(numCap==0?1:0);
                    System.out.println(count);
                }
                if(!isContinuous(line) && isCharacter(line)){
                    int count = 0;
                    for(int i=0;i<line.length()-3;i++){
                        if(line.charAt(i)==line.charAt(i+1)
                                && line.charAt(i+1)==line.charAt(i+2)){

                        }
                    }
                }
            }
        }
    }

    public static boolean isMatchLength(String str){
        return str.length()>=6 && str.length()<=20;
    }

    public static boolean isCharacter(String str){
        int numCount = 0;
        int numLow = 0;
        int numCap = 0;
        for(Character character:str.toCharArray()){
            if(character>='a'&&character<='z')
                numLow++;
            if(character>='A'&&character<='Z')
                numCap++;
            if(character>='0'&&character<='9')
                numCount++;
        }
        return numCount >=1 && numCap >=1 && numLow >=1;
    }

    public static boolean isContinuous(String str){
        for(int i=0;i<str.length()-3;i++){
            if(str.charAt(i)==str.charAt(i+1)
                    && str.charAt(i+1)==str.charAt(i+2))
                return false;
        }
        return true;
    }
}
