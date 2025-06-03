// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W3;

import d4.b;
import V3.k;

public abstract class d
{
    public final a a;
    public final e b;
    public final k c;
    
    public d(final a a, final e b, final k c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public k a() {
        return this.c;
    }
    
    public e b() {
        return this.b;
    }
    
    public a c() {
        return this.a;
    }
    
    public abstract d d(final b p0);
    
    public enum a
    {
        o("Overwrite", 0), 
        p("Merge", 1), 
        q("AckUserWrite", 2), 
        r("ListenComplete", 3);
        
        public a(final String name, final int ordinal) {
        }
    }
}
