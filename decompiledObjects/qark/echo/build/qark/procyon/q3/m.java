// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.security.Key;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import h3.b;
import o3.a;

public final class m implements a
{
    public static final b.b d;
    public final SecretKey a;
    public byte[] b;
    public byte[] c;
    
    static {
        d = b.b.o;
    }
    
    public m(final byte[] key) {
        r.a(key.length);
        this.a = new SecretKeySpec(key, "AES");
        this.b();
    }
    
    public static Cipher c() {
        if (m.d.c()) {
            return (Cipher)i.b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
    
    @Override
    public byte[] a(final byte[] original, final int newLength) {
        if (newLength <= 16) {
            final Cipher c = c();
            c.init(1, this.a);
            final int max = Math.max(1, (int)Math.ceil(original.length / 16.0));
            byte[] array;
            if (max * 16 == original.length) {
                array = f.d(original, (max - 1) * 16, this.b, 0, 16);
            }
            else {
                array = f.e(m3.a.a(Arrays.copyOfRange(original, (max - 1) * 16, original.length)), this.c);
            }
            byte[] doFinal = new byte[16];
            for (int i = 0; i < max - 1; ++i) {
                doFinal = c.doFinal(f.d(doFinal, 0, original, i * 16, 16));
            }
            return Arrays.copyOf(c.doFinal(f.e(array, doFinal)), newLength);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
    
    public final void b() {
        final Cipher c = c();
        c.init(1, this.a);
        final byte[] b = m3.a.b(c.doFinal(new byte[16]));
        this.b = b;
        this.c = m3.a.b(b);
    }
}
