/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.z;

public abstract class l0 {
    public abstract void a(Object var1, int var2, int var3);

    public abstract void b(Object var1, int var2, long var3);

    public abstract void c(Object var1, int var2, Object var3);

    public abstract void d(Object var1, int var2, g var3);

    public abstract void e(Object var1, int var2, long var3);

    public abstract Object f(Object var1);

    public abstract Object g(Object var1);

    public abstract int h(Object var1);

    public abstract int i(Object var1);

    public abstract void j(Object var1);

    public abstract Object k(Object var1, Object var2);

    public final void l(Object object, d0 d02) {
        while (d02.p() != Integer.MAX_VALUE && this.m(object, d02)) {
        }
    }

    public final boolean m(Object object, d0 d02) {
        int n8 = d02.e();
        int n9 = r0.a(n8);
        if ((n8 = r0.b(n8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                this.a(object, n9, d02.n());
                                return true;
                            }
                            throw z.d();
                        }
                        return false;
                    }
                    Object object2 = this.n();
                    n8 = r0.c(n9, 4);
                    this.l(object2, d02);
                    if (n8 == d02.e()) {
                        this.c(object, n9, this.r(object2));
                        return true;
                    }
                    throw z.a();
                }
                this.d(object, n9, d02.u());
                return true;
            }
            this.b(object, n9, d02.f());
            return true;
        }
        this.e(object, n9, d02.E());
        return true;
    }

    public abstract Object n();

    public abstract void o(Object var1, Object var2);

    public abstract void p(Object var1, Object var2);

    public abstract boolean q(d0 var1);

    public abstract Object r(Object var1);

    public abstract void s(Object var1, s0 var2);

    public abstract void t(Object var1, s0 var2);
}

