/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Set
 */
package z2;

import A2.I;
import A2.i;
import A2.n;
import T2.d;
import T2.f;
import T2.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import x2.b;
import y2.a;
import y2.e;
import z2.J;
import z2.K;
import z2.L;

public final class M
extends d
implements e.a,
e.b {
    public static final a.a i = S2.d.c;
    public final Context b;
    public final Handler c;
    public final a.a d;
    public final Set e;
    public final A2.d f;
    public S2.e g;
    public L h;

    public M(Context context, Handler handler, A2.d d8) {
        a.a a8 = i;
        this.b = context;
        this.c = handler;
        this.f = (A2.d)n.j(d8, "ClientSettings must not be null");
        this.e = d8.e();
        this.d = a8;
    }

    @Override
    public final void K(l l8) {
        this.c.post((Runnable)new K(this, l8));
    }

    public final void c1(L l8) {
        Object object = this.g;
        if (object != null) {
            object.c();
        }
        this.f.i(System.identityHashCode((Object)this));
        object = this.d;
        Context context = this.b;
        Looper looper = this.c.getLooper();
        A2.d d8 = this.f;
        this.g = object.a(context, looper, d8, d8.f(), this, this);
        this.h = l8;
        l8 = this.e;
        if (l8 != null && !l8.isEmpty()) {
            this.g.n();
            return;
        }
        this.c.post((Runnable)new J(this));
    }

    public final void d1() {
        S2.e e8 = this.g;
        if (e8 != null) {
            e8.c();
        }
    }

    @Override
    public final void n(int n8) {
        this.g.c();
    }

    @Override
    public final void o(b b8) {
        this.h.a(b8);
    }

    @Override
    public final void v(Bundle bundle) {
        this.g.d(this);
    }
}

