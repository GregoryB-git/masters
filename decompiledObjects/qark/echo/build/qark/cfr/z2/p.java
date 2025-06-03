/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package z2;

import A2.n;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import x2.j;
import z2.X;
import z2.b;
import z2.e;
import z2.g;

public final class p
extends X {
    public final t.b t = new t.b();
    public final e u;

    public p(g g8, e e8, j j8) {
        super(g8, j8);
        this.u = e8;
        this.o.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity object, e e8, b b8) {
        g g8 = LifecycleCallback.c((Activity)object);
        p p8 = (p)g8.b("ConnectionlessLifecycleHelper", p.class);
        object = p8;
        if (p8 == null) {
            object = new p(g8, e8, j.m());
        }
        n.j(b8, "ApiKey cannot be null");
        object.t.add(b8);
        e8.c((p)object);
    }

    @Override
    public final void h() {
        LifecycleCallback.super.h();
        this.v();
    }

    @Override
    public final void j() {
        super.j();
        this.v();
    }

    @Override
    public final void k() {
        super.k();
        this.u.d(this);
    }

    @Override
    public final void m(x2.b b8, int n8) {
        this.u.F(b8, n8);
    }

    @Override
    public final void n() {
        this.u.a();
    }

    public final t.b t() {
        return this.t;
    }

    public final void v() {
        if (!this.t.isEmpty()) {
            this.u.c(this);
        }
    }
}

