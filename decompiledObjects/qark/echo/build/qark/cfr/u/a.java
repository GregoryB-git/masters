/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Future
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 *  java.util.concurrent.locks.LockSupport
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package u;

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

public abstract class a
implements b3.e {
    public static final boolean r;
    public static final Logger s;
    public static final b t;
    public static final Object u;
    public volatile Object o;
    public volatile e p;
    public volatile h q;

    static {
        b b82;
        Object var0_1;
        b b82;
        r = Boolean.parseBoolean((String)System.getProperty((String)"guava.concurrent.generate_cancellation_cause", (String)"false"));
        s = Logger.getLogger((String)a.class.getName());
        try {
            b82 = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, (String)"a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, (String)"b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, (String)"q"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, (String)"p"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, (String)"o"));
            var0_1 = null;
        }
        catch (Throwable throwable) {
            b82 = new g();
        }
        t = b82;
        if (var0_1 != null) {
            s.log(Level.SEVERE, "SafeAtomicHelper is broken!", (Throwable)var0_1);
        }
        u = new Object();
    }

    public static CancellationException j(String string2, Throwable throwable) {
        string2 = new CancellationException(string2);
        string2.initCause(throwable);
        return string2;
    }

    public static Object l(Object object) {
        object.getClass();
        return object;
    }

    public static void n(a object) {
        object.w();
        object.h();
        object = object.m(null);
        while (object != null) {
            e e8 = object.c;
            a.o(object.a, object.b);
            object = e8;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeException) {
            Logger logger = s;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append((Object)runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append((Object)executor);
            logger.log(level, stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object r(Future future) {
        boolean bl = false;
        do {
            Object object;
            block5 : {
                try {
                    object = future.get();
                    if (!bl) break block5;
                }
                catch (Throwable throwable) {
                    if (bl) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {}
                Thread.currentThread().interrupt();
            }
            return object;
            bl = true;
        } while (true);
    }

    public boolean C(Throwable object) {
        if (t.b(this, null, object = new d((Throwable)a.l(object)))) {
            a.n(this);
            return true;
        }
        return false;
    }

    public final String D(Object object) {
        if (object == this) {
            return "this future";
        }
        return String.valueOf((Object)object);
    }

    public final boolean F() {
        Object object = this.o;
        if (object instanceof c && ((c)object).a) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        a.l((Object)runnable);
        a.l((Object)executor);
        e e8 = this.p;
        if (e8 != e.d) {
            e e9;
            e e10 = new e(runnable, executor);
            do {
                e10.c = e8;
                if (t.a(this, e8, e10)) {
                    return;
                }
                e8 = e9 = this.p;
            } while (e9 != e.d);
        }
        a.o(runnable, executor);
    }

    public final boolean cancel(boolean bl) {
        Object object = this.o;
        boolean bl2 = object == null;
        if (bl2) {
            c c8 = r ? new c(bl, (Throwable)new CancellationException("Future.cancel() was called.")) : (bl ? c.c : c.d);
            if (t.b(this, object, c8)) {
                if (bl) {
                    this.s();
                }
                a.n(this);
                return true;
            }
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e(StringBuilder stringBuilder) {
        String string2;
        block5 : {
            ExecutionException executionException222;
            block4 : {
                string2 = "]";
                try {
                    Object object = a.r(this);
                    stringBuilder.append("SUCCESS, result=[");
                    stringBuilder.append(this.D(object));
                    stringBuilder.append("]");
                    return;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (ExecutionException executionException222) {
                    break block4;
                }
                stringBuilder.append("UNKNOWN, cause=[");
                stringBuilder.append((Object)runtimeException.getClass());
                string2 = " thrown from get()]";
                break block5;
            }
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append((Object)executionException222.getCause());
            break block5;
            catch (CancellationException cancellationException) {}
            string2 = "CANCELLED";
        }
        stringBuilder.append(string2);
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object object = this.o;
            boolean bl = object != null;
            if (bl & true) {
                return this.p(object);
            }
            object = this.q;
            if (object != h.c) {
                h h8;
                h h9 = new h();
                do {
                    h9.a((h)object);
                    if (t.c(this, (h)object, h9)) {
                        block6 : {
                            do {
                                LockSupport.park((Object)this);
                                if (Thread.interrupted()) break block6;
                                object = this.o;
                                bl = object != null;
                            } while (!(bl & true));
                            return this.p(object);
                        }
                        this.x(h9);
                        throw new InterruptedException();
                    }
                    h8 = this.q;
                    object = h8;
                } while (h8 != h.c);
            }
            return this.p(this.o);
        }
        throw new InterruptedException();
    }

    public final Object get(long l8, TimeUnit object) {
        long l9 = object.toNanos(l8);
        if (!Thread.interrupted()) {
            boolean bl;
            Object object2;
            long l10;
            Object object3;
            Object object4;
            long l11;
            block17 : {
                object3 = this.o;
                bl = object3 != null;
                if (bl & true) {
                    return this.p(object3);
                }
                l10 = l9 > 0L ? System.nanoTime() + l9 : 0L;
                l11 = l9;
                if (l9 >= 1000L) {
                    object3 = this.q;
                    if (object3 != h.c) {
                        object2 = new h();
                        do {
                            object2.a((h)object3);
                            if (t.c(this, (h)object3, (h)object2)) {
                                block16 : {
                                    do {
                                        LockSupport.parkNanos((Object)this, (long)l9);
                                        if (Thread.interrupted()) break block16;
                                        object3 = this.o;
                                        bl = object3 != null;
                                        if (bl & true) {
                                            return this.p(object3);
                                        }
                                        l9 = l11 = l10 - System.nanoTime();
                                    } while (l11 >= 1000L);
                                    this.x((h)object2);
                                    break block17;
                                }
                                this.x((h)object2);
                                throw new InterruptedException();
                            }
                            object3 = object4 = this.q;
                        } while (object4 != h.c);
                    }
                    return this.p(this.o);
                }
            }
            while (l11 > 0L) {
                object3 = this.o;
                bl = object3 != null;
                if (bl & true) {
                    return this.p(object3);
                }
                if (!Thread.interrupted()) {
                    l11 = l10 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            object2 = this.toString();
            object4 = object.toString();
            object3 = Locale.ROOT;
            String string2 = object4.toLowerCase((Locale)object3);
            object4 = new StringBuilder();
            object4.append("Waited ");
            object4.append(l8);
            object4.append(" ");
            object4.append(object.toString().toLowerCase((Locale)object3));
            object3 = object4 = object4.toString();
            if (l11 + 1000L < 0L) {
                object3 = new StringBuilder();
                object3.append((String)object4);
                object3.append(" (plus ");
                object3 = object3.toString();
                l11 = - l11;
                l8 = object.convert(l11, TimeUnit.NANOSECONDS);
                long l12 = l8 LCMP 0L;
                bl = l12 == false || (l11 -= object.toNanos(l8)) > 1000L;
                object = object3;
                if (l12 > 0) {
                    object = new StringBuilder();
                    object.append((String)object3);
                    object.append(l8);
                    object.append(" ");
                    object.append(string2);
                    object = object3 = object.toString();
                    if (bl) {
                        object = new StringBuilder();
                        object.append((String)object3);
                        object.append(",");
                        object = object.toString();
                    }
                    object3 = new StringBuilder();
                    object3.append((String)object);
                    object3.append(" ");
                    object = object3.toString();
                }
                object3 = object;
                if (bl) {
                    object3 = new StringBuilder();
                    object3.append((String)object);
                    object3.append(l11);
                    object3.append(" nanoseconds ");
                    object3 = object3.toString();
                }
                object = new StringBuilder();
                object.append((String)object3);
                object.append("delay)");
                object3 = object.toString();
            }
            if (this.isDone()) {
                object = new StringBuilder();
                object.append((String)object3);
                object.append(" but future completed as timeout expired");
                throw new TimeoutException(object.toString());
            }
            object = new StringBuilder();
            object.append((String)object3);
            object.append(" for ");
            object.append((String)object2);
            throw new TimeoutException(object.toString());
        }
        throw new InterruptedException();
    }

    public void h() {
    }

    public final boolean isCancelled() {
        return this.o instanceof c;
    }

    public final boolean isDone() {
        boolean bl = this.o != null;
        return bl & true;
    }

    public final e m(e e8) {
        e e9;
        while (!t.a(this, e9 = this.p, e.d)) {
        }
        e e10 = e8;
        e8 = e9;
        while (e8 != null) {
            e9 = e8.c;
            e8.c = e10;
            e10 = e8;
            e8 = e9;
        }
        return e10;
    }

    public final Object p(Object object) {
        if (!(object instanceof c)) {
            if (!(object instanceof d)) {
                Object object2 = object;
                if (object == u) {
                    object2 = null;
                }
                return object2;
            }
            throw new ExecutionException(((d)object).a);
        }
        throw a.j("Task was cancelled.", ((c)object).b);
    }

    public void s() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String toString() {
        block6 : {
            var2_1 = new StringBuilder();
            var2_1.append(super.toString());
            var2_1.append("[status=");
            if (!this.isCancelled()) break block6;
            var1_2 = "CANCELLED";
            ** GOTO lbl26
        }
        if (this.isDone()) ** GOTO lbl-1000
        try {
            var1_2 = this.u();
        }
        catch (RuntimeException var1_3) {
            var3_4 = new StringBuilder();
            var3_4.append("Exception thrown from implementation: ");
            var3_4.append((Object)var1_3.getClass());
            var1_2 = var3_4.toString();
        }
        if (var1_2 != null && !var1_2.isEmpty()) {
            var2_1.append("PENDING, info=[");
            var2_1.append(var1_2);
            var2_1.append("]");
        } else if (this.isDone()) lbl-1000: // 2 sources:
        {
            this.e(var2_1);
        } else {
            var1_2 = "PENDING";
lbl26: // 2 sources:
            var2_1.append(var1_2);
        }
        var2_1.append("]");
        return var2_1.toString();
    }

    public String u() {
        if (this instanceof ScheduledFuture) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remaining delay=[");
            stringBuilder.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    public final void w() {
        h h8;
        while (!t.c(this, h8 = this.q, h.c)) {
        }
        while (h8 != null) {
            h8.b();
            h8 = h8.b;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void x(h var1_1) {
        var1_1.a = null;
        block0 : do {
            if ((var1_1 = this.q) == h.c) {
                return;
            }
            var2_2 = null;
            while (var1_1 != null) {
                var4_4 = var1_1.b;
                if (var1_1.a != null) {
                    var3_3 = var1_1;
                } else if (var2_2 != null) {
                    var2_2.b = var4_4;
                    var3_3 = var2_2;
                    if (var2_2.a == null) {
                        continue block0;
                    }
                } else {
                    var3_3 = var2_2;
                    if (a.t.c(this, var1_1, var4_4)) ** break;
                    continue block0;
                }
                var1_1 = var4_4;
                var2_2 = var3_3;
            }
            return;
            break;
        } while (true);
    }

    public boolean z(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = u;
        }
        if (t.b(this, null, object2)) {
            a.n(this);
            return true;
        }
        return false;
    }

    public static abstract class b {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public abstract boolean a(a var1, e var2, e var3);

        public abstract boolean b(a var1, Object var2, Object var3);

        public abstract boolean c(a var1, h var2, h var3);

        public abstract void d(h var1, h var2);

        public abstract void e(h var1, Thread var2);
    }

    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (a.r) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        public c(boolean bl, Throwable throwable) {
            this.a = bl;
            this.b = throwable;
        }
    }

    public static final class d {
        public static final d b = new d(new Throwable("Failure occurred while trying to finish a future."){

            /*
             * Enabled aggressive block sorting
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public Throwable fillInStackTrace() {
                // MONITORENTER : this
                // MONITOREXIT : this
                return this;
            }
        });
        public final Throwable a;

        public d(Throwable throwable) {
            this.a = (Throwable)a.l((Object)throwable);
        }

    }

    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    public static final class f
    extends b {
        public final AtomicReferenceFieldUpdater a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override
        public boolean a(a a8, e e8, e e9) {
            return u.b.a(this.d, a8, e8, e9);
        }

        @Override
        public boolean b(a a8, Object object, Object object2) {
            return u.b.a(this.e, a8, object, object2);
        }

        @Override
        public boolean c(a a8, h h8, h h9) {
            return u.b.a(this.c, a8, h8, h9);
        }

        @Override
        public void d(h h8, h h9) {
            this.b.lazySet((Object)h8, (Object)h9);
        }

        @Override
        public void e(h h8, Thread thread) {
            this.a.lazySet((Object)h8, (Object)thread);
        }
    }

    public static final class g
    extends b {
        public g() {
            super(null);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean a(a a8, e e8, e e9) {
            synchronized (a8) {
                try {
                    if (a8.p == e8) {
                        a8.p = e9;
                        return true;
                    }
                    return false;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean b(a a8, Object object, Object object2) {
            synchronized (a8) {
                try {
                    if (a8.o == object) {
                        a8.o = object2;
                        return true;
                    }
                    return false;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public boolean c(a a8, h h8, h h9) {
            synchronized (a8) {
                try {
                    if (a8.q == h8) {
                        a8.q = h9;
                        return true;
                    }
                    return false;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        @Override
        public void d(h h8, h h9) {
            h8.b = h9;
        }

        @Override
        public void e(h h8, Thread thread) {
            h8.a = thread;
        }
    }

    public static final class h {
        public static final h c = new h(false);
        public volatile Thread a;
        public volatile h b;

        public h() {
            a.t.e(this, Thread.currentThread());
        }

        public h(boolean bl) {
        }

        public void a(h h8) {
            a.t.d(this, h8);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark((Thread)thread);
            }
        }
    }

}

