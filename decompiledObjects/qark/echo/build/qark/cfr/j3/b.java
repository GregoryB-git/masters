/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.KeyStore
 *  java.security.ProviderException
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.AEADBadTagException
 *  javax.crypto.Cipher
 *  javax.crypto.SecretKey
 *  javax.crypto.spec.GCMParameterSpec
 */
package j3;

import android.util.Log;
import c3.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public final class b
implements a {
    public static final String b = "b";
    public final SecretKey a;

    public b(String string2, KeyStore keyStore) {
        keyStore = (SecretKey)keyStore.getKey(string2, null);
        this.a = keyStore;
        if (keyStore != null) {
            return;
        }
        keyStore = new StringBuilder();
        keyStore.append("Keystore cannot load the key with ID: ");
        keyStore.append(string2);
        throw new InvalidKeyException(keyStore.toString());
    }

    public static void e() {
        long l8 = (int)(Math.random() * 100.0);
        try {
            Thread.sleep((long)l8);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        void var3_6;
        try {
            byte[] arrby3 = this.d(arrby, arrby2);
            return arrby3;
        }
        catch (GeneralSecurityException generalSecurityException) {
        }
        catch (ProviderException providerException) {
            // empty catch block
        }
        Log.w((String)b, (String)"encountered a potentially transient KeyStore error, will wait and retry", (Throwable)var3_6);
        b.e();
        return this.d(arrby, arrby2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public byte[] b(byte[] arrby, byte[] arrby2) {
        void var3_7;
        if (arrby.length < 28) throw new GeneralSecurityException("ciphertext too short");
        try {
            return this.c(arrby, arrby2);
        }
        catch (GeneralSecurityException generalSecurityException) {
        }
        catch (ProviderException providerException) {
            // empty catch block
        }
        Log.w((String)b, (String)"encountered a potentially transient KeyStore error, will wait and retry", (Throwable)var3_7);
        b.e();
        return this.c(arrby, arrby2);
        catch (AEADBadTagException aEADBadTagException) {
            throw aEADBadTagException;
        }
    }

    public final byte[] c(byte[] arrby, byte[] arrby2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, arrby, 0, 12);
        Cipher cipher = Cipher.getInstance((String)"AES/GCM/NoPadding");
        cipher.init(2, (Key)this.a, (AlgorithmParameterSpec)gCMParameterSpec);
        cipher.updateAAD(arrby2);
        return cipher.doFinal(arrby, 12, arrby.length - 12);
    }

    public final byte[] d(byte[] arrby, byte[] arrby2) {
        if (arrby.length <= 2147483619) {
            byte[] arrby3 = new byte[arrby.length + 28];
            Cipher cipher = Cipher.getInstance((String)"AES/GCM/NoPadding");
            cipher.init(1, (Key)this.a);
            cipher.updateAAD(arrby2);
            cipher.doFinal(arrby, 0, arrby.length, arrby3, 12);
            System.arraycopy((Object)cipher.getIV(), (int)0, (Object)arrby3, (int)0, (int)12);
            return arrby3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}

