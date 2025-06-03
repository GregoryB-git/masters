// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y6;

import u6.G;
import u6.F;

public abstract class e
{
    public static final int a;
    public static final F b;
    public static final F c;
    public static final F d;
    public static final F e;
    public static final int f;
    
    static {
        a = G.g("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        b = new F("PERMIT");
        c = new F("TAKEN");
        d = new F("BROKEN");
        e = new F("CANCELLED");
        f = G.g("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
    }
    
    public static final f h(final long n, final f f) {
        return new f(n, f, 0);
    }
}
