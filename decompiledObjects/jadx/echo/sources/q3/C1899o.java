package q3;

import c3.InterfaceC0842t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.InterfaceC1755a;

/* renamed from: q3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1899o implements InterfaceC0842t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1755a f18885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18886b;

    public C1899o(InterfaceC1755a interfaceC1755a, int i7) {
        this.f18885a = interfaceC1755a;
        this.f18886b = i7;
        if (i7 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC1755a.a(new byte[0], i7);
    }

    @Override // c3.InterfaceC0842t
    public void a(byte[] bArr, byte[] bArr2) {
        if (!AbstractC1890f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // c3.InterfaceC0842t
    public byte[] b(byte[] bArr) {
        return this.f18885a.a(bArr, this.f18886b);
    }
}
