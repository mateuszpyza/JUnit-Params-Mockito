public class TextLength {
    public static int getTextLength(String text) {
        if (text != null) {
            return text.length();
        }
        System.out.println("Input data is null!");
        return 0;
    }
}