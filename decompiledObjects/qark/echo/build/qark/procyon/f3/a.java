// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f3;

import java.security.Key;
import q3.p;
import javax.crypto.spec.IvParameterSpec;
import q3.q;
import javax.crypto.spec.GCMParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.r;
import java.security.GeneralSecurityException;
import q3.i;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class a implements c3.a
{
    public static final ThreadLocal b;
    public final SecretKey a;
    
    static {
        b = new ThreadLocal() {
            public Cipher a() {
                try {
                    return (Cipher)i.b.a("AES/GCM-SIV/NoPadding");
                }
                catch (GeneralSecurityException cause) {
                    throw new IllegalStateException(cause);
                }
            }
        };
    }
    
    public a(final byte[] key) {
        r.a(key.length);
        this.a = new SecretKeySpec(key, "AES");
    }
    
    public static AlgorithmParameterSpec c(final byte[] array) {
        return d(array, 0, array.length);
    }
    
    public static AlgorithmParameterSpec d(final byte[] array, final int n, final int n2) {
        while (true) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                return new GCMParameterSpec(128, array, n, n2);
                // iftrue(Label_0039:, !q.b())
                return new IvParameterSpec(array, n, n2);
                Label_0039: {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            catch (ClassNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public byte[] a(final byte[] input, final byte[] src) {
        if (input.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        final byte[] output = new byte[input.length + 28];
        final byte[] c = p.c(12);
        System.arraycopy(c, 0, output, 0, 12);
        final AlgorithmParameterSpec c2 = c(c);
        final ThreadLocal b = f3.a.b;
        b.get().init(1, this.a, c2);
        if (src != null && src.length != 0) {
            b.get().updateAAD(src);
        }
        final int doFinal = b.get().doFinal(input, 0, input.length, output, 12);
        if (doFinal == input.length + 16) {
            return output;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, doFinal - input.length));
    }
    
    @Override
    public byte[] b(final byte[] input, final byte[] src) {
        if (input.length >= 28) {
            final AlgorithmParameterSpec d = d(input, 0, 12);
            final ThreadLocal b = f3.a.b;
            b.get().init(2, this.a, d);
            if (src != null && src.length != 0) {
                b.get().updateAAD(src);
            }
            return b.get().doFinal(input, 12, input.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
