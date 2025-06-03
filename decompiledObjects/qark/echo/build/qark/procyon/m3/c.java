// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m3;

import java.security.GeneralSecurityException;
import l3.i;
import h3.b;
import l3.g;

public final class c implements g
{
    public static final b.b b;
    public final i a;
    
    static {
        b = h3.b.b.p;
    }
    
    public c(final i a) {
        if (c.b.c()) {
            this.a = a;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
