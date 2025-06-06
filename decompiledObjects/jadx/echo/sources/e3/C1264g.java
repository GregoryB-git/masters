package e3;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: e3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1264g extends AbstractC1261d {
    public C1264g(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    public static int[] g(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC1258a.c(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        AbstractC1258a.d(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // e3.AbstractC1261d
    public int[] b(int[] iArr, int i7) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        AbstractC1258a.c(iArr2, g(this.f13946a, iArr));
        iArr2[12] = i7;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // e3.AbstractC1261d
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // e3.AbstractC1261d
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // e3.AbstractC1261d
    public int e() {
        return 24;
    }
}
