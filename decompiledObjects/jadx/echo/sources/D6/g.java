package D6;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1508a = Charset.forName("UTF-8");

    public static boolean a(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9)));
        }
    }
}
