package LeetcodeEasy;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Leetcode - 1773 - Count Items matching a rule
//https://leetcode.com/problems/count-items-matching-a-rule/description/
public class CoutingItemsMatchingArule {
    public static void main(String[] args) {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer","silver","phone"),
                List.of("phone","gold","iphone")
        );
        System.out.println(countMatches(items,"type","phone",0));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue, int index) {
        int count = 0;
        if(ruleKey.equals("type")){
            index = 0;
        }
        if(ruleKey.equals("color")){
            index = 1;
        }
        if(ruleKey.equals("name")){
            index = 2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count += 1;
            }
        }
    return count;
    }
}
