import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String str = "Football";
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1); 
            
        }
        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No unique character");
    }
}
