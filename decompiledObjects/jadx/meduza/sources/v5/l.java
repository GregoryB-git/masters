package v5;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import v5.h;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public final v5.c f15913a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15914b;

    /* renamed from: c, reason: collision with root package name */
    public final b<T> f15915c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f15916d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f15917e;
    public final ArrayDeque<Runnable> f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15918g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15919h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15920i;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void d(T t, h hVar);
    }

    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f15921a;

        /* renamed from: b, reason: collision with root package name */
        public h.a f15922b = new h.a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f15923c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15924d;

        public c(T t) {
            this.f15921a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f15921a.equals(((c) obj).f15921a);
        }

        public final int hashCode() {
            return this.f15921a.hashCode();
        }
    }

    public l(Looper looper, v5.c cVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar);
    }

    public l(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, v5.c cVar, b<T> bVar) {
        this.f15913a = cVar;
        this.f15916d = copyOnWriteArraySet;
        this.f15915c = bVar;
        this.f15918g = new Object();
        this.f15917e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.f15914b = cVar.b(looper, new s5.b(this, 1));
        this.f15920i = true;
    }

    public final void a(T t) {
        t.getClass();
        synchronized (this.f15918g) {
            if (this.f15919h) {
                return;
            }
            this.f15916d.add(new c<>(t));
        }
    }

    public final void b() {
        f();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.f15914b.a()) {
            k kVar = this.f15914b;
            kVar.c(kVar.f(0));
        }
        boolean z10 = !this.f15917e.isEmpty();
        this.f15917e.addAll(this.f);
        this.f.clear();
        if (z10) {
            return;
        }
        while (!this.f15917e.isEmpty()) {
            this.f15917e.peekFirst().run();
            this.f15917e.removeFirst();
        }
    }

    public final void c(int i10, a<T> aVar) {
        f();
        this.f.add(new n1.a(new CopyOnWriteArraySet(this.f15916d), i10, aVar, 1));
    }

    public final void d() {
        f();
        synchronized (this.f15918g) {
            this.f15919h = true;
        }
        Iterator<c<T>> it = this.f15916d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f15915c;
            next.f15924d = true;
            if (next.f15923c) {
                next.f15923c = false;
                bVar.d(next.f15921a, next.f15922b.b());
            }
        }
        this.f15916d.clear();
    }

    public final void e(int i10, a<T> aVar) {
        c(i10, aVar);
        b();
    }

    public final void f() {
        if (this.f15920i) {
            x6.b.H(Thread.currentThread() == this.f15914b.l().getThread());
        }
    }
}
