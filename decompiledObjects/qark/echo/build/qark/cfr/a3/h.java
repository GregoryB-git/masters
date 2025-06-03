/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package a3;

import W2.m;
import java.util.Arrays;

public abstract class h {
    public static int a(long l8, long l9) {
        long l10 = l8 LCMP l9;
        if (l10 < 0) {
            return -1;
        }
        if (l10 > 0) {
            return 1;
        }
        return 0;
    }

    public static int b(long l8) {
        return (int)(l8 ^ l8 >>> 32);
    }

    public static /* varargs */ long c(long ... arrl) {
        int n8 = arrl.length;
        boolean bl = n8 > 0;
        m.d(bl);
        long l8 = arrl[0];
        for (int i8 = 1; i8 < arrl.length; ++i8) {
            long l9 = arrl[i8];
            long l10 = l8;
            if (l9 > l8) {
                l10 = l9;
            }
            l8 = l10;
        }
        return l8;
    }

    public static Long d(String string2, int n8) {
        if (((String)m.j(string2)).isEmpty()) {
            return null;
        }
        if (n8 >= 2 && n8 <= 36) {
            int n9 = 0;
            if (string2.charAt(0) == '-') {
                n9 = 1;
            }
            if (n9 == string2.length()) {
                return null;
            }
            int n10 = a.a(string2.charAt(n9));
            if (n10 >= 0) {
                if (n10 >= n8) {
                    return null;
                }
                long l8 = - n10;
                long l9 = n8;
                long l10 = Long.MIN_VALUE / l9;
                for (int i8 = n9 + 1; i8 < string2.length(); ++i8) {
                    n10 = a.a(string2.charAt(i8));
                    if (n10 >= 0 && n10 < n8) {
                        if (l8 < l10) {
                            return null;
                        }
                        long l11 = n10;
                        if ((l8 *= l9) < l11 - Long.MIN_VALUE) {
                            return null;
                        }
                        l8 -= l11;
                        continue;
                    }
                    return null;
                }
                if (n9 != 0) {
                    return l8;
                }
                if (l8 == Long.MIN_VALUE) {
                    return null;
                }
                return - l8;
            }
            return null;
        }
        string2 = new StringBuilder();
        string2.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
        string2.append(n8);
        throw new IllegalArgumentException(string2.toString());
    }

    public static final abstract class a {
        public static final byte[] a;

        static {
            byte[] arrby = new byte[128];
            Arrays.fill((byte[])arrby, (byte)-1);
            int n8 = 0;
            int n9 = 0;
            do {
                if (n9 >= 10) break;
                arrby[n9 + 48] = (byte)n9;
                ++n9;
            } while (true);
            for (int i8 = n8; i8 < 26; ++i8) {
                byte by;
                arrby[i8 + 65] = by = (byte)(i8 + 10);
                arrby[i8 + 97] = by;
            }
            a = arrby;
        }

        public static int a(char c8) {
            if (c8 < '') {
                return a[c8];
            }
            return -1;
        }
    }

}

