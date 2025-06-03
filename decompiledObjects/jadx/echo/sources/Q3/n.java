package Q3;

import Q3.e;
import V2.AbstractC0659j;
import V3.C;
import java.util.Map;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public V3.m f4387a;

    /* renamed from: b, reason: collision with root package name */
    public V3.k f4388b;

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ d4.n f4389o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y3.g f4390p;

        public a(d4.n nVar, Y3.g gVar) {
            this.f4389o = nVar;
            this.f4390p = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f4387a.U(n.this.f4388b, this.f4389o, (e.InterfaceC0084e) this.f4390p.b());
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Map f4392o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y3.g f4393p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map f4394q;

        public b(Map map, Y3.g gVar, Map map2) {
            this.f4392o = map;
            this.f4393p = gVar;
            this.f4394q = map2;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f4387a.V(n.this.f4388b, this.f4392o, (e.InterfaceC0084e) this.f4393p.b(), this.f4394q);
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y3.g f4396o;

        public c(Y3.g gVar) {
            this.f4396o = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f4387a.T(n.this.f4388b, (e.InterfaceC0084e) this.f4396o.b());
        }
    }

    public n(V3.m mVar, V3.k kVar) {
        this.f4387a = mVar;
        this.f4388b = kVar;
    }

    public AbstractC0659j c() {
        return d(null);
    }

    public final AbstractC0659j d(e.InterfaceC0084e interfaceC0084e) {
        Y3.g l7 = Y3.m.l(interfaceC0084e);
        this.f4387a.i0(new c(l7));
        return (AbstractC0659j) l7.a();
    }

    public final AbstractC0659j e(Object obj, d4.n nVar, e.InterfaceC0084e interfaceC0084e) {
        Y3.n.l(this.f4388b);
        C.g(this.f4388b, obj);
        Object b7 = Z3.a.b(obj);
        Y3.n.k(b7);
        d4.n b8 = d4.o.b(b7, nVar);
        Y3.g l7 = Y3.m.l(interfaceC0084e);
        this.f4387a.i0(new a(b8, l7));
        return (AbstractC0659j) l7.a();
    }

    public AbstractC0659j f(Object obj) {
        return e(obj, d4.r.a(), null);
    }

    public AbstractC0659j g(Object obj, double d7) {
        return e(obj, d4.r.c(this.f4388b, Double.valueOf(d7)), null);
    }

    public AbstractC0659j h(Object obj, String str) {
        return e(obj, d4.r.c(this.f4388b, str), null);
    }

    public AbstractC0659j i(Map map) {
        return j(map, null);
    }

    public final AbstractC0659j j(Map map, e.InterfaceC0084e interfaceC0084e) {
        Map e7 = Y3.n.e(this.f4388b, map);
        Y3.g l7 = Y3.m.l(interfaceC0084e);
        this.f4387a.i0(new b(e7, l7, map));
        return (AbstractC0659j) l7.a();
    }
}
