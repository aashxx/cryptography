public class rails {
    public static String encode(String text, int n) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        String[] rails = new String[n];
        for (int i = 0; i < n; i++) {
            rails[i] = "";
        }
        int num = 0;
        boolean down = false;
        for (int i = 0; i < len; i++) {
            rails[num] += chars[i];
            if (num == 0 || num == n - 1) {
                down = !down;
            }
            num += down ? 1 : -1;
        }
        String cipher = "";
        for (int i = 0; i < n; i++) {
            cipher += rails[i];
        }
        return cipher;
    }

    public static void main(String[] args) {
        String text = "saifloveszaina";
        int n = 3;
        String cipher = encode(text, n);
        System.out.println(cipher);
    }
}