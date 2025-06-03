/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.z;
import java.util.Iterator;
import java.util.Map;

public final class T
implements e0 {
    public final O a;
    public final l0 b;
    public final boolean c;
    public final p d;

    public T(l0 l02, p p8, O o8) {
        this.b = l02;
        this.c = p8.e(o8);
        this.d = p8;
        this.a = o8;
    }

    private int j(l0 l02, Object object) {
        return l02.i(l02.g(object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void k(l0 l02, p p8, Object object, d0 d02, o o8) {
        Object object2 = l02.f(object);
        s s8 = p8.d(object);
        do {
            int n8 = d02.p();
            if (n8 == Integer.MAX_VALUE) {
                return;
            }
            boolean bl = this.m(d02, o8, p8, s8, l02, object2);
            if (!bl) return;
            continue;
            break;
        } while (true);
        finally {
            l02.o(object, object2);
        }
    }

    public static T l(l0 l02, p p8, O o8) {
        return new T(l02, p8, o8);
    }

    @Override
    public void a(Object object, Object object2) {
        g0.F(this.b, object, object2);
        if (this.c) {
            g0.D(this.d, object, object2);
        }
    }

    @Override
    public void b(Object object) {
        this.b.j(object);
        this.d.f(object);
    }

    @Override
    public final boolean c(Object object) {
        return this.d.c(object).k();
    }

    @Override
    public boolean d(Object object, Object object2) {
        if (!this.b.g(object).equals(this.b.g(object2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(object).equals(this.d.c(object2));
        }
        return true;
    }

    @Override
    public int e(Object object) {
        int n8;
        int n9 = n8 = this.j(this.b, object);
        if (this.c) {
            n9 = n8 + this.d.c(object).f();
        }
        return n9;
    }

    @Override
    public Object f() {
        return this.a.d().c();
    }

    @Override
    public int g(Object object) {
        int n8;
        int n9 = n8 = this.b.g(object).hashCode();
        if (this.c) {
            n9 = n8 * 53 + this.d.c(object).hashCode();
        }
        return n9;
    }

    @Override
    public void h(Object object, d0 d02, o o8) {
        this.k(this.b, this.d, object, d02, o8);
    }

    @Override
    public void i(Object object, s0 s02) {
        Iterator iterator = this.d.c(object).n();
        if (!iterator.hasNext()) {
            this.n(this.b, object, s02);
            return;
        }
        a.a(((Map.Entry)iterator.next()).getKey());
        throw null;
    }

    public final boolean m(d0 d02, o o8, p p8, s s8, l0 l02, Object object) {
        int n8 = d02.e();
        if (n8 != r0.a) {
            if (r0.b(n8) == 2) {
                Object object2 = p8.b(o8, this.a, r0.a(n8));
                if (object2 != null) {
                    p8.h(d02, object2, o8, s8);
                    return true;
                }
                return l02.m(object, d02);
            }
            return d02.y();
        }
        Object object3 = null;
        n8 = 0;
        g g8 = null;
        while (d02.p() != Integer.MAX_VALUE) {
            int n9 = d02.e();
            if (n9 == r0.c) {
                n8 = d02.w();
                object3 = p8.b(o8, this.a, n8);
                continue;
            }
            if (n9 == r0.d) {
                if (object3 != null) {
                    p8.h(d02, object3, o8, s8);
                    continue;
                }
                g8 = d02.u();
                continue;
            }
            if (d02.y()) continue;
        }
        if (d02.e() == r0.b) {
            if (g8 != null) {
                if (object3 != null) {
                    p8.i(g8, object3, o8, s8);
                    return true;
                }
                l02.d(object, n8, g8);
            }
            return true;
        }
        throw z.a();
    }

    public final void n(l0 l02, Object object, s0 s02) {
        l02.s(l02.g(object), s02);
    }
}

