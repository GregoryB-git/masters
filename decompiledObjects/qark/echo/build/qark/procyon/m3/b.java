// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m3;

import java.security.GeneralSecurityException;
import l3.a;
import l3.g;

public final class b implements g
{
    public static final h3.b.b b;
    public final a a;
    
    static {
        b = h3.b.b.o;
    }
    
    public b(final a a) {
        if (m3.b.b.c()) {
            this.a = a;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
