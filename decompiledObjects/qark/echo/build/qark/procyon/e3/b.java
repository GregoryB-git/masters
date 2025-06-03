// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import java.security.Key;
import java.nio.ByteBuffer;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import q3.q;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.r;
import java.security.GeneralSecurityException;
import q3.i;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class b
{
    public static final h3.b.b c;
    public static final ThreadLocal d;
    public final SecretKey a;
    public final boolean b;
    
    static {
        c = h3.b.b.p;
        d = new ThreadLocal() {
            public Cipher a() {
                try {
                    return (Cipher)i.b.a("AES/GCM/NoPadding");
                }
                catch (GeneralSecurityException cause) {
                    throw new IllegalStateException(cause);
                }
            }
        };
    }
    
    public b(final byte[] key, final boolean b) {
        if (e3.b.c.c()) {
            r.a(key.length);
            this.a = new SecretKeySpec(key, "AES");
            this.b = b;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    public static AlgorithmParameterSpec c(final byte[] array) {
        return d(array, 0, array.length);
    }
    
    public static AlgorithmParameterSpec d(final byte[] array, final int n, final int n2) {
        if (q.b() && q.a() <= 19) {
            return new IvParameterSpec(array, n, n2);
        }
        return new GCMParameterSpec(128, array, n, n2);
    }
    
    public byte[] a(final byte[] array, final byte[] array2, final byte[] src) {
        if (array.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        final boolean b = this.b;
        int n;
        if (b) {
            n = 28;
        }
        else {
            n = 16;
        }
        if (array2.length < n) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int inputOffset = 0;
        if (b && !ByteBuffer.wrap(array).equals(ByteBuffer.wrap(array2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        final AlgorithmParameterSpec c = c(array);
        final ThreadLocal d = e3.b.d;
        d.get().init(2, this.a, c);
        if (src != null && src.length != 0) {
            d.get().updateAAD(src);
        }
        final boolean b2 = this.b;
        if (b2) {
            inputOffset = 12;
        }
        int length;
        if (b2) {
            length = array2.length - 12;
        }
        else {
            length = array2.length;
        }
        return d.get().doFinal(array2, inputOffset, length);
    }
    
    public byte[] b(final byte[] array, final byte[] input, final byte[] src) {
        if (array.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (input.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        final boolean b = this.b;
        final int length = input.length;
        int n;
        if (b) {
            n = length + 28;
        }
        else {
            n = length + 16;
        }
        final byte[] output = new byte[n];
        if (b) {
            System.arraycopy(array, 0, output, 0, 12);
        }
        final AlgorithmParameterSpec c = c(array);
        final ThreadLocal d = e3.b.d;
        d.get().init(1, this.a, c);
        if (src != null && src.length != 0) {
            d.get().updateAAD(src);
        }
        int outputOffset;
        if (this.b) {
            outputOffset = 12;
        }
        else {
            outputOffset = 0;
        }
        final int doFinal = d.get().doFinal(input, 0, input.length, output, outputOffset);
        if (doFinal == input.length + 16) {
            return output;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, doFinal - input.length));
    }
}
