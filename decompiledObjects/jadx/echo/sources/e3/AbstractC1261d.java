package e3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import q3.AbstractC1890f;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1261d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13947b;

    public AbstractC1261d(byte[] bArr, int i7) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f13946a = AbstractC1258a.e(bArr);
        this.f13947b = i7;
    }

    public ByteBuffer a(byte[] bArr, int i7) {
        int[] b7 = b(AbstractC1258a.e(bArr), i7);
        int[] iArr = (int[]) b7.clone();
        AbstractC1258a.d(iArr);
        for (int i8 = 0; i8 < b7.length; i8++) {
            b7[i8] = b7[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b7, 0, 16);
        return order;
    }

    public abstract int[] b(int[] iArr, int i7);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public abstract int e();

    public final void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int remaining = byteBuffer2.remaining();
        int i7 = remaining / 64;
        int i8 = i7 + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            ByteBuffer a7 = a(bArr, this.f13947b + i9);
            int i10 = 64;
            if (i9 == i7) {
                i10 = remaining % 64;
            }
            AbstractC1890f.c(byteBuffer, byteBuffer2, a7, i10);
        }
    }
}
