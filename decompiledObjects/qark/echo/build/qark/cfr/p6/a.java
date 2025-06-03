/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package p6;

import X5.d;
import X5.g;
import g6.p;
import p6.D;
import p6.E;
import p6.H;
import p6.I;
import p6.K;
import p6.M;
import p6.q0;
import p6.x0;
import p6.y0;
import p6.z;
import u6.F;

public abstract class a
extends x0
implements q0,
d,
I {
    public final g q;

    public a(g g8, boolean bl, boolean bl2) {
        super(bl2);
        if (bl) {
            this.e0((q0)g8.b(q0.n));
        }
        this.q = g8.k(this);
    }

    public void G0(Object object) {
        this.F(object);
    }

    public void H0(Throwable throwable, boolean bl) {
    }

    public void I0(Object object) {
    }

    public final void J0(K k8, Object object, p p8) {
        k8.e(p8, object, this);
    }

    @Override
    public String N() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(M.a(this));
        stringBuilder.append(" was cancelled");
        return stringBuilder.toString();
    }

    @Override
    public boolean a() {
        return super.a();
    }

    @Override
    public final void d0(Throwable throwable) {
        H.a(this.q, throwable);
    }

    @Override
    public g f() {
        return this.q;
    }

    @Override
    public final g getContext() {
        return this.q;
    }

    @Override
    public String l0() {
        String string2 = E.b(this.q);
        if (string2 == null) {
            return super.l0();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\"');
        stringBuilder.append(string2);
        stringBuilder.append("\":");
        stringBuilder.append(super.l0());
        return stringBuilder.toString();
    }

    @Override
    public final void q0(Object object) {
        if (object instanceof z) {
            object = (z)object;
            this.H0(object.a, object.a());
            return;
        }
        this.I0(object);
    }

    @Override
    public final void resumeWith(Object object) {
        if ((object = this.j0(D.d(object, null, 1, null))) == y0.b) {
            return;
        }
        this.G0(object);
    }
}

