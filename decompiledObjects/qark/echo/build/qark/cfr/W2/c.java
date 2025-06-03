/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package W2;

public abstract class c {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int n8 = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (n8 != charSequence2.length()) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9;
            char c8;
            char c9 = charSequence.charAt(i8);
            if (c9 == (c8 = charSequence2.charAt(i8)) || (n9 = c.b(c9)) < 26 && n9 == c.b(c8)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static int b(char c8) {
        return (char)((c8 | 32) - 97);
    }

    public static boolean c(char c8) {
        if (c8 >= 'a' && c8 <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean d(char c8) {
        if (c8 >= 'A' && c8 <= 'Z') {
            return true;
        }
        return false;
    }

    public static String e(String arrc) {
        int n8 = arrc.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!c.d(arrc.charAt(i8))) continue;
            arrc = arrc.toCharArray();
            while (i8 < n8) {
                char c8 = arrc[i8];
                if (c.d(c8)) {
                    arrc[i8] = (char)(c8 ^ 32);
                }
                ++i8;
            }
            return String.valueOf((char[])arrc);
        }
        return arrc;
    }

    public static String f(String arrc) {
        int n8 = arrc.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!c.c(arrc.charAt(i8))) continue;
            arrc = arrc.toCharArray();
            while (i8 < n8) {
                char c8 = arrc[i8];
                if (c.c(c8)) {
                    arrc[i8] = (char)(c8 ^ 32);
                }
                ++i8;
            }
            return String.valueOf((char[])arrc);
        }
        return arrc;
    }
}

