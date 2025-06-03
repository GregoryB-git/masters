package q3;

import c3.InterfaceC0823a;
import c3.InterfaceC0842t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: q3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892h implements InterfaceC0823a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1896l f18861a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0842t f18862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18863c;

    public C1892h(InterfaceC1896l interfaceC1896l, InterfaceC0842t interfaceC0842t, int i7) {
        this.f18861a = interfaceC1896l;
        this.f18862b = interfaceC0842t;
        this.f18863c = i7;
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a7 = this.f18861a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC1890f.a(a7, this.f18862b.b(AbstractC1890f.a(bArr2, a7, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f18863c;
        if (length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i7);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f18863c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f18862b.a(copyOfRange2, AbstractC1890f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f18861a.b(copyOfRange);
    }
}
