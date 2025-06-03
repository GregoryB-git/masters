package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class q extends p {
    public static Integer f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i7) {
        boolean z7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        int i11 = -2147483647;
        if (Intrinsics.d(charAt, 48) < 0) {
            i8 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z7 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i11 = Integer.MIN_VALUE;
                z7 = true;
            }
        } else {
            z7 = false;
            i8 = 0;
        }
        int i12 = -59652323;
        while (i8 < length) {
            int a7 = CharsKt__CharJVMKt.a(str.charAt(i8), i7);
            if (a7 < 0) {
                return null;
            }
            if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / i7))) || (i9 = i10 * i7) < i11 + a7) {
                return null;
            }
            i10 = i9 - a7;
            i8++;
        }
        return z7 ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }

    public static Long h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return i(str, 10);
    }

    public static final Long i(String str, int i7) {
        boolean z7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (Intrinsics.d(charAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z7 = false;
                i8 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j7 = Long.MIN_VALUE;
                i8 = 1;
            }
        } else {
            z7 = false;
        }
        long j8 = -256204778801521550L;
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i8 < length) {
            int a7 = CharsKt__CharJVMKt.a(str.charAt(i8), i7);
            if (a7 < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 == j8) {
                    j10 = j7 / i7;
                    if (j9 < j10) {
                    }
                }
                return null;
            }
            long j11 = j9 * i7;
            long j12 = a7;
            if (j11 < j7 + j12) {
                return null;
            }
            j9 = j11 - j12;
            i8++;
            j8 = -256204778801521550L;
        }
        return z7 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }
}
