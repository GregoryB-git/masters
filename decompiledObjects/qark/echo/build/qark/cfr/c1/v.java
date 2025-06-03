/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 */
package c1;

import F0.M;
import F0.T;
import android.util.SparseArray;
import c1.t;
import c1.x;

public final class v
implements F0.t {
    public final F0.t o;
    public final t.a p;
    public final SparseArray q;

    public v(F0.t t8, t.a a8) {
        this.o = t8;
        this.p = a8;
        this.q = new SparseArray();
    }

    @Override
    public T a(int n8, int n9) {
        if (n9 != 3) {
            return this.o.a(n8, n9);
        }
        x x8 = (x)this.q.get(n8);
        if (x8 != null) {
            return x8;
        }
        x8 = new x(this.o.a(n8, n9), this.p);
        this.q.put(n8, (Object)x8);
        return x8;
    }

    public void b() {
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            ((x)this.q.valueAt(i8)).k();
        }
    }

    @Override
    public void e(M m8) {
        this.o.e(m8);
    }

    @Override
    public void j() {
        this.o.j();
    }
}

