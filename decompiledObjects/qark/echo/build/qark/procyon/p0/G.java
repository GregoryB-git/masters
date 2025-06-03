// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import g0.M;
import java.util.UUID;
import j0.b;

public final class G implements b
{
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;
    
    static {
        boolean d3 = false;
        Label_0040: {
            if ("Amazon".equals(M.c)) {
                final String d2 = M.d;
                if ("AFTM".equals(d2) || "AFTB".equals(d2)) {
                    d3 = true;
                    break Label_0040;
                }
            }
            d3 = false;
        }
        d = d3;
    }
    
    public G(final UUID a, final byte[] b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
