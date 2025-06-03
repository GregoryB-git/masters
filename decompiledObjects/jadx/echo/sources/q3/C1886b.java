package q3;

import c3.InterfaceC0823a;
import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1886b implements InterfaceC0823a {

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f18828e = AbstractC1336b.EnumC0213b.f14584o;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f18829f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f18830g = new C0254b();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f18831a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18832b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f18833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18834d;

    /* renamed from: q3.b$a */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) C1893i.f18864b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    /* renamed from: q3.b$b, reason: collision with other inner class name */
    public class C0254b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) C1893i.f18864b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    public C1886b(byte[] bArr, int i7) {
        if (!f18828e.c()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f18834d = i7;
        AbstractC1902r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f18833c = secretKeySpec;
        Cipher cipher = (Cipher) f18829f.get();
        cipher.init(1, secretKeySpec);
        byte[] c7 = c(cipher.doFinal(new byte[16]));
        this.f18831a = c7;
        this.f18832b = c(c7);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (((bArr[i7] << 1) ^ ((bArr[i8] & 255) >>> 7)) & 255);
            i7 = i8;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr3[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
        return bArr3;
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f18834d;
        if (length > 2147483631 - i7) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i7 + 16];
        byte[] c7 = AbstractC1900p.c(i7);
        System.arraycopy(c7, 0, bArr3, 0, this.f18834d);
        Cipher cipher = (Cipher) f18829f.get();
        cipher.init(1, this.f18833c);
        byte[] d7 = d(cipher, 0, c7, 0, c7.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d8 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f18830g.get();
        cipher2.init(1, this.f18833c, new IvParameterSpec(d7));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f18834d);
        byte[] d9 = d(cipher, 2, bArr3, this.f18834d, bArr.length);
        int length2 = bArr.length + this.f18834d;
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[length2 + i8] = (byte) ((d8[i8] ^ d7[i8]) ^ d9[i8]);
        }
        return bArr3;
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f18834d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f18829f.get();
        cipher.init(1, this.f18833c);
        byte[] d7 = d(cipher, 0, bArr, 0, this.f18834d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] d8 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] d9 = d(cipher, 2, bArr, this.f18834d, length);
        int length2 = bArr.length - 16;
        byte b7 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            b7 = (byte) (b7 | (((bArr[length2 + i7] ^ d8[i7]) ^ d7[i7]) ^ d9[i7]));
        }
        if (b7 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f18830g.get();
        cipher2.init(1, this.f18833c, new IvParameterSpec(d7));
        return cipher2.doFinal(bArr, this.f18834d, length);
    }

    public final byte[] d(Cipher cipher, int i7, byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i7;
        if (i9 == 0) {
            return cipher.doFinal(f(bArr2, this.f18831a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i10 = 0;
        while (i9 - i10 > 16) {
            for (int i11 = 0; i11 < 16; i11++) {
                doFinal[i11] = (byte) (doFinal[i11] ^ bArr[(i8 + i10) + i11]);
            }
            doFinal = cipher.doFinal(doFinal);
            i10 += 16;
        }
        return cipher.doFinal(f(doFinal, e(Arrays.copyOfRange(bArr, i10 + i8, i8 + i9))));
    }

    public final byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.f18831a);
        }
        byte[] copyOf = Arrays.copyOf(this.f18832b, 16);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            copyOf[i7] = (byte) (copyOf[i7] ^ bArr[i7]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }
}
