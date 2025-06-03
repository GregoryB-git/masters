package x0;

import android.os.Handler;
import android.os.Looper;
import d0.AbstractC1170I;
import d0.C1198u;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l0.y1;
import p0.v;
import x0.InterfaceC2117E;
import x0.InterfaceC2142x;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2120a implements InterfaceC2142x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20705a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f20706b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2117E.a f20707c = new InterfaceC2117E.a();

    /* renamed from: d, reason: collision with root package name */
    public final v.a f20708d = new v.a();

    /* renamed from: e, reason: collision with root package name */
    public Looper f20709e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1170I f20710f;

    /* renamed from: g, reason: collision with root package name */
    public y1 f20711g;

    public final void A(AbstractC1170I abstractC1170I) {
        this.f20710f = abstractC1170I;
        Iterator it = this.f20705a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2142x.c) it.next()).a(this, abstractC1170I);
        }
    }

    public abstract void B();

    @Override // x0.InterfaceC2142x
    public final void c(InterfaceC2117E interfaceC2117E) {
        this.f20707c.B(interfaceC2117E);
    }

    @Override // x0.InterfaceC2142x
    public final void d(InterfaceC2142x.c cVar) {
        boolean z7 = !this.f20706b.isEmpty();
        this.f20706b.remove(cVar);
        if (z7 && this.f20706b.isEmpty()) {
            v();
        }
    }

    @Override // x0.InterfaceC2142x
    public final void g(InterfaceC2142x.c cVar, i0.y yVar, y1 y1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f20709e;
        AbstractC1297a.a(looper == null || looper == myLooper);
        this.f20711g = y1Var;
        AbstractC1170I abstractC1170I = this.f20710f;
        this.f20705a.add(cVar);
        if (this.f20709e == null) {
            this.f20709e = myLooper;
            this.f20706b.add(cVar);
            z(yVar);
        } else if (abstractC1170I != null) {
            n(cVar);
            cVar.a(this, abstractC1170I);
        }
    }

    @Override // x0.InterfaceC2142x
    public /* synthetic */ boolean i() {
        return AbstractC2141w.b(this);
    }

    @Override // x0.InterfaceC2142x
    public /* synthetic */ AbstractC1170I j() {
        return AbstractC2141w.a(this);
    }

    @Override // x0.InterfaceC2142x
    public final void k(Handler handler, p0.v vVar) {
        AbstractC1297a.e(handler);
        AbstractC1297a.e(vVar);
        this.f20708d.g(handler, vVar);
    }

    @Override // x0.InterfaceC2142x
    public /* synthetic */ void l(C1198u c1198u) {
        AbstractC2141w.c(this, c1198u);
    }

    @Override // x0.InterfaceC2142x
    public final void m(InterfaceC2142x.c cVar) {
        this.f20705a.remove(cVar);
        if (!this.f20705a.isEmpty()) {
            d(cVar);
            return;
        }
        this.f20709e = null;
        this.f20710f = null;
        this.f20711g = null;
        this.f20706b.clear();
        B();
    }

    @Override // x0.InterfaceC2142x
    public final void n(InterfaceC2142x.c cVar) {
        AbstractC1297a.e(this.f20709e);
        boolean isEmpty = this.f20706b.isEmpty();
        this.f20706b.add(cVar);
        if (isEmpty) {
            w();
        }
    }

    @Override // x0.InterfaceC2142x
    public final void o(p0.v vVar) {
        this.f20708d.t(vVar);
    }

    @Override // x0.InterfaceC2142x
    public final void p(Handler handler, InterfaceC2117E interfaceC2117E) {
        AbstractC1297a.e(handler);
        AbstractC1297a.e(interfaceC2117E);
        this.f20707c.g(handler, interfaceC2117E);
    }

    public final v.a r(int i7, InterfaceC2142x.b bVar) {
        return this.f20708d.u(i7, bVar);
    }

    public final v.a s(InterfaceC2142x.b bVar) {
        return this.f20708d.u(0, bVar);
    }

    public final InterfaceC2117E.a t(int i7, InterfaceC2142x.b bVar) {
        return this.f20707c.E(i7, bVar);
    }

    public final InterfaceC2117E.a u(InterfaceC2142x.b bVar) {
        return this.f20707c.E(0, bVar);
    }

    public final y1 x() {
        return (y1) AbstractC1297a.h(this.f20711g);
    }

    public final boolean y() {
        return !this.f20706b.isEmpty();
    }

    public abstract void z(i0.y yVar);

    public void v() {
    }

    public void w() {
    }
}
