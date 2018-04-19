package sample.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str){
        String s = str.replace(" ", "").toLowerCase();
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = s.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Ramesh Babu Napa");
    }
}
