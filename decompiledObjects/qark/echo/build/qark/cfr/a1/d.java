/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.List
 */
package a1;

import F0.L;
import F0.T;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import a1.b;
import a1.c;
import a1.f;
import a1.h;
import a1.i;
import a1.j;
import d0.A;
import g0.a;
import g0.z;
import java.util.List;

public class d
implements r {
    public static final x d = new c();
    public t a;
    public i b;
    public boolean c;

    public static /* synthetic */ r[] c() {
        return d.f();
    }

    private static /* synthetic */ r[] f() {
        return new r[]{new d()};
    }

    public static z h(z z8) {
        z8.T(0);
        return z8;
    }

    @Override
    public void a(long l8, long l9) {
        i i8 = this.b;
        if (i8 != null) {
            i8.m(l8, l9);
        }
    }

    @Override
    public void b(t t8) {
        this.a = t8;
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(s s8) {
        try {
            return this.j(s8);
        }
        catch (A a8) {
            return false;
        }
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        a.h(this.a);
        if (this.b == null) {
            if (this.j(s8)) {
                s8.h();
            } else {
                throw A.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.c) {
            T t8 = this.a.a(0, 1);
            this.a.j();
            this.b.d(this.a, t8);
            this.c = true;
        }
        return this.b.g(s8, l8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean j(s object) {
        block4 : {
            block6 : {
                Object object2;
                block7 : {
                    block5 : {
                        object2 = new f();
                        if (!object2.a((s)object, true)) break block4;
                        if ((object2.b & 2) != 2) {
                            return false;
                        }
                        int n8 = Math.min((int)object2.i, (int)8);
                        object2 = new z(n8);
                        object.n(object2.e(), 0, n8);
                        if (!b.p(d.h((z)object2))) break block5;
                        object = new b();
                        break block6;
                    }
                    if (!j.r(d.h((z)object2))) break block7;
                    object = new j();
                    break block6;
                }
                if (!h.o(d.h((z)object2))) break block4;
                object = new h();
            }
            this.b = object;
            return true;
        }
        return false;
    }

    @Override
    public void release() {
    }
}

