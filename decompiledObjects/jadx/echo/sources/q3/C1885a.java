package q3;

import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885a implements InterfaceC1896l {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f18823d = AbstractC1336b.EnumC0213b.f14585p;

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f18824e = new C0253a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f18825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18827c;

    /* renamed from: q3.a$a, reason: collision with other inner class name */
    public class C0253a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) C1893i.f18864b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    public C1885a(byte[] bArr, int i7) {
        if (!f18823d.c()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1902r.a(bArr.length);
        this.f18825a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f18824e.get()).getBlockSize();
        this.f18827c = blockSize;
        if (i7 < 12 || i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f18826b = i7;
    }

    @Override // q3.InterfaceC1896l
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i7 = this.f18826b;
        if (length > Integer.MAX_VALUE - i7) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f18826b));
        }
        byte[] bArr2 = new byte[bArr.length + i7];
        byte[] c7 = AbstractC1900p.c(i7);
        System.arraycopy(c7, 0, bArr2, 0, this.f18826b);
        c(bArr, 0, bArr.length, bArr2, this.f18826b, c7, true);
        return bArr2;
    }

    @Override // q3.InterfaceC1896l
    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i7 = this.f18826b;
        if (length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        int length2 = bArr.length;
        int i8 = this.f18826b;
        byte[] bArr3 = new byte[length2 - i8];
        c(bArr, i8, bArr.length - i8, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, byte[] bArr3, boolean z7) {
        Cipher cipher = (Cipher) f18824e.get();
        byte[] bArr4 = new byte[this.f18827c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f18826b);
        cipher.init(z7 ? 1 : 2, this.f18825a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i7, i8, bArr2, i9) != i8) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
