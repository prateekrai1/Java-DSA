package LeetcodeEasy;

public class GoalParser {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        StringBuilder builder = new StringBuilder();
        System.out.println(interpret(command,0, builder));
    }
    public static String interpret(String command, int index, StringBuilder res) {
        if(index >= command.length()){
            return res.toString();
        }
        if(command.charAt(index) == 'G'){
            res.append(command.charAt(index));
            index=index+1;
            return interpret(command,index,res);
        }
        if(command.substring(index, index + 2).equals("()")){
            res.append("o");
            index=index+2;
            return interpret(command,index,res);
        }
        if(command.substring(index, index + 4).equals("(al)")){
            res.append("al");
            index=index+4;
            return interpret(command,index,res);
        }
        return interpret(command,index,res);
    }
}
