class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] numberAsChars = String.valueOf(numberToCheck).toCharArray();
        int length = numberAsChars.length();
        int number = 0;
        for (char c: numberAsChars) {
            number += Math.pow((c - '0'), length)
        }
        return number = numberToCheck;
    }
}
