// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m6;

import a6.b;
import a6.a;

public enum j
{
    o("PUBLIC", 0), 
    p("PROTECTED", 1), 
    q("INTERNAL", 2), 
    r("PRIVATE", 3);
    
    static {
        t = b.a(s = c());
    }
    
    public j(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ j[] c() {
        return new j[] { j.o, j.p, j.q, j.r };
    }
}
