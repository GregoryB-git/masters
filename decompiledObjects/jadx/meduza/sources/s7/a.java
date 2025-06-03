package s7;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class a<V> extends t7.a implements s7.e<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f14234d;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f14235e;
    public static final AbstractC0220a f;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f14236o;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f14237a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f14238b;

    /* renamed from: c, reason: collision with root package name */
    public volatile k f14239c;

    /* renamed from: s7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0220a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, k kVar, k kVar2);

        public abstract d d(a<?> aVar, d dVar);

        public abstract k e(a aVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f14240b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f14241c;

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f14242a;

        static {
            if (a.f14234d) {
                f14241c = null;
                f14240b = null;
            } else {
                f14241c = new b(null, false);
                f14240b = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f14242a = th;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f14243a;

        /* renamed from: s7.a$c$a, reason: collision with other inner class name */
        public class C0221a extends Throwable {
            public C0221a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0221a());
        }

        public c(Throwable th) {
            th.getClass();
            this.f14243a = th;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f14244d = new d();

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f14245a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f14246b;

        /* renamed from: c, reason: collision with root package name */
        public d f14247c;

        public d() {
            this.f14245a = null;
            this.f14246b = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.f14245a = runnable;
            this.f14246b = executor;
        }
    }

    public static final class e extends AbstractC0220a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, Thread> f14248a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, k> f14249b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, k> f14250c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f14251d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f14252e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f14248a = atomicReferenceFieldUpdater;
            this.f14249b = atomicReferenceFieldUpdater2;
            this.f14250c = atomicReferenceFieldUpdater3;
            this.f14251d = atomicReferenceFieldUpdater4;
            this.f14252e = atomicReferenceFieldUpdater5;
        }

        @Override // s7.a.AbstractC0220a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f14251d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // s7.a.AbstractC0220a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = this.f14252e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // s7.a.AbstractC0220a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater = this.f14250c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, kVar, kVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != kVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // s7.a.AbstractC0220a
        public final d d(a<?> aVar, d dVar) {
            return this.f14251d.getAndSet(aVar, dVar);
        }

        @Override // s7.a.AbstractC0220a
        public final k e(a aVar) {
            return this.f14250c.getAndSet(aVar, k.f14258c);
        }

        @Override // s7.a.AbstractC0220a
        public final void f(k kVar, k kVar2) {
            this.f14249b.lazySet(kVar, kVar2);
        }

        @Override // s7.a.AbstractC0220a
        public final void g(k kVar, Thread thread) {
            this.f14248a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class g extends AbstractC0220a {
        @Override // s7.a.AbstractC0220a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f14238b != dVar) {
                    return false;
                }
                aVar.f14238b = dVar2;
                return true;
            }
        }

        @Override // s7.a.AbstractC0220a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f14237a != obj) {
                    return false;
                }
                aVar.f14237a = obj2;
                return true;
            }
        }

        @Override // s7.a.AbstractC0220a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                if (aVar.f14239c != kVar) {
                    return false;
                }
                aVar.f14239c = kVar2;
                return true;
            }
        }

        @Override // s7.a.AbstractC0220a
        public final d d(a<?> aVar, d dVar) {
            d dVar2;
            synchronized (aVar) {
                dVar2 = aVar.f14238b;
                if (dVar2 != dVar) {
                    aVar.f14238b = dVar;
                }
            }
            return dVar2;
        }

        @Override // s7.a.AbstractC0220a
        public final k e(a aVar) {
            k kVar;
            k kVar2 = k.f14258c;
            synchronized (aVar) {
                kVar = aVar.f14239c;
                if (kVar != kVar2) {
                    aVar.f14239c = kVar2;
                }
            }
            return kVar;
        }

        @Override // s7.a.AbstractC0220a
        public final void f(k kVar, k kVar2) {
            kVar.f14260b = kVar2;
        }

        @Override // s7.a.AbstractC0220a
        public final void g(k kVar, Thread thread) {
            kVar.f14259a = thread;
        }
    }

    public interface h<V> extends s7.e<V> {
    }

    public static abstract class i<V> extends a<V> implements h<V> {
        @Override // s7.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // s7.a, s7.e
        public final void f(Runnable runnable, Executor executor) {
            super.f(runnable, executor);
        }

        @Override // s7.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // s7.a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // s7.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f14237a instanceof b;
        }

        @Override // s7.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public static final class j extends AbstractC0220a {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f14253a;

        /* renamed from: b, reason: collision with root package name */
        public static final long f14254b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f14255c;

        /* renamed from: d, reason: collision with root package name */
        public static final long f14256d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f14257e;
        public static final long f;

        /* renamed from: s7.a$j$a, reason: collision with other inner class name */
        public class C0222a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0222a());
                }
                try {
                    f14255c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                    f14254b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                    f14256d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                    f14257e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                    f14253a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                } catch (RuntimeException e11) {
                    throw e11;
                }
            } catch (PrivilegedActionException e12) {
                throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
            }
        }

        @Override // s7.a.AbstractC0220a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            return s7.b.a(f14253a, aVar, f14254b, dVar, dVar2);
        }

        @Override // s7.a.AbstractC0220a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            return s7.b.a(f14253a, aVar, f14256d, obj, obj2);
        }

        @Override // s7.a.AbstractC0220a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            return s7.b.a(f14253a, aVar, f14255c, kVar, kVar2);
        }

        @Override // s7.a.AbstractC0220a
        public final d d(a<?> aVar, d dVar) {
            d dVar2;
            do {
                dVar2 = aVar.f14238b;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!a(aVar, dVar2, dVar));
            return dVar2;
        }

        @Override // s7.a.AbstractC0220a
        public final k e(a aVar) {
            k kVar;
            k kVar2 = k.f14258c;
            do {
                kVar = aVar.f14239c;
                if (kVar2 == kVar) {
                    return kVar;
                }
            } while (!c(aVar, kVar, kVar2));
            return kVar;
        }

        @Override // s7.a.AbstractC0220a
        public final void f(k kVar, k kVar2) {
            f14253a.putObject(kVar, f, kVar2);
        }

        @Override // s7.a.AbstractC0220a
        public final void g(k kVar, Thread thread) {
            f14253a.putObject(kVar, f14257e, thread);
        }
    }

    public static final class k {

        /* renamed from: c, reason: collision with root package name */
        public static final k f14258c = new k(0);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f14259a;

        /* renamed from: b, reason: collision with root package name */
        public volatile k f14260b;

        public k() {
            a.f.g(this, Thread.currentThread());
        }

        public k(int i10) {
        }
    }

    static {
        boolean z10;
        AbstractC0220a gVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f14234d = z10;
        f14235e = Logger.getLogger(a.class.getName());
        Throwable th = null;
        try {
            gVar = new j();
            e = null;
        } catch (Error | RuntimeException e10) {
            e = e10;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                th = e11;
                gVar = new g();
            }
        }
        f = gVar;
        if (th != null) {
            Logger logger = f14235e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", e);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f14236o = new Object();
    }

    private void b(StringBuilder sb2) {
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
        c(sb2, v10);
        sb2.append("]");
    }

    public static void d(a aVar) {
        aVar.getClass();
        for (k e10 = f.e(aVar); e10 != null; e10 = e10.f14260b) {
            Thread thread = e10.f14259a;
            if (thread != null) {
                e10.f14259a = null;
                LockSupport.unpark(thread);
            }
        }
        d d10 = f.d(aVar, d.f14244d);
        d dVar = null;
        while (d10 != null) {
            d dVar2 = d10.f14247c;
            d10.f14247c = dVar;
            dVar = d10;
            d10 = dVar2;
        }
        while (dVar != null) {
            d dVar3 = dVar.f14247c;
            Runnable runnable = dVar.f14245a;
            Objects.requireNonNull(runnable);
            if (runnable instanceof f) {
                throw null;
            }
            Executor executor = dVar.f14246b;
            Objects.requireNonNull(executor);
            e(runnable, executor);
            dVar = dVar3;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f14235e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private static Object g(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f14242a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f14243a);
        }
        if (obj == f14236o) {
            return null;
        }
        return obj;
    }

    @Override // t7.a
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f14237a;
        if (obj instanceof c) {
            return ((c) obj).f14243a;
        }
        return null;
    }

    public final void c(StringBuilder sb2, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        b bVar;
        Object obj = this.f14237a;
        if ((obj == null) | (obj instanceof f)) {
            if (f14234d) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z10);
            } else {
                bVar = z10 ? b.f14240b : b.f14241c;
                Objects.requireNonNull(bVar);
            }
            while (!f.b(this, obj, bVar)) {
                obj = this.f14237a;
                if (!(obj instanceof f)) {
                }
            }
            d(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // s7.e
    public void f(Runnable runnable, Executor executor) {
        d dVar;
        x6.b.y(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f14238b) != d.f14244d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f14247c = dVar;
                if (f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f14238b;
                }
            } while (dVar != d.f14244d);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f14237a;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return (V) g(obj2);
        }
        k kVar = this.f14239c;
        if (kVar != k.f14258c) {
            k kVar2 = new k();
            do {
                AbstractC0220a abstractC0220a = f;
                abstractC0220a.f(kVar2, kVar);
                if (abstractC0220a.c(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f14237a;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return (V) g(obj);
                }
                kVar = this.f14239c;
            } while (kVar != k.f14258c);
        }
        Object obj3 = this.f14237a;
        Objects.requireNonNull(obj3);
        return (V) g(obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder l10 = defpackage.f.l("remaining delay=[");
        l10.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        l10.append(" ms]");
        return l10.toString();
    }

    public final void i(k kVar) {
        kVar.f14259a = null;
        while (true) {
            k kVar2 = this.f14239c;
            if (kVar2 == k.f14258c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f14260b;
                if (kVar2.f14259a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f14260b = kVar4;
                    if (kVar3.f14259a == null) {
                        break;
                    }
                } else if (!f.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f14237a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f14237a != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L1e
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L26
        L1e:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
        L26:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r7.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lc1
        L4d:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L57
            r7.b(r0)
            goto Lc1
        L57:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r7.f14237a
            boolean r4 = r3 instanceof s7.a.f
            java.lang.String r5 = "Exception thrown from implementation: "
            r6 = 0
            if (r4 == 0) goto L85
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            s7.a$f r3 = (s7.a.f) r3
            r3.getClass()
            r0.append(r6)     // Catch: java.lang.StackOverflowError -> L77 java.lang.RuntimeException -> L79
            goto Lae
        L77:
            r3 = move-exception
            goto L7a
        L79:
            r3 = move-exception
        L7a:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto Lae
        L85:
            java.lang.String r3 = r7.h()     // Catch: java.lang.StackOverflowError -> L92 java.lang.RuntimeException -> L94
            boolean r4 = n7.i.a(r3)     // Catch: java.lang.StackOverflowError -> L92 java.lang.RuntimeException -> L94
            if (r4 == 0) goto L90
            goto La4
        L90:
            r6 = r3
            goto La4
        L92:
            r3 = move-exception
            goto L95
        L94:
            r3 = move-exception
        L95:
            java.lang.StringBuilder r4 = defpackage.f.l(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r6 = r4.toString()
        La4:
            if (r6 == 0) goto Lb1
            java.lang.String r3 = ", info=["
            r0.append(r3)
            r0.append(r6)
        Lae:
            r0.append(r2)
        Lb1:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto Lc1
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.b(r0)
        Lc1:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.a.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00bb -> B:33:0x00c1). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
