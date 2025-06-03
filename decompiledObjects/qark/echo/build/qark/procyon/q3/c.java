// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.util.Arrays;
import java.security.GeneralSecurityException;
import h3.b;
import c3.a;

public final class c implements a
{
    public static final b.b b;
    public final e3.b a;
    
    static {
        b = h3.b.b.p;
    }
    
    public c(final byte[] array) {
        if (c.b.c()) {
            this.a = new e3.b(array, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
    
    @Override
    public byte[] a(final byte[] array, final byte[] array2) {
        return this.a.b(p.c(12), array, array2);
    }
    
    @Override
    public byte[] b(final byte[] original, final byte[] array) {
        return this.a.a(Arrays.copyOf(original, 12), original, array);
    }
}
