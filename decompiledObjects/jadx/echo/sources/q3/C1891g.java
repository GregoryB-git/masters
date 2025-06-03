package q3;

import c3.InterfaceC0823a;
import e3.C1262e;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: q3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1891g implements InterfaceC0823a {

    /* renamed from: a, reason: collision with root package name */
    public final C1262e f18860a;

    public C1891g(byte[] bArr) {
        this.f18860a = new C1262e(bArr);
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] c7 = AbstractC1900p.c(12);
        allocate.put(c7);
        this.f18860a.b(allocate, c7, bArr, bArr2);
        return allocate.array();
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f18860a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
