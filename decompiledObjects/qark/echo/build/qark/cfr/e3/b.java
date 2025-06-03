/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.SecretKey
 *  javax.crypto.spec.GCMParameterSpec
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package e3;

import h3.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.i;
import q3.q;
import q3.r;

public final class b {
    public static final b.b c = b.b.p;
    public static final ThreadLocal d = new ThreadLocal(){

        public Cipher a() {
            try {
                Cipher cipher = (Cipher)i.b.a("AES/GCM/NoPadding");
                return cipher;
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException((Throwable)generalSecurityException);
            }
        }
    };
    public final SecretKey a;
    public final boolean b;

    public b(byte[] arrby, boolean bl) {
        if (c.c()) {
            r.a(arrby.length);
            this.a = new SecretKeySpec(arrby, "AES");
            this.b = bl;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec c(byte[] arrby) {
        return b.d(arrby, 0, arrby.length);
    }

    public static AlgorithmParameterSpec d(byte[] arrby, int n8, int n9) {
        if (q.b() && q.a() <= 19) {
            return new IvParameterSpec(arrby, n8, n9);
        }
        return new GCMParameterSpec(128, arrby, n8, n9);
    }

    public byte[] a(byte[] algorithmParameterSpec, byte[] arrby, byte[] arrby2) {
        if (algorithmParameterSpec.length == 12) {
            boolean bl = this.b;
            int n8 = bl ? 28 : 16;
            if (arrby.length >= n8) {
                n8 = 0;
                if (bl && !ByteBuffer.wrap((byte[])algorithmParameterSpec).equals((Object)ByteBuffer.wrap((byte[])arrby, (int)0, (int)12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                algorithmParameterSpec = b.c((byte[])algorithmParameterSpec);
                ThreadLocal threadLocal = d;
                ((Cipher)threadLocal.get()).init(2, (Key)this.a, algorithmParameterSpec);
                if (arrby2 != null && arrby2.length != 0) {
                    ((Cipher)threadLocal.get()).updateAAD(arrby2);
                }
                if (bl = this.b) {
                    n8 = 12;
                }
                int n9 = bl ? arrby.length - 12 : arrby.length;
                return ((Cipher)threadLocal.get()).doFinal(arrby, n8, n9);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public byte[] b(byte[] algorithmParameterSpec, byte[] arrby, byte[] arrby2) {
        if (algorithmParameterSpec.length == 12) {
            if (arrby.length <= 2147483619) {
                boolean bl = this.b;
                int n8 = arrby.length;
                n8 = bl ? (n8 += 28) : (n8 += 16);
                byte[] arrby3 = new byte[n8];
                if (bl) {
                    System.arraycopy((Object)algorithmParameterSpec, (int)0, (Object)arrby3, (int)0, (int)12);
                }
                algorithmParameterSpec = b.c((byte[])algorithmParameterSpec);
                ThreadLocal threadLocal = d;
                ((Cipher)threadLocal.get()).init(1, (Key)this.a, algorithmParameterSpec);
                if (arrby2 != null && arrby2.length != 0) {
                    ((Cipher)threadLocal.get()).updateAAD(arrby2);
                }
                n8 = this.b ? 12 : 0;
                n8 = ((Cipher)threadLocal.get()).doFinal(arrby, 0, arrby.length, arrby3, n8);
                if (n8 == arrby.length + 16) {
                    return arrby3;
                }
                throw new GeneralSecurityException(String.format((String)"encryption failed; GCM tag must be %s bytes, but got only %s bytes", (Object[])new Object[]{16, n8 - arrby.length}));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

}

