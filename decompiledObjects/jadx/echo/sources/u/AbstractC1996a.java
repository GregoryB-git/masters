package u;

import b3.InterfaceFutureC0796e;
import j3.C1371a;
import j3.C1372b;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1996a implements InterfaceFutureC0796e {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f19620r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f19621s = Logger.getLogger(AbstractC1996a.class.getName());

    /* renamed from: t, reason: collision with root package name */
    public static final b f19622t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f19623u;

    /* renamed from: o, reason: collision with root package name */
    public volatile Object f19624o;

    /* renamed from: p, reason: collision with root package name */
    public volatile e f19625p;

    /* renamed from: q, reason: collision with root package name */
    public volatile h f19626q;

    /* renamed from: u.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC1996a abstractC1996a, e eVar, e eVar2);

        public abstract boolean b(AbstractC1996a abstractC1996a, Object obj, Object obj2);

        public abstract boolean c(AbstractC1996a abstractC1996a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: u.a$c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f19627c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f19628d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19629a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f19630b;

        static {
            if (AbstractC1996a.f19620r) {
                f19628d = null;
                f19627c = null;
            } else {
                f19628d = new c(false, null);
                f19627c = new c(true, null);
            }
        }

        public c(boolean z7, Throwable th) {
            this.f19629a = z7;
            this.f19630b = th;
        }
    }

    /* renamed from: u.a$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f19631b = new d(new C0274a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f19632a;

        /* renamed from: u.a$d$a, reason: collision with other inner class name */
        public class C0274a extends Throwable {
            public C0274a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f19632a = (Throwable) AbstractC1996a.l(th);
        }
    }

    /* renamed from: u.a$e */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f19633d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f19634a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f19635b;

        /* renamed from: c, reason: collision with root package name */
        public e f19636c;

        public e(Runnable runnable, Executor executor) {
            this.f19634a = runnable;
            this.f19635b = executor;
        }
    }

    /* renamed from: u.a$f */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19637a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19638b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19639c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19640d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19641e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f19637a = atomicReferenceFieldUpdater;
            this.f19638b = atomicReferenceFieldUpdater2;
            this.f19639c = atomicReferenceFieldUpdater3;
            this.f19640d = atomicReferenceFieldUpdater4;
            this.f19641e = atomicReferenceFieldUpdater5;
        }

        @Override // u.AbstractC1996a.b
        public boolean a(AbstractC1996a abstractC1996a, e eVar, e eVar2) {
            return AbstractC1997b.a(this.f19640d, abstractC1996a, eVar, eVar2);
        }

        @Override // u.AbstractC1996a.b
        public boolean b(AbstractC1996a abstractC1996a, Object obj, Object obj2) {
            return AbstractC1997b.a(this.f19641e, abstractC1996a, obj, obj2);
        }

        @Override // u.AbstractC1996a.b
        public boolean c(AbstractC1996a abstractC1996a, h hVar, h hVar2) {
            return AbstractC1997b.a(this.f19639c, abstractC1996a, hVar, hVar2);
        }

        @Override // u.AbstractC1996a.b
        public void d(h hVar, h hVar2) {
            this.f19638b.lazySet(hVar, hVar2);
        }

        @Override // u.AbstractC1996a.b
        public void e(h hVar, Thread thread) {
            this.f19637a.lazySet(hVar, thread);
        }
    }

    /* renamed from: u.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // u.AbstractC1996a.b
        public boolean a(AbstractC1996a abstractC1996a, e eVar, e eVar2) {
            synchronized (abstractC1996a) {
                try {
                    if (abstractC1996a.f19625p != eVar) {
                        return false;
                    }
                    abstractC1996a.f19625p = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // u.AbstractC1996a.b
        public boolean b(AbstractC1996a abstractC1996a, Object obj, Object obj2) {
            synchronized (abstractC1996a) {
                try {
                    if (abstractC1996a.f19624o != obj) {
                        return false;
                    }
                    abstractC1996a.f19624o = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // u.AbstractC1996a.b
        public boolean c(AbstractC1996a abstractC1996a, h hVar, h hVar2) {
            synchronized (abstractC1996a) {
                try {
                    if (abstractC1996a.f19626q != hVar) {
                        return false;
                    }
                    abstractC1996a.f19626q = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // u.AbstractC1996a.b
        public void d(h hVar, h hVar2) {
            hVar.f19644b = hVar2;
        }

        @Override // u.AbstractC1996a.b
        public void e(h hVar, Thread thread) {
            hVar.f19643a = thread;
        }
    }

    /* renamed from: u.a$h */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f19642c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f19643a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f19644b;

        public h() {
            AbstractC1996a.f19622t.e(this, Thread.currentThread());
        }

        public h(boolean z7) {
        }

        public void a(h hVar) {
            AbstractC1996a.f19622t.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f19643a;
            if (thread != null) {
                this.f19643a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, C1371a.f15434e), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, C1372b.f15446b), AtomicReferenceFieldUpdater.newUpdater(AbstractC1996a.class, h.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1996a.class, e.class, "p"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1996a.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f19622t = gVar;
        if (th != null) {
            f19621s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f19623u = new Object();
    }

    public static CancellationException j(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object l(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void n(AbstractC1996a abstractC1996a) {
        abstractC1996a.w();
        abstractC1996a.h();
        e m7 = abstractC1996a.m(null);
        while (m7 != null) {
            e eVar = m7.f19636c;
            o(m7.f19634a, m7.f19635b);
            m7 = eVar;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f19621s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object r(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public boolean C(Throwable th) {
        if (!f19622t.b(this, null, new d((Throwable) l(th)))) {
            return false;
        }
        n(this);
        return true;
    }

    public final String D(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean F() {
        Object obj = this.f19624o;
        return (obj instanceof c) && ((c) obj).f19629a;
    }

    @Override // b3.InterfaceFutureC0796e
    public final void c(Runnable runnable, Executor executor) {
        l(runnable);
        l(executor);
        e eVar = this.f19625p;
        if (eVar != e.f19633d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f19636c = eVar;
                if (f19622t.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f19625p;
                }
            } while (eVar != e.f19633d);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f19624o;
        if (obj == null) {
            if (f19622t.b(this, obj, f19620r ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f19627c : c.f19628d)) {
                if (z7) {
                    s();
                }
                n(this);
                return true;
            }
        }
        return false;
    }

    public final void e(StringBuilder sb) {
        String str = "]";
        try {
            Object r7 = r(this);
            sb.append("SUCCESS, result=[");
            sb.append(D(r7));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append(str);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f19624o;
        if ((obj2 != null) && true) {
            return p(obj2);
        }
        h hVar = this.f19626q;
        if (hVar != h.f19642c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f19622t.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            x(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f19624o;
                    } while (!((obj != null) & true));
                    return p(obj);
                }
                hVar = this.f19626q;
            } while (hVar != h.f19642c);
        }
        return p(this.f19624o);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19624o instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f19624o != null) & true;
    }

    public final e m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f19625p;
        } while (!f19622t.a(this, eVar2, e.f19633d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f19636c;
            eVar4.f19636c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object p(Object obj) {
        if (obj instanceof c) {
            throw j("Task was cancelled.", ((c) obj).f19630b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f19632a);
        }
        if (obj == f19623u) {
            return null;
        }
        return obj;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = u();
                } catch (RuntimeException e7) {
                    str = "Exception thrown from implementation: " + e7.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            e(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String u() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void w() {
        h hVar;
        do {
            hVar = this.f19626q;
        } while (!f19622t.c(this, hVar, h.f19642c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f19644b;
        }
    }

    public final void x(h hVar) {
        hVar.f19643a = null;
        while (true) {
            h hVar2 = this.f19626q;
            if (hVar2 == h.f19642c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f19644b;
                if (hVar2.f19643a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f19644b = hVar4;
                    if (hVar3.f19643a == null) {
                        break;
                    }
                } else if (!f19622t.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean z(Object obj) {
        if (obj == null) {
            obj = f19623u;
        }
        if (!f19622t.b(this, null, obj)) {
            return false;
        }
        n(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f19624o;
        if ((obj != null) && true) {
            return p(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f19626q;
            if (hVar != h.f19642c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f19622t.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                x(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f19624o;
                            if ((obj2 != null) && true) {
                                return p(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        x(hVar2);
                    } else {
                        hVar = this.f19626q;
                    }
                } while (hVar != h.f19642c);
            }
            return p(this.f19624o);
        }
        while (nanos > 0) {
            Object obj3 = this.f19624o;
            if ((obj3 != null) && true) {
                return p(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC1996a = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            boolean z7 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z7) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z7) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractC1996a);
    }

    public void h() {
    }

    public void s() {
    }
}
