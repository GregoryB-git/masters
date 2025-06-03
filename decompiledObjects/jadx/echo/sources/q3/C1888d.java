package q3;

import c3.InterfaceC0827e;
import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m3.AbstractC1670a;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888d implements InterfaceC0827e {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f18837c = AbstractC1336b.EnumC0213b.f14584o;

    /* renamed from: d, reason: collision with root package name */
    public static final Collection f18838d = Arrays.asList(64);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f18839e = new byte[16];

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f18840f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final C1897m f18841a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18842b;

    public C1888d(byte[] bArr) {
        if (!f18837c.c()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f18838d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f18842b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f18841a = new C1897m(copyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    @Override // c3.InterfaceC0827e
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) C1893i.f18864b.a("AES/CTR/NoPadding");
        byte[] c7 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c7.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f18842b, "AES"), new IvParameterSpec(bArr3));
        return AbstractC1890f.a(c7, cipher.doFinal(bArr));
    }

    @Override // c3.InterfaceC0827e
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) C1893i.f18864b.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f18842b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && AbstractC1901q.b()) {
            doFinal = new byte[0];
        }
        if (AbstractC1890f.b(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f18841a.a(f18840f, 16);
        }
        byte[] a7 = this.f18841a.a(f18839e, 16);
        for (int i7 = 0; i7 < bArr.length - 1; i7++) {
            byte[] bArr2 = bArr[i7];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a7 = AbstractC1890f.e(AbstractC1670a.b(a7), this.f18841a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f18841a.a(bArr3.length >= 16 ? AbstractC1890f.f(bArr3, a7) : AbstractC1890f.e(AbstractC1670a.a(bArr3), AbstractC1670a.b(a7)), 16);
    }
}
