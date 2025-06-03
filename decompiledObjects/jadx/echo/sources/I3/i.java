package I3;

import H3.AbstractC0387i;
import H3.C0392n;
import I3.i;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1977f;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final d f2549a;

    /* renamed from: b, reason: collision with root package name */
    public final C0392n f2550b;

    /* renamed from: c, reason: collision with root package name */
    public String f2551c;

    /* renamed from: d, reason: collision with root package name */
    public final a f2552d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    public final a f2553e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicMarkableReference f2554f = new AtomicMarkableReference(null, false);

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f2555a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference f2556b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2557c;

        public a(boolean z7) {
            this.f2557c = z7;
            this.f2555a = new AtomicMarkableReference(new b(64, z7 ? 8192 : 1024), false);
        }

        public Map b() {
            return ((b) this.f2555a.getReference()).a();
        }

        public final /* synthetic */ Void c() {
            this.f2556b.set(null);
            e();
            return null;
        }

        public final void d() {
            Callable callable = new Callable() { // from class: I3.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c7;
                    c7 = i.a.this.c();
                    return c7;
                }
            };
            if (AbstractC1977f.a(this.f2556b, null, callable)) {
                i.this.f2550b.h(callable);
            }
        }

        public final void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f2555a.isMarked()) {
                        map = ((b) this.f2555a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f2555a;
                        atomicMarkableReference.set((b) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                i.this.f2549a.m(i.this.f2551c, map, this.f2557c);
            }
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((b) this.f2555a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f2555a;
                    atomicMarkableReference.set((b) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public i(String str, M3.g gVar, C0392n c0392n) {
        this.f2551c = str;
        this.f2549a = new d(gVar);
        this.f2550b = c0392n;
    }

    public static i i(String str, M3.g gVar, C0392n c0392n) {
        d dVar = new d(gVar);
        i iVar = new i(str, gVar, c0392n);
        ((b) iVar.f2552d.f2555a.getReference()).e(dVar.g(str, false));
        ((b) iVar.f2553e.f2555a.getReference()).e(dVar.g(str, true));
        iVar.f2554f.set(dVar.h(str), false);
        return iVar;
    }

    public static String j(String str, M3.g gVar) {
        return new d(gVar).h(str);
    }

    public Map e() {
        return this.f2552d.b();
    }

    public Map f() {
        return this.f2553e.b();
    }

    public String g() {
        return (String) this.f2554f.getReference();
    }

    public final /* synthetic */ Object h() {
        k();
        return null;
    }

    public final void k() {
        boolean z7;
        String str;
        synchronized (this.f2554f) {
            try {
                z7 = false;
                if (this.f2554f.isMarked()) {
                    str = g();
                    this.f2554f.set(str, false);
                    z7 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            this.f2549a.n(this.f2551c, str);
        }
    }

    public boolean l(String str, String str2) {
        return this.f2552d.f(str, str2);
    }

    public boolean m(String str, String str2) {
        return this.f2553e.f(str, str2);
    }

    public void n(String str) {
        synchronized (this.f2551c) {
            try {
                this.f2551c = str;
                Map b7 = this.f2552d.b();
                if (g() != null) {
                    this.f2549a.n(str, g());
                }
                if (!b7.isEmpty()) {
                    this.f2549a.l(str, b7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(String str) {
        String c7 = b.c(str, 1024);
        synchronized (this.f2554f) {
            try {
                if (AbstractC0387i.z(c7, (String) this.f2554f.getReference())) {
                    return;
                }
                this.f2554f.set(c7, true);
                this.f2550b.h(new Callable() { // from class: I3.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object h7;
                        h7 = i.this.h();
                        return h7;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
