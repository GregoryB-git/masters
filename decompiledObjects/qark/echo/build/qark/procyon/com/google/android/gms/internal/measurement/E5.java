// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class E5
{
    public static final F5 a;
    
    static {
        if (D5.w()) {
            D5.z();
        }
        a = new I5();
    }
    
    public static int a(final CharSequence seq) {
        final int length = seq.length();
        final int n = 0;
        int i;
        for (i = 0; i < length && seq.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (i >= length) {
                break;
            }
            final char char1 = seq.charAt(i);
            if (char1 >= '\u0800') {
                final int length2 = seq.length();
                int n4 = n;
                while (i < length2) {
                    final char char2 = seq.charAt(i);
                    int n5;
                    if (char2 < '\u0800') {
                        n4 += '\u007f' - char2 >>> 31;
                        n5 = i;
                    }
                    else {
                        final int n6 = n4 += 2;
                        n5 = i;
                        if ('\ud800' <= char2) {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(seq, i) < 65536) {
                                    throw new H5(i, length2);
                                }
                                n5 = i + 1;
                                n4 = n6;
                            }
                        }
                    }
                    i = n5 + 1;
                }
                n3 = n2 + n4;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n3 >= length) {
            return n3;
        }
        final long n7 = n3;
        final StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(n7 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int b(final CharSequence charSequence, final byte[] array, final int n, final int n2) {
        return E5.a.b(charSequence, array, n, n2);
    }
    
    public static boolean d(final byte[] array) {
        return E5.a.d(array, 0, array.length);
    }
    
    public static String e(final byte[] array, final int n, final int n2) {
        return E5.a.c(array, n, n2);
    }
    
    public static boolean f(final byte[] array, final int n, final int n2) {
        return E5.a.d(array, n, n2);
    }
}
