package oc;

import android.os.Handler;
import android.os.Looper;
import ec.i;
import java.util.concurrent.CancellationException;
import nc.e2;
import nc.l;
import nc.r0;
import nc.s1;
import nc.t0;
import nc.u1;
import p2.m0;
import sc.n;

/* loaded from: classes.dex */
public final class f extends g {
    private volatile f _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f12145c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12146d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12147e;
    public final f f;

    public f(Handler handler) {
        this(handler, null, false);
    }

    @Override // nc.a0
    public final boolean B0() {
        return (this.f12147e && i.a(Looper.myLooper(), this.f12145c.getLooper())) ? false : true;
    }

    @Override // nc.s1
    public final s1 C0() {
        return this.f;
    }

    public final void D0(ub.h hVar, Runnable runnable) {
        m0.l(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        r0.f11546b.z0(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).f12145c == this.f12145c;
    }

    @Override // nc.l0
    public final void f(long j10, l lVar) {
        d dVar = new d(lVar, this);
        Handler handler = this.f12145c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(dVar, j10)) {
            lVar.v(new e(this, dVar));
        } else {
            D0(lVar.f11516e, dVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12145c);
    }

    @Override // oc.g, nc.l0
    public final t0 q0(long j10, final e2 e2Var, ub.h hVar) {
        Handler handler = this.f12145c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(e2Var, j10)) {
            return new t0() { // from class: oc.c
                @Override // nc.t0
                public final void dispose() {
                    f fVar = f.this;
                    fVar.f12145c.removeCallbacks(e2Var);
                }
            };
        }
        D0(hVar, e2Var);
        return u1.f11557a;
    }

    @Override // nc.s1, nc.a0
    public final String toString() {
        s1 s1Var;
        String str;
        tc.c cVar = r0.f11545a;
        s1 s1Var2 = n.f14360a;
        if (this == s1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                s1Var = s1Var2.C0();
            } catch (UnsupportedOperationException unused) {
                s1Var = null;
            }
            str = this == s1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f12146d;
        if (str2 == null) {
            str2 = this.f12145c.toString();
        }
        return this.f12147e ? defpackage.g.d(str2, ".immediate") : str2;
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        if (this.f12145c.post(runnable)) {
            return;
        }
        D0(hVar, runnable);
    }

    public f(Handler handler, String str, boolean z10) {
        this.f12145c = handler;
        this.f12146d = str;
        this.f12147e = z10;
        this._immediate = z10 ? this : null;
        f fVar = this._immediate;
        if (fVar == null) {
            fVar = new f(handler, str, true);
            this._immediate = fVar;
        }
        this.f = fVar;
    }
}
