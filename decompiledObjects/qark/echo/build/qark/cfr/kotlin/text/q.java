/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.String
 */
package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.p;

public class q
extends p {
    public static Integer f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return q.g(string2, 10);
    }

    public static final Integer g(String string2, int n8) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        CharsKt__CharJVMKt.checkRadix(n8);
        int n9 = string2.length();
        if (n9 == 0) {
            return null;
        }
        int n10 = 0;
        char c8 = string2.charAt(0);
        int n11 = Intrinsics.d(c8, 48);
        int n12 = -2147483647;
        if (n11 < 0) {
            n11 = 1;
            if (n9 == 1) {
                return null;
            }
            if (c8 != '+') {
                if (c8 != '-') {
                    return null;
                }
                n12 = Integer.MIN_VALUE;
                c8 = '\u0001';
            } else {
                c8 = '\u0000';
            }
        } else {
            c8 = '\u0000';
            n11 = c8;
        }
        int n13 = -59652323;
        while (n11 < n9) {
            int n14;
            int n15;
            block14 : {
                block15 : {
                    n15 = CharsKt__CharJVMKt.a(string2.charAt(n11), n8);
                    if (n15 < 0) {
                        return null;
                    }
                    n14 = n13;
                    if (n10 >= n13) break block14;
                    if (n13 != -59652323) break block15;
                    n14 = n13 = n12 / n8;
                    if (n10 >= n13) break block14;
                }
                return null;
            }
            if ((n10 *= n8) < n12 + n15) {
                return null;
            }
            n10 -= n15;
            ++n11;
            n13 = n14;
        }
        if (c8 != '\u0000') {
            return n10;
        }
        return - n10;
    }

    public static Long h(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return q.i(string2, 10);
    }

    public static final Long i(String string2, int n8) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        CharsKt__CharJVMKt.checkRadix(n8);
        int n9 = string2.length();
        if (n9 == 0) {
            return null;
        }
        int n10 = 0;
        int n11 = string2.charAt(0);
        int n12 = Intrinsics.d(n11, 48);
        long l8 = -9223372036854775807L;
        if (n12 < 0) {
            n12 = 1;
            if (n9 == 1) {
                return null;
            }
            if (n11 != 43) {
                if (n11 != 45) {
                    return null;
                }
                l8 = Long.MIN_VALUE;
                n10 = 1;
            } else {
                n12 = 0;
                n10 = 1;
            }
        } else {
            n12 = 0;
        }
        long l9 = 0L;
        long l10 = -256204778801521550L;
        while (n10 < n9) {
            long l11;
            block14 : {
                block15 : {
                    n11 = CharsKt__CharJVMKt.a(string2.charAt(n10), n8);
                    if (n11 < 0) {
                        return null;
                    }
                    l11 = l10;
                    if (l9 >= l10) break block14;
                    if (l10 != -256204778801521550L) break block15;
                    l11 = l10 = l8 / (long)n8;
                    if (l9 >= l10) break block14;
                }
                return null;
            }
            if ((l9 *= (long)n8) < l8 + (l10 = (long)n11)) {
                return null;
            }
            l9 -= l10;
            ++n10;
            l10 = l11;
        }
        if (n12 != 0) {
            return l9;
        }
        return - l9;
    }
}

