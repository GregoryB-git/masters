// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o4;

public interface j
{
    a b(final String p0);
    
    public enum a
    {
        p("NONE", 0, 0), 
        q("SDK", 1, 1), 
        r("GLOBAL", 2, 2), 
        s("COMBINED", 3, 3);
        
        public final int o;
        
        public a(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public int c() {
            return this.o;
        }
    }
}
