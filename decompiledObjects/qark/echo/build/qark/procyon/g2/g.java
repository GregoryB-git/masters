// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

public abstract class g
{
    public static g a() {
        return new b(a.q, -1L);
    }
    
    public static g d() {
        return new b(a.r, -1L);
    }
    
    public static g e(final long n) {
        return new b(a.o, n);
    }
    
    public static g f() {
        return new b(a.p, -1L);
    }
    
    public abstract long b();
    
    public abstract a c();
    
    public enum a
    {
        o("OK", 0), 
        p("TRANSIENT_ERROR", 1), 
        q("FATAL_ERROR", 2), 
        r("INVALID_PAYLOAD", 3);
        
        public a(final String name, final int ordinal) {
        }
    }
}
