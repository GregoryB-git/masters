package z4;

import a4.g;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v3.r1;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public abstract class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<t.c> f17555a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<t.c> f17556b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    public final w.a f17557c = new w.a();

    /* renamed from: d, reason: collision with root package name */
    public final g.a f17558d = new g.a();

    /* renamed from: e, reason: collision with root package name */
    public Looper f17559e;
    public r1 f;

    /* renamed from: o, reason: collision with root package name */
    public w3.a0 f17560o;

    @Override // z4.t
    public final void a(t.c cVar) {
        this.f17555a.remove(cVar);
        if (!this.f17555a.isEmpty()) {
            l(cVar);
            return;
        }
        this.f17559e = null;
        this.f = null;
        this.f17560o = null;
        this.f17556b.clear();
        w();
    }

    @Override // z4.t
    public final void b(t.c cVar) {
        this.f17559e.getClass();
        boolean isEmpty = this.f17556b.isEmpty();
        this.f17556b.add(cVar);
        if (isEmpty) {
            s();
        }
    }

    @Override // z4.t
    public final void c(a4.g gVar) {
        g.a aVar = this.f17558d;
        Iterator<g.a.C0005a> it = aVar.f182c.iterator();
        while (it.hasNext()) {
            g.a.C0005a next = it.next();
            if (next.f184b == gVar) {
                aVar.f182c.remove(next);
            }
        }
    }

    @Override // z4.t
    public final void d(Handler handler, a4.g gVar) {
        g.a aVar = this.f17558d;
        aVar.getClass();
        aVar.f182c.add(new g.a.C0005a(handler, gVar));
    }

    @Override // z4.t
    public final void e(t.c cVar, t5.l0 l0Var, w3.a0 a0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f17559e;
        x6.b.q(looper == null || looper == myLooper);
        this.f17560o = a0Var;
        r1 r1Var = this.f;
        this.f17555a.add(cVar);
        if (this.f17559e == null) {
            this.f17559e = myLooper;
            this.f17556b.add(cVar);
            t(l0Var);
        } else if (r1Var != null) {
            b(cVar);
            cVar.a(this, r1Var);
        }
    }

    @Override // z4.t
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // z4.t
    public /* synthetic */ r1 j() {
        return null;
    }

    @Override // z4.t
    public final void l(t.c cVar) {
        boolean z10 = !this.f17556b.isEmpty();
        this.f17556b.remove(cVar);
        if (z10 && this.f17556b.isEmpty()) {
            r();
        }
    }

    @Override // z4.t
    public final void m(w wVar) {
        w.a aVar = this.f17557c;
        Iterator<w.a.C0268a> it = aVar.f17742c.iterator();
        while (it.hasNext()) {
            w.a.C0268a next = it.next();
            if (next.f17745b == wVar) {
                aVar.f17742c.remove(next);
            }
        }
    }

    @Override // z4.t
    public final void n(Handler handler, w wVar) {
        w.a aVar = this.f17557c;
        aVar.getClass();
        aVar.f17742c.add(new w.a.C0268a(handler, wVar));
    }

    public final w.a q(t.b bVar) {
        return new w.a(this.f17557c.f17742c, 0, bVar, 0L);
    }

    public void r() {
    }

    public void s() {
    }

    public abstract void t(t5.l0 l0Var);

    public final void v(r1 r1Var) {
        this.f = r1Var;
        Iterator<t.c> it = this.f17555a.iterator();
        while (it.hasNext()) {
            it.next().a(this, r1Var);
        }
    }

    public abstract void w();
}
