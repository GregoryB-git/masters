package e3;

import h3.AbstractC1336b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* renamed from: e3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1263f {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f13948c = AbstractC1336b.EnumC0213b.f14584o;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1261d f13949a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1261d f13950b;

    public AbstractC1263f(byte[] bArr) {
        if (!f13948c.c()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f13949a = e(bArr, 1);
        this.f13950b = e(bArr, 0);
    }

    public static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i7 = remaining % 16;
        int i8 = (i7 == 0 ? remaining : (remaining + 16) - i7) + length;
        ByteBuffer order = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i8);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            i.f(c(bArr), d(bArr2, byteBuffer), bArr3);
            byteBuffer.position(position);
            return this.f13949a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e7) {
            throw new AEADBadTagException(e7.toString());
        }
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.f13949a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] a7 = i.a(c(bArr), d(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(a7);
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f13950b.a(bArr, 0).get(bArr2);
        return bArr2;
    }

    public abstract AbstractC1261d e(byte[] bArr, int i7);
}
