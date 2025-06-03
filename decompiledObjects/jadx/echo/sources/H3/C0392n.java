package H3;

import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: H3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0392n {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2285a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0659j f2286b = V2.m.e(null);

    /* renamed from: c, reason: collision with root package name */
    public final Object f2287c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f2288d = new ThreadLocal();

    /* renamed from: H3.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0392n.this.f2288d.set(Boolean.TRUE);
        }
    }

    /* renamed from: H3.n$b */
    public class b implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Runnable f2290o;

        public b(Runnable runnable) {
            this.f2290o = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f2290o.run();
            return null;
        }
    }

    /* renamed from: H3.n$c */
    public class c implements InterfaceC0651b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f2292a;

        public c(Callable callable) {
            this.f2292a = callable;
        }

        @Override // V2.InterfaceC0651b
        public Object a(AbstractC0659j abstractC0659j) {
            return this.f2292a.call();
        }
    }

    /* renamed from: H3.n$d */
    public class d implements InterfaceC0651b {
        public d() {
        }

        @Override // V2.InterfaceC0651b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(AbstractC0659j abstractC0659j) {
            return null;
        }
    }

    public C0392n(Executor executor) {
        this.f2285a = executor;
        executor.execute(new a());
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f2285a;
    }

    public final AbstractC0659j d(AbstractC0659j abstractC0659j) {
        return abstractC0659j.g(this.f2285a, new d());
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.f2288d.get());
    }

    public final InterfaceC0651b f(Callable callable) {
        return new c(callable);
    }

    public AbstractC0659j g(Runnable runnable) {
        return h(new b(runnable));
    }

    public AbstractC0659j h(Callable callable) {
        AbstractC0659j g7;
        synchronized (this.f2287c) {
            g7 = this.f2286b.g(this.f2285a, f(callable));
            this.f2286b = d(g7);
        }
        return g7;
    }

    public AbstractC0659j i(Callable callable) {
        AbstractC0659j h7;
        synchronized (this.f2287c) {
            h7 = this.f2286b.h(this.f2285a, f(callable));
            this.f2286b = d(h7);
        }
        return h7;
    }
}
