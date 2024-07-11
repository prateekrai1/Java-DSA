package GeeksForGeeks;

public class FirstUppercaseLetterInString {
    public static void main(String[] args) {
        String s = "GeekS";
        System.out.println(firstUppercase(s.toCharArray(),0));
    }
    public static char firstUppercase(char[] string, int index){
        if(string[index] == Character.toUpperCase(string[index])){
            return string[index];
        }
        index++;
        return firstUppercase(string,index);
    }
}
