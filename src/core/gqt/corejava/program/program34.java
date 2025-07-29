package core.gqt.corejava.program;
import java.util.HashMap;
import java.util.Map;

public class program34 {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        System.out.println("Most frequent character in the string: " + mostFrequentChar);
    }
}
