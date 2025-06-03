// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import Y4.b;
import java.util.Map;
import V4.a;

public final class f extends n
{
    public static void f(final int n, final int[] array) {
        for (int i = 0; i < 9; ++i) {
            int n2 = 1;
            if ((1 << 8 - i & n) != 0x0) {
                n2 = 2;
            }
            array[i] = n2;
        }
    }
    
    public static String g(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            String str = null;
            Label_0319: {
                if (char1 != '\0') {
                    char c;
                    if ((c = char1) != ' ') {
                        if (char1 == '@') {
                            str = "%V";
                            break Label_0319;
                        }
                        if (char1 == '`') {
                            str = "%W";
                            break Label_0319;
                        }
                        c = char1;
                        if (char1 != '-' && (c = char1) != '.') {
                            int n = 0;
                            Label_0091: {
                                if (char1 <= '\u001a') {
                                    sb.append('$');
                                    n = char1 + '@';
                                }
                                else if (char1 < ' ') {
                                    sb.append('%');
                                    n = char1 + '&';
                                }
                                else if (char1 > ',' && char1 != '/' && char1 != ':') {
                                    if (char1 > '9') {
                                        if (char1 <= '?') {
                                            sb.append('%');
                                            n = char1 + '\u000b';
                                            break Label_0091;
                                        }
                                        if (char1 > 'Z') {
                                            if (char1 <= '_') {
                                                sb.append('%');
                                                n = char1 - '\u0010';
                                                break Label_0091;
                                            }
                                            if (char1 <= 'z') {
                                                sb.append('+');
                                                n = char1 - ' ';
                                                break Label_0091;
                                            }
                                            if (char1 <= '\u007f') {
                                                sb.append('%');
                                                n = char1 - '+';
                                                break Label_0091;
                                            }
                                            final StringBuilder sb2 = new StringBuilder("Requested content contains a non-encodable character: '");
                                            sb2.append(s.charAt(i));
                                            sb2.append("'");
                                            throw new IllegalArgumentException(sb2.toString());
                                        }
                                    }
                                    n = char1;
                                }
                                else {
                                    sb.append('/');
                                    n = char1 + ' ';
                                }
                            }
                            c = (char)n;
                        }
                    }
                    sb.append(c);
                    continue;
                }
                str = "%U";
            }
            sb.append(str);
        }
        return sb.toString();
    }
    
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        if (obj == a.q) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(obj)));
    }
    
    @Override
    public boolean[] c(final String s) {
        final int length = s.length();
        if (length <= 80) {
            int index = 0;
            int length2;
            String g;
            while (true) {
                length2 = length;
                g = s;
                if (index >= length) {
                    break;
                }
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(s.charAt(index)) < 0) {
                    g = g(s);
                    length2 = g.length();
                    if (length2 <= 80) {
                        break;
                    }
                    final StringBuilder sb = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
                    sb.append(length2);
                    sb.append(" (extended full ASCII mode)");
                    throw new IllegalArgumentException(sb.toString());
                }
                else {
                    ++index;
                }
            }
            final int[] array = new int[9];
            int n = length2 + 25;
            for (int i = 0; i < length2; ++i) {
                f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(g.charAt(i))], array);
                for (int j = 0; j < 9; ++j) {
                    n += array[j];
                }
            }
            final boolean[] array2 = new boolean[n];
            f(148, array);
            final int b = c5.n.b(array2, 0, array, true);
            final int[] array3 = { 1 };
            int n2 = b + c5.n.b(array2, b, array3, false);
            for (int k = 0; k < length2; ++k) {
                f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(g.charAt(k))], array);
                final int n3 = n2 + c5.n.b(array2, n2, array, true);
                n2 = n3 + c5.n.b(array2, n3, array3, false);
            }
            f(148, array);
            c5.n.b(array2, n2, array, true);
            return array2;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
