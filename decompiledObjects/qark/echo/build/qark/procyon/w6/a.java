// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import V5.t;
import kotlin.jvm.internal.u;
import p6.M;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import p6.c;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.g;
import u6.A;
import u6.F;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.io.Closeable;
import java.util.concurrent.Executor;

public final class a implements Executor, Closeable
{
    public static final a v;
    public static final AtomicLongFieldUpdater w;
    public static final AtomicLongFieldUpdater x;
    public static final AtomicIntegerFieldUpdater y;
    public static final F z;
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
    
    static {
        v = new a(null);
        w = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
        x = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
        y = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
        z = new F("NOT_IN_STACK");
    }
    
    public a(final int i, final int j, final long n, final String r) {
        this.o = i;
        this.p = j;
        this.q = n;
        this.r = r;
        if (i < 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (j < i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Max pool size ");
            sb2.append(j);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (j > 2097150) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Max pool size ");
            sb3.append(j);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (n > 0L) {
            this.s = new w6.d();
            this.t = new w6.d();
            this.u = new A((i + 1) * 2);
            this.controlState = (long)i << 42;
            this._isTerminated = 0;
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Idle worker keep alive time ");
        sb4.append(n);
        sb4.append(" must be positive");
        throw new IllegalArgumentException(sb4.toString().toString());
    }
    
    public static final /* synthetic */ AtomicLongFieldUpdater a() {
        return a.x;
    }
    
    public static /* synthetic */ void k(final a a, final Runnable runnable, i g, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            g = l.g;
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        a.i(runnable, g, b);
    }
    
    public static /* synthetic */ boolean x(final a a, long value, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            value = a.x.get(a);
        }
        return a.w(value);
    }
    
    public final boolean B() {
        c m;
        do {
            m = this.m();
            if (m == null) {
                return false;
            }
        } while (!c.j().compareAndSet(m, -1, 0));
        LockSupport.unpark(m);
        return true;
    }
    
    public final boolean b(final h h) {
        w6.d d;
        if (h.p.b() == 1) {
            d = this.t;
        }
        else {
            d = this.s;
        }
        return d.a(h);
    }
    
    public final int c() {
        final A u = this.u;
        // monitorenter(u)
        while (true) {
            try {
                if (this.isTerminated()) {
                    // monitorexit(u)
                    return -1;
                }
                final AtomicLongFieldUpdater x = a.x;
                final long value = x.get(this);
                final int n = (int)(value & 0x1FFFFFL);
                final int a = l6.d.a(n - (int)((value & 0x3FFFFE00000L) >> 21), 0);
                if (a >= this.o) {
                    // monitorexit(u)
                    return 0;
                }
                if (n >= this.p) {
                    // monitorexit(u)
                    return 0;
                }
                final int n2 = (int)(a().get(this) & 0x1FFFFFL) + 1;
                if (n2 <= 0 || this.u.b(n2) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                final c c = new c(n2);
                this.u.c(n2, c);
                if (n2 == (int)(0x1FFFFFL & x.incrementAndGet(this))) {
                    // monitorexit(u)
                    c.start();
                    return a + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
                // monitorexit(u)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void close() {
        this.s(10000L);
    }
    
    public final h e(final Runnable runnable, final i p2) {
        final long a = l.f.a();
        if (runnable instanceof h) {
            final h h = (h)runnable;
            h.o = a;
            h.p = p2;
            return h;
        }
        return new k(runnable, a, p2);
    }
    
    @Override
    public void execute(final Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }
    
    public final c h() {
        final Thread currentThread = Thread.currentThread();
        final boolean b = currentThread instanceof c;
        final c c = null;
        c c2;
        if (b) {
            c2 = (c)currentThread;
        }
        else {
            c2 = null;
        }
        c c3 = c;
        if (c2 != null) {
            c3 = c;
            if (Intrinsics.a(w6.a.c.a(c2), this)) {
                c3 = c2;
            }
        }
        return c3;
    }
    
    public final void i(final Runnable runnable, final i i, final boolean b) {
        p6.c.a();
        final h e = this.e(runnable, i);
        final int b2 = e.p.b();
        final boolean b3 = false;
        final boolean b4 = b2 == 1;
        long addAndGet;
        if (b4) {
            addAndGet = a.x.addAndGet(this, 2097152L);
        }
        else {
            addAndGet = 0L;
        }
        final c h = this.h();
        final h v = this.v(h, e, b);
        if (v != null && !this.b(v)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.r);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
        boolean b5 = b3;
        if (b) {
            b5 = b3;
            if (h != null) {
                b5 = true;
            }
        }
        if (b4) {
            this.t(addAndGet, b5);
            return;
        }
        if (b5) {
            return;
        }
        this.u();
    }
    
    public final boolean isTerminated() {
        return a.y.get(this) != 0;
    }
    
    public final int l(c c) {
        int i;
        do {
            final Object j = c.i();
            if (j == a.z) {
                return -1;
            }
            if (j == null) {
                return 0;
            }
            c = (c)j;
            i = c.h();
        } while (i == 0);
        return i;
    }
    
    public final c m() {
        final AtomicLongFieldUpdater w = a.w;
        int l;
        long value;
        c c;
        do {
            value = w.get(this);
            c = (c)this.u.b((int)(0x1FFFFFL & value));
            if (c == null) {
                return null;
            }
            l = this.l(c);
        } while (l < 0 || !a.w.compareAndSet(this, value, (long)l | (2097152L + value & 0xFFFFFFFFFFE00000L)));
        c.r(a.z);
        return c;
    }
    
    public final boolean n(final c c) {
        if (c.i() != a.z) {
            return false;
        }
        final AtomicLongFieldUpdater w = a.w;
        long value;
        int h;
        do {
            value = w.get(this);
            final int n = (int)(0x1FFFFFL & value);
            h = c.h();
            c.r(this.u.b(n));
        } while (!a.w.compareAndSet(this, value, (2097152L + value & 0xFFFFFFFFFFE00000L) | (long)h));
        return true;
    }
    
    public final void q(final c c, final int n, final int n2) {
        final AtomicLongFieldUpdater w = a.w;
        int l;
        long value;
        do {
            value = w.get(this);
            if ((l = (int)(0x1FFFFFL & value)) == n) {
                if (n2 == 0) {
                    l = this.l(c);
                }
                else {
                    l = n2;
                }
            }
        } while (l < 0 || !a.w.compareAndSet(this, value, (2097152L + value & 0xFFFFFFFFFFE00000L) | (long)l));
    }
    
    public final void r(final h h) {
        try {
            h.run();
            p6.c.a();
        }
        finally {
            try {
                final Thread currentThread = Thread.currentThread();
                final Throwable t;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
            }
            finally {
                p6.c.a();
            }
        }
    }
    
    public final void s(final long millis) {
        if (!a.y.compareAndSet(this, 0, 1)) {
            return;
        }
        final c h = this.h();
        Object thread = this.u;
        synchronized (thread) {
            final int n = (int)(a().get(this) & 0x1FFFFFL);
            // monitorexit(thread)
            if (1 <= n) {
                int n2 = 1;
                while (true) {
                    thread = this.u.b(n2);
                    Intrinsics.b(thread);
                    thread = thread;
                    if (thread != h) {
                        while (((Thread)thread).isAlive()) {
                            LockSupport.unpark((Thread)thread);
                            ((Thread)thread).join(millis);
                        }
                        ((c)thread).o.f(this.t);
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            this.t.b();
            this.s.b();
            while ((h != null && (thread = h.g(true)) != null) || (thread = this.s.d()) != null || (thread = this.t.d()) != null) {
                this.r((h)thread);
            }
            if (h != null) {
                h.u(d.s);
            }
            a.w.set(this, 0L);
            a.x.set(this, 0L);
        }
    }
    
    public final void t(final long n, final boolean b) {
        if (b) {
            return;
        }
        if (this.B()) {
            return;
        }
        if (this.w(n)) {
            return;
        }
        this.B();
    }
    
    @Override
    public String toString() {
        final ArrayList<String> obj = new ArrayList<String>();
        final int a = this.u.a();
        final int n = 0;
        final int n3;
        final int n2 = n3 = 0;
        int j;
        int i = j = n3;
        int k = 1;
        int l = n3;
        int m = n2;
        int i2 = n;
        while (k < a) {
            final c c = (c)this.u.b(k);
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            Label_0347: {
                if (c == null) {
                    n4 = i2;
                    n5 = m;
                    n6 = l;
                    n7 = j;
                }
                else {
                    final int e = c.o.e();
                    final int n8 = b.a[c.q.ordinal()];
                    if (n8 != 1) {
                        StringBuilder sb;
                        char c2;
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    if (n8 != 5) {
                                        n4 = i2;
                                        n5 = m;
                                        n6 = l;
                                        n7 = j;
                                        break Label_0347;
                                    }
                                    n7 = j + 1;
                                    n4 = i2;
                                    n5 = m;
                                    n6 = l;
                                    break Label_0347;
                                }
                                else {
                                    final int n9 = i + 1;
                                    n4 = i2;
                                    n5 = m;
                                    n6 = l;
                                    i = n9;
                                    n7 = j;
                                    if (e <= 0) {
                                        break Label_0347;
                                    }
                                    sb = new StringBuilder();
                                    sb.append(e);
                                    c2 = 'd';
                                    i = n9;
                                }
                            }
                            else {
                                ++i2;
                                sb = new StringBuilder();
                                sb.append(e);
                                c2 = 'c';
                            }
                        }
                        else {
                            ++m;
                            sb = new StringBuilder();
                            sb.append(e);
                            c2 = 'b';
                        }
                        sb.append(c2);
                        obj.add(sb.toString());
                        n4 = i2;
                        n5 = m;
                        n6 = l;
                        n7 = j;
                    }
                    else {
                        n6 = l + 1;
                        n7 = j;
                        n5 = m;
                        n4 = i2;
                    }
                }
            }
            ++k;
            i2 = n4;
            m = n5;
            l = n6;
            j = n7;
        }
        final long value = w6.a.x.get(this);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.r);
        sb2.append('@');
        sb2.append(M.b(this));
        sb2.append("[Pool Size {core = ");
        sb2.append(this.o);
        sb2.append(", max = ");
        sb2.append(this.p);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i2);
        sb2.append(", blocking = ");
        sb2.append(m);
        sb2.append(", parked = ");
        sb2.append(l);
        sb2.append(", dormant = ");
        sb2.append(i);
        sb2.append(", terminated = ");
        sb2.append(j);
        sb2.append("}, running workers queues = ");
        sb2.append(obj);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.s.c());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.t.c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int)(0x1FFFFFL & value));
        sb2.append(", blocking tasks = ");
        sb2.append((int)((0x3FFFFE00000L & value) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(this.o - (int)((0x7FFFFC0000000000L & value) >> 42));
        sb2.append("}]");
        return sb2.toString();
    }
    
    public final void u() {
        if (this.B()) {
            return;
        }
        if (x(this, 0L, 1, null)) {
            return;
        }
        this.B();
    }
    
    public final h v(final c c, final h h, final boolean b) {
        if (c == null) {
            return h;
        }
        if (c.q == d.s) {
            return h;
        }
        if (h.p.b() == 0 && c.q == d.p) {
            return h;
        }
        c.u = true;
        return c.o.a(h, b);
    }
    
    public final boolean w(final long n) {
        if (l6.d.a((int)(0x1FFFFFL & n) - (int)((n & 0x3FFFFE00000L) >> 21), 0) < this.o) {
            final int c = this.c();
            if (c == 1 && this.o > 1) {
                this.c();
            }
            if (c > 0) {
                return true;
            }
        }
        return false;
    }
    
    public static final class a
    {
    }
    
    public final class c extends Thread
    {
        public static final AtomicIntegerFieldUpdater w;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final n o;
        public final u p;
        public d q;
        public long r;
        public long s;
        public int t;
        public boolean u;
        public final /* synthetic */ a v;
        private volatile int workerCtl;
        
        static {
            w = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        }
        
        public c() {
            this.setDaemon(true);
            this.o = new n();
            this.p = new u();
            this.q = d.r;
            this.nextParkedWorker = a.z;
            this.t = j6.c.o.c();
        }
        
        public c(final a a, final int n) {
            this(a);
            this.q(n);
        }
        
        public static final /* synthetic */ a a(final c c) {
            return c.v;
        }
        
        public static final AtomicIntegerFieldUpdater j() {
            return c.w;
        }
        
        public final void b(final int n) {
            if (n == 0) {
                return;
            }
            a.a().addAndGet(a.this, -2097152L);
            if (this.q != d.s) {
                this.q = d.r;
            }
        }
        
        public final void c(final int n) {
            if (n == 0) {
                return;
            }
            if (this.u(d.p)) {
                a.this.u();
            }
        }
        
        public final void d(final h h) {
            final int b = h.p.b();
            this.k(b);
            this.c(b);
            a.this.r(h);
            this.b(b);
        }
        
        public final h e(final boolean b) {
            if (b) {
                final boolean b2 = this.m(a.this.o * 2) == 0;
                if (b2) {
                    final h o = this.o();
                    if (o != null) {
                        return o;
                    }
                }
                final h g = this.o.g();
                if (g != null) {
                    return g;
                }
                if (!b2) {
                    final h o2 = this.o();
                    if (o2 != null) {
                        return o2;
                    }
                }
            }
            else {
                final h o3 = this.o();
                if (o3 != null) {
                    return o3;
                }
            }
            return this.v(3);
        }
        
        public final h f() {
            h h;
            if ((h = this.o.h()) == null && (h = (h)a.this.t.d()) == null) {
                h = this.v(1);
            }
            return h;
        }
        
        public final h g(final boolean b) {
            if (this.s()) {
                return this.e(b);
            }
            return this.f();
        }
        
        public final int h() {
            return this.indexInArray;
        }
        
        public final Object i() {
            return this.nextParkedWorker;
        }
        
        public final void k(final int n) {
            this.r = 0L;
            if (this.q == d.q) {
                this.q = d.p;
            }
        }
        
        public final boolean l() {
            return this.nextParkedWorker != a.z;
        }
        
        public final int m(final int n) {
            final int t = this.t;
            final int n2 = t ^ t << 13;
            final int n3 = n2 ^ n2 >> 17;
            final int t2 = n3 ^ n3 << 5;
            this.t = t2;
            final int n4 = n - 1;
            if ((n4 & n) == 0x0) {
                return t2 & n4;
            }
            return (t2 & Integer.MAX_VALUE) % n;
        }
        
        public final void n() {
            if (this.r == 0L) {
                this.r = System.nanoTime() + a.this.q;
            }
            LockSupport.parkNanos(a.this.q);
            if (System.nanoTime() - this.r >= 0L) {
                this.r = 0L;
                this.w();
            }
        }
        
        public final h o() {
            w6.d d;
            if (this.m(2) == 0) {
                final h h = (h)a.this.s.d();
                if (h != null) {
                    return h;
                }
                d = a.this.t;
            }
            else {
                final h h2 = (h)a.this.t.d();
                if (h2 != null) {
                    return h2;
                }
                d = a.this.s;
            }
            return (h)d.d();
        }
        
        public final void p() {
        Label_0000:
            while (true) {
                int n = 0;
                while (!a.this.isTerminated() && this.q != d.s) {
                    final h g = this.g(this.u);
                    if (g != null) {
                        this.s = 0L;
                        this.d(g);
                        continue Label_0000;
                    }
                    this.u = false;
                    if (this.s != 0L) {
                        if (n != 0) {
                            this.u(d.q);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.s);
                            this.s = 0L;
                            continue Label_0000;
                        }
                        n = 1;
                    }
                    else {
                        this.t();
                    }
                }
                break;
            }
            this.u(d.s);
        }
        
        public final void q(final int n) {
            final StringBuilder sb = new StringBuilder();
            sb.append(a.this.r);
            sb.append("-worker-");
            String value;
            if (n == 0) {
                value = "TERMINATED";
            }
            else {
                value = String.valueOf(n);
            }
            sb.append(value);
            this.setName(sb.toString());
            this.indexInArray = n;
        }
        
        public final void r(final Object nextParkedWorker) {
            this.nextParkedWorker = nextParkedWorker;
        }
        
        @Override
        public void run() {
            this.p();
        }
        
        public final boolean s() {
            if (this.q == d.o) {
                return true;
            }
            final a v = a.this;
            final AtomicLongFieldUpdater a = w6.a.a();
            long value;
            do {
                value = a.get(v);
                if ((int)((0x7FFFFC0000000000L & value) >> 42) == 0) {
                    return false;
                }
            } while (!w6.a.a().compareAndSet(v, value, value - 4398046511104L));
            this.q = d.o;
            return true;
        }
        
        public final void t() {
            if (!this.l()) {
                a.this.n(this);
                return;
            }
            c.w.set(this, -1);
            while (this.l() && c.w.get(this) == -1 && !a.this.isTerminated()) {
                if (this.q == d.s) {
                    return;
                }
                this.u(d.q);
                Thread.interrupted();
                this.n();
            }
        }
        
        public final boolean u(final d q) {
            final d q2 = this.q;
            final boolean b = q2 == d.o;
            if (b) {
                a.a().addAndGet(a.this, 4398046511104L);
            }
            if (q2 != q) {
                this.q = q;
            }
            return b;
        }
        
        public final h v(final int n) {
            final int n2 = (int)(a.a().get(a.this) & 0x1FFFFFL);
            if (n2 < 2) {
                return null;
            }
            int m = this.m(n2);
            final a v = a.this;
            int i = 0;
            long n3 = Long.MAX_VALUE;
            while (i < n2) {
                if (++m > n2) {
                    m = 1;
                }
                final c c = (c)v.u.b(m);
                long min;
                if (c != null && c != this) {
                    final long n4 = c.o.n(n, this.p);
                    if (n4 == -1L) {
                        final u p = this.p;
                        final h h = (h)p.o;
                        p.o = null;
                        return h;
                    }
                    min = n3;
                    if (n4 > 0L) {
                        min = Math.min(n3, n4);
                    }
                }
                else {
                    min = n3;
                }
                ++i;
                n3 = min;
            }
            if (n3 == Long.MAX_VALUE) {
                n3 = 0L;
            }
            this.s = n3;
            return null;
        }
        
        public final void w() {
            final a v = a.this;
            final A u = v.u;
            // monitorenter(u)
            while (true) {
                try {
                    if (v.isTerminated()) {
                        // monitorexit(u)
                        return;
                    }
                    if ((int)(a.a().get(v) & 0x1FFFFFL) <= v.o) {
                        // monitorexit(u)
                        return;
                    }
                    if (!c.w.compareAndSet(this, -1, 1)) {
                        // monitorexit(u)
                        return;
                    }
                    final int indexInArray = this.indexInArray;
                    this.q(0);
                    v.q(this, indexInArray, 0);
                    final int n = (int)(a.a().getAndDecrement(v) & 0x1FFFFFL);
                    if (n != indexInArray) {
                        final Object b = v.u.b(n);
                        Intrinsics.b(b);
                        final c c = (c)b;
                        v.u.c(indexInArray, c);
                        c.q(indexInArray);
                        v.q(c, n, indexInArray);
                    }
                    v.u.c(n, null);
                    final t a = V5.t.a;
                    // monitorexit(u)
                    this.q = d.s;
                    return;
                    // monitorexit(u)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public enum d
    {
        o("CPU_ACQUIRED", 0), 
        p("BLOCKING", 1), 
        q("PARKING", 2), 
        r("DORMANT", 3), 
        s("TERMINATED", 4);
        
        static {
            t = c();
        }
        
        public d(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ d[] c() {
            return new d[] { d.o, d.p, d.q, d.r, d.s };
        }
    }
}
