package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m.C1631a;
import n.C1687a;
import n.b;

/* loaded from: classes.dex */
public class i extends d {

    /* renamed from: b, reason: collision with root package name */
    public C1687a f9695b;

    /* renamed from: c, reason: collision with root package name */
    public d.c f9696c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f9697d;

    /* renamed from: e, reason: collision with root package name */
    public int f9698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9699f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9700g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f9701h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9702i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public d.c f9703a;

        /* renamed from: b, reason: collision with root package name */
        public f f9704b;

        public a(g gVar, d.c cVar) {
            this.f9704b = j.f(gVar);
            this.f9703a = cVar;
        }

        public void a(h hVar, d.b bVar) {
            d.c e7 = bVar.e();
            this.f9703a = i.k(this.f9703a, e7);
            this.f9704b.a(hVar, bVar);
            this.f9703a = e7;
        }
    }

    public i(h hVar) {
        this(hVar, true);
    }

    public static d.c k(d.c cVar, d.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // androidx.lifecycle.d
    public void a(g gVar) {
        h hVar;
        f("addObserver");
        d.c cVar = this.f9696c;
        d.c cVar2 = d.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = d.c.INITIALIZED;
        }
        a aVar = new a(gVar, cVar2);
        if (((a) this.f9695b.k(gVar, aVar)) == null && (hVar = (h) this.f9697d.get()) != null) {
            boolean z7 = this.f9698e != 0 || this.f9699f;
            d.c e7 = e(gVar);
            this.f9698e++;
            while (aVar.f9703a.compareTo(e7) < 0 && this.f9695b.contains(gVar)) {
                n(aVar.f9703a);
                d.b h7 = d.b.h(aVar.f9703a);
                if (h7 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f9703a);
                }
                aVar.a(hVar, h7);
                m();
                e7 = e(gVar);
            }
            if (!z7) {
                p();
            }
            this.f9698e--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.c b() {
        return this.f9696c;
    }

    @Override // androidx.lifecycle.d
    public void c(g gVar) {
        f("removeObserver");
        this.f9695b.q(gVar);
    }

    public final void d(h hVar) {
        Iterator descendingIterator = this.f9695b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f9700g) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f9703a.compareTo(this.f9696c) > 0 && !this.f9700g && this.f9695b.contains(entry.getKey())) {
                d.b c7 = d.b.c(aVar.f9703a);
                if (c7 == null) {
                    throw new IllegalStateException("no event down from " + aVar.f9703a);
                }
                n(c7.e());
                aVar.a(hVar, c7);
                m();
            }
        }
    }

    public final d.c e(g gVar) {
        Map.Entry s7 = this.f9695b.s(gVar);
        d.c cVar = null;
        d.c cVar2 = s7 != null ? ((a) s7.getValue()).f9703a : null;
        if (!this.f9701h.isEmpty()) {
            cVar = (d.c) this.f9701h.get(r0.size() - 1);
        }
        return k(k(this.f9696c, cVar2), cVar);
    }

    public final void f(String str) {
        if (!this.f9702i || C1631a.d().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void g(h hVar) {
        b.d f7 = this.f9695b.f();
        while (f7.hasNext() && !this.f9700g) {
            Map.Entry entry = (Map.Entry) f7.next();
            a aVar = (a) entry.getValue();
            while (aVar.f9703a.compareTo(this.f9696c) < 0 && !this.f9700g && this.f9695b.contains(entry.getKey())) {
                n(aVar.f9703a);
                d.b h7 = d.b.h(aVar.f9703a);
                if (h7 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f9703a);
                }
                aVar.a(hVar, h7);
                m();
            }
        }
    }

    public void h(d.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.e());
    }

    public final boolean i() {
        if (this.f9695b.size() == 0) {
            return true;
        }
        d.c cVar = ((a) this.f9695b.a().getValue()).f9703a;
        d.c cVar2 = ((a) this.f9695b.g().getValue()).f9703a;
        return cVar == cVar2 && this.f9696c == cVar2;
    }

    public void j(d.c cVar) {
        f("markState");
        o(cVar);
    }

    public final void l(d.c cVar) {
        if (this.f9696c == cVar) {
            return;
        }
        this.f9696c = cVar;
        if (this.f9699f || this.f9698e != 0) {
            this.f9700g = true;
            return;
        }
        this.f9699f = true;
        p();
        this.f9699f = false;
    }

    public final void m() {
        this.f9701h.remove(r0.size() - 1);
    }

    public final void n(d.c cVar) {
        this.f9701h.add(cVar);
    }

    public void o(d.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    public final void p() {
        h hVar = (h) this.f9697d.get();
        if (hVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i7 = i();
            this.f9700g = false;
            if (i7) {
                return;
            }
            if (this.f9696c.compareTo(((a) this.f9695b.a().getValue()).f9703a) < 0) {
                d(hVar);
            }
            Map.Entry g7 = this.f9695b.g();
            if (!this.f9700g && g7 != null && this.f9696c.compareTo(((a) g7.getValue()).f9703a) > 0) {
                g(hVar);
            }
        }
    }

    public i(h hVar, boolean z7) {
        this.f9695b = new C1687a();
        this.f9698e = 0;
        this.f9699f = false;
        this.f9700g = false;
        this.f9701h = new ArrayList();
        this.f9697d = new WeakReference(hVar);
        this.f9696c = d.c.INITIALIZED;
        this.f9702i = z7;
    }
}
