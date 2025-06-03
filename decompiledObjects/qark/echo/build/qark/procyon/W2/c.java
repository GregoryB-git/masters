// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

public abstract class c
{
    public static boolean a(final CharSequence charSequence, final CharSequence charSequence2) {
        final int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            final char char2 = charSequence2.charAt(i);
            if (char1 != char2) {
                final int b = b(char1);
                if (b >= 26 || b != b(char2)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static int b(final char c) {
        return (char)((c | ' ') - 97);
    }
    
    public static boolean c(final char c) {
        return c >= 'a' && c <= 'z';
    }
    
    public static boolean d(final char c) {
        return c >= 'A' && c <= 'Z';
    }
    
    public static String e(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            if (d(s.charAt(i))) {
                final char[] charArray = s.toCharArray();
                while (i < length) {
                    final char c = charArray[i];
                    if (d(c)) {
                        charArray[i] = (char)(c ^ ' ');
                    }
                    ++i;
                }
                return String.valueOf(charArray);
            }
        }
        return s;
    }
    
    public static String f(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            if (c(s.charAt(i))) {
                final char[] charArray = s.toCharArray();
                while (i < length) {
                    final char c = charArray[i];
                    if (c(c)) {
                        charArray[i] = (char)(c ^ ' ');
                    }
                    ++i;
                }
                return String.valueOf(charArray);
            }
        }
        return s;
    }
}
