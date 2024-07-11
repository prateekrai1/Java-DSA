package StackAndQueues;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); // this will call CustomStack()
    }
    public DynamicStack(int size){
        super(size); // this will call CustomStack(int size)
    }

    @Override
    public boolean push(int item){
        // if the array is full
        if(isFull()){
            // double the size
            int temp[] = new int[data.length * 2];
            //copy all the items into the new array
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point array is not full
        //hence insert it normally
        return super.push(item);
    }
}
