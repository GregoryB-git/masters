package e3;

import java.nio.ByteBuffer;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1260c extends AbstractC1261d {
    public C1260c(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // e3.AbstractC1261d
    public int[] b(int[] iArr, int i7) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        AbstractC1258a.c(iArr2, this.f13946a);
        iArr2[12] = i7;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
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
        return 12;
    }
}
