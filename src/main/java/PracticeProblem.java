public class PracticeProblem {
	public static void main(String args[]) {

	}
    public static final int MAXIMUM = 10;
    /**
     * Performs a calculation on two integers using the specified operator
     * @param num1 First integer
     * @param num2 Second integer
     * @param operator The operation to perform (+, -, *, /, %, ^)
     * @return The result of the operation
     */
    public static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;  // Floor division (integer division)
            case '%':
                return num1 % num2;
            case '^':
                return (int) Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
	public static boolean totalWordsChecker(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;  // Empty string has 0 words, which is <= MAXIMUM
        }

        String[] words = str.trim().split("\\s+");
        return words.length <= MAXIMUM;
    }
    public static String minString(String str1, String str2, String str3) {
        String min = str1;

        if (str2.compareToIgnoreCase(min) < 0) {
            min = str2;
        }

        if (str3.compareToIgnoreCase(min) < 0) {
            min = str3;
        }

        return min;
    }
}
