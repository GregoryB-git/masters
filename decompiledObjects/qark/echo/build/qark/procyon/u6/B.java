// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import g6.l;
import p6.D;
import Y5.b;
import X5.g;
import X5.d;
import Z5.e;
import p6.a;

public class B extends a implements e
{
    public final d r;
    
    public B(final g g, final d r) {
        super(g, true, true);
        this.r = r;
    }
    
    @Override
    public void F(final Object o) {
        k.c(b.b(this.r), D.a(o, this.r), null, 2, null);
    }
    
    @Override
    public void G0(final Object o) {
        final d r = this.r;
        r.resumeWith(D.a(o, r));
    }
    
    @Override
    public final boolean g0() {
        return true;
    }
    
    @Override
    public final e getCallerFrame() {
        final d r = this.r;
        if (r instanceof e) {
            return (e)r;
        }
        return null;
    }
}
