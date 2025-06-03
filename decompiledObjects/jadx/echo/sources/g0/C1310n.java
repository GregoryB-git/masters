package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d0.C1193p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1310n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1299c f14307a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1307k f14308b;

    /* renamed from: c, reason: collision with root package name */
    public final b f14309c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f14310d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f14311e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f14312f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14313g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14314h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14315i;

    /* renamed from: g0.n$a */
    public interface a {
        void invoke(Object obj);
    }

    /* renamed from: g0.n$b */
    public interface b {
        void a(Object obj, C1193p c1193p);
    }

    /* renamed from: g0.n$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14316a;

        /* renamed from: b, reason: collision with root package name */
        public C1193p.b f14317b = new C1193p.b();

        /* renamed from: c, reason: collision with root package name */
        public boolean f14318c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14319d;

        public c(Object obj) {
            this.f14316a = obj;
        }

        public void a(int i7, a aVar) {
            if (this.f14319d) {
                return;
            }
            if (i7 != -1) {
                this.f14317b.a(i7);
            }
            this.f14318c = true;
            aVar.invoke(this.f14316a);
        }

        public void b(b bVar) {
            if (this.f14319d || !this.f14318c) {
                return;
            }
            C1193p e7 = this.f14317b.e();
            this.f14317b = new C1193p.b();
            this.f14318c = false;
            bVar.a(this.f14316a, e7);
        }

        public void c(b bVar) {
            this.f14319d = true;
            if (this.f14318c) {
                this.f14318c = false;
                bVar.a(this.f14316a, this.f14317b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f14316a.equals(((c) obj).f14316a);
        }

        public int hashCode() {
            return this.f14316a.hashCode();
        }
    }

    public C1310n(Looper looper, InterfaceC1299c interfaceC1299c, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1299c, bVar, true);
    }

    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i7, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i7, aVar);
        }
    }

    public void c(Object obj) {
        AbstractC1297a.e(obj);
        synchronized (this.f14313g) {
            try {
                if (this.f14314h) {
                    return;
                }
                this.f14310d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1310n d(Looper looper, InterfaceC1299c interfaceC1299c, b bVar) {
        return new C1310n(this.f14310d, looper, interfaceC1299c, bVar, this.f14315i);
    }

    public C1310n e(Looper looper, b bVar) {
        return d(looper, this.f14307a, bVar);
    }

    public void f() {
        l();
        if (this.f14312f.isEmpty()) {
            return;
        }
        if (!this.f14308b.a(1)) {
            InterfaceC1307k interfaceC1307k = this.f14308b;
            interfaceC1307k.d(interfaceC1307k.k(1));
        }
        boolean z7 = !this.f14311e.isEmpty();
        this.f14311e.addAll(this.f14312f);
        this.f14312f.clear();
        if (z7) {
            return;
        }
        while (!this.f14311e.isEmpty()) {
            ((Runnable) this.f14311e.peekFirst()).run();
            this.f14311e.removeFirst();
        }
    }

    public final boolean g(Message message) {
        Iterator it = this.f14310d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f14309c);
            if (this.f14308b.a(1)) {
                break;
            }
        }
        return true;
    }

    public void i(final int i7, final a aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f14310d);
        this.f14312f.add(new Runnable() { // from class: g0.m
            @Override // java.lang.Runnable
            public final void run() {
                C1310n.h(copyOnWriteArraySet, i7, aVar);
            }
        });
    }

    public void j() {
        l();
        synchronized (this.f14313g) {
            this.f14314h = true;
        }
        Iterator it = this.f14310d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f14309c);
        }
        this.f14310d.clear();
    }

    public void k(int i7, a aVar) {
        i(i7, aVar);
        f();
    }

    public final void l() {
        if (this.f14315i) {
            AbstractC1297a.f(Thread.currentThread() == this.f14308b.i().getThread());
        }
    }

    public C1310n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC1299c interfaceC1299c, b bVar, boolean z7) {
        this.f14307a = interfaceC1299c;
        this.f14310d = copyOnWriteArraySet;
        this.f14309c = bVar;
        this.f14313g = new Object();
        this.f14311e = new ArrayDeque();
        this.f14312f = new ArrayDeque();
        this.f14308b = interfaceC1299c.e(looper, new Handler.Callback() { // from class: g0.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g7;
                g7 = C1310n.this.g(message);
                return g7;
            }
        });
        this.f14315i = z7;
    }
}
