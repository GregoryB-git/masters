/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Arrays
 *  javax.crypto.AEADBadTagException
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package q3;

import c3.a;
import h3.b;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.i;
import q3.p;
import q3.r;

public final class b
implements a {
    public static final b.b e = b.b.o;
    public static final ThreadLocal f = new ThreadLocal(){

        public Cipher a() {
            try {
                Cipher cipher = (Cipher)i.b.a("AES/ECB/NOPADDING");
                return cipher;
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException((Throwable)generalSecurityException);
            }
        }
    };
    public static final ThreadLocal g = new ThreadLocal(){

        public Cipher a() {
            try {
                Cipher cipher = (Cipher)i.b.a("AES/CTR/NOPADDING");
                return cipher;
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException((Throwable)generalSecurityException);
            }
        }
    };
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;

    public b(byte[] arrby, int n8) {
        if (e.c()) {
            if (n8 != 12 && n8 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.d = n8;
            r.a(arrby.length);
            arrby = new byte[](arrby, "AES");
            this.c = arrby;
            Cipher cipher = (Cipher)f.get();
            cipher.init(1, (Key)arrby);
            arrby = b.c(cipher.doFinal(new byte[16]));
            this.a = arrby;
            this.b = b.c(arrby);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static byte[] c(byte[] arrby) {
        byte[] arrby2 = new byte[16];
        int n8 = 0;
        while (n8 < 15) {
            byte by = arrby[n8];
            int n9 = n8 + 1;
            arrby2[n8] = (byte)((by << 1 ^ (arrby[n9] & 255) >>> 7) & 255);
            n8 = n9;
        }
        n8 = arrby[15];
        arrby2[15] = (byte)(arrby[0] >> 7 & 135 ^ n8 << 1);
        return arrby2;
    }

    public static byte[] f(byte[] arrby, byte[] arrby2) {
        int n8 = arrby.length;
        byte[] arrby3 = new byte[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrby3[i8] = (byte)(arrby[i8] ^ arrby2[i8]);
        }
        return arrby3;
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        int n8 = arrby.length;
        int n9 = this.d;
        if (n8 <= 2147483631 - n9) {
            byte[] arrby3 = new byte[arrby.length + n9 + 16];
            byte[] arrby4 = p.c(n9);
            n9 = this.d;
            n8 = 0;
            System.arraycopy((Object)arrby4, (int)0, (Object)arrby3, (int)0, (int)n9);
            byte[] arrby5 = (byte[])f.get();
            arrby5.init(1, (Key)this.c);
            arrby4 = this.d((Cipher)arrby5, 0, arrby4, 0, arrby4.length);
            if (arrby2 == null) {
                arrby2 = new byte[]{};
            }
            arrby2 = this.d((Cipher)arrby5, 1, arrby2, 0, arrby2.length);
            Cipher cipher = (Cipher)g.get();
            cipher.init(1, (Key)this.c, (AlgorithmParameterSpec)new IvParameterSpec(arrby4));
            cipher.doFinal(arrby, 0, arrby.length, arrby3, this.d);
            arrby5 = this.d((Cipher)arrby5, 2, arrby3, this.d, arrby.length);
            n9 = arrby.length;
            int n10 = this.d;
            while (n8 < 16) {
                arrby3[n9 + n10 + n8] = (byte)(arrby2[n8] ^ arrby4[n8] ^ arrby5[n8]);
                ++n8;
            }
            return arrby3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override
    public byte[] b(byte[] arrby, byte[] cipher) {
        int n8 = arrby.length - this.d - 16;
        if (n8 >= 0) {
            Cipher cipher2 = (Cipher)f.get();
            cipher2.init(1, (Key)this.c);
            byte[] arrby2 = this.d(cipher2, 0, arrby, 0, this.d);
            int n9 = 0;
            Cipher cipher3 = cipher;
            if (cipher == null) {
                cipher3 = new byte[]{};
            }
            cipher = this.d(cipher2, 1, (byte[])cipher3, 0, cipher3.length);
            cipher3 = this.d(cipher2, 2, arrby, this.d, n8);
            int n10 = arrby.length;
            int n11 = 0;
            while (n9 < 16) {
                n11 = (byte)(n11 | arrby[n10 - 16 + n9] ^ cipher[n9] ^ arrby2[n9] ^ cipher3[n9]);
                ++n9;
            }
            if (n11 == 0) {
                cipher = (Cipher)g.get();
                cipher.init(1, (Key)this.c, (AlgorithmParameterSpec)new IvParameterSpec(arrby2));
                return cipher.doFinal(arrby, this.d, n8);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int n8, byte[] arrby, int n9, int n10) {
        byte[] arrby2 = new byte[16];
        arrby2[15] = (byte)n8;
        if (n10 == 0) {
            return cipher.doFinal(b.f(arrby2, this.a));
        }
        arrby2 = cipher.doFinal(arrby2);
        n8 = 0;
        while (n10 - n8 > 16) {
            for (int i8 = 0; i8 < 16; ++i8) {
                arrby2[i8] = (byte)(arrby2[i8] ^ arrby[n9 + n8 + i8]);
            }
            arrby2 = cipher.doFinal(arrby2);
            n8 += 16;
        }
        return cipher.doFinal(b.f(arrby2, this.e(Arrays.copyOfRange((byte[])arrby, (int)(n8 + n9), (int)(n9 + n10)))));
    }

    public final byte[] e(byte[] arrby) {
        if (arrby.length == 16) {
            return b.f(arrby, this.a);
        }
        byte[] arrby2 = Arrays.copyOf((byte[])this.b, (int)16);
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            arrby2[i8] = (byte)(arrby2[i8] ^ arrby[i8]);
        }
        arrby2[arrby.length] = (byte)(arrby2[arrby.length] ^ 128);
        return arrby2;
    }

}

