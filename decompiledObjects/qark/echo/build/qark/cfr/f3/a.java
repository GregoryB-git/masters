/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.SecretKey
 *  javax.crypto.spec.GCMParameterSpec
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package f3;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.i;
import q3.p;
import q3.q;
import q3.r;

public final class a
implements c3.a {
    public static final ThreadLocal b = new ThreadLocal(){

        public Cipher a() {
            try {
                Cipher cipher = (Cipher)i.b.a("AES/GCM-SIV/NoPadding");
                return cipher;
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException((Throwable)generalSecurityException);
            }
        }
    };
    public final SecretKey a;

    public a(byte[] arrby) {
        r.a(arrby.length);
        this.a = new SecretKeySpec(arrby, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] arrby) {
        return a.d(arrby, 0, arrby.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AlgorithmParameterSpec d(byte[] arrby, int n8, int n9) {
        try {
            Class.forName((String)"javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, arrby, n8, n9);
        }
        catch (ClassNotFoundException classNotFoundException) {}
        if (!q.b()) throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        return new IvParameterSpec(arrby, n8, n9);
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        if (arrby.length <= 2147483619) {
            int n8;
            byte[] arrby3 = new byte[arrby.length + 28];
            AlgorithmParameterSpec algorithmParameterSpec = p.c(12);
            System.arraycopy((Object)algorithmParameterSpec, (int)0, (Object)arrby3, (int)0, (int)12);
            algorithmParameterSpec = a.c((byte[])algorithmParameterSpec);
            ThreadLocal threadLocal = b;
            ((Cipher)threadLocal.get()).init(1, (Key)this.a, algorithmParameterSpec);
            if (arrby2 != null && arrby2.length != 0) {
                ((Cipher)threadLocal.get()).updateAAD(arrby2);
            }
            if ((n8 = ((Cipher)threadLocal.get()).doFinal(arrby, 0, arrby.length, arrby3, 12)) == arrby.length + 16) {
                return arrby3;
            }
            throw new GeneralSecurityException(String.format((String)"encryption failed; GCM tag must be %s bytes, but got only %s bytes", (Object[])new Object[]{16, n8 - arrby.length}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override
    public byte[] b(byte[] arrby, byte[] arrby2) {
        if (arrby.length >= 28) {
            AlgorithmParameterSpec algorithmParameterSpec = a.d(arrby, 0, 12);
            ThreadLocal threadLocal = b;
            ((Cipher)threadLocal.get()).init(2, (Key)this.a, algorithmParameterSpec);
            if (arrby2 != null && arrby2.length != 0) {
                ((Cipher)threadLocal.get()).updateAAD(arrby2);
            }
            return ((Cipher)threadLocal.get()).doFinal(arrby, 12, arrby.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

}

