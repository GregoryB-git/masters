// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

public abstract class k
{
    public static a a() {
        return (a)new e.b();
    }
    
    public abstract e2.a b();
    
    public abstract b c();
    
    public abstract static class a
    {
        public abstract k a();
        
        public abstract a b(final e2.a p0);
        
        public abstract a c(final b p0);
    }
    
    public enum b
    {
        p("UNKNOWN", 0, 0), 
        q("ANDROID_FIREBASE", 1, 23);
        
        public final int o;
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
    }
}
