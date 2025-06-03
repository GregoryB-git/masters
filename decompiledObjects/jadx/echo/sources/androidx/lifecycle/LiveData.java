package androidx.lifecycle;

import androidx.lifecycle.d;
import java.util.Map;
import m.C1631a;
import n.b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f9654k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9655a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public n.b f9656b = new n.b();

    /* renamed from: c, reason: collision with root package name */
    public int f9657c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9658d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9659e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f9660f;

    /* renamed from: g, reason: collision with root package name */
    public int f9661g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9662h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9663i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f9664j;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements f {

        /* renamed from: s, reason: collision with root package name */
        public final h f9665s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ LiveData f9666t;

        @Override // androidx.lifecycle.f
        public void a(h hVar, d.b bVar) {
            d.c b7 = this.f9665s.g().b();
            if (b7 == d.c.DESTROYED) {
                this.f9666t.i(this.f9669o);
                return;
            }
            d.c cVar = null;
            while (cVar != b7) {
                b(d());
                cVar = b7;
                b7 = this.f9665s.g().b();
            }
        }

        public void c() {
            this.f9665s.g().c(this);
        }

        public boolean d() {
            return this.f9665s.g().b().c(d.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f9655a) {
                obj = LiveData.this.f9660f;
                LiveData.this.f9660f = LiveData.f9654k;
            }
            LiveData.this.j(obj);
        }
    }

    public class b extends c {
        public b(m mVar) {
            super(mVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean d() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: o, reason: collision with root package name */
        public final m f9669o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f9670p;

        /* renamed from: q, reason: collision with root package name */
        public int f9671q = -1;

        public c(m mVar) {
            this.f9669o = mVar;
        }

        public void b(boolean z7) {
            if (z7 == this.f9670p) {
                return;
            }
            this.f9670p = z7;
            LiveData.this.b(z7 ? 1 : -1);
            if (this.f9670p) {
                LiveData.this.d(this);
            }
        }

        public void c() {
        }

        public abstract boolean d();
    }

    public LiveData() {
        Object obj = f9654k;
        this.f9660f = obj;
        this.f9664j = new a();
        this.f9659e = obj;
        this.f9661g = -1;
    }

    public static void a(String str) {
        if (C1631a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i7) {
        int i8 = this.f9657c;
        this.f9657c = i7 + i8;
        if (this.f9658d) {
            return;
        }
        this.f9658d = true;
        while (true) {
            try {
                int i9 = this.f9657c;
                if (i8 == i9) {
                    this.f9658d = false;
                    return;
                }
                boolean z7 = i8 == 0 && i9 > 0;
                boolean z8 = i8 > 0 && i9 == 0;
                if (z7) {
                    f();
                } else if (z8) {
                    g();
                }
                i8 = i9;
            } catch (Throwable th) {
                this.f9658d = false;
                throw th;
            }
        }
    }

    public final void c(c cVar) {
        if (cVar.f9670p) {
            if (!cVar.d()) {
                cVar.b(false);
                return;
            }
            int i7 = cVar.f9671q;
            int i8 = this.f9661g;
            if (i7 >= i8) {
                return;
            }
            cVar.f9671q = i8;
            cVar.f9669o.a(this.f9659e);
        }
    }

    public void d(c cVar) {
        if (this.f9662h) {
            this.f9663i = true;
            return;
        }
        this.f9662h = true;
        do {
            this.f9663i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                b.d f7 = this.f9656b.f();
                while (f7.hasNext()) {
                    c((c) ((Map.Entry) f7.next()).getValue());
                    if (this.f9663i) {
                        break;
                    }
                }
            }
        } while (this.f9663i);
        this.f9662h = false;
    }

    public void e(m mVar) {
        a("observeForever");
        b bVar = new b(mVar);
        c cVar = (c) this.f9656b.k(mVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.b(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(Object obj) {
        boolean z7;
        synchronized (this.f9655a) {
            z7 = this.f9660f == f9654k;
            this.f9660f = obj;
        }
        if (z7) {
            C1631a.d().c(this.f9664j);
        }
    }

    public void i(m mVar) {
        a("removeObserver");
        c cVar = (c) this.f9656b.q(mVar);
        if (cVar == null) {
            return;
        }
        cVar.c();
        cVar.b(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f9661g++;
        this.f9659e = obj;
        d(null);
    }
}
