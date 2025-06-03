// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.t;

public enum d implements a
{
    p("APPLICATION_PROCESS_STATE_UNKNOWN", 0, 0), 
    q("FOREGROUND", 1, 1), 
    r("BACKGROUND", 2, 2), 
    s("FOREGROUND_BACKGROUND", 3, 3);
    
    public static final t.b t;
    public final int o;
    
    static {
        t = new t.b() {};
    }
    
    public d(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static c c() {
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
