// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o6;

import a6.b;
import java.util.concurrent.TimeUnit;
import a6.a;

public enum d
{
    p("NANOSECONDS", 0, TimeUnit.NANOSECONDS), 
    q("MICROSECONDS", 1, TimeUnit.MICROSECONDS), 
    r("MILLISECONDS", 2, TimeUnit.MILLISECONDS), 
    s("SECONDS", 3, TimeUnit.SECONDS), 
    t("MINUTES", 4, TimeUnit.MINUTES), 
    u("HOURS", 5, TimeUnit.HOURS), 
    v("DAYS", 6, TimeUnit.DAYS);
    
    public final TimeUnit o;
    
    static {
        x = b.a(w = c());
    }
    
    public d(final String name, final int ordinal, final TimeUnit o) {
        this.o = o;
    }
    
    public static final /* synthetic */ d[] c() {
        return new d[] { d.p, d.q, d.r, d.s, d.t, d.u, d.v };
    }
    
    public final TimeUnit e() {
        return this.o;
    }
}
