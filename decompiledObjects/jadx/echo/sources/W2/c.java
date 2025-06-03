package W2;

/* loaded from: classes.dex */
public abstract class c {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int b7;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            char charAt2 = charSequence2.charAt(i7);
            if (charAt != charAt2 && ((b7 = b(charAt)) >= 26 || b7 != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static int b(char c7) {
        return (char) ((c7 | ' ') - 97);
    }

    public static boolean c(char c7) {
        return c7 >= 'a' && c7 <= 'z';
    }

    public static boolean d(char c7) {
        return c7 >= 'A' && c7 <= 'Z';
    }

    public static String e(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (d(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (d(c7)) {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String f(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (c(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (c(c7)) {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }
}
