package s;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<V> implements s7.e<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13910d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f13911e = Logger.getLogger(a.class.getName());
    public static final AbstractC0213a f;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f13912o;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f13913a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f13914b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f13915c;

    /* renamed from: s.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0213a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f13916c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f13917d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13918a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f13919b;

        static {
            if (a.f13910d) {
                f13917d = null;
                f13916c = null;
            } else {
                f13917d = new b(null, false);
                f13916c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f13918a = z10;
            this.f13919b = th;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f13920a;

        /* renamed from: s.a$c$a, reason: collision with other inner class name */
        public class C0214a extends Throwable {
            public C0214a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0214a());
        }

        public c(Throwable th) {
            boolean z10 = a.f13910d;
            th.getClass();
            this.f13920a = th;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f13921d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f13922a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f13923b;

        /* renamed from: c, reason: collision with root package name */
        public d f13924c;

        public d(Runnable runnable, Executor executor) {
            this.f13922a = runnable;
            this.f13923b = executor;
        }
    }

    public static final class e extends AbstractC0213a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f13925a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f13926b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f13927c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f13928d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f13929e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f13925a = atomicReferenceFieldUpdater;
            this.f13926b = atomicReferenceFieldUpdater2;
            this.f13927c = atomicReferenceFieldUpdater3;
            this.f13928d = atomicReferenceFieldUpdater4;
            this.f13929e = atomicReferenceFieldUpdater5;
        }

        @Override // s.a.AbstractC0213a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f13928d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // s.a.AbstractC0213a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = this.f13929e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // s.a.AbstractC0213a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f13927c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // s.a.AbstractC0213a
        public final void d(h hVar, h hVar2) {
            this.f13926b.lazySet(hVar, hVar2);
        }

        @Override // s.a.AbstractC0213a
        public final void e(h hVar, Thread thread) {
            this.f13925a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class g extends AbstractC0213a {
        @Override // s.a.AbstractC0213a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f13914b != dVar) {
                    return false;
                }
                aVar.f13914b = dVar2;
                return true;
            }
        }

        @Override // s.a.AbstractC0213a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f13913a != obj) {
                    return false;
                }
                aVar.f13913a = obj2;
                return true;
            }
        }

        @Override // s.a.AbstractC0213a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f13915c != hVar) {
                    return false;
                }
                aVar.f13915c = hVar2;
                return true;
            }
        }

        @Override // s.a.AbstractC0213a
        public final void d(h hVar, h hVar2) {
            hVar.f13932b = hVar2;
        }

        @Override // s.a.AbstractC0213a
        public final void e(h hVar, Thread thread) {
            hVar.f13931a = thread;
        }
    }

    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f13930c = new h(0);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f13931a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f13932b;

        public h() {
            a.f.e(this, Thread.currentThread());
        }

        public h(int i10) {
        }
    }

    static {
        AbstractC0213a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f = gVar;
        if (th != null) {
            f13911e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f13912o = new Object();
    }

    public static void i(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f13915c;
        } while (!f.c(aVar, hVar, h.f13930c));
        while (hVar != null) {
            Thread thread = hVar.f13931a;
            if (thread != null) {
                hVar.f13931a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f13932b;
        }
        aVar.h();
        do {
            dVar = aVar.f13914b;
        } while (!f.a(aVar, dVar, d.f13921d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f13924c;
            dVar.f13924c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f13924c;
            Runnable runnable = dVar2.f13922a;
            if (runnable instanceof f) {
                ((f) runnable).getClass();
                throw null;
            }
            l(runnable, dVar2.f13923b);
            dVar2 = dVar4;
        }
    }

    public static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f13911e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f13913a;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f13910d ? new b(new CancellationException("Future.cancel() was called."), z10) : z10 ? b.f13916c : b.f13917d;
            while (!f.b(this, obj, bVar)) {
                obj = this.f13913a;
                if (!(obj instanceof f)) {
                }
            }
            i(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // s7.e
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f13914b;
        if (dVar != d.f13921d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f13924c = dVar;
                if (f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f13914b;
                }
            } while (dVar != d.f13921d);
        }
        l(runnable, executor);
    }

    public final void g(StringBuilder sb2) {
        V v10;
        String str = "]";
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (CancellationException unused) {
                    str = "CANCELLED";
                    sb2.append(str);
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    str = " thrown from get()]";
                    sb2.append(str);
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append(str);
                    return;
                }
            } catch (InterruptedException unused2) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v10 == this ? "this future" : String.valueOf(v10));
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13913a;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return m(obj2);
        }
        h hVar = this.f13915c;
        if (hVar != h.f13930c) {
            h hVar2 = new h();
            do {
                AbstractC0213a abstractC0213a = f;
                abstractC0213a.d(hVar2, hVar);
                if (abstractC0213a.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f13913a;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return m(obj);
                }
                hVar = this.f13915c;
            } while (hVar != h.f13930c);
        }
        return m(this.f13913a);
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13913a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f13913a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V m(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f13919b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f13920a);
        }
        if (obj == f13912o) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String n() {
        Object obj = this.f13913a;
        if (obj instanceof f) {
            StringBuilder l10 = defpackage.f.l("setFuture=[");
            ((f) obj).getClass();
            l10.append("null");
            l10.append("]");
            return l10.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder l11 = defpackage.f.l("remaining delay=[");
        l11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        l11.append(" ms]");
        return l11.toString();
    }

    public final void o(h hVar) {
        hVar.f13931a = null;
        while (true) {
            h hVar2 = this.f13915c;
            if (hVar2 == h.f13930c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f13932b;
                if (hVar2.f13931a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f13932b = hVar4;
                    if (hVar3.f13931a == null) {
                        break;
                    }
                } else if (!f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) f13912o;
        }
        if (!f.b(this, null, v10)) {
            return false;
        }
        i(this);
        return true;
    }

    public boolean q(Throwable th) {
        th.getClass();
        if (!f.b(this, null, new c(th))) {
            return false;
        }
        i(this);
        return true;
    }

    public final String toString() {
        String sb2;
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (!(this.f13913a instanceof b)) {
            if (!isDone()) {
                try {
                    sb2 = n();
                } catch (RuntimeException e10) {
                    StringBuilder l10 = defpackage.f.l("Exception thrown from implementation: ");
                    l10.append(e10.getClass());
                    sb2 = l10.toString();
                }
                if (sb2 != null && !sb2.isEmpty()) {
                    sb3.append("PENDING, info=[");
                    sb3.append(sb2);
                    sb3.append("]");
                    sb3.append("]");
                    return sb3.toString();
                }
                str = isDone() ? "CANCELLED" : "PENDING";
            }
            g(sb3);
            sb3.append("]");
            return sb3.toString();
        }
        sb3.append(str);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f13913a;
        boolean z10 = true;
        if ((obj != null) && (!(obj instanceof f))) {
            return m(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f13915c;
            if (hVar != h.f13930c) {
                h hVar2 = new h();
                do {
                    AbstractC0213a abstractC0213a = f;
                    abstractC0213a.d(hVar2, hVar);
                    if (abstractC0213a.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f13913a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return m(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(hVar2);
                    } else {
                        hVar = this.f13915c;
                    }
                } while (hVar != h.f13930c);
            }
            return m(this.f13913a);
        }
        while (nanos > 0) {
            Object obj3 = this.f13913a;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return m(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String d10 = defpackage.g.d(str, " (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (convert > 0) {
                String str2 = d10 + convert + " " + lowerCase;
                if (z10) {
                    str2 = defpackage.g.d(str2, ",");
                }
                d10 = defpackage.g.d(str2, " ");
            }
            if (z10) {
                d10 = d10 + nanos2 + " nanoseconds ";
            }
            str = defpackage.g.d(d10, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(defpackage.g.d(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(defpackage.g.e(str, " for ", aVar));
    }
}
