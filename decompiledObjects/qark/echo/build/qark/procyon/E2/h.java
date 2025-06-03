// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import android.os.SystemClock;

public class h implements e
{
    public static final h a;
    
    static {
        a = new h();
    }
    
    public static e d() {
        return h.a;
    }
    
    @Override
    public final long a() {
        return System.currentTimeMillis();
    }
    
    @Override
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
    
    @Override
    public final long c() {
        return System.nanoTime();
    }
}
