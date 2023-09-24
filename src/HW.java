public class HW {
//    public static void main(String[] args) {
//        int number1 = 48;
//        int number2 = 35;
//
//        int absoluteDifference = calculateAbsoluteDifference(number1, number2);
//
//        System.out.println("Absolute difference: " + absoluteDifference);
//    }
//
//    public static int calculateAbsoluteDifference(int a, int b){
//
//        // Using a Math.abs() method to calculate absolute difference
//        return Math.abs(a - b);
//    }
//
//}
//
//class SecondTask {
//    public static void main(String[] args) {
//        String inputString = "Java";
//
//        char firstChar = getFirstCharacter(inputString);
//
//        System.out.println("First character: " + firstChar);
//    }
//
//    public static char getFirstCharacter(String input) {
//        // Check that the string is not empty and has at least one character
//        if (input != null && !input.isEmpty()) {
//            // Returning the first character of the string
//            return input.charAt(0);
//        } else {
//            // If the string is empty or null, we return the default character (for example, '!')
//            return '!';
//        }
//    }
//}
//
//class ThirdTask{
//    public static void main(String[] args) {
//        String inputString = "Java";
//
//        char lastChar = getLastCharacter(inputString);
//
//        System.out.println("Last character: " + lastChar);
//    }
//
//    public static char getLastCharacter(String input) {
//        // Check that the string is not empty and has at least one character
//        if (input != null && !input.isEmpty()) {
//            // Returning the last character of the string
//            return input.charAt(input.length() - 1);
//        } else {
//            // If the string is empty or null, we return the default character (for example, '!')
//            return '!';
//        }
//    }
//
//
//
//}
//
//class FouthTask{
//    public static void main(String[] args) {
//        String inputString = "Java";
//
//        String swappedString = swapFirstAndLastCharacters(inputString);
//
//        System.out.println("Line after replacement: " + swappedString);
//    }
//
//    public static String swapFirstAndLastCharacters(String input) {
//        // Check that the string is not empty and has at least two characters
//        if (input != null && input.length() >= 2) {
//            // We get the first and last characters of the string
//            char firstChar = input.charAt(0);
//            char lastChar = input.charAt(input.length() - 1);
//
//            // Creating a new line by swapping the first and last characters
//            String swappedString = lastChar + input.substring(1, input.length() - 1) + firstChar;
//
//            return swappedString;
//        } else {
//            // If the string is empty, null, or has less than two characters, we return the original string
//            return input;
//        }
//    }
//
//
}
