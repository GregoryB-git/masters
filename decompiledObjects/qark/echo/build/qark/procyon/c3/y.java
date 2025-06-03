// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import java.security.GeneralSecurityException;

public final class y
{
    public static final y a;
    
    static {
        a = new y();
    }
    
    public static y a() {
        return y.a;
    }
    
    public static y b(final y y) {
        if (y != null) {
            return y;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
