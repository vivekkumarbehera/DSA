package StackAndQueue;

public class CustomStack {
   protected int[] data;
   private static  final int Default_size = 10;

   int ptr = -1;
   public CustomStack(){
       this(Default_size);
   }
   public CustomStack(int size){
       this.data = new int[size];
   }
   public boolean push(int item){
       if(isfull()){
           System.out.println("Stack is full");
           return false;
       }
       ptr++;
       data[ptr]= item;
       return true;
   }
   public int pop() throws StackException{
       if(isempty()){
           throw new StackException("Can not pop From an element in the Stack !!!!");

       }
       int removed = data[ptr];
       ptr--;
       return removed;
    }
    public int peek() throws StackException{
       if(isempty()){
           throw new StackException("Can not peak from the element !!");
       }
       return data[ptr];
    }
   public boolean isfull(){
       return ptr==data.length-1;
   }
   public boolean isempty(){
       return ptr == -1;
   }

}
