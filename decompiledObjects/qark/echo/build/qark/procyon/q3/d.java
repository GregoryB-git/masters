// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import m3.a;
import javax.crypto.AEADBadTagException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.InvalidKeyException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;
import h3.b;
import c3.e;

public final class d implements e
{
    public static final b.b c;
    public static final Collection d;
    public static final byte[] e;
    public static final byte[] f;
    public final m a;
    public final byte[] b;
    
    static {
        c = b.b.o;
        d = Arrays.asList(64);
        e = new byte[16];
        f = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
    }
    
    public d(final byte[] array) {
        if (!q3.d.c.c()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (q3.d.d.contains(array.length)) {
            final byte[] copyOfRange = Arrays.copyOfRange(array, 0, array.length / 2);
            this.b = Arrays.copyOfRange(array, array.length / 2, array.length);
            this.a = new m(copyOfRange);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("invalid key size: ");
        sb.append(array.length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }
    
    @Override
    public byte[] a(final byte[] input, byte[] c) {
        if (input.length <= 2147483631) {
            final Cipher cipher = (Cipher)i.b.a("AES/CTR/NoPadding");
            c = this.c(new byte[][] { c, input });
            final byte[] iv = c.clone();
            iv[8] &= 0x7F;
            iv[12] &= 0x7F;
            cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(iv));
            return q3.f.a(new byte[][] { c, cipher.doFinal(input) });
        }
        throw new GeneralSecurityException("plaintext too long");
    }
    
    @Override
    public byte[] b(byte[] doFinal, final byte[] array) {
        if (doFinal.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        final Cipher cipher = (Cipher)i.b.a("AES/CTR/NoPadding");
        final byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, 16);
        final byte[] iv = copyOfRange.clone();
        iv[8] &= 0x7F;
        iv[12] &= 0x7F;
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(iv));
        final byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, 16, doFinal.length);
        final byte[] array2 = doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && (doFinal = array2) == null) {
            doFinal = array2;
            if (q.b()) {
                doFinal = new byte[0];
            }
        }
        if (q3.f.b(copyOfRange, this.c(new byte[][] { array, doFinal }))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
    
    public final byte[] c(final byte[]... array) {
        if (array.length == 0) {
            return this.a.a(q3.d.f, 16);
        }
        byte[] array2 = this.a.a(q3.d.e, 16);
        for (int i = 0; i < array.length - 1; ++i) {
            byte[] array3;
            if ((array3 = array[i]) == null) {
                array3 = new byte[0];
            }
            array2 = q3.f.e(m3.a.b(array2), this.a.a(array3, 16));
        }
        final byte[] array4 = array[array.length - 1];
        byte[] array5;
        if (array4.length >= 16) {
            array5 = q3.f.f(array4, array2);
        }
        else {
            array5 = q3.f.e(m3.a.a(array4), m3.a.b(array2));
        }
        return this.a.a(array5, 16);
    }
}
