// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

public enum a
{
    o("SUSPEND", 0), 
    p("DROP_OLDEST", 1), 
    q("DROP_LATEST", 2);
    
    static {
        r = c();
    }
    
    public a(final String name, final int ordinal) {
    }
    
    public static final /* synthetic */ a[] c() {
        return new a[] { a.o, a.p, a.q };
    }
}
