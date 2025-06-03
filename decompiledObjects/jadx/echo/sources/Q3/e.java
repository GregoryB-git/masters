package Q3;

import Q3.r;
import V2.AbstractC0659j;
import V3.C;
import V3.C0663b;
import d4.C1227b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends p {

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ d4.n f4356o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y3.g f4357p;

        public a(d4.n nVar, Y3.g gVar) {
            this.f4356o = nVar;
            this.f4357p = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f4398a.m0(eVar.s(), this.f4356o, (InterfaceC0084e) this.f4357p.b());
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ d4.n f4359o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y3.g f4360p;

        public b(d4.n nVar, Y3.g gVar) {
            this.f4359o = nVar;
            this.f4360p = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f4398a.m0(eVar.s().U(C1227b.o()), this.f4359o, (InterfaceC0084e) this.f4360p.b());
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C0663b f4362o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y3.g f4363p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map f4364q;

        public c(C0663b c0663b, Y3.g gVar, Map map) {
            this.f4362o = c0663b;
            this.f4363p = gVar;
            this.f4364q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f4398a.o0(eVar.s(), this.f4362o, (InterfaceC0084e) this.f4363p.b(), this.f4364q);
        }
    }

    public class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ r.b f4366o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f4367p;

        public d(r.b bVar, boolean z7) {
            this.f4366o = bVar;
            this.f4367p = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f4398a.n0(eVar.s(), this.f4366o, this.f4367p);
        }
    }

    /* renamed from: Q3.e$e, reason: collision with other inner class name */
    public interface InterfaceC0084e {
        void a(Q3.c cVar, e eVar);
    }

    public e(V3.m mVar, V3.k kVar) {
        super(mVar, kVar);
    }

    public e W(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (s().isEmpty()) {
            Y3.n.i(str);
        } else {
            Y3.n.h(str);
        }
        return new e(this.f4398a, s().T(new V3.k(str)));
    }

    public String X() {
        if (s().isEmpty()) {
            return null;
        }
        return s().X().e();
    }

    public e Y() {
        V3.k a02 = s().a0();
        if (a02 != null) {
            return new e(this.f4398a, a02);
        }
        return null;
    }

    public n Z() {
        Y3.n.l(s());
        return new n(this.f4398a, s());
    }

    public void a0(r.b bVar, boolean z7) {
        if (bVar == null) {
            throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
        }
        Y3.n.l(s());
        this.f4398a.i0(new d(bVar, z7));
    }

    public AbstractC0659j b0(Object obj) {
        return c0(d4.r.c(this.f4399b, obj), null);
    }

    public final AbstractC0659j c0(d4.n nVar, InterfaceC0084e interfaceC0084e) {
        Y3.n.l(s());
        Y3.g l7 = Y3.m.l(interfaceC0084e);
        this.f4398a.i0(new b(nVar, l7));
        return (AbstractC0659j) l7.a();
    }

    public AbstractC0659j d0(Object obj) {
        return f0(obj, d4.r.c(this.f4399b, null), null);
    }

    public AbstractC0659j e0(Object obj, Object obj2) {
        return f0(obj, d4.r.c(this.f4399b, obj2), null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && toString().equals(obj.toString());
    }

    public final AbstractC0659j f0(Object obj, d4.n nVar, InterfaceC0084e interfaceC0084e) {
        Y3.n.l(s());
        C.g(s(), obj);
        Object b7 = Z3.a.b(obj);
        Y3.n.k(b7);
        d4.n b8 = d4.o.b(b7, nVar);
        Y3.g l7 = Y3.m.l(interfaceC0084e);
        this.f4398a.i0(new a(b8, l7));
        return (AbstractC0659j) l7.a();
    }

    public AbstractC0659j g0(Map map) {
        return h0(map, null);
    }

    public final AbstractC0659j h0(Map map, InterfaceC0084e interfaceC0084e) {
        if (map == null) {
            throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
        }
        Map c7 = Z3.a.c(map);
        C0663b D7 = C0663b.D(Y3.n.e(s(), c7));
        Y3.g l7 = Y3.m.l(interfaceC0084e);
        this.f4398a.i0(new c(D7, l7, c7));
        return (AbstractC0659j) l7.a();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        e Y6 = Y();
        if (Y6 == null) {
            return this.f4398a.toString();
        }
        try {
            return Y6.toString() + "/" + URLEncoder.encode(X(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e7) {
            throw new Q3.d("Failed to URLEncode key: " + X(), e7);
        }
    }
}
