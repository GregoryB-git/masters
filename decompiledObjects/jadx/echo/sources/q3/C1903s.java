package q3;

import c3.InterfaceC0823a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: q3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903s implements InterfaceC0823a {

    /* renamed from: a, reason: collision with root package name */
    public final e3.h f18890a;

    public C1903s(byte[] bArr) {
        this.f18890a = new e3.h(bArr);
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] c7 = AbstractC1900p.c(24);
        allocate.put(c7);
        this.f18890a.b(allocate, c7, bArr, bArr2);
        return allocate.array();
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f18890a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
