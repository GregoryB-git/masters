/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.F5;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.I5;

public abstract class E5 {
    public static final F5 a;

    static {
        if (D5.w()) {
            D5.z();
        }
        a = new I5();
    }

    public static int a(CharSequence charSequence) {
        int n8;
        int n9;
        block10 : {
            int n10;
            n9 = charSequence.length();
            int n11 = 0;
            for (n10 = 0; n10 < n9 && charSequence.charAt(n10) < ''; ++n10) {
            }
            int n12 = n9;
            do {
                n8 = n12;
                if (n10 >= n9) break block10;
                n8 = charSequence.charAt(n10);
                if (n8 >= 2048) break;
                n12 += 127 - n8 >>> 31;
                ++n10;
            } while (true);
            int n13 = charSequence.length();
            n8 = n11;
            while (n10 < n13) {
                char c8 = charSequence.charAt(n10);
                if (c8 < '\u0800') {
                    n8 += 127 - c8 >>> 31;
                    n11 = n10;
                } else {
                    int n14;
                    n8 = n14 = n8 + 2;
                    n11 = n10;
                    if ('\ud800' <= c8) {
                        n8 = n14;
                        n11 = n10;
                        if (c8 <= '\udfff') {
                            if (Character.codePointAt((CharSequence)charSequence, (int)n10) >= 65536) {
                                n11 = n10 + 1;
                                n8 = n14;
                            } else {
                                throw new H5(n10, n13);
                            }
                        }
                    }
                }
                n10 = n11 + 1;
            }
            n8 = n12 + n8;
        }
        if (n8 >= n9) {
            return n8;
        }
        long l8 = n8;
        charSequence = new StringBuilder("UTF-8 length does not fit in int: ");
        charSequence.append(l8 + 0x100000000L);
        throw new IllegalArgumentException(charSequence.toString());
    }

    public static int b(CharSequence charSequence, byte[] arrby, int n8, int n9) {
        return a.b(charSequence, arrby, n8, n9);
    }

    public static /* synthetic */ int c(byte[] arrby, int n8, int n9) {
        byte by = arrby[n8 - 1];
        if ((n9 -= n8) != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    n9 = arrby[n8];
                    n8 = arrby[n8 + 1];
                    if (by <= -12 && n9 <= -65) {
                        if (n8 > -65) {
                            return -1;
                        }
                        return n8 << 16 ^ (n9 << 8 ^ by);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            n8 = arrby[n8];
            if (by <= -12) {
                if (n8 > -65) {
                    return -1;
                }
                return n8 << 8 ^ by;
            }
            return -1;
        }
        if (by > -12) {
            return -1;
        }
        return by;
    }

    public static boolean d(byte[] arrby) {
        return a.d(arrby, 0, arrby.length);
    }

    public static String e(byte[] arrby, int n8, int n9) {
        return a.c(arrby, n8, n9);
    }

    public static boolean f(byte[] arrby, int n8, int n9) {
        return a.d(arrby, n8, n9);
    }
}

