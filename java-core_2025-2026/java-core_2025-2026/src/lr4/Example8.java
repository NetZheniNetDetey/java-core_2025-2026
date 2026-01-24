package lr4;

public class Example8 {
    static void main(String[] args) {

    }

    public class Encpypt {
        public static String getEbcryptString(String encryptString, int shift) {
            char[] arrayChar = encryptString.toCharArray();
            long[] arrayInt = new long[arrayChar.length];
            char[] arrayCharNew = new char[arrayChar.length];

            for (int i = 0; i < arrayChar.length; i++) {
                arrayInt[i] = arrayInt[i] + shift;
                arrayCharNew[i] = (char) arrayInt[i];
            }

            encryptString = new String(arrayCharNew);

            return encryptString;
        }
    }
}
