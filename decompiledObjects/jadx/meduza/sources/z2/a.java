package z2;

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
    public static final boolean f17480d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f17481e = Logger.getLogger(a.class.getName());
    public static final AbstractC0266a f;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f17482o;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f17483a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f17484b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f17485c;

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0266a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f17486c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f17487d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17488a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f17489b;

        static {
            if (a.f17480d) {
                f17487d = null;
                f17486c = null;
            } else {
                f17487d = new b(null, false);
                f17486c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f17488a = z10;
            this.f17489b = th;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f17490b = new c(new C0267a());

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f17491a;

        /* renamed from: z2.a$c$a, reason: collision with other inner class name */
        public class C0267a extends Throwable {
            public C0267a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z10 = a.f17480d;
            th.getClass();
            this.f17491a = th;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f17492d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f17493a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f17494b;

        /* renamed from: c, reason: collision with root package name */
        public d f17495c;

        public d(Runnable runnable, Executor executor) {
            this.f17493a = runnable;
            this.f17494b = executor;
        }
    }

    public static final class e extends AbstractC0266a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f17496a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f17497b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f17498c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f17499d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f17500e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f17496a = atomicReferenceFieldUpdater;
            this.f17497b = atomicReferenceFieldUpdater2;
            this.f17498c = atomicReferenceFieldUpdater3;
            this.f17499d = atomicReferenceFieldUpdater4;
            this.f17500e = atomicReferenceFieldUpdater5;
        }

        @Override // z2.a.AbstractC0266a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f17499d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // z2.a.AbstractC0266a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = this.f17500e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // z2.a.AbstractC0266a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f17498c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // z2.a.AbstractC0266a
        public final void d(h hVar, h hVar2) {
            this.f17497b.lazySet(hVar, hVar2);
        }

        @Override // z2.a.AbstractC0266a
        public final void e(h hVar, Thread thread) {
            this.f17496a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final a<V> f17501a;

        /* renamed from: b, reason: collision with root package name */
        public final s7.e<? extends V> f17502b;

        public f(a<V> aVar, s7.e<? extends V> eVar) {
            this.f17501a = aVar;
            this.f17502b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f17501a.f17483a != this) {
                return;
            }
            if (a.f.b(this.f17501a, this, a.e(this.f17502b))) {
                a.b(this.f17501a);
            }
        }
    }

    public static final class g extends AbstractC0266a {
        @Override // z2.a.AbstractC0266a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f17484b != dVar) {
                    return false;
                }
                aVar.f17484b = dVar2;
                return true;
            }
        }

        @Override // z2.a.AbstractC0266a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f17483a != obj) {
                    return false;
                }
                aVar.f17483a = obj2;
                return true;
            }
        }

        @Override // z2.a.AbstractC0266a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f17485c != hVar) {
                    return false;
                }
                aVar.f17485c = hVar2;
                return true;
            }
        }

        @Override // z2.a.AbstractC0266a
        public final void d(h hVar, h hVar2) {
            hVar.f17505b = hVar2;
        }

        @Override // z2.a.AbstractC0266a
        public final void e(h hVar, Thread thread) {
            hVar.f17504a = thread;
        }
    }

    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f17503c = new h(0);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f17504a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f17505b;

        public h() {
            a.f.e(this, Thread.currentThread());
        }

        public h(int i10) {
        }
    }

    static {
        AbstractC0266a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f = gVar;
        if (th != null) {
            f17481e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f17482o = new Object();
    }

    public static void b(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = aVar.f17485c;
            if (f.c(aVar, hVar, h.f17503c)) {
                while (hVar != null) {
                    Thread thread = hVar.f17504a;
                    if (thread != null) {
                        hVar.f17504a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f17505b;
                }
                do {
                    dVar = aVar.f17484b;
                } while (!f.a(aVar, dVar, d.f17492d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f17495c;
                    dVar3.f17495c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f17495c;
                    Runnable runnable = dVar2.f17493a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f17501a;
                        if (aVar.f17483a == fVar) {
                            if (f.b(aVar, fVar, e(fVar.f17502b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f17494b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f17481e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(s7.e<?> eVar) {
        Object obj;
        if (eVar instanceof a) {
            Object obj2 = ((a) eVar).f17483a;
            if (!(obj2 instanceof b)) {
                return obj2;
            }
            b bVar = (b) obj2;
            return bVar.f17488a ? bVar.f17489b != null ? new b(bVar.f17489b, false) : b.f17487d : obj2;
        }
        boolean isCancelled = eVar.isCancelled();
        boolean z10 = true;
        if ((!f17480d) && isCancelled) {
            return b.f17487d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = eVar.get();
                    break;
                } catch (CancellationException e10) {
                    if (isCancelled) {
                        return new b(e10, false);
                    }
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e10));
                } catch (ExecutionException e11) {
                    return new c(e11.getCause());
                } catch (Throwable th) {
                    return new c(th);
                }
            } catch (InterruptedException unused) {
                z11 = z10;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f17482o : obj;
    }

    public final void a(StringBuilder sb2) {
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
    public final boolean cancel(boolean z10) {
        Object obj = this.f17483a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = f17480d ? new b(new CancellationException("Future.cancel() was called."), z10) : z10 ? b.f17486c : b.f17487d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f.b(aVar, obj, bVar)) {
                b(aVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                s7.e<? extends V> eVar = ((f) obj).f17502b;
                if (!(eVar instanceof a)) {
                    eVar.cancel(z10);
                    return true;
                }
                aVar = (a) eVar;
                obj = aVar.f17483a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f17483a;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V d(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f17489b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f17491a);
        }
        if (obj == f17482o) {
            return null;
        }
        return obj;
    }

    @Override // s7.e
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f17484b;
        if (dVar != d.f17492d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f17495c = dVar;
                if (f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f17484b;
                }
            } while (dVar != d.f17492d);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f17483a;
        if (obj instanceof f) {
            StringBuilder l10 = defpackage.f.l("setFuture=[");
            s7.e<? extends V> eVar = ((f) obj).f17502b;
            return defpackage.g.f(l10, eVar == this ? "this future" : String.valueOf(eVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder l11 = defpackage.f.l("remaining delay=[");
        l11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        l11.append(" ms]");
        return l11.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f17483a;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return d(obj2);
        }
        h hVar = this.f17485c;
        if (hVar != h.f17503c) {
            h hVar2 = new h();
            do {
                AbstractC0266a abstractC0266a = f;
                abstractC0266a.d(hVar2, hVar);
                if (abstractC0266a.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f17483a;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return d(obj);
                }
                hVar = this.f17485c;
            } while (hVar != h.f17503c);
        }
        return d(this.f17483a);
    }

    public final void h(h hVar) {
        hVar.f17504a = null;
        while (true) {
            h hVar2 = this.f17485c;
            if (hVar2 == h.f17503c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f17505b;
                if (hVar2.f17504a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f17505b = hVar4;
                    if (hVar3.f17504a == null) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17483a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f17483a != null);
    }

    public final String toString() {
        String sb2;
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (!(this.f17483a instanceof b)) {
            if (!isDone()) {
                try {
                    sb2 = g();
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
            a(sb3);
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
        Object obj = this.f17483a;
        boolean z10 = true;
        if ((obj != null) && (!(obj instanceof f))) {
            return d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f17485c;
            if (hVar != h.f17503c) {
                h hVar2 = new h();
                do {
                    AbstractC0266a abstractC0266a = f;
                    abstractC0266a.d(hVar2, hVar);
                    if (abstractC0266a.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17483a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar2);
                    } else {
                        hVar = this.f17485c;
                    }
                } while (hVar != h.f17503c);
            }
            return d(this.f17483a);
        }
        while (nanos > 0) {
            Object obj3 = this.f17483a;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return d(obj3);
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
