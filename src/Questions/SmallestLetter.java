package Questions;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class SmallestLetter {
    //Find the smallest letter greater than the target in the char array
    public static void main(String[] args) {
        char[] arr = {'c','j','k','i'};
        char tgt = 'i';
        char ans = smallestLetter(arr,tgt);
        System.out.println(ans);
    }

    static char smallestLetter(char[] letters, char tgt){
        int start = 0;
        int end = letters.length -1;
        while (start <= end){
            int mid = start + (end -start)/2;

            if(tgt < letters[mid]){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
