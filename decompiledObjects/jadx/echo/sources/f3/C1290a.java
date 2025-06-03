package f3;

import c3.InterfaceC0823a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.AbstractC1900p;
import q3.AbstractC1901q;
import q3.AbstractC1902r;
import q3.C1893i;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290a implements InterfaceC0823a {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f14237b = new C0207a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f14238a;

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    public class C0207a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) C1893i.f18864b.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    public C1290a(byte[] bArr) {
        AbstractC1902r.a(bArr.length);
        this.f14238a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec d(byte[] bArr, int i7, int i8) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i7, i8);
        } catch (ClassNotFoundException unused) {
            if (AbstractC1901q.b()) {
                return new IvParameterSpec(bArr, i7, i8);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] c7 = AbstractC1900p.c(12);
        System.arraycopy(c7, 0, bArr3, 0, 12);
        AlgorithmParameterSpec c8 = c(c7);
        ThreadLocal threadLocal = f14237b;
        ((Cipher) threadLocal.get()).init(1, this.f14238a, c8);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec d7 = d(bArr, 0, 12);
        ThreadLocal threadLocal = f14237b;
        ((Cipher) threadLocal.get()).init(2, this.f14238a, d7);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
