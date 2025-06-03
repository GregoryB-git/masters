// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import l4.f;

public enum j implements f
{
    p("EVENT_TYPE_UNKNOWN", 0, 0), 
    q("SESSION_START", 1, 1);
    
    public final int o;
    
    static {
        r = c();
    }
    
    public j(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static final /* synthetic */ j[] c() {
        return new j[] { j.p, j.q };
    }
    
    @Override
    public int g() {
        return this.o;
    }
}
