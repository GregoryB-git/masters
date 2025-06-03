// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y5;

import a6.b;

public enum a
{
    o("COROUTINE_SUSPENDED", 0), 
    p("UNDECIDED", 1), 
    q("RESUMED", 2);
    
    static {
        s = b.a(r = c());
    }
    
    public a(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ a[] c() {
        return new a[] { a.o, a.p, a.q };
    }
}
