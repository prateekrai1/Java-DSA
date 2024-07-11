package Trees;

public class Main {
    public static void main(String[] args) {
     int[] arr = {10,15,12,9,5,17};
     InsertionInBST insert = new InsertionInBST();
        insert.populate(13);
     for(int i=0; i<arr.length;i++){
         insert.populate(arr[i]);
     }
    }
}
