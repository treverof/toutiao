package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Box {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public  static Model[] items;
    private static BoxTemplate boxTemplate;
    private static int CUSTOMS_LIMIT_MONEY_PER_BOX = 2000;
    private static int boxMinNum = 1;
    private static List<Model> list = new LinkedList<>();

    private static int process() {
        sort(items,0,items.length-1);
        int totalPrice = 0;
        int totaLength = 0;
        int totalWidth = 0;
        int totalHeight = 0;
        int count =0;
        for(int i=0;i<items.length;i++){
            totalPrice += items[i].price;
            if(totalPrice>=CUSTOMS_LIMIT_MONEY_PER_BOX){
                count++;
                totalPrice = 0;
            }
        }
        for(int i=0;i<items.length;i++){
            if(totalPrice+items[i].price<CUSTOMS_LIMIT_MONEY_PER_BOX&&totaLength+items[i].length<boxTemplate.length
                    &&totalWidth+items[i].width<boxTemplate.width&&totalHeight+items[i].height<boxTemplate.height){
                count++;
                list.add(items[i]);
            }else{
                Model item = list.remove(list.size()-1);
//                if(item.price+)
            }
        }
            if(count==0)
                return -1;
            else
                return count;
    }

    public static void sort(Model[] items,int left,int right){
        if(left>=right)
            return ;
        int i = left;
        int j = right;
        Model model = items[i];
        while(i<j){
            for(;i<j&&items[j].price>model.price;j--);
            items[j] = items[i];
            for(;i<j&&items[i].price<model.price;i++);
            items[i] = items[j];
        }
        items[i] = model;
        sort(items,left,i-1);
        sort(items,i+1,right);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            boxMinNum = Integer.MAX_VALUE;
            System.out.println (process());

        }
    }
}

class Model {
    public int price;
    public int length;
    public int width;
    public int height;
}

class BoxTemplate {
    public int length;
    public int width;
    public int height;
    public int price;
    public BoxTemplate(int length,int width,int height){
        this.height = height;
        this.length = length;
        this.width = width;
    }
}