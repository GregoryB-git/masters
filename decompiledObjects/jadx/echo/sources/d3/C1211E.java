package d3;

import c3.AbstractC0846x;
import c3.InterfaceC0823a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.C1792A;

/* renamed from: d3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211E implements InterfaceC0823a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13151c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final C1792A f13152a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0823a f13153b;

    public C1211E(C1792A c1792a, InterfaceC0823a interfaceC0823a) {
        this.f13152a = c1792a;
        this.f13153b = interfaceC0823a;
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f7 = AbstractC0846x.j(this.f13152a).f();
        return c(this.f13153b.a(f7, f13151c), ((InterfaceC0823a) AbstractC0846x.f(this.f13152a.a0(), f7, InterfaceC0823a.class)).a(bArr, bArr2));
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 <= 0 || i7 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i7];
            wrap.get(bArr3, 0, i7);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((InterfaceC0823a) AbstractC0846x.f(this.f13152a.a0(), this.f13153b.b(bArr3, f13151c), InterfaceC0823a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
