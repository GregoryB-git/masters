// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import v0.b;
import B0.p;
import java.util.List;

public final class e implements j
{
    public final j a;
    public final List b;
    
    public e(final j a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public p.a a(final g g, final f f) {
        return new b(this.a.a(g, f), this.b);
    }
    
    @Override
    public p.a b() {
        return new b(this.a.b(), this.b);
    }
}
