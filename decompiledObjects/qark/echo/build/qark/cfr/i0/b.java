/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Map
 */
package i0;

import g0.M;
import g0.a;
import i0.f;
import i0.g;
import i0.k;
import i0.y;
import java.util.ArrayList;
import java.util.Map;

public abstract class b
implements g {
    public final boolean a;
    public final ArrayList b;
    public int c;
    public k d;

    public b(boolean bl) {
        this.a = bl;
        this.b = new ArrayList(1);
    }

    @Override
    public final void c(y y8) {
        a.e(y8);
        if (!this.b.contains((Object)y8)) {
            this.b.add((Object)y8);
            ++this.c;
        }
    }

    @Override
    public /* synthetic */ Map g() {
        return f.a(this);
    }

    public final void q(int n8) {
        k k8 = (k)M.i(this.d);
        for (int i8 = 0; i8 < this.c; ++i8) {
            ((y)this.b.get(i8)).e(this, k8, this.a, n8);
        }
    }

    public final void r() {
        k k8 = (k)M.i(this.d);
        for (int i8 = 0; i8 < this.c; ++i8) {
            ((y)this.b.get(i8)).h(this, k8, this.a);
        }
        this.d = null;
    }

    public final void s(k k8) {
        for (int i8 = 0; i8 < this.c; ++i8) {
            ((y)this.b.get(i8)).f(this, k8, this.a);
        }
    }

    public final void t(k k8) {
        this.d = k8;
        for (int i8 = 0; i8 < this.c; ++i8) {
            ((y)this.b.get(i8)).g(this, k8, this.a);
        }
    }
}

