import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> sumSymbols = new HashMap<>();
        for (int i = 0; i != text.length(); i++){
            if (Character.isLetter(text.charAt(i))){
                if (sumSymbols.containsKey(text.charAt(i))){
                    sumSymbols.put(text.charAt(i), (sumSymbols.remove(text.charAt(i)) + 1));
                } else {
                    sumSymbols.put(text.charAt(i), 1);
                }
            }
        }
        System.out.println(sumSymbols);
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : sumSymbols.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> entry : sumSymbols.entrySet()) {
            if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                minEntry = entry;
            }
        }
        System.out.println(maxEntry);
        System.out.println(minEntry);
    }
}