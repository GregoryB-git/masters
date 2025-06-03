// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v4;

public abstract class f
{
    public static a a() {
        return new v4.b.b().d(0L);
    }
    
    public abstract b b();
    
    public abstract String c();
    
    public abstract long d();
    
    public abstract static class a
    {
        public abstract f a();
        
        public abstract a b(final b p0);
        
        public abstract a c(final String p0);
        
        public abstract a d(final long p0);
    }
    
    public enum b
    {
        o("OK", 0), 
        p("BAD_CONFIG", 1), 
        q("AUTH_ERROR", 2);
        
        public b(final String name, final int ordinal) {
        }
    }
}
