// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c4;

public interface d
{
    void a(final a p0, final String p1, final String p2, final long p3);
    
    a b();
    
    public enum a
    {
        o("DEBUG", 0), 
        p("INFO", 1), 
        q("WARN", 2), 
        r("ERROR", 3), 
        s("NONE", 4);
        
        public a(final String name, final int ordinal) {
        }
    }
}
