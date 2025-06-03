package e3;

import h3.AbstractC1336b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.AbstractC1901q;
import q3.AbstractC1902r;
import q3.C1893i;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259b {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f13942c = AbstractC1336b.EnumC0213b.f14585p;

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13943d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f13944a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13945b;

    /* renamed from: e3.b$a */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) C1893i.f18864b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    public C1259b(byte[] bArr, boolean z7) {
        if (!f13942c.c()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1902r.a(bArr.length);
        this.f13944a = new SecretKeySpec(bArr, "AES");
        this.f13945b = z7;
    }

    public static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec d(byte[] bArr, int i7, int i8) {
        return (!AbstractC1901q.b() || AbstractC1901q.a() > 19) ? new GCMParameterSpec(128, bArr, i7, i8) : new IvParameterSpec(bArr, i7, i8);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z7 = this.f13945b;
        if (bArr2.length < (z7 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z7 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec c7 = c(bArr);
        ThreadLocal threadLocal = f13943d;
        ((Cipher) threadLocal.get()).init(2, this.f13944a, c7);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z8 = this.f13945b;
        return ((Cipher) threadLocal.get()).doFinal(bArr2, z8 ? 12 : 0, z8 ? bArr2.length - 12 : bArr2.length);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z7 = this.f13945b;
        int length = bArr2.length;
        byte[] bArr4 = new byte[z7 ? length + 28 : length + 16];
        if (z7) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec c7 = c(bArr);
        ThreadLocal threadLocal = f13943d;
        ((Cipher) threadLocal.get()).init(1, this.f13944a, c7);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, bArr2.length, bArr4, this.f13945b ? 12 : 0);
        if (doFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
    }
}
