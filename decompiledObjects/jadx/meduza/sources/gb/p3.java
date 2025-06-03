package gb;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f6652a = Logger.getLogger(p3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6653b = "-bin".getBytes(n7.d.f11282a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }
}
