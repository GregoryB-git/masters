// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import h3.b;

public final class a implements l
{
    public static final b.b d;
    public static final ThreadLocal e;
    public final SecretKeySpec a;
    public final int b;
    public final int c;
    
    static {
        d = b.b.p;
        e = new ThreadLocal() {
            public Cipher a() {
                try {
                    return (Cipher)i.b.a("AES/CTR/NoPadding");
                }
                catch (GeneralSecurityException cause) {
                    throw new IllegalStateException(cause);
                }
            }
        };
    }
    
    public a(final byte[] key, final int b) {
        if (!q3.a.d.c()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(key.length);
        this.a = new SecretKeySpec(key, "AES");
        final int blockSize = q3.a.e.get().getBlockSize();
        this.c = blockSize;
        if (b >= 12 && b <= blockSize) {
            this.b = b;
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
    
    @Override
    public byte[] a(final byte[] array) {
        final int length = array.length;
        final int b = this.b;
        if (length <= Integer.MAX_VALUE - b) {
            final byte[] array2 = new byte[array.length + b];
            final byte[] c = p.c(b);
            System.arraycopy(c, 0, array2, 0, this.b);
            this.c(array, 0, array.length, array2, this.b, c, true);
            return array2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("plaintext length can not exceed ");
        sb.append(Integer.MAX_VALUE - this.b);
        throw new GeneralSecurityException(sb.toString());
    }
    
    @Override
    public byte[] b(final byte[] array) {
        final int length = array.length;
        final int b = this.b;
        if (length >= b) {
            final byte[] array2 = new byte[b];
            System.arraycopy(array, 0, array2, 0, b);
            final int length2 = array.length;
            final int b2 = this.b;
            final byte[] array3 = new byte[length2 - b2];
            this.c(array, b2, array.length - b2, array3, 0, array2, false);
            return array3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public final void c(final byte[] input, final int inputOffset, final int inputLen, final byte[] output, final int outputOffset, final byte[] array, final boolean b) {
        final Cipher cipher = q3.a.e.get();
        final byte[] iv = new byte[this.c];
        System.arraycopy(array, 0, iv, 0, this.b);
        final IvParameterSpec params = new IvParameterSpec(iv);
        int opmode;
        if (b) {
            opmode = 1;
        }
        else {
            opmode = 2;
        }
        cipher.init(opmode, this.a, params);
        if (cipher.doFinal(input, inputOffset, inputLen, output, outputOffset) == inputLen) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
