// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.util.Collections;
import java.util.Map;
import android.net.Uri;
import i0.k;
import java.util.concurrent.atomic.AtomicLong;

public final class r
{
    public static final AtomicLong h;
    public final long a;
    public final k b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;
    
    static {
        h = new AtomicLong();
    }
    
    public r(final long n, final k k, final long n2) {
        this(n, k, k.a, Collections.emptyMap(), n2, 0L, 0L);
    }
    
    public r(final long a, final k b, final Uri c, final Map d, final long e, final long f, final long g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static long a() {
        return r.h.getAndIncrement();
    }
}
