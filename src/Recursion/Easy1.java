package Recursion;


//1 2 3 4 5 and 5 4 3 2 1 basic idea of recursion
public class Easy1 {
    public static void main(String[] args) {
        fun2(5);
    }

    static void fun(int n){
        if(n==0){
          return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n-1);
        System.out.println(n);
    }
}
