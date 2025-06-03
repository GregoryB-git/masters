// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import g0.M;
import java.util.Map;
import g0.a;
import java.util.ArrayList;

public abstract class b implements g
{
    public final boolean a;
    public final ArrayList b;
    public int c;
    public k d;
    
    public b(final boolean a) {
        this.a = a;
        this.b = new ArrayList(1);
    }
    
    @Override
    public final void c(final y y) {
        g0.a.e(y);
        if (!this.b.contains(y)) {
            this.b.add(y);
            ++this.c;
        }
    }
    
    public final void q(final int n) {
        final k k = (k)M.i(this.d);
        for (int i = 0; i < this.c; ++i) {
            ((y)this.b.get(i)).e(this, k, this.a, n);
        }
    }
    
    public final void r() {
        final k k = (k)M.i(this.d);
        for (int i = 0; i < this.c; ++i) {
            ((y)this.b.get(i)).h(this, k, this.a);
        }
        this.d = null;
    }
    
    public final void s(final k k) {
        for (int i = 0; i < this.c; ++i) {
            ((y)this.b.get(i)).f(this, k, this.a);
        }
    }
    
    public final void t(final k d) {
        this.d = d;
        for (int i = 0; i < this.c; ++i) {
            ((y)this.b.get(i)).g(this, d, this.a);
        }
    }
}
