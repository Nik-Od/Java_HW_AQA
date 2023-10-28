package HW9;

public class StringModifier {

    public static void main(String[] args) {
        String initialString = "abcd4efabc123deabcdaaa";
        String charactersToRemove = "ad3";

        String modifiedString = removeCharacters(initialString, charactersToRemove);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String removeCharacters(String str, String charsToRemove) {
        // Замінюємо кожен символ charsToRemove на порожній рядок
        for (char ch : charsToRemove.toCharArray()) {
            str = str.replace(Character.toString(ch), "");
        }
        return str;
    }
}

