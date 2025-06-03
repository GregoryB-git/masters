/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.x;
import java.util.Iterator;
import java.util.Map;

public final class T
implements e0 {
    public final O a;
    public final k0 b;
    public final boolean c;
    public final q d;

    public T(k0 k02, q q8, O o8) {
        this.b = k02;
        this.c = q8.e(o8);
        this.d = q8;
        this.a = o8;
    }

    private int k(k0 k02, Object object) {
        return k02.i(k02.g(object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void l(k0 k02, q q8, Object object, d0 d02, p p8) {
        Object object2 = k02.f(object);
        t t8 = q8.d(object);
        do {
            int n8 = d02.p();
            if (n8 == Integer.MAX_VALUE) {
                return;
            }
            boolean bl = this.n(d02, p8, q8, t8, k02, object2);
            if (!bl) return;
            continue;
            break;
        } while (true);
        finally {
            k02.o(object, object2);
        }
    }

    public static T m(k0 k02, q q8, O o8) {
        return new T(k02, q8, o8);
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
        return this.d.c(object).e();
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
        int n9 = n8 = this.k(this.b, object);
        if (this.c) {
            n9 = n8 + this.d.c(object).b();
        }
        return n9;
    }

    @Override
    public Object f() {
        O o8 = this.a;
        if (o8 instanceof x) {
            return ((x)o8).J();
        }
        return o8.d().c();
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
    public void h(Object object, byte[] object2, int n8, int n9, e.a a8) {
        object2 = (x)object;
        if (object2.unknownFields == l0.c()) {
            object2.unknownFields = l0.k();
        }
        a.a(object);
        throw null;
    }

    @Override
    public void i(Object object, r0 r02) {
        Iterator iterator = this.d.c(object).f();
        if (!iterator.hasNext()) {
            this.o(this.b, object, r02);
            return;
        }
        a.a(((Map.Entry)iterator.next()).getKey());
        throw null;
    }

    @Override
    public void j(Object object, d0 d02, p p8) {
        this.l(this.b, this.d, object, d02, p8);
    }

    public final boolean n(d0 d02, p p8, q q8, t t8, k0 k02, Object object) {
        int n8 = d02.e();
        if (n8 != q0.a) {
            if (q0.b(n8) == 2) {
                Object object2 = q8.b(p8, this.a, q0.a(n8));
                if (object2 != null) {
                    q8.h(d02, object2, p8, t8);
                    return true;
                }
                return k02.m(object, d02);
            }
            return d02.y();
        }
        Object object3 = null;
        n8 = 0;
        h h8 = null;
        while (d02.p() != Integer.MAX_VALUE) {
            int n9 = d02.e();
            if (n9 == q0.c) {
                n8 = d02.w();
                object3 = q8.b(p8, this.a, n8);
                continue;
            }
            if (n9 == q0.d) {
                if (object3 != null) {
                    q8.h(d02, object3, p8, t8);
                    continue;
                }
                h8 = d02.u();
                continue;
            }
            if (d02.y()) continue;
        }
        if (d02.e() == q0.b) {
            if (h8 != null) {
                if (object3 != null) {
                    q8.i(h8, object3, p8, t8);
                    return true;
                }
                k02.d(object, n8, h8);
            }
            return true;
        }
        throw A.b();
    }

    public final void o(k0 k02, Object object, r0 r02) {
        k02.s(k02.g(object), r02);
    }
}

