// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g5;

public enum a
{
    p("L", 0, 1), 
    q("M", 1, 0), 
    r("Q", 2, 3), 
    s("H", 3, 2);
    
    public static final a[] t;
    public final int o;
    
    static {
        final a a;
        final a a2;
        final a a3;
        final a a4;
        t = new a[] { a2, a, a4, a3 };
    }
    
    public a(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public int c() {
        return this.o;
    }
}
