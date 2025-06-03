// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import o6.c;
import o6.d;
import android.os.SystemClock;
import o6.a;
import kotlin.jvm.internal.g;

public final class w implements x
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @Override
    public long a() {
        return System.currentTimeMillis() * 1000L;
    }
    
    @Override
    public long b() {
        final o6.a.a p = o6.a.p;
        return c.p(SystemClock.elapsedRealtime(), d.r);
    }
    
    public static final class a
    {
    }
}
