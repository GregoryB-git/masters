// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y6;

import u6.F;
import r6.h;
import u.b;
import u6.D;
import g6.p;
import u6.C;
import p6.P0;
import kotlin.jvm.internal.Intrinsics;
import V5.t;
import g6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class d
{
    public static final AtomicReferenceFieldUpdater c;
    public static final AtomicLongFieldUpdater d;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final AtomicIntegerFieldUpdater g;
    private volatile int _availablePermits;
    public final int a;
    public final l b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;
    
    static {
        c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");
        d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");
        e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");
        f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");
        g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    }
    
    public d(final int i, final int n) {
        this.a = i;
        if (i <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Semaphore should have at least 1 permit, but had ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n >= 0 && n <= i) {
            final f f = new f(0L, null, 2);
            this.head = f;
            this.tail = f;
            this._availablePermits = i - n;
            this.b = new l() {
                public final /* synthetic */ d o;
                
                public final void a(final Throwable t) {
                    this.o.i();
                }
            };
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("The number of acquired permits should be in 0..");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public final void d(final p6.l l) {
        while (this.g() <= 0) {
            Intrinsics.c(l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (this.e((P0)l)) {
                return;
            }
        }
        l.j(t.a, this.b);
    }
    
    public final boolean e(final P0 obj) {
        final AtomicReferenceFieldUpdater e = y6.d.e;
        final f f = e.get(this);
        final long andIncrement = y6.d.f.getAndIncrement(this);
        final p o = d$a.o;
        final long n = andIncrement / y6.e.f();
        Object c = null;
    Label_0147:
        while (true) {
            c = u6.d.c(f, n, o);
            if (D.c(c)) {
                break;
            }
            final C b = D.b(c);
            while (true) {
                final f f2 = e.get(this);
                if (f2.q >= b.q) {
                    break Label_0147;
                }
                if (!b.q()) {
                    break;
                }
                if (u.b.a(e, this, f2, b)) {
                    if (f2.m()) {
                        f2.k();
                        break Label_0147;
                    }
                    break Label_0147;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    b.k();
                }
            }
        }
        final f f3 = (f)D.b(c);
        final int n2 = (int)(andIncrement % y6.e.f());
        if (h.a(f3.r(), n2, null, obj)) {
            obj.a(f3, n2);
            return true;
        }
        if (!h.a(f3.r(), n2, y6.e.e(), y6.e.g())) {
            return false;
        }
        if (obj instanceof p6.l) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((p6.l)obj).j(t.a, this.b);
            return true;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void f() {
        int value;
        int a;
        AtomicIntegerFieldUpdater g;
        do {
            g = y6.d.g;
            value = g.get(this);
            a = this.a;
        } while (value > a && !g.compareAndSet(this, value, a));
    }
    
    public final int g() {
        int i;
        do {
            i = y6.d.g.getAndDecrement(this);
        } while (i > this.a);
        return i;
    }
    
    public int h() {
        return Math.max(y6.d.g.get(this), 0);
    }
    
    public void i() {
        do {
            final int andIncrement = y6.d.g.getAndIncrement(this);
            if (andIncrement >= this.a) {
                this.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("The number of released permits cannot be greater than ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!this.l());
    }
    
    public boolean j() {
        while (true) {
            final AtomicIntegerFieldUpdater g = y6.d.g;
            final int value = g.get(this);
            if (value > this.a) {
                this.f();
            }
            else {
                if (value <= 0) {
                    return false;
                }
                if (g.compareAndSet(this, value, value - 1)) {
                    return true;
                }
                continue;
            }
        }
    }
    
    public final boolean k(final Object obj) {
        if (!(obj instanceof p6.l)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        final p6.l l = (p6.l)obj;
        final Object g = l.g(t.a, null, this.b);
        if (g != null) {
            l.p(g);
            return true;
        }
        return false;
    }
    
    public final boolean l() {
        final AtomicReferenceFieldUpdater c = y6.d.c;
        final f f = c.get(this);
        final long andIncrement = y6.d.d.getAndIncrement(this);
        final long n = andIncrement / y6.e.f();
        final p o = d$c.o;
        Object c2 = null;
    Label_0149:
        while (true) {
            c2 = u6.d.c(f, n, o);
            if (D.c(c2)) {
                break;
            }
            final C b = D.b(c2);
            while (true) {
                final f f2 = c.get(this);
                if (f2.q >= b.q) {
                    break Label_0149;
                }
                if (!b.q()) {
                    break;
                }
                if (u.b.a(c, this, f2, b)) {
                    if (f2.m()) {
                        f2.k();
                        break Label_0149;
                    }
                    break Label_0149;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    b.k();
                }
            }
        }
        final f f3 = (f)D.b(c2);
        f3.b();
        final long q = f3.q;
        int i = 0;
        if (q > n) {
            return false;
        }
        final int n2 = (int)(andIncrement % y6.e.f());
        final F andSet = f3.r().getAndSet(n2, y6.e.e());
        if (andSet == null) {
            while (i < y6.e.d()) {
                if (f3.r().get(n2) == y6.e.g()) {
                    return true;
                }
                ++i;
            }
            return h.a(f3.r(), n2, y6.e.e(), y6.e.b()) ^ true;
        }
        return andSet != y6.e.c() && this.k(andSet);
    }
}
