// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W3;

import Y3.m;
import V3.k;

public class b extends d
{
    public b(final e e, final k k) {
        super(d.a.r, e, k);
        m.g(e.d() ^ true, "Can't have a listen complete from a user source");
    }
    
    @Override
    public d d(final d4.b b) {
        if (super.c.isEmpty()) {
            return new b(super.b, k.Y());
        }
        return new b(super.b, super.c.c0());
    }
    
    @Override
    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", this.a(), this.b());
    }
}
