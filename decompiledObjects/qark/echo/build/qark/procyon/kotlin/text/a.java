// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

public class a extends CharsKt__CharJVMKt
{
    public static int c(final char c) {
        final int a = CharsKt__CharJVMKt.a(c, 10);
        if (a >= 0) {
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Char ");
        sb.append(c);
        sb.append(" is not a decimal digit");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final boolean d(final char ch, final char ch2, final boolean b) {
        final boolean b2 = true;
        if (ch == ch2) {
            return true;
        }
        if (!b) {
            return false;
        }
        final char upperCase = Character.toUpperCase(ch);
        final char upperCase2 = Character.toUpperCase(ch2);
        boolean b3 = b2;
        if (upperCase != upperCase2) {
            if (Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
                return true;
            }
            b3 = false;
        }
        return b3;
    }
}
