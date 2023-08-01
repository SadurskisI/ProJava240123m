package algorithms.lesson06;

import java.util.HashMap;
import java.util.Map;

public class calculateLetterFrequency {

    public static void main(String[] args) {

        String text = "The quick fox jumps over the lazy dog";
        Map<Character,Integer> letterFrequency = calculateLetterFrequency(text);

        for (Map.Entry<Character,Integer> entry: letterFrequency.entrySet()){
            System.out.println(entry.getKey()+": " + entry.getValue());
        }


    }

    public static Map<Character,Integer> calculateLetterFrequency(String text){
        Map<Character,Integer> letterFrequency = new HashMap<>();
        String lowerCaseText = text.toLowerCase();
        for (int i = 0; i < lowerCaseText.length(); i++){
            char c = lowerCaseText.charAt(i);
            if (Character.isLetter(c)){
                letterFrequency.put(c,letterFrequency.getOrDefault(c,0)+1);
            }
        }
        return letterFrequency;
    }
}
