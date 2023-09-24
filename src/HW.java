public class HW {
    public static void main(String[] args) {
        // Examples of methods
        int number1 = 10;
        int number2 = 5;
        System.out.println("Absolut difference: " + calculateAbsoluteDifference(number1, number2));

        String inputString = "Hello, World!";
        System.out.println("First character: " + getFirstCharacter(inputString));
        System.out.println("Last character: " + getLastCharacter(inputString));
        System.out.println("Line after replacement: " + swapFirstAndLastCharacters(inputString));
    }

    // A method for calculating the absolute difference between two numbers
    public static int calculateAbsoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }

    // Method for getting the first character from a string
    public char getFirstCharacter(String input) {
        if (input != null && !input.isEmpty()) {
            return input.charAt(0);
        } else {
            return '!';
        }
    }

    // Method for getting the last character from a string
    public char getLastCharacter(String input) {
        if (input != null && !input.isEmpty()) {
            return input.charAt(input.length() - 1);
        } else {
            return '!';
        }
    }

    // Method for replacing the first and last characters in a string
    public String swapFirstAndLastCharacters(String input) {
        if (input != null && input.length() >= 2) {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);
            String middle = input.substring(1, input.length() - 1);
            return lastChar + middle + firstChar;
        } else {
            return input;
        }
    }
}




