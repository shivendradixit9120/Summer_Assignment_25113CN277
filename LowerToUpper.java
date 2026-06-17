public class LowerToUpper {
    public static void main(String[] args) {
        String str = "hello world";
        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            upper += ch;
        }

        System.out.println("Uppercase String = " + upper);
    }
}