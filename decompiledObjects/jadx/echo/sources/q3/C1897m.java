package q3;

import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import m3.AbstractC1670a;
import o3.InterfaceC1755a;

/* renamed from: q3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1897m implements InterfaceC1755a {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f18875d = AbstractC1336b.EnumC0213b.f14584o;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f18876a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f18877b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f18878c;

    public C1897m(byte[] bArr) {
        AbstractC1902r.a(bArr.length);
        this.f18876a = new SecretKeySpec(bArr, "AES");
        b();
    }

    public static Cipher c() {
        if (f18875d.c()) {
            return (Cipher) C1893i.f18864b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // o3.InterfaceC1755a
    public byte[] a(byte[] bArr, int i7) {
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher c7 = c();
        c7.init(1, this.f18876a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] d7 = max * 16 == bArr.length ? AbstractC1890f.d(bArr, (max - 1) * 16, this.f18877b, 0, 16) : AbstractC1890f.e(AbstractC1670a.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f18878c);
        byte[] bArr2 = new byte[16];
        for (int i8 = 0; i8 < max - 1; i8++) {
            bArr2 = c7.doFinal(AbstractC1890f.d(bArr2, 0, bArr, i8 * 16, 16));
        }
        return Arrays.copyOf(c7.doFinal(AbstractC1890f.e(d7, bArr2)), i7);
    }

    public final void b() {
        Cipher c7 = c();
        c7.init(1, this.f18876a);
        byte[] b7 = AbstractC1670a.b(c7.doFinal(new byte[16]));
        this.f18877b = b7;
        this.f18878c = AbstractC1670a.b(b7);
    }
}
