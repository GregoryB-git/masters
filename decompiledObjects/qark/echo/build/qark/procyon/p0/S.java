// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import java.util.Map;
import android.net.Uri;
import i0.k;
import java.io.IOException;

public final class S extends IOException
{
    public final k o;
    public final Uri p;
    public final Map q;
    public final long r;
    
    public S(final k o, final Uri p5, final Map q, final long r, final Throwable cause) {
        super(cause);
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
}
