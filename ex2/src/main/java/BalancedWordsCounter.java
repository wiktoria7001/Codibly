import java.util.HashMap;

class BalancedWordsCounter {
    public int count(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        if (!input.matches("[a-zA-Z]*")) {
            throw new IllegalArgumentException("Input can only contain letters.");
        }
        if (input.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {     
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                HashMap<Character, Integer> charCount = new HashMap<>();
                for (int k = 0; k < sub.length(); k++) {
                    charCount.put(sub.charAt(k), charCount.getOrDefault(sub.charAt(k), 0) + 1);
                }
                boolean isBalanced = true;
                int freq = charCount.values().iterator().next();
                for (int f : charCount.values()) {
                    if (freq != f) {
                        isBalanced = false;
                        break;
                    }
                }
                if (isBalanced) {
                    count++;
                }
            }
        }
        return count;
    }

}
