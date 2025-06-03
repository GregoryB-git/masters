// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.t;

public enum l implements a
{
    p("SESSION_VERBOSITY_NONE", 0, 0), 
    q("GAUGES_AND_SYSTEM_EVENTS", 1, 1);
    
    public static final t.b r;
    public final int o;
    
    static {
        r = new t.b() {};
    }
    
    public l(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static l c(final int n) {
        if (n == 0) {
            return l.p;
        }
        if (n != 1) {
            return null;
        }
        return l.q;
    }
    
    public static c e() {
        return b.a;
    }
    
    @Override
    public final int g() {
        return this.o;
    }
    
    public static final class b implements c
    {
        public static final c a;
        
        static {
            a = new b();
        }
    }
}
