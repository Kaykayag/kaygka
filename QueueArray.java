
  public class QueueArray{
    private Object[] items;
    private int count;
    
    public QueueArray(int size){
        items = new Object[size];
        count = 0;
    }
    
    public boolean isEmpty(){
        if(count == 0)
           return true;
        else
           return false;
    }
    
    public boolean isFull(){
        return count == items.length;
    }
    
    public boolean enqueue(Object val){
        if(!isFull()){
            items[count++] = val;
            return true;
        }
        return false;
    }
    
    public boolean dequeue(){
        if(!isEmpty()){
            for(int i = 1; i < count - 1; i++){
                items[i - 1] = items[i];
            }
            items[count - 1] = null;
            count--; //count = count - 1
            return true;
        }
        return false;
    }

    public Object front(){
        if(!isEmpty()){
            return items[0];
        }
        return null;
    }
    
    public void display(){
        if(!isEmpty()){
            for(int i = 0; i < count; i++){
                System.out.println("[" + items[i] + "]");
            }
            System.out.println(" ");
        }
        else
            System.out.println("Queue is empty");
    }
    
    public static void main(String[] args){
        QueueArray qa = new QueueArray (5);
        qa.enqueue(6);
        qa.display();
    }
}