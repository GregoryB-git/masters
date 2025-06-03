package q3;

import c3.InterfaceC0823a;
import e3.C1259b;
import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887c implements InterfaceC0823a {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f18835b = AbstractC1336b.EnumC0213b.f14585p;

    /* renamed from: a, reason: collision with root package name */
    public final C1259b f18836a;

    public C1887c(byte[] bArr) {
        if (!f18835b.c()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f18836a = new C1259b(bArr, true);
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f18836a.b(AbstractC1900p.c(12), bArr, bArr2);
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f18836a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
