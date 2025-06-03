// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import java.util.Random;

public abstract class j
{
    public static final Random a;
    public static long b;
    public static final int[] c;
    
    static {
        a = new Random();
        j.b = 0L;
        c = new int[12];
    }
    
    public static final String a(final String str) {
        n.g(str);
        final Integer k = m.k(str);
        if (k != null) {
            if (k == Integer.MIN_VALUE) {
                return "[MIN_NAME]";
            }
            return String.valueOf(k - 1);
        }
        else {
            final StringBuilder sb = new StringBuilder(str);
            if (sb.charAt(sb.length() - 1) != '-') {
                sb.setCharAt(sb.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(sb.length() - 1)) - 1));
                sb.append(new String(new char[786 - sb.length()]).replace("\u0000", "z"));
                return sb.toString();
            }
            if (sb.length() == 1) {
                return String.valueOf(Integer.MAX_VALUE);
            }
            return sb.substring(0, sb.length() - 1);
        }
    }
    
    public static final String b(final String str) {
        n.g(str);
        final Integer k = m.k(str);
        if (k != null) {
            if (k == Integer.MAX_VALUE) {
                return String.valueOf('-');
            }
            return String.valueOf(k + 1);
        }
        else {
            final StringBuilder sb = new StringBuilder(str);
            if (sb.length() < 786) {
                sb.append('-');
                return sb.toString();
            }
            int start;
            for (start = sb.length() - 1; start >= 0 && sb.charAt(start) == 'z'; --start) {}
            if (start == -1) {
                return "[MAX_KEY]";
            }
            final char char1 = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(start)) + 1);
            final int end = start + 1;
            sb.replace(start, end, String.valueOf(char1));
            return sb.substring(0, end);
        }
    }
}
