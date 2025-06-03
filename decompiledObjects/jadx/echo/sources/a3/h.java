package a3;

import W2.m;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class h {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f8078a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i7 = 0; i7 < 10; i7++) {
                bArr[i7 + 48] = (byte) i7;
            }
            for (int i8 = 0; i8 < 26; i8++) {
                byte b7 = (byte) (i8 + 10);
                bArr[i8 + 65] = b7;
                bArr[i8 + 97] = b7;
            }
            f8078a = bArr;
        }

        public static int a(char c7) {
            if (c7 < 128) {
                return f8078a[c7];
            }
            return -1;
        }
    }

    public static int a(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 > j8 ? 1 : 0;
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static long c(long... jArr) {
        m.d(jArr.length > 0);
        long j7 = jArr[0];
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long j8 = jArr[i7];
            if (j8 > j7) {
                j7 = j8;
            }
        }
        return j7;
    }

    public static Long d(String str, int i7) {
        if (((String) m.j(str)).isEmpty()) {
            return null;
        }
        if (i7 < 2 || i7 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i7);
        }
        int i8 = str.charAt(0) == '-' ? 1 : 0;
        if (i8 == str.length()) {
            return null;
        }
        int i9 = i8 + 1;
        int a7 = a.a(str.charAt(i8));
        if (a7 < 0 || a7 >= i7) {
            return null;
        }
        long j7 = -a7;
        long j8 = i7;
        long j9 = Long.MIN_VALUE / j8;
        while (i9 < str.length()) {
            int i10 = i9 + 1;
            int a8 = a.a(str.charAt(i9));
            if (a8 < 0 || a8 >= i7 || j7 < j9) {
                return null;
            }
            long j10 = j7 * j8;
            long j11 = a8;
            if (j10 < j11 - Long.MIN_VALUE) {
                return null;
            }
            j7 = j10 - j11;
            i9 = i10;
        }
        if (i8 != 0) {
            return Long.valueOf(j7);
        }
        if (j7 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j7);
    }
}
