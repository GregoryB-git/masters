package v3;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import v3.z0;
import z4.e0;
import z4.t;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final w3.a0 f15824a;

    /* renamed from: e, reason: collision with root package name */
    public final d f15828e;

    /* renamed from: h, reason: collision with root package name */
    public final w3.a f15830h;

    /* renamed from: i, reason: collision with root package name */
    public final v5.k f15831i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15833k;

    /* renamed from: l, reason: collision with root package name */
    public t5.l0 f15834l;

    /* renamed from: j, reason: collision with root package name */
    public z4.e0 f15832j = new e0.a();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<z4.r, c> f15826c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15827d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15825b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f15829g = new HashSet();

    public final class a implements z4.w, a4.g {

        /* renamed from: a, reason: collision with root package name */
        public final c f15835a;

        public a(c cVar) {
            this.f15835a = cVar;
        }

        @Override // a4.g
        public final /* synthetic */ void B() {
        }

        @Override // a4.g
        public final void E(int i10, t.b bVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new x0.f(7, this, b10));
            }
        }

        @Override // a4.g
        public final void H(int i10, t.b bVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new y0(this, b10, 0));
            }
        }

        @Override // z4.w
        public final void M(int i10, t.b bVar, z4.n nVar, z4.q qVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new p2.v(this, b10, nVar, qVar, 1));
            }
        }

        @Override // a4.g
        public final void O(int i10, t.b bVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new w.g(7, this, b10));
            }
        }

        @Override // a4.g
        public final void P(int i10, t.b bVar, Exception exc) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new x0.d(this, b10, exc, 2));
            }
        }

        @Override // a4.g
        public final void U(int i10, t.b bVar, int i11) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new p.s(this, b10, i11, 2));
            }
        }

        @Override // z4.w
        public final void V(int i10, t.b bVar, z4.q qVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new x0.g(this, b10, qVar, 3));
            }
        }

        public final Pair<Integer, t.b> b(int i10, t.b bVar) {
            t.b bVar2;
            t.b bVar3 = null;
            if (bVar != null) {
                c cVar = this.f15835a;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f15842c.size()) {
                        bVar2 = null;
                        break;
                    }
                    if (((t.b) cVar.f15842c.get(i11)).f17728d == bVar.f17728d) {
                        Object obj = bVar.f17725a;
                        Object obj2 = cVar.f15841b;
                        int i12 = v3.a.f15231e;
                        bVar2 = bVar.b(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
                }
                if (bVar2 == null) {
                    return null;
                }
                bVar3 = bVar2;
            }
            return Pair.create(Integer.valueOf(i10 + this.f15835a.f15843d), bVar3);
        }

        @Override // z4.w
        public final void f0(int i10, t.b bVar, final z4.n nVar, final z4.q qVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new Runnable() { // from class: v3.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        z0.a aVar = z0.a.this;
                        Pair pair = b10;
                        z0.this.f15830h.f0(((Integer) pair.first).intValue(), (t.b) pair.second, nVar, qVar, iOException, z10);
                    }
                });
            }
        }

        @Override // z4.w
        public final void h0(int i10, t.b bVar, z4.n nVar, z4.q qVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new v0(this, b10, nVar, qVar, 0));
            }
        }

        @Override // a4.g
        public final void j0(int i10, t.b bVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new y0(this, b10, 1));
            }
        }

        @Override // z4.w
        public final void n0(int i10, t.b bVar, z4.n nVar, z4.q qVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new v0(this, b10, nVar, qVar, 1));
            }
        }

        @Override // z4.w
        public final void o0(int i10, t.b bVar, z4.q qVar) {
            Pair<Integer, t.b> b10 = b(i10, bVar);
            if (b10 != null) {
                z0.this.f15831i.e(new x0(this, b10, qVar, 0));
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final z4.t f15837a;

        /* renamed from: b, reason: collision with root package name */
        public final t.c f15838b;

        /* renamed from: c, reason: collision with root package name */
        public final a f15839c;

        public b(z4.p pVar, u0 u0Var, a aVar) {
            this.f15837a = pVar;
            this.f15838b = u0Var;
            this.f15839c = aVar;
        }
    }

    public static final class c implements t0 {

        /* renamed from: a, reason: collision with root package name */
        public final z4.p f15840a;

        /* renamed from: d, reason: collision with root package name */
        public int f15843d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15844e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f15842c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f15841b = new Object();

        public c(z4.t tVar, boolean z10) {
            this.f15840a = new z4.p(tVar, z10);
        }

        @Override // v3.t0
        public final Object a() {
            return this.f15841b;
        }

        @Override // v3.t0
        public final r1 b() {
            return this.f15840a.f17711w;
        }
    }

    public interface d {
    }

    public z0(d dVar, w3.a aVar, v5.k kVar, w3.a0 a0Var) {
        this.f15824a = a0Var;
        this.f15828e = dVar;
        this.f15830h = aVar;
        this.f15831i = kVar;
    }

    public final r1 a(int i10, List<c> list, z4.e0 e0Var) {
        if (!list.isEmpty()) {
            this.f15832j = e0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f15825b.get(i11 - 1);
                    cVar.f15843d = cVar2.f15840a.f17711w.o() + cVar2.f15843d;
                } else {
                    cVar.f15843d = 0;
                }
                cVar.f15844e = false;
                cVar.f15842c.clear();
                b(i11, cVar.f15840a.f17711w.o());
                this.f15825b.add(i11, cVar);
                this.f15827d.put(cVar.f15841b, cVar);
                if (this.f15833k) {
                    f(cVar);
                    if (this.f15826c.isEmpty()) {
                        this.f15829g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.f15837a.l(bVar.f15838b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public final void b(int i10, int i11) {
        while (i10 < this.f15825b.size()) {
            ((c) this.f15825b.get(i10)).f15843d += i11;
            i10++;
        }
    }

    public final r1 c() {
        if (this.f15825b.isEmpty()) {
            return r1.f15743a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f15825b.size(); i11++) {
            c cVar = (c) this.f15825b.get(i11);
            cVar.f15843d = i10;
            i10 += cVar.f15840a.f17711w.o();
        }
        return new h1(this.f15825b, this.f15832j);
    }

    public final void d() {
        Iterator it = this.f15829g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f15842c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.f15837a.l(bVar.f15838b);
                }
                it.remove();
            }
        }
    }

    public final void e(c cVar) {
        if (cVar.f15844e && cVar.f15842c.isEmpty()) {
            b remove = this.f.remove(cVar);
            remove.getClass();
            remove.f15837a.a(remove.f15838b);
            remove.f15837a.m(remove.f15839c);
            remove.f15837a.c(remove.f15839c);
            this.f15829g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [v3.u0, z4.t$c] */
    public final void f(c cVar) {
        z4.p pVar = cVar.f15840a;
        ?? r12 = new t.c() { // from class: v3.u0
            @Override // z4.t.c
            public final void a(z4.t tVar, r1 r1Var) {
                ((g0) z0.this.f15828e).f15358p.i(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(pVar, r12, aVar));
        int i10 = v5.e0.f15881a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        pVar.n(new Handler(myLooper, null), aVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        pVar.d(new Handler(myLooper2, null), aVar);
        pVar.e(r12, this.f15834l, this.f15824a);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f15825b.remove(i12);
            this.f15827d.remove(cVar.f15841b);
            b(i12, -cVar.f15840a.f17711w.o());
            cVar.f15844e = true;
            if (this.f15833k) {
                e(cVar);
            }
        }
    }
}
