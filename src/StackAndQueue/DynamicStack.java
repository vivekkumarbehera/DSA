package StackAndQueue;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }
    public boolean push(int item){
        if(this.isfull()){
            int temp[]=new int[data.length*2];
            for (int i = 0; i < data.length ; i++) {
                temp[i]=data[i];
            }
            temp = data;
        }
        return super.push(item);
    }
}
