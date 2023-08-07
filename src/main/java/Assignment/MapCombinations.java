package Assignment;

import java.util.HashMap;
import java.util.Map;

public class MapCombinations {

    public static void main(String[] args) {
        // Create the map
        Map<String, Integer> map = new HashMap<>();
        map.put("value1", 10);
        map.put("value2", 20);
        map.put("value3", 30);

        // Accept user input value
        int userInputValue = 25;

        // Find keys with values less than or equal to the user input value
        String resultKeys = findKeysWithValuesLessThanOrEqualToInput(map, userInputValue);

        // Display the result
        System.out.println("{"+ resultKeys+"}");
    }

    private static String findKeysWithValuesLessThanOrEqualToInput(Map<String, Integer> map, int inputValue) {
        StringBuilder keysBuilder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= inputValue) {
                keysBuilder.append(entry.getKey()).append(", ");
            }
        }

        // Remove the last ", " if there are any keys found
        if (keysBuilder.length() > 0) {
            keysBuilder.setLength(keysBuilder.length() - 2);
        }

        return keysBuilder.toString();
    }
}
