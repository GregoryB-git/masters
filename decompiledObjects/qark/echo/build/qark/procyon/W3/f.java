// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W3;

import d4.b;
import V3.k;
import d4.n;

public class f extends d
{
    public final n d;
    
    public f(final e e, final k k, final n d) {
        super(W3.d.a.o, e, k);
        this.d = d;
    }
    
    @Override
    public d d(final b b) {
        if (super.c.isEmpty()) {
            return new f(super.b, k.Y(), this.d.v(b));
        }
        return new f(super.b, super.c.c0(), this.d);
    }
    
    public n e() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", this.a(), this.b(), this.d);
    }
}
