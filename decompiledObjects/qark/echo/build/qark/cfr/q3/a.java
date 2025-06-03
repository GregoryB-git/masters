/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package q3;

import h3.b;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.i;
import q3.l;
import q3.p;
import q3.r;

public final class a
implements l {
    public static final b.b d = b.b.p;
    public static final ThreadLocal e = new ThreadLocal(){

        public Cipher a() {
            try {
                Cipher cipher = (Cipher)i.b.a("AES/CTR/NoPadding");
                return cipher;
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException((Throwable)generalSecurityException);
            }
        }
    };
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public a(byte[] arrby, int n8) {
        if (d.c()) {
            int n9;
            r.a(arrby.length);
            this.a = new SecretKeySpec(arrby, "AES");
            this.c = n9 = ((Cipher)e.get()).getBlockSize();
            if (n8 >= 12 && n8 <= n9) {
                this.b = n8;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override
    public byte[] a(byte[] stringBuilder) {
        int n8 = stringBuilder.length;
        int n9 = this.b;
        if (n8 <= Integer.MAX_VALUE - n9) {
            byte[] arrby = new byte[stringBuilder.length + n9];
            byte[] arrby2 = p.c(n9);
            System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)0, (int)this.b);
            this.c((byte[])stringBuilder, 0, stringBuilder.length, arrby, this.b, arrby2, true);
            return arrby;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("plaintext length can not exceed ");
        stringBuilder.append(Integer.MAX_VALUE - this.b);
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    @Override
    public byte[] b(byte[] arrby) {
        int n8 = arrby.length;
        int n9 = this.b;
        if (n8 >= n9) {
            byte[] arrby2 = new byte[n9];
            System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)n9);
            n8 = arrby.length;
            n9 = this.b;
            byte[] arrby3 = new byte[n8 - n9];
            this.c(arrby, n9, arrby.length - n9, arrby3, 0, arrby2, false);
            return arrby3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(byte[] arrby, int n8, int n9, byte[] arrby2, int n10, byte[] ivParameterSpec, boolean bl) {
        Cipher cipher = (Cipher)e.get();
        byte[] arrby3 = new byte[this.c];
        System.arraycopy((Object)ivParameterSpec, (int)0, (Object)arrby3, (int)0, (int)this.b);
        ivParameterSpec = new IvParameterSpec(arrby3);
        int n11 = bl ? 1 : 2;
        cipher.init(n11, (Key)this.a, (AlgorithmParameterSpec)ivParameterSpec);
        if (cipher.doFinal(arrby, n8, n9, arrby2, n10) != n9) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

}

