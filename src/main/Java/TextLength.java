public class TextLength {
    public static int getTextLength(String text) {
        try {
            return text.length();
        } catch (NullPointerException e) {
            throw new NullPointerException("Input data problems!");
        }

    }
}
