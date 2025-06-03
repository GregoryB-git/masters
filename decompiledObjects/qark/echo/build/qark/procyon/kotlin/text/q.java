// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

public class q extends p
{
    public static Integer f(final String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return g(s, 10);
    }
    
    public static final Integer g(final String s, final int n) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        CharsKt__CharJVMKt.checkRadix(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        final char char1 = s.charAt(0);
        final int d = Intrinsics.d(char1, 48);
        int n2 = -2147483647;
        int j;
        int n3;
        if (d < 0) {
            j = 1;
            if (length == 1) {
                return null;
            }
            if (char1 != '+') {
                if (char1 != '-') {
                    return null;
                }
                n2 = Integer.MIN_VALUE;
                n3 = 1;
            }
            else {
                n3 = 0;
            }
        }
        else {
            n3 = (j = 0);
        }
        int n4 = -59652323;
        while (j < length) {
            final int a = CharsKt__CharJVMKt.a(s.charAt(j), n);
            if (a < 0) {
                return null;
            }
            int n5;
            if (i < (n5 = n4) && (n4 != -59652323 || i < (n5 = n2 / n))) {
                return null;
            }
            final int n6 = i * n;
            if (n6 < n2 + a) {
                return null;
            }
            i = n6 - a;
            ++j;
            n4 = n5;
        }
        if (n3 != 0) {
            return i;
        }
        return -i;
    }
    
    public static Long h(final String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return i(s, 10);
    }
    
    public static final Long i(final String s, final int n) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        CharsKt__CharJVMKt.checkRadix(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        final char char1 = s.charAt(0);
        final int d = Intrinsics.d(char1, 48);
        long n2 = -9223372036854775807L;
        boolean b;
        if (d < 0) {
            b = true;
            if (length == 1) {
                return null;
            }
            if (char1 != '+') {
                if (char1 != '-') {
                    return null;
                }
                n2 = Long.MIN_VALUE;
                i = 1;
            }
            else {
                b = false;
                i = 1;
            }
        }
        else {
            b = false;
        }
        long l = 0L;
        long n3 = -256204778801521550L;
        while (i < length) {
            final int a = CharsKt__CharJVMKt.a(s.charAt(i), n);
            if (a < 0) {
                return null;
            }
            long n4 = n3;
            if (l < n3 && (n3 != -256204778801521550L || l < (n4 = n2 / n))) {
                return null;
            }
            final long n5 = l * n;
            final long n6 = a;
            if (n5 < n2 + n6) {
                return null;
            }
            l = n5 - n6;
            ++i;
            n3 = n4;
        }
        if (b) {
            return l;
        }
        return -l;
    }
}
