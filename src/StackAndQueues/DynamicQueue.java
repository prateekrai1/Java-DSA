package StackAndQueues;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        // if the array is full
        if(isFull()){
            // double the size
            int temp[] = new int[data.length * 2];
            //copy all the items into the new array
            for(int i=0; i<data.length; i++){
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        //at this point array is not full
        //hence insert it normally
        return super.insert(item);
    }

}
