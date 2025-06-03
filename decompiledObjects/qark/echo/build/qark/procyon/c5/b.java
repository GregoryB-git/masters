// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

public final class b extends n
{
    public static final char[] a;
    public static final char[] b;
    public static final char[] c;
    public static final char d;
    
    static {
        final char[] array;
        final char[] a2 = array = new char[4];
        array[0] = 'A';
        array[1] = 'B';
        array[2] = 'C';
        array[3] = 'D';
        a = a2;
        b = new char[] { 'T', 'N', '*', 'E' };
        c = new char[] { '/', ':', '+', '.' };
        d = a2[0];
    }
    
    @Override
    public boolean[] c(String string) {
        Label_0192: {
            StringBuilder sb;
            if (string.length() < 2) {
                sb = new StringBuilder();
            }
            else {
                final char upperCase = Character.toUpperCase(string.charAt(0));
                final char upperCase2 = Character.toUpperCase(string.charAt(string.length() - 1));
                final char[] a = c5.b.a;
                final boolean a2 = c5.a.a(a, upperCase);
                final boolean a3 = c5.a.a(a, upperCase2);
                final char[] b = c5.b.b;
                final boolean a4 = c5.a.a(b, upperCase);
                final boolean a5 = c5.a.a(b, upperCase2);
                if (a2) {
                    if (a3) {
                        break Label_0192;
                    }
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(string));
                }
                else if (a4) {
                    if (a5) {
                        break Label_0192;
                    }
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(string));
                }
                else {
                    if (a3 || a5) {
                        throw new IllegalArgumentException("Invalid start/end guards: ".concat(string));
                    }
                    sb = new StringBuilder();
                }
            }
            final char d = c5.b.d;
            sb.append(d);
            sb.append(string);
            sb.append(d);
            string = sb.toString();
        }
        int n = 20;
        for (int i = 1; i < string.length() - 1; ++i) {
            if (!Character.isDigit(string.charAt(i)) && string.charAt(i) != '-' && string.charAt(i) != '$') {
                if (!c5.a.a(c5.b.c, string.charAt(i))) {
                    final StringBuilder sb2 = new StringBuilder("Cannot encode : '");
                    sb2.append(string.charAt(i));
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
                n += 10;
            }
            else {
                n += 9;
            }
        }
        final boolean[] array = new boolean[n + (string.length() - 1)];
        int n2;
        int n6;
        for (int j = n2 = 0; j < string.length(); ++j, n2 = n6) {
            final char upperCase3 = Character.toUpperCase(string.charAt(j));
            char c = '\0';
            Label_0452: {
                if (j != 0) {
                    c = upperCase3;
                    if (j != string.length() - 1) {
                        break Label_0452;
                    }
                }
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 != 'T') {
                                c = upperCase3;
                            }
                            else {
                                c = 'A';
                            }
                        }
                        else {
                            c = 'B';
                        }
                    }
                    else {
                        c = 'D';
                    }
                }
                else {
                    c = 'C';
                }
            }
            int n3 = 0;
            int n4;
            while (true) {
                final char[] a6 = c5.a.a;
                if (n3 >= a6.length) {
                    n4 = 0;
                    break;
                }
                if (c == a6[n3]) {
                    n4 = c5.a.b[n3];
                    break;
                }
                ++n3;
            }
            int n5;
            int k = n5 = 0;
            boolean b2 = true;
            while (k < 7) {
                array[n2] = b2;
                ++n2;
                if ((n4 >> 6 - k & 0x1) != 0x0 && n5 != 1) {
                    ++n5;
                }
                else {
                    b2 ^= true;
                    ++k;
                    n5 = 0;
                }
            }
            n6 = n2;
            if (j < string.length() - 1) {
                array[n2] = false;
                n6 = n2 + 1;
            }
        }
        return array;
    }
}
