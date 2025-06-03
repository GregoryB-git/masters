// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

public enum z
{
    p("DEVELOPER", 0, 1), 
    q("USER_SIDELOAD", 1, 2), 
    r("TEST_DISTRIBUTION", 2, 3), 
    s("APP_STORE", 3, 4);
    
    public final int o;
    
    public z(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static z c(final String s) {
        if (s != null) {
            return z.s;
        }
        return z.p;
    }
    
    public int e() {
        return this.o;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.o);
    }
}
