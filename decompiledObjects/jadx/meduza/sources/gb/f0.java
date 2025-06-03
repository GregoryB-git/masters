package gb;

import eb.k0;
import gb.h2;
import gb.r1;
import gb.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f0 implements h2 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f6345c;

    /* renamed from: d, reason: collision with root package name */
    public final eb.h1 f6346d;

    /* renamed from: e, reason: collision with root package name */
    public a f6347e;
    public b f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f6348g;

    /* renamed from: h, reason: collision with root package name */
    public h2.a f6349h;

    /* renamed from: j, reason: collision with root package name */
    public eb.e1 f6351j;

    /* renamed from: k, reason: collision with root package name */
    public k0.j f6352k;

    /* renamed from: l, reason: collision with root package name */
    public long f6353l;

    /* renamed from: a, reason: collision with root package name */
    public final eb.f0 f6343a = eb.f0.a(f0.class, null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f6344b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Collection<e> f6350i = new LinkedHashSet();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h2.a f6354a;

        public a(r1.g gVar) {
            this.f6354a = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6354a.e(true);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h2.a f6355a;

        public b(r1.g gVar) {
            this.f6355a = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6355a.e(false);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h2.a f6356a;

        public c(r1.g gVar) {
            this.f6356a = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6356a.d();
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.e1 f6357a;

        public d(eb.e1 e1Var) {
            this.f6357a = e1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f6349h.a(this.f6357a);
        }
    }

    public class e extends g0 {

        /* renamed from: j, reason: collision with root package name */
        public final k0.g f6359j;

        /* renamed from: k, reason: collision with root package name */
        public final eb.p f6360k = eb.p.b();

        /* renamed from: l, reason: collision with root package name */
        public final eb.h[] f6361l;

        public e(s2 s2Var, eb.h[] hVarArr) {
            this.f6359j = s2Var;
            this.f6361l = hVarArr;
        }

        @Override // gb.g0, gb.s
        public final void i(d2.q qVar) {
            if (Boolean.TRUE.equals(((s2) this.f6359j).f6805a.f5041h)) {
                qVar.e("wait_for_ready");
            }
            super.i(qVar);
        }

        @Override // gb.g0, gb.s
        public final void n(eb.e1 e1Var) {
            super.n(e1Var);
            synchronized (f0.this.f6344b) {
                f0 f0Var = f0.this;
                if (f0Var.f6348g != null) {
                    boolean remove = f0Var.f6350i.remove(this);
                    if (!f0.this.b() && remove) {
                        f0 f0Var2 = f0.this;
                        f0Var2.f6346d.b(f0Var2.f);
                        f0 f0Var3 = f0.this;
                        if (f0Var3.f6351j != null) {
                            f0Var3.f6346d.b(f0Var3.f6348g);
                            f0.this.f6348g = null;
                        }
                    }
                }
            }
            f0.this.f6346d.a();
        }

        @Override // gb.g0
        public final void s(eb.e1 e1Var) {
            for (eb.h hVar : this.f6361l) {
                hVar.o(e1Var);
            }
        }
    }

    public f0(Executor executor, eb.h1 h1Var) {
        this.f6345c = executor;
        this.f6346d = h1Var;
    }

    public final e a(s2 s2Var, eb.h[] hVarArr) {
        int size;
        e eVar = new e(s2Var, hVarArr);
        this.f6350i.add(eVar);
        synchronized (this.f6344b) {
            size = this.f6350i.size();
        }
        if (size == 1) {
            this.f6346d.b(this.f6347e);
        }
        for (eb.h hVar : hVarArr) {
            hVar.v();
        }
        return eVar;
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f6344b) {
            z10 = !this.f6350i.isEmpty();
        }
        return z10;
    }

    @Override // gb.h2
    public final void c(eb.e1 e1Var) {
        Runnable runnable;
        synchronized (this.f6344b) {
            if (this.f6351j != null) {
                return;
            }
            this.f6351j = e1Var;
            this.f6346d.b(new d(e1Var));
            if (!b() && (runnable = this.f6348g) != null) {
                this.f6346d.b(runnable);
                this.f6348g = null;
            }
            this.f6346d.a();
        }
    }

    @Override // gb.u
    public final s d(eb.t0<?, ?> t0Var, eb.s0 s0Var, eb.c cVar, eb.h[] hVarArr) {
        s l0Var;
        try {
            s2 s2Var = new s2(t0Var, s0Var, cVar);
            k0.j jVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f6344b) {
                    try {
                        eb.e1 e1Var = this.f6351j;
                        if (e1Var == null) {
                            k0.j jVar2 = this.f6352k;
                            if (jVar2 == null || (jVar != null && j10 == this.f6353l)) {
                                break;
                            }
                            j10 = this.f6353l;
                            u e10 = v0.e(jVar2.a(s2Var), Boolean.TRUE.equals(cVar.f5041h));
                            if (e10 != null) {
                                l0Var = e10.d(s2Var.f6807c, s2Var.f6806b, s2Var.f6805a, hVarArr);
                                break;
                            }
                            jVar = jVar2;
                        } else {
                            l0Var = new l0(e1Var, t.a.PROCESSED, hVarArr);
                            break;
                        }
                    } finally {
                    }
                }
            }
            l0Var = a(s2Var, hVarArr);
            return l0Var;
        } finally {
            this.f6346d.a();
        }
    }

    @Override // eb.e0
    public final eb.f0 f() {
        return this.f6343a;
    }

    @Override // gb.h2
    public final Runnable g(h2.a aVar) {
        this.f6349h = aVar;
        r1.g gVar = (r1.g) aVar;
        this.f6347e = new a(gVar);
        this.f = new b(gVar);
        this.f6348g = new c(gVar);
        return null;
    }

    @Override // gb.h2
    public final void h(eb.e1 e1Var) {
        Collection<e> collection;
        Runnable runnable;
        c(e1Var);
        synchronized (this.f6344b) {
            collection = this.f6350i;
            runnable = this.f6348g;
            this.f6348g = null;
            if (!collection.isEmpty()) {
                this.f6350i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                h0 t = eVar.t(new l0(e1Var, t.a.REFUSED, eVar.f6361l));
                if (t != null) {
                    t.run();
                }
            }
            this.f6346d.execute(runnable);
        }
    }

    public final void i(k0.j jVar) {
        Runnable runnable;
        synchronized (this.f6344b) {
            this.f6352k = jVar;
            this.f6353l++;
            if (jVar != null && b()) {
                ArrayList arrayList = new ArrayList(this.f6350i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    k0.f a10 = jVar.a(eVar.f6359j);
                    eb.c cVar = ((s2) eVar.f6359j).f6805a;
                    u e10 = v0.e(a10, Boolean.TRUE.equals(cVar.f5041h));
                    if (e10 != null) {
                        Executor executor = this.f6345c;
                        Executor executor2 = cVar.f5036b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        eb.p a11 = eVar.f6360k.a();
                        try {
                            k0.g gVar = eVar.f6359j;
                            s d10 = e10.d(((s2) gVar).f6807c, ((s2) gVar).f6806b, ((s2) gVar).f6805a, eVar.f6361l);
                            eVar.f6360k.c(a11);
                            h0 t = eVar.t(d10);
                            if (t != null) {
                                executor.execute(t);
                            }
                            arrayList2.add(eVar);
                        } catch (Throwable th) {
                            eVar.f6360k.c(a11);
                            throw th;
                        }
                    }
                }
                synchronized (this.f6344b) {
                    if (b()) {
                        this.f6350i.removeAll(arrayList2);
                        if (this.f6350i.isEmpty()) {
                            this.f6350i = new LinkedHashSet();
                        }
                        if (!b()) {
                            this.f6346d.b(this.f);
                            if (this.f6351j != null && (runnable = this.f6348g) != null) {
                                this.f6346d.b(runnable);
                                this.f6348g = null;
                            }
                        }
                        this.f6346d.a();
                    }
                }
            }
        }
    }
}
