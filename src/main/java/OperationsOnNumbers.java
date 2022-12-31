public class OperationsOnNumbers {
    public static boolean isDivisibleByTwo(int number) {
        return number % 2 == 0;
    }

    public static int addDigitsInNumber(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int sum=0;
        for (int i=0;i<Integer.toString(number).length();i++){
            sum = Integer.parseInt(String.valueOf(digits[i]))+sum;
        }
        return sum;
    }
}
