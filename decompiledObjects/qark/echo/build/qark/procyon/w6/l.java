// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import java.util.concurrent.TimeUnit;
import l6.d;
import u6.G;

public abstract class l
{
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static g f;
    public static final i g;
    public static final i h;
    
    static {
        a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
        b = G.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        c = G.g("kotlinx.coroutines.scheduler.core.pool.size", l6.d.a(G.a(), 2), 1, 0, 8, null);
        d = G.g("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        e = TimeUnit.SECONDS.toNanos(G.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        l.f = w6.e.a;
        g = new j(0);
        h = new j(1);
    }
}
