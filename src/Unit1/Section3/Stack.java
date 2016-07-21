package Unit1.Section3;

/**
 *DEADLINE 7.13
 * 实现一个队列，不能调用java.util下面的包
 * 需要实现的方法如下
 * 各个方法详细解释参考书上的解释
 *
 */
public class Stack<Item> {
    private Item[] items;
    private Item[] temp;
    private int counter=0;
    private int size=4;
    public Stack(){
        //TODO to complete this method
        items=(Item[]) new Object[size];
    }

    public void push(Item item){
        //TODO to complete this method
        if(items[items.length-1]!=null){
            size*=2;
            temp=(Item[]) new Object[size];
            System.arraycopy(items, 0, temp, 0, items.length);
            items=(Item[]) new Object[size];
            System.arraycopy(temp, 0, items, 0, items.length);
        }
        items[counter]=item;
        counter++;
    }

    public Item pop(){
        //TODO to complete this method
        if(items[(items.length/4)-1]==null){
            size/=2;
            temp=(Item[]) new Object[size];
            System.arraycopy(items, 0, temp, 0, items.length);
            items=(Item[]) new Object[size];
            System.arraycopy(temp, 0, items, 0, items.length);
        }
        Item tempItem=items[counter];
        counter--;
        items[counter]=null;
        return tempItem;
    }

    public boolean isEmpty() {
        //TODO to complete this method
        return items[0]==null;
    }

    public int size(){
        //TODO to complete this method
        return items.length;
    }

}
