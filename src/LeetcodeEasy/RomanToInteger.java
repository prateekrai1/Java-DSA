//package LeetcodeEasy;
//
//public class RomanToInteger {
//    public static void main(String[] args) {
//        int ans = romantoInt("","VI",0,0);
//        System.out.println(ans);
//    }
//
//    static int romantoInt(String p,String up, int num,int index){
//        int upIndex= 0;
//        int I = 1;
//        int V = 5;
//        int X = 10;
//        int L = 50;
//        int C = 100;
//        int D = 500;
//        int M = 1000;
//
//        if(index > p.length()-1){
//                return num;
//            }
//            if(up.charAt(index) == 'I'){
//                if(!(p.charAt(index) == 'I')){
//
//                }
//                return romantoInt(p+up.charAt(upIndex),up.substring(upIndex),num+1,index+1);
//            }
//            if(p.charAt(index) == 'V'){
//                return romantoInt(p,num+5,index+1);
//            }
//            if(p.charAt(index) == 'X'){
//                return romantoInt(p,num+10,index+1);
//            }
//            if(p.charAt(index) == 'L'){
//                return romantoInt(p,num+50,index+1);
//            }
//            if(p.charAt(index) == 'C'){
//                return romantoInt(p,num+100,index+1);
//            }
//            if(p.charAt(index) == 'D'){
//                return romantoInt(p,num+500,index+1);
//            }
//            if(p.charAt(index) == 'M'){
//                return romantoInt(p,num+1000,index+1);
//            }
//        return num;
//    }
//}
