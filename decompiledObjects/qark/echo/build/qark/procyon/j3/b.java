// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j3;

import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.AEADBadTagException;
import android.util.Log;
import java.security.ProviderException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.SecretKey;
import c3.a;

public final class b implements a
{
    public static final String b = "b";
    public final SecretKey a;
    
    public b(final String s, final KeyStore keyStore) {
        final SecretKey a = (SecretKey)keyStore.getKey(s, null);
        this.a = a;
        if (a != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Keystore cannot load the key with ID: ");
        sb.append(s);
        throw new InvalidKeyException(sb.toString());
    }
    
    public static void e() {
        final long n = (int)(Math.random() * 100.0);
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException ex) {}
    }
    
    @Override
    public byte[] a(final byte[] array, final byte[] array2) {
        byte[] d = null;
        try {
            d = this.d(array, array2);
            return d;
        }
        catch (GeneralSecurityException d) {}
        catch (ProviderException ex) {}
        Log.w(j3.b.b, "encountered a potentially transient KeyStore error, will wait and retry", (Throwable)(Object)d);
        e();
        return this.d(array, array2);
    }
    
    @Override
    public byte[] b(final byte[] array, final byte[] array2) {
        if (array.length >= 28) {
            try {
                return this.c(array, array2);
            }
            catch (GeneralSecurityException c) {
                goto Label_0021;
            }
            catch (ProviderException ex2) {}
            catch (AEADBadTagException ex) {
                throw ex;
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public final byte[] c(final byte[] array, final byte[] src) {
        final GCMParameterSpec params = new GCMParameterSpec(128, array, 0, 12);
        final Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.a, params);
        instance.updateAAD(src);
        return instance.doFinal(array, 12, array.length - 12);
    }
    
    public final byte[] d(final byte[] input, final byte[] src) {
        if (input.length <= 2147483619) {
            final byte[] output = new byte[input.length + 28];
            final Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.a);
            instance.updateAAD(src);
            instance.doFinal(input, 0, input.length, output, 12);
            System.arraycopy(instance.getIV(), 0, output, 0, 12);
            return output;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
