// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import F0.M;
import F0.T;
import android.util.SparseArray;
import F0.t;

public final class v implements t
{
    public final t o;
    public final c1.t.a p;
    public final SparseArray q;
    
    public v(final t o, final c1.t.a p2) {
        this.o = o;
        this.p = p2;
        this.q = new SparseArray();
    }
    
    @Override
    public T a(final int n, final int n2) {
        if (n2 != 3) {
            return this.o.a(n, n2);
        }
        final x x = (x)this.q.get(n);
        if (x != null) {
            return x;
        }
        final x x2 = new x(this.o.a(n, n2), this.p);
        this.q.put(n, (Object)x2);
        return x2;
    }
    
    public void b() {
        for (int i = 0; i < this.q.size(); ++i) {
            ((x)this.q.valueAt(i)).k();
        }
    }
    
    @Override
    public void e(final M m) {
        this.o.e(m);
    }
    
    @Override
    public void j() {
        this.o.j();
    }
}
