package m3;

import java.util.Arrays;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1670a {
    public static byte[] a(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[bArr.length] = Byte.MIN_VALUE;
        return copyOf;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            byte b7 = (byte) ((bArr[i7] << 1) & 254);
            bArr2[i7] = b7;
            if (i7 < 15) {
                bArr2[i7] = (byte) (((byte) ((bArr[i7 + 1] >> 7) & 1)) | b7);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
