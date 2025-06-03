// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.io.IOException;
import java.util.Map;

public final class t extends r
{
    public final int r;
    public final String s;
    public final Map t;
    public final byte[] u;
    
    public t(final int n, final String s, final IOException ex, final Map t, final k k, final byte[] u) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Response code: ");
        sb.append(n);
        super(sb.toString(), ex, k, 2004, 1);
        this.r = n;
        this.s = s;
        this.t = t;
        this.u = u;
    }
}
