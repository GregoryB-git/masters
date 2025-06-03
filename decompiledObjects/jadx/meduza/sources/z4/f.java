package z4;

import a4.g;
import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import v3.r1;
import z4.h;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public abstract class f<T> extends z4.a {

    /* renamed from: p, reason: collision with root package name */
    public final HashMap<T, b<T>> f17623p = new HashMap<>();

    /* renamed from: q, reason: collision with root package name */
    public Handler f17624q;

    /* renamed from: r, reason: collision with root package name */
    public t5.l0 f17625r;

    public final class a implements w, a4.g {

        /* renamed from: a, reason: collision with root package name */
        public final T f17626a;

        /* renamed from: b, reason: collision with root package name */
        public w.a f17627b;

        /* renamed from: c, reason: collision with root package name */
        public g.a f17628c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h.d dVar) {
            this.f17627b = f.this.q(null);
            this.f17628c = new g.a(f.this.f17558d.f182c, 0, null);
            this.f17626a = dVar;
        }

        @Override // a4.g
        public final /* synthetic */ void B() {
        }

        @Override // a4.g
        public final void E(int i10, t.b bVar) {
            if (b(i10, bVar)) {
                this.f17628c.c();
            }
        }

        @Override // a4.g
        public final void H(int i10, t.b bVar) {
            if (b(i10, bVar)) {
                this.f17628c.f();
            }
        }

        @Override // z4.w
        public final void M(int i10, t.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f17627b.f(nVar, d(qVar));
            }
        }

        @Override // a4.g
        public final void O(int i10, t.b bVar) {
            if (b(i10, bVar)) {
                this.f17628c.b();
            }
        }

        @Override // a4.g
        public final void P(int i10, t.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f17628c.e(exc);
            }
        }

        @Override // a4.g
        public final void U(int i10, t.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f17628c.d(i11);
            }
        }

        @Override // z4.w
        public final void V(int i10, t.b bVar, q qVar) {
            if (b(i10, bVar)) {
                this.f17627b.c(d(qVar));
            }
        }

        public final boolean b(int i10, t.b bVar) {
            t.b bVar2;
            if (bVar != null) {
                bVar2 = f.this.x(this.f17626a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int z10 = f.this.z(i10, this.f17626a);
            w.a aVar = this.f17627b;
            if (aVar.f17740a != z10 || !v5.e0.a(aVar.f17741b, bVar2)) {
                this.f17627b = new w.a(f.this.f17557c.f17742c, z10, bVar2, 0L);
            }
            g.a aVar2 = this.f17628c;
            if (aVar2.f180a == z10 && v5.e0.a(aVar2.f181b, bVar2)) {
                return true;
            }
            this.f17628c = new g.a(f.this.f17558d.f182c, z10, bVar2);
            return true;
        }

        public final q d(q qVar) {
            long y10 = f.this.y(this.f17626a, qVar.f);
            long y11 = f.this.y(this.f17626a, qVar.f17724g);
            return (y10 == qVar.f && y11 == qVar.f17724g) ? qVar : new q(qVar.f17719a, qVar.f17720b, qVar.f17721c, qVar.f17722d, qVar.f17723e, y10, y11);
        }

        @Override // z4.w
        public final void f0(int i10, t.b bVar, n nVar, q qVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f17627b.l(nVar, d(qVar), iOException, z10);
            }
        }

        @Override // z4.w
        public final void h0(int i10, t.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f17627b.o(nVar, d(qVar));
            }
        }

        @Override // a4.g
        public final void j0(int i10, t.b bVar) {
            if (b(i10, bVar)) {
                this.f17628c.a();
            }
        }

        @Override // z4.w
        public final void n0(int i10, t.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f17627b.i(nVar, d(qVar));
            }
        }

        @Override // z4.w
        public final void o0(int i10, t.b bVar, q qVar) {
            if (b(i10, bVar)) {
                this.f17627b.p(d(qVar));
            }
        }
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final t f17630a;

        /* renamed from: b, reason: collision with root package name */
        public final t.c f17631b;

        /* renamed from: c, reason: collision with root package name */
        public final f<T>.a f17632c;

        public b(t tVar, e eVar, a aVar) {
            this.f17630a = tVar;
            this.f17631b = eVar;
            this.f17632c = aVar;
        }
    }

    public abstract void A(Object obj, r1 r1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [z4.e, z4.t$c] */
    public final void B(final h.d dVar, t tVar) {
        x6.b.q(!this.f17623p.containsKey(dVar));
        ?? r02 = new t.c() { // from class: z4.e
            @Override // z4.t.c
            public final void a(t tVar2, r1 r1Var) {
                f.this.A(dVar, r1Var);
            }
        };
        a aVar = new a(dVar);
        this.f17623p.put(dVar, new b<>(tVar, r02, aVar));
        Handler handler = this.f17624q;
        handler.getClass();
        tVar.n(handler, aVar);
        Handler handler2 = this.f17624q;
        handler2.getClass();
        tVar.d(handler2, aVar);
        t5.l0 l0Var = this.f17625r;
        w3.a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        tVar.e(r02, l0Var, a0Var);
        if (!this.f17556b.isEmpty()) {
            return;
        }
        tVar.l(r02);
    }

    @Override // z4.t
    public void h() {
        Iterator<b<T>> it = this.f17623p.values().iterator();
        while (it.hasNext()) {
            it.next().f17630a.h();
        }
    }

    @Override // z4.a
    public void r() {
        for (b<T> bVar : this.f17623p.values()) {
            bVar.f17630a.l(bVar.f17631b);
        }
    }

    @Override // z4.a
    public void s() {
        for (b<T> bVar : this.f17623p.values()) {
            bVar.f17630a.b(bVar.f17631b);
        }
    }

    @Override // z4.a
    public void w() {
        for (b<T> bVar : this.f17623p.values()) {
            bVar.f17630a.a(bVar.f17631b);
            bVar.f17630a.m(bVar.f17632c);
            bVar.f17630a.c(bVar.f17632c);
        }
        this.f17623p.clear();
    }

    public abstract t.b x(T t, t.b bVar);

    public long y(T t, long j10) {
        return j10;
    }

    public abstract int z(int i10, Object obj);
}
