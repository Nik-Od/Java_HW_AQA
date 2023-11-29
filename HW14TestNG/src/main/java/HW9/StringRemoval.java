package HW9;


public class StringRemoval {

    public static String removeSubString(String mainStr, String removableStr) {
        return mainStr.replace(removableStr, "");
    }

    public static void main(String[] args) {
        String mainString = "This is the test string";
        String removableString = "st";
        String newString = removeSubString(mainString, removableString);

        System.out.println("The main string is: " + mainString);
        System.out.println("The removable string is: " + removableString);
        System.out.println("The new string is: " + newString);
    }
}
