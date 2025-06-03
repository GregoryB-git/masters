// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

public enum z implements a
{
    p("UNKNOWN_STATUS", 0, 0), 
    q("ENABLED", 1, 1), 
    r("DISABLED", 2, 2), 
    s("DESTROYED", 3, 3), 
    t("UNRECOGNIZED", 4, -1);
    
    public static final b u;
    public final int o;
    
    static {
        u = new b() {};
    }
    
    public z(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static z c(final int n) {
        if (n == 0) {
            return z.p;
        }
        if (n == 1) {
            return z.q;
        }
        if (n == 2) {
            return z.r;
        }
        if (n != 3) {
            return null;
        }
        return z.s;
    }
    
    public final int g() {
        if (this != z.t) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
