import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicatesInAString {
    public static void main(String[] args) {
        String s = "GeeksForGeeks" ;
        Map<Character, Integer> dups = findDuplicates(s);
        for(Map.Entry<Character, Integer> dup: dups.entrySet()) {
            System.out.println(dup.getKey() + ", count = " + dup.getValue()) ;
        }
    }

    private static Map<Character, Integer> findDuplicates(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch: s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1) ;
        }
        HashMap<Character, Integer> ans = new HashMap<>();
        for(Map.Entry<Character, Integer> ent: freq.entrySet()) {
            if(ent.getValue() > 1) {
                ans.put(ent.getKey(), ent.getValue()) ;
            }
        }
        return ans;
    }
}