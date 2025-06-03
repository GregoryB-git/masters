// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import s3.l;

public class j extends l
{
    public final a o;
    
    public j(final String s, final a o) {
        super(s);
        this.o = o;
    }
    
    public j(final a o) {
        this.o = o;
    }
    
    public enum a
    {
        o("BAD_CONFIG", 0), 
        p("UNAVAILABLE", 1), 
        q("TOO_MANY_REQUESTS", 2);
        
        public a(final String name, final int ordinal) {
        }
    }
}
