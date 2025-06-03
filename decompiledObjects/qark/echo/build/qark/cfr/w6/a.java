/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.concurrent.Executor
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicLongFieldUpdater
 *  java.util.concurrent.locks.LockSupport
 */
package w6;

import V5.t;
import j6.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import p6.M;
import u6.A;
import u6.F;
import w6.g;
import w6.h;
import w6.i;
import w6.k;
import w6.l;
import w6.n;

public final class a
implements Executor,
Closeable {
    public static final a v = new a(null);
    public static final AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(a.class, (String)"parkedWorkersStack");
    public static final AtomicLongFieldUpdater x = AtomicLongFieldUpdater.newUpdater(a.class, (String)"controlState");
    public static final AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(a.class, (String)"_isTerminated");
    public static final F z = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;
    public final int o;
    public final int p;
    private volatile long parkedWorkersStack;
    public final long q;
    public final String r;
    public final w6.d s;
    public final w6.d t;
    public final A u;

    public a(int n8, int n9, long l8, String string2) {
        this.o = n8;
        this.p = n9;
        this.q = l8;
        this.r = string2;
        if (n8 >= 1) {
            if (n9 >= n8) {
                if (n9 <= 2097150) {
                    if (l8 > 0L) {
                        this.s = new w6.d();
                        this.t = new w6.d();
                        this.u = new A((n8 + 1) * 2);
                        this.controlState = (long)n8 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    string2 = new StringBuilder();
                    string2.append("Idle worker keep alive time ");
                    string2.append(l8);
                    string2.append(" must be positive");
                    throw new IllegalArgumentException(string2.toString().toString());
                }
                string2 = new StringBuilder();
                string2.append("Max pool size ");
                string2.append(n9);
                string2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(string2.toString().toString());
            }
            string2 = new StringBuilder();
            string2.append("Max pool size ");
            string2.append(n9);
            string2.append(" should be greater than or equals to core pool size ");
            string2.append(n8);
            throw new IllegalArgumentException(string2.toString().toString());
        }
        string2 = new StringBuilder();
        string2.append("Core pool size ");
        string2.append(n8);
        string2.append(" should be at least 1");
        throw new IllegalArgumentException(string2.toString().toString());
    }

    public static /* synthetic */ void k(a a8, Runnable runnable, i i8, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            i8 = l.g;
        }
        if ((n8 & 4) != 0) {
            bl = false;
        }
        a8.i(runnable, i8, bl);
    }

    public static /* synthetic */ boolean x(a a8, long l8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            l8 = x.get((Object)a8);
        }
        return a8.w(l8);
    }

    public final boolean B() {
        c c8;
        do {
            if ((c8 = this.m()) != null) continue;
            return false;
        } while (!c.j().compareAndSet((Object)c8, -1, 0));
        LockSupport.unpark((Thread)c8);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(h h8) {
        w6.d d8;
        if (h8.p.b() == 1) {
            d8 = this.t;
            do {
                return d8.a(h8);
                break;
            } while (true);
        }
        d8 = this.s;
        return d8.a(h8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int c() {
        int n8;
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        int n9;
        block11 : {
            int n10;
            block10 : {
                block9 : {
                    A a8 = this.u;
                    // MONITORENTER : a8
                    boolean bl = this.isTerminated();
                    if (!bl) break block9;
                    return -1;
                }
                atomicLongFieldUpdater = x;
                l8 = atomicLongFieldUpdater.get((Object)this);
                n8 = (int)(l8 & 0x1FFFFFL);
                n9 = l6.d.a(n8 - (int)((l8 & 4398044413952L) >> 21), 0);
                n10 = this.o;
                if (n9 < n10) break block10;
                // MONITOREXIT : a8
                return 0;
            }
            n10 = this.p;
            if (n8 < n10) break block11;
            // MONITOREXIT : a8
            return 0;
        }
        n8 = (int)(x.get((Object)this) & 0x1FFFFFL) + 1;
        if (n8 <= 0) throw new IllegalArgumentException("Failed requirement.".toString());
        if (this.u.b(n8) != null) throw new IllegalArgumentException("Failed requirement.".toString());
        c c8 = new c(n8);
        this.u.c(n8, (Object)c8);
        l8 = atomicLongFieldUpdater.incrementAndGet((Object)this);
        if (n8 == (int)(0x1FFFFFL & l8)) {
            // MONITOREXIT : a8
            c8.start();
            return n9 + 1;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void close() {
        this.s(10000L);
    }

    public final h e(Runnable runnable, i i8) {
        long l8 = l.f.a();
        if (runnable instanceof h) {
            runnable = (h)runnable;
            runnable.o = l8;
            runnable.p = i8;
            return runnable;
        }
        return new k(runnable, l8, i8);
    }

    public void execute(Runnable runnable) {
        a.k(this, runnable, null, false, 6, null);
    }

    public final c h() {
        Thread thread = Thread.currentThread();
        boolean bl = thread instanceof c;
        Thread thread2 = null;
        thread = bl ? (c)thread : null;
        Thread thread3 = thread2;
        if (thread != null) {
            thread3 = thread2;
            if (Intrinsics.a(((c)thread).a.this, this)) {
                thread3 = thread;
            }
        }
        return thread3;
    }

    public final void i(Runnable object, i object2, boolean bl) {
        p6.c.a();
        object2 = this.e((Runnable)object, (i)object2);
        int n8 = object2.p.b();
        boolean bl2 = false;
        n8 = n8 == 1 ? 1 : 0;
        long l8 = n8 != 0 ? x.addAndGet((Object)this, 0x200000L) : 0L;
        object = this.h();
        object2 = this.v((c)((Object)object), (h)object2, bl);
        if (object2 != null && !this.b((h)object2)) {
            object = new StringBuilder();
            object.append(this.r);
            object.append(" was terminated");
            throw new RejectedExecutionException(object.toString());
        }
        boolean bl3 = bl2;
        if (bl) {
            bl3 = bl2;
            if (object != null) {
                bl3 = true;
            }
        }
        if (n8 != 0) {
            this.t(l8, bl3);
            return;
        }
        if (bl3) {
            return;
        }
        this.u();
    }

    public final boolean isTerminated() {
        if (y.get((Object)this) != 0) {
            return true;
        }
        return false;
    }

    public final int l(c object) {
        int n8;
        do {
            if ((object = object.i()) == z) {
                return -1;
            }
            if (object != null) continue;
            return 0;
        } while ((n8 = (object = (c)((Object)object)).h()) == 0);
        return n8;
    }

    public final c m() {
        long l8;
        int n8;
        c c8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        do {
            if ((c8 = (c)((Object)this.u.b(n8 = (int)(0x1FFFFFL & (l8 = atomicLongFieldUpdater.get((Object)this)))))) != null) continue;
            return null;
        } while ((n8 = this.l(c8)) < 0 || !w.compareAndSet((Object)this, l8, (long)n8 | 0x200000L + l8 & -2097152L));
        c8.r(z);
        return c8;
    }

    public final boolean n(c c8) {
        long l8;
        int n8;
        if (c8.i() != z) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        do {
            l8 = atomicLongFieldUpdater.get((Object)this);
            int n9 = (int)(0x1FFFFFL & l8);
            n8 = c8.h();
            c8.r(this.u.b(n9));
        } while (!w.compareAndSet((Object)this, l8, 0x200000L + l8 & -2097152L | (long)n8));
        return true;
    }

    public final void q(c c8, int n8, int n9) {
        int n10;
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        do {
            int n11;
            l8 = atomicLongFieldUpdater.get((Object)this);
            n10 = n11 = (int)(0x1FFFFFL & l8);
            if (n11 != n8) continue;
            n10 = n9 == 0 ? this.l(c8) : n9;
        } while (n10 < 0 || !w.compareAndSet((Object)this, l8, 0x200000L + l8 & -2097152L | (long)n10));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void r(h h8) {
        try {
            h8.run();
            do {
                return;
                break;
            } while (true);
        }
        catch (Throwable throwable) {
            try {
                Thread thread = Thread.currentThread();
                thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
                return;
            }
            finally {
                p6.c.a();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void s(long l8) {
        if (!y.compareAndSet((Object)this, 0, 1)) {
            return;
        }
        c c8 = this.h();
        Object object = this.u;
        // MONITORENTER : object
        long l9 = x.get((Object)this);
        int n8 = (int)(l9 & 0x1FFFFFL);
        // MONITOREXIT : object
        if (1 <= n8) {
            int n9 = 1;
            do {
                object = this.u.b(n9);
                Intrinsics.b(object);
                object = (c)((Object)object);
                if (object != c8) {
                    while (object.isAlive()) {
                        LockSupport.unpark((Thread)object);
                        object.join(l8);
                    }
                    object.o.f(this.t);
                }
                if (n9 == n8) break;
                ++n9;
            } while (true);
        }
        this.t.b();
        this.s.b();
        do {
            block15 : {
                h h8;
                block14 : {
                    if (c8 == null) break block14;
                    h8 = c8.g(true);
                    object = h8;
                    if (h8 != null) break block15;
                }
                h8 = (h)this.s.d();
                object = h8;
                if (h8 == null) {
                    h8 = (h)this.t.d();
                    object = h8;
                    if (h8 == null) {
                        if (c8 != null) {
                            c8.u(d.s);
                        }
                        w.set((Object)this, 0L);
                        x.set((Object)this, 0L);
                        return;
                    }
                }
            }
            this.r((h)object);
        } while (true);
    }

    public final void t(long l8, boolean bl) {
        if (bl) {
            return;
        }
        if (this.B()) {
            return;
        }
        if (this.w(l8)) {
            return;
        }
        this.B();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        int n8;
        int n9;
        int n10;
        ArrayList arrayList = new ArrayList();
        int n11 = this.u.a();
        int n12 = 0;
        int n13 = n10 = (n9 = (n8 = 0));
        int n14 = 1;
        int n15 = n9;
        n9 = n8;
        n8 = n12;
        do {
            int n16;
            int n17;
            int n18;
            block5 : {
                block6 : {
                    Object object;
                    int n19;
                    block10 : {
                        int n20;
                        block7 : {
                            block8 : {
                                block9 : {
                                    block4 : {
                                        if (n14 >= n11) {
                                            long l8 = x.get((Object)this);
                                            object = new StringBuilder();
                                            object.append(this.r);
                                            object.append('@');
                                            object.append(M.b(this));
                                            object.append("[Pool Size {core = ");
                                            object.append(this.o);
                                            object.append(", max = ");
                                            object.append(this.p);
                                            object.append("}, Worker States {CPU = ");
                                            object.append(n8);
                                            object.append(", blocking = ");
                                            object.append(n9);
                                            object.append(", parked = ");
                                            object.append(n15);
                                            object.append(", dormant = ");
                                            object.append(n10);
                                            object.append(", terminated = ");
                                            object.append(n13);
                                            object.append("}, running workers queues = ");
                                            object.append((Object)arrayList);
                                            object.append(", global CPU queue size = ");
                                            object.append(this.s.c());
                                            object.append(", global blocking queue size = ");
                                            object.append(this.t.c());
                                            object.append(", Control State {created workers= ");
                                            object.append((int)(0x1FFFFFL & l8));
                                            object.append(", blocking tasks = ");
                                            object.append((int)((4398044413952L & l8) >> 21));
                                            object.append(", CPUs acquired = ");
                                            object.append(this.o - (int)((9223367638808264704L & l8) >> 42));
                                            object.append("}]");
                                            return object.toString();
                                        }
                                        object = (c)((Object)this.u.b(n14));
                                        if (object != null) break block4;
                                        n12 = n8;
                                        n18 = n9;
                                        n17 = n15;
                                        n16 = n13;
                                        break block5;
                                    }
                                    n20 = object.o.e();
                                    object = object.q;
                                    n12 = b.a[object.ordinal()];
                                    if (n12 == 1) break block6;
                                    if (n12 == 2) break block7;
                                    if (n12 == 3) break block8;
                                    if (n12 == 4) break block9;
                                    if (n12 != 5) {
                                        n12 = n8;
                                        n18 = n9;
                                        n17 = n15;
                                        n16 = n13;
                                    } else {
                                        n16 = n13 + 1;
                                        n12 = n8;
                                        n18 = n9;
                                        n17 = n15;
                                    }
                                    break block5;
                                }
                                int n21 = n10 + 1;
                                n12 = n8;
                                n18 = n9;
                                n17 = n15;
                                n10 = n21;
                                n16 = n13;
                                if (n20 <= 0) break block5;
                                object = new StringBuilder();
                                object.append(n20);
                                n19 = 100;
                                n10 = n21;
                                break block10;
                            }
                            ++n8;
                            object = new StringBuilder();
                            object.append(n20);
                            n19 = 99;
                            break block10;
                        }
                        ++n9;
                        object = new StringBuilder();
                        object.append(n20);
                        n19 = 98;
                    }
                    object.append((char)n19);
                    arrayList.add((Object)object.toString());
                    n12 = n8;
                    n18 = n9;
                    n17 = n15;
                    n16 = n13;
                    break block5;
                }
                n17 = n15 + 1;
                n16 = n13;
                n18 = n9;
                n12 = n8;
            }
            ++n14;
            n8 = n12;
            n9 = n18;
            n15 = n17;
            n13 = n16;
        } while (true);
    }

    public final void u() {
        if (this.B()) {
            return;
        }
        if (a.x(this, 0L, 1, null)) {
            return;
        }
        this.B();
    }

    public final h v(c c8, h h8, boolean bl) {
        if (c8 == null) {
            return h8;
        }
        if (c8.q == d.s) {
            return h8;
        }
        if (h8.p.b() == 0 && c8.q == d.p) {
            return h8;
        }
        c8.u = true;
        return c8.o.a(h8, bl);
    }

    public final boolean w(long l8) {
        if (l6.d.a((int)(0x1FFFFFL & l8) - (int)((l8 & 4398044413952L) >> 21), 0) < this.o) {
            int n8 = this.c();
            if (n8 == 1 && this.o > 1) {
                this.c();
            }
            if (n8 > 0) {
                return true;
            }
        }
        return false;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

    public abstract class b {
        public static final /* synthetic */ int[] a;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] arrn;
            arrn = new int[d.values().length];
            try {
                arrn[d.q.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[d.p.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[d.o.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[d.r.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                arrn[d.s.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            a = arrn;
        }
    }

    public final class c
    extends Thread {
        public static final AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(c.class, (String)"workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final n o;
        public final u p;
        public d q;
        public long r;
        public long s;
        public int t;
        public boolean u;
        private volatile int workerCtl;

        public c() {
            this.setDaemon(true);
            this.o = new n();
            this.p = new u();
            this.q = d.r;
            this.nextParkedWorker = a.z;
            this.t = j6.c.o.c();
        }

        public c(int n8) {
            this();
            this.q(n8);
        }

        public static final AtomicIntegerFieldUpdater j() {
            return w;
        }

        public final void b(int n8) {
            if (n8 == 0) {
                return;
            }
            a a8 = a.this;
            x.addAndGet((Object)a8, -2097152L);
            if (this.q != d.s) {
                this.q = d.r;
            }
        }

        public final void c(int n8) {
            if (n8 == 0) {
                return;
            }
            if (this.u(d.p)) {
                a.this.u();
            }
        }

        public final void d(h h8) {
            int n8 = h8.p.b();
            this.k(n8);
            this.c(n8);
            a.this.r(h8);
            this.b(n8);
        }

        public final h e(boolean bl) {
            if (bl) {
                h h8;
                boolean bl2 = this.m(a.this.o * 2) == 0;
                if (bl2 && (h8 = this.o()) != null) {
                    return h8;
                }
                h8 = this.o.g();
                if (h8 != null) {
                    return h8;
                }
                if (!bl2 && (h8 = this.o()) != null) {
                    return h8;
                }
            } else {
                h h9 = this.o();
                if (h9 != null) {
                    return h9;
                }
            }
            return this.v(3);
        }

        public final h f() {
            h h8;
            h h9 = h8 = this.o.h();
            if (h8 == null) {
                h9 = h8 = (h)a.this.t.d();
                if (h8 == null) {
                    h9 = this.v(1);
                }
            }
            return h9;
        }

        public final h g(boolean bl) {
            if (this.s()) {
                return this.e(bl);
            }
            return this.f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int n8) {
            this.r = 0L;
            if (this.q == d.q) {
                this.q = d.p;
            }
        }

        public final boolean l() {
            if (this.nextParkedWorker != a.z) {
                return true;
            }
            return false;
        }

        public final int m(int n8) {
            int n9 = this.t;
            n9 ^= n9 << 13;
            n9 ^= n9 >> 17;
            n9 ^= n9 << 5;
            this.t = n9;
            int n10 = n8 - 1;
            if ((n10 & n8) == 0) {
                return n9 & n10;
            }
            return (n9 & Integer.MAX_VALUE) % n8;
        }

        public final void n() {
            if (this.r == 0L) {
                this.r = System.nanoTime() + a.this.q;
            }
            LockSupport.parkNanos((long)a.this.q);
            if (System.nanoTime() - this.r >= 0L) {
                this.r = 0L;
                this.w();
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final h o() {
            Object object;
            if (this.m(2) == 0) {
                object = (h)a.this.s.d();
                if (object != null) {
                    return object;
                }
                object = a.this.t;
                do {
                    return (h)object.d();
                    break;
                } while (true);
            }
            object = (h)a.this.t.d();
            if (object != null) {
                return object;
            }
            object = a.this.s;
            return (h)object.d();
        }

        public final void p() {
            block0 : do {
                boolean bl = false;
                while (!a.this.isTerminated() && this.q != d.s) {
                    h h8 = this.g(this.u);
                    if (h8 != null) {
                        this.s = 0L;
                        this.d(h8);
                        continue block0;
                    }
                    this.u = false;
                    if (this.s != 0L) {
                        if (!bl) {
                            bl = true;
                            continue;
                        }
                        this.u(d.q);
                        Thread.interrupted();
                        LockSupport.parkNanos((long)this.s);
                        this.s = 0L;
                        continue block0;
                    }
                    this.t();
                }
                break;
            } while (true);
            this.u(d.s);
        }

        public final void q(int n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.this.r);
            stringBuilder.append("-worker-");
            String string2 = n8 == 0 ? "TERMINATED" : String.valueOf((int)n8);
            stringBuilder.append(string2);
            this.setName(stringBuilder.toString());
            this.indexInArray = n8;
        }

        public final void r(Object object) {
            this.nextParkedWorker = object;
        }

        public void run() {
            this.p();
        }

        public final boolean s() {
            long l8;
            if (this.q == d.o) {
                return true;
            }
            a a8 = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = x;
            do {
                if ((int)((9223367638808264704L & (l8 = atomicLongFieldUpdater.get((Object)a8))) >> 42) != 0) continue;
                return false;
            } while (!x.compareAndSet((Object)a8, l8, l8 - 0x40000000000L));
            this.q = d.o;
            return true;
        }

        public final void t() {
            if (!this.l()) {
                a.this.n(this);
                return;
            }
            w.set((Object)this, -1);
            while (this.l() && w.get((Object)this) == -1 && !a.this.isTerminated()) {
                if (this.q == d.s) {
                    return;
                }
                this.u(d.q);
                Thread.interrupted();
                this.n();
            }
        }

        public final boolean u(d d8) {
            d d9 = this.q;
            boolean bl = d9 == d.o;
            if (bl) {
                a a8 = a.this;
                x.addAndGet((Object)a8, 0x40000000000L);
            }
            if (d9 != d8) {
                this.q = d8;
            }
            return bl;
        }

        public final h v(int n8) {
            Object object = a.this;
            int n9 = (int)(x.get(object) & 0x1FFFFFL);
            if (n9 < 2) {
                return null;
            }
            int n10 = this.m(n9);
            object = a.this;
            long l8 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < n9; ++i8) {
                long l9;
                Object object2;
                int n11;
                n10 = n11 = n10 + 1;
                if (n11 > n9) {
                    n10 = 1;
                }
                if ((object2 = (c)((Object)object.u.b(n10))) != null && object2 != this) {
                    long l10 = object2.o.n(n8, this.p);
                    if (l10 == -1L) {
                        object = this.p;
                        object2 = (h)object.o;
                        object.o = null;
                        return object2;
                    }
                    l9 = l8;
                    if (l10 > 0L) {
                        l9 = Math.min((long)l8, (long)l10);
                    }
                } else {
                    l9 = l8;
                }
                l8 = l9;
            }
            if (l8 == Long.MAX_VALUE) {
                l8 = 0L;
            }
            this.s = l8;
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void w() {
            int n8;
            Object object;
            int n9;
            block9 : {
                boolean bl;
                block8 : {
                    block7 : {
                        object = a.this;
                        A a8 = object.u;
                        // MONITORENTER : a8
                        bl = object.isTerminated();
                        if (!bl) break block7;
                        return;
                    }
                    n9 = (int)(x.get(object) & 0x1FFFFFL);
                    n8 = object.o;
                    if (n9 > n8) break block8;
                    // MONITOREXIT : a8
                    return;
                }
                bl = w.compareAndSet((Object)this, -1, 1);
                if (bl) break block9;
                // MONITOREXIT : a8
                return;
            }
            n9 = this.indexInArray;
            this.q(0);
            object.q(this, n9, 0);
            n8 = (int)(x.getAndDecrement(object) & 0x1FFFFFL);
            if (n8 != n9) {
                Object object2 = object.u.b(n8);
                Intrinsics.b(object2);
                object2 = (c)((Object)object2);
                object.u.c(n9, object2);
                object2.q(n9);
                object.q((c)((Object)object2), n8, n9);
            }
            object.u.c(n8, null);
            object = t.a;
            // MONITOREXIT : a8
            this.q = d.s;
        }
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d o = new d();
        public static final /* enum */ d p = new d();
        public static final /* enum */ d q = new d();
        public static final /* enum */ d r = new d();
        public static final /* enum */ d s = new d();
        public static final /* synthetic */ d[] t;

        static {
            t = d.c();
        }

        public static final /* synthetic */ d[] c() {
            return new d[]{o, p, q, r, s};
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])t.clone();
        }
    }

}

