package GeeksForGeeks;


//Geeks for Geeks - Remove All consecutive Duplicates From String
//https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
public class RemoveAllDuplicatesFromString {
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println(remove("",s,0));
    }

    public static String remove(String p, String up, int index){
        if(up.isEmpty()){
            return p;
        }
        if(p.isEmpty() || p.charAt(index-1) != up.charAt(0)){
            p += up.charAt(0);
            index++;
        }
        up = up.substring(1);
        return remove(p, up,index);
    }
}
