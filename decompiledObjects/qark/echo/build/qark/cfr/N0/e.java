/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package N0;

import F0.D;
import F0.M;
import F0.N;
import F0.T;
import F0.t;

public final class e
implements t {
    public final long o;
    public final t p;

    public e(long l8, t t8) {
        this.o = l8;
        this.p = t8;
    }

    @Override
    public T a(int n8, int n9) {
        return this.p.a(n8, n9);
    }

    @Override
    public void e(final M m8) {
        this.p.e(new D(m8){

            @Override
            public M.a j(long l8) {
                Object object = m8.j(l8);
                N n8 = object.a;
                n8 = new N(n8.a, n8.b + e.this.o);
                object = object.b;
                return new M.a(n8, new N(object.a, object.b + e.this.o));
            }
        });
    }

    @Override
    public void j() {
        this.p.j();
    }

}

