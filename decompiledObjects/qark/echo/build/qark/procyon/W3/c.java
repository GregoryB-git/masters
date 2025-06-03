// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W3;

import V3.k;
import V3.b;

public class c extends d
{
    public final b d;
    
    public c(final e e, final k k, final b d) {
        super(W3.d.a.p, e, k);
        this.d = d;
    }
    
    @Override
    public d d(final d4.b b) {
        if (super.c.isEmpty()) {
            final b k = this.d.k(new k(new d4.b[] { b }));
            if (k.isEmpty()) {
                return null;
            }
            if (k.X() != null) {
                return new f(super.b, V3.k.Y(), k.X());
            }
            return new c(super.b, V3.k.Y(), k);
        }
        else {
            if (super.c.Z().equals(b)) {
                return new c(super.b, super.c.c0(), this.d);
            }
            return null;
        }
    }
    
    public b e() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", this.a(), this.b(), this.d);
    }
}
