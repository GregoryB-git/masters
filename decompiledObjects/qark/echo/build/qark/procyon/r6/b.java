// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.List;
import u6.O;
import java.util.ArrayList;
import p6.m;
import Z5.h;
import u6.x;
import V5.o;
import V5.n;
import u6.F;
import kotlin.jvm.internal.y;
import u6.D;
import u6.C;
import g6.p;
import p6.P0;
import u6.E;
import V5.t;
import x6.a;
import kotlin.jvm.internal.Intrinsics;
import g6.q;
import g6.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class b implements d
{
    public static final AtomicLongFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final AtomicLongFieldUpdater g;
    public static final AtomicLongFieldUpdater h;
    public static final AtomicReferenceFieldUpdater i;
    public static final AtomicReferenceFieldUpdater j;
    public static final AtomicReferenceFieldUpdater k;
    public static final AtomicReferenceFieldUpdater l;
    public static final AtomicReferenceFieldUpdater m;
    private volatile Object _closeCause;
    public final int b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    public final l c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final q d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;
    
    static {
        e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
        f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
        g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
        h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
        i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
        j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
        k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
        l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
        m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    }
    
    public b(final int n, final l c) {
        this.b = n;
        this.c = c;
        if (n >= 0) {
            this.bufferEnd = r6.c.t(n);
            this.completedExpandBuffersAndPauseFlag = this.D();
            i n2 = new i(0L, null, this, 3);
            this.sendSegment = n2;
            this.receiveSegment = n2;
            if (this.U()) {
                n2 = r6.c.n();
                Intrinsics.c(n2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = n2;
            q d;
            if (c != null) {
                d = new q() {
                    public final /* synthetic */ b o;
                    
                    public final g6.l a(final x6.a a, final Object o, final Object o2) {
                        return new g6.l() {
                            public final /* synthetic */ b p = b$b.this.o;
                            
                            public final void a(final Throwable t) {
                                if (o2 == c.z()) {
                                    return;
                                }
                                final l c = this.p.c;
                                throw null;
                            }
                        };
                    }
                };
            }
            else {
                d = null;
            }
            this.d = d;
            this._closeCause = r6.c.l();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid channel capacity: ");
        sb.append(n);
        sb.append(", should be >=0");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static /* synthetic */ void L(final b b, long n, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x1) != 0x0) {
                n = 1L;
            }
            b.K(n);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }
    
    public static /* synthetic */ Object g0(final b obj, final X5.d d) {
        i i = h().get(obj);
        while (!obj.P()) {
            final long andIncrement = i().getAndIncrement(obj);
            final int b = c.b;
            final long n = andIncrement / b;
            final int n2 = (int)(andIncrement % b);
            i e = i;
            if (i.q != n) {
                e = obj.B(n, i);
                if (e == null) {
                    continue;
                }
            }
            final Object p2 = obj.r0(e, n2, andIncrement, null);
            if (p2 == c.r()) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (p2 == c.h()) {
                i = e;
                if (andIncrement >= obj.I()) {
                    continue;
                }
                e.b();
                i = e;
            }
            else {
                if (p2 == c.s()) {
                    return obj.h0(e, n2, andIncrement, d);
                }
                e.b();
                return p2;
            }
        }
        throw E.a(obj.F());
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater h() {
        return b.j;
    }
    
    public static final /* synthetic */ AtomicLongFieldUpdater i() {
        return b.f;
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater j() {
        return b.i;
    }
    
    public static final /* synthetic */ AtomicLongFieldUpdater k() {
        return b.e;
    }
    
    public final i A(final long n, i i, final long n2) {
        final AtomicReferenceFieldUpdater k = r6.b.k;
        final p p3 = (p)r6.c.y();
        Object c = null;
    Label_0121:
        while (true) {
            c = u6.d.c(i, n, p3);
            if (D.c(c)) {
                break;
            }
            final C b = D.b(c);
            while (true) {
                final C c2 = k.get(this);
                if (c2.q >= b.q) {
                    break Label_0121;
                }
                if (!b.q()) {
                    break;
                }
                if (u.b.a(k, this, c2, b)) {
                    if (c2.m()) {
                        c2.k();
                        break Label_0121;
                    }
                    break Label_0121;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    b.k();
                }
            }
        }
        if (D.c(c)) {
            this.x();
            this.Z(n, i);
        }
        else {
            i = (i)D.b(c);
            final long q = i.q;
            if (q <= n) {
                return i;
            }
            final AtomicLongFieldUpdater g = r6.b.g;
            final int b2 = r6.c.b;
            if (g.compareAndSet(this, n2 + 1L, b2 * q)) {
                this.K(i.q * b2 - n2);
                return null;
            }
        }
        L(this, 0L, 1, null);
        return null;
    }
    
    public final i B(final long n, i i) {
        final AtomicReferenceFieldUpdater j = r6.b.j;
        final p p2 = (p)r6.c.y();
        Object c = null;
    Label_0121:
        while (true) {
            c = u6.d.c(i, n, p2);
            if (D.c(c)) {
                break;
            }
            final C b = D.b(c);
            while (true) {
                final C c2 = j.get(this);
                if (c2.q >= b.q) {
                    break Label_0121;
                }
                if (!b.q()) {
                    break;
                }
                if (u.b.a(j, this, c2, b)) {
                    if (c2.m()) {
                        c2.k();
                        break Label_0121;
                    }
                    break Label_0121;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    b.k();
                }
            }
        }
        final boolean c3 = D.c(c);
        i k = null;
        if (c3) {
            this.x();
            if (i.q * r6.c.b >= this.I()) {
                return k;
            }
        }
        else {
            i = (i)D.b(c);
            if (!this.U() && n <= this.D() / r6.c.b) {
                final AtomicReferenceFieldUpdater l = r6.b.k;
                while (true) {
                    final C c4 = l.get(this);
                    if (c4.q >= i.q || !i.q()) {
                        break;
                    }
                    if (u.b.a(l, this, c4, i)) {
                        if (c4.m()) {
                            c4.k();
                            break;
                        }
                        break;
                    }
                    else {
                        if (!i.m()) {
                            continue;
                        }
                        i.k();
                    }
                }
            }
            final long q = i.q;
            if (q <= n) {
                k = i;
                return k;
            }
            final int b2 = r6.c.b;
            this.v0(q * b2);
            if (i.q * b2 >= this.I()) {
                return k;
            }
        }
        i.b();
        return null;
    }
    
    public final i C(final long n, i i) {
        final AtomicReferenceFieldUpdater j = r6.b.i;
        final p p2 = (p)r6.c.y();
        Object c = null;
    Label_0121:
        while (true) {
            c = u6.d.c(i, n, p2);
            if (D.c(c)) {
                break;
            }
            final C b = D.b(c);
            while (true) {
                final C c2 = j.get(this);
                if (c2.q >= b.q) {
                    break Label_0121;
                }
                if (!b.q()) {
                    break;
                }
                if (u.b.a(j, this, c2, b)) {
                    if (c2.m()) {
                        c2.k();
                        break Label_0121;
                    }
                    break Label_0121;
                }
                else {
                    if (!b.m()) {
                        continue;
                    }
                    b.k();
                }
            }
        }
        final boolean c3 = D.c(c);
        i k = null;
        if (c3) {
            this.x();
            if (i.q * r6.c.b >= this.G()) {
                return k;
            }
        }
        else {
            i = (i)D.b(c);
            final long q = i.q;
            if (q <= n) {
                k = i;
                return k;
            }
            final int b2 = r6.c.b;
            this.w0(q * b2);
            if (i.q * b2 >= this.G()) {
                return k;
            }
        }
        i.b();
        return null;
    }
    
    public final long D() {
        return r6.b.g.get(this);
    }
    
    public final Throwable E() {
        return r6.b.l.get(this);
    }
    
    public final Throwable F() {
        Throwable e;
        if ((e = this.E()) == null) {
            e = new j("Channel was closed");
        }
        return e;
    }
    
    public final long G() {
        return r6.b.f.get(this);
    }
    
    public final Throwable H() {
        Throwable e;
        if ((e = this.E()) == null) {
            e = new k("Channel was closed");
        }
        return e;
    }
    
    public final long I() {
        return r6.b.e.get(this) & 0xFFFFFFFFFFFFFFFL;
    }
    
    public final boolean J() {
        while (true) {
            final AtomicReferenceFieldUpdater j = r6.b.j;
            final i i = j.get(this);
            final long g = this.G();
            if (this.I() <= g) {
                return false;
            }
            final int b = r6.c.b;
            final long n = g / b;
            i b2 = i;
            if (i.q != n && (b2 = this.B(n, i)) == null) {
                if (j.get(this).q < n) {
                    return false;
                }
                continue;
            }
            else {
                b2.b();
                if (this.N(b2, (int)(g % b), g)) {
                    return true;
                }
                r6.b.f.compareAndSet(this, g, g + 1L);
            }
        }
    }
    
    public final void K(final long delta) {
        if ((r6.b.h.addAndGet(this, delta) & 0x4000000000000000L) != 0x0L) {
            while ((r6.b.h.get(this) & 0x4000000000000000L) != 0x0L) {}
        }
    }
    
    public final void M() {
        final AtomicReferenceFieldUpdater m = r6.b.m;
        l value;
        F f;
        do {
            value = m.get(this);
            if (value == null) {
                f = r6.c.d();
            }
            else {
                f = r6.c.e();
            }
        } while (!u.b.a(m, this, value, f));
        if (value == null) {
            return;
        }
        final l l = (l)y.b(value, 1);
        value.invoke(this.E());
    }
    
    public final boolean N(final i i, final int n, final long n2) {
        Object w;
        do {
            w = i.w(n);
            boolean b = false;
            if (w != null && w != r6.c.k()) {
                if (w == r6.c.d) {
                    return true;
                }
                if (w == r6.c.j()) {
                    return false;
                }
                if (w == r6.c.z()) {
                    return false;
                }
                if (w == r6.c.f()) {
                    return false;
                }
                if (w == r6.c.o()) {
                    return false;
                }
                if (w == r6.c.p()) {
                    return true;
                }
                if (w == r6.c.q()) {
                    return false;
                }
                if (n2 == this.G()) {
                    b = true;
                }
                return b;
            }
        } while (!i.r(n, w, r6.c.o()));
        this.z();
        return false;
    }
    
    public final boolean O(final long n, final boolean b) {
        final int i = (int)(n >> 60);
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unexpected close status: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString().toString());
                }
                this.v(n & 0xFFFFFFFFFFFFFFFL);
            }
            else {
                this.w(n & 0xFFFFFFFFFFFFFFFL);
                if (b) {
                    if (this.J()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean P() {
        return this.Q(r6.b.e.get(this));
    }
    
    public final boolean Q(final long n) {
        return this.O(n, true);
    }
    
    public boolean R() {
        return this.S(r6.b.e.get(this));
    }
    
    public final boolean S(final long n) {
        return this.O(n, false);
    }
    
    public boolean T() {
        return false;
    }
    
    public final boolean U() {
        final long d = this.D();
        return d == 0L || d == Long.MAX_VALUE;
    }
    
    public final long V(i i) {
        do {
            int n = r6.c.b - 1;
        Label_0006:
            while (-1 < n) {
                final long n2 = i.q * r6.c.b + n;
                if (n2 < this.G()) {
                    return -1L;
                }
                while (true) {
                    Object w;
                    do {
                        w = i.w(n);
                        if (w != null && w != r6.c.k()) {
                            if (w == r6.c.d) {
                                return n2;
                            }
                            --n;
                            continue Label_0006;
                        }
                    } while (!i.r(n, w, r6.c.z()));
                    i.p();
                    continue;
                }
            }
        } while ((i = (i)i.g()) != null);
        return -1L;
    }
    
    public final void W() {
        final AtomicLongFieldUpdater e = r6.b.e;
        long value;
        do {
            value = e.get(this);
        } while ((int)(value >> 60) == 0 && !e.compareAndSet(this, value, r6.c.b(0xFFFFFFFFFFFFFFFL & value, 1)));
    }
    
    public final void X() {
        final AtomicLongFieldUpdater e = r6.b.e;
        long value;
        do {
            value = e.get(this);
        } while (!e.compareAndSet(this, value, r6.c.b(0xFFFFFFFFFFFFFFFL & value, 3)));
    }
    
    public final void Y() {
        final AtomicLongFieldUpdater e = r6.b.e;
        while (true) {
            final long value = e.get(this);
            final int n = (int)(value >> 60);
            long n2;
            int n3;
            if (n != 0) {
                if (n != 1) {
                    return;
                }
                n2 = (value & 0xFFFFFFFFFFFFFFFL);
                n3 = 3;
            }
            else {
                n2 = (value & 0xFFFFFFFFFFFFFFFL);
                n3 = 2;
            }
            if (e.compareAndSet(this, value, r6.c.b(n2, n3))) {
                return;
            }
        }
    }
    
    public final void Z(final long n, i i) {
        i j;
        while (true) {
            j = i;
            if (i.q >= n) {
                break;
            }
            final i k = (i)i.e();
            if (k == null) {
                j = i;
                break;
            }
            i = k;
        }
        while (true) {
            if (j.h()) {
                i = (i)j.e();
                if (i != null) {
                    j = i;
                    continue;
                }
            }
            final AtomicReferenceFieldUpdater l = r6.b.k;
            while (true) {
                final C c = l.get(this);
                if (c.q >= j.q) {
                    return;
                }
                if (!j.q()) {
                    break;
                }
                if (u.b.a(l, this, c, j)) {
                    if (c.m()) {
                        c.k();
                    }
                    return;
                }
                if (!j.m()) {
                    continue;
                }
                j.k();
            }
        }
    }
    
    @Override
    public Object a(final X5.d d) {
        return g0(this, d);
    }
    
    public void a0() {
    }
    
    @Override
    public boolean b(final Throwable t) {
        return this.u(t, false);
    }
    
    public final void b0(final p6.l l) {
        final V5.n.a o = V5.n.o;
        l.resumeWith(V5.n.a(V5.o.a(this.F())));
    }
    
    @Override
    public Object c() {
        final long value = r6.b.f.get(this);
        final long value2 = r6.b.e.get(this);
        if (this.Q(value2)) {
            return r6.g.a.a(this.E());
        }
        if (value >= (value2 & 0xFFFFFFFFFFFFFFFL)) {
            return r6.g.a.b();
        }
        final F i = r6.c.i();
        i j = h().get(this);
        while (!this.P()) {
            final long andIncrement = i().getAndIncrement(this);
            final int b = r6.c.b;
            final long n = andIncrement / b;
            final int n2 = (int)(andIncrement % b);
            if (j.q != n) {
                final i e = this.B(n, j);
                if (e == null) {
                    continue;
                }
                j = e;
            }
            final Object p = this.r0(j, n2, andIncrement, i);
            if (p == r6.c.r()) {
                P0 p2;
                if (i instanceof P0) {
                    p2 = (P0)i;
                }
                else {
                    p2 = null;
                }
                if (p2 != null) {
                    this.e0(p2, j, n2);
                }
                this.x0(andIncrement);
                j.p();
                return r6.g.a.b();
            }
            if (p == r6.c.h()) {
                if (andIncrement >= this.I()) {
                    continue;
                }
                j.b();
            }
            else {
                if (p != r6.c.s()) {
                    j.b();
                    return r6.g.a.c(p);
                }
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return r6.g.a.a(this.E());
    }
    
    public void c0() {
    }
    
    @Override
    public Object d(final Object o) {
        if (this.m0(r6.b.e.get(this))) {
            return r6.g.a.b();
        }
        final F j = r6.c.j();
        i i = j().get(this);
        while (true) {
            final long andIncrement = k().getAndIncrement(this);
            final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
            final boolean l = this.S(andIncrement);
            final int b = r6.c.b;
            final long n2 = n / b;
            final int n3 = (int)(n % b);
            if (i.q != n2) {
                final i f = this.C(n2, i);
                if (f == null) {
                    if (l) {
                        break;
                    }
                    continue;
                }
                else {
                    i = f;
                }
            }
            final int q = this.t0(i, n3, o, n, j, l);
            if (q == 0) {
                i.b();
                return r6.g.a.c(t.a);
            }
            if (q == 1) {
                return r6.g.a.c(t.a);
            }
            if (q != 2) {
                if (q == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (q != 4) {
                    if (q != 5) {
                        continue;
                    }
                    i.b();
                }
                else {
                    if (n < this.G()) {
                        i.b();
                        break;
                    }
                    break;
                }
            }
            else {
                if (l) {
                    i.p();
                    break;
                }
                P0 p;
                if (j instanceof P0) {
                    p = (P0)j;
                }
                else {
                    p = null;
                }
                if (p != null) {
                    this.f0(p, i, n3);
                }
                i.p();
                return r6.g.a.b();
            }
        }
        return r6.g.a.a(this.H());
    }
    
    public void d0() {
    }
    
    public final void e0(final P0 p3, final i i, final int n) {
        this.d0();
        p3.a(i, n);
    }
    
    public final void f0(final P0 p3, final i i, final int n) {
        p3.a(i, n + r6.c.b);
    }
    
    public final Object h0(i e, int b, long andIncrement, final X5.d d) {
    Label_0153_Outer:
        while (true) {
            final p6.m b2 = p6.o.b(Y5.b.b(d));
            while (true) {
                Label_0378: {
                    while (true) {
                        try {
                            final Object p4 = this.r0(e, b, andIncrement, b2);
                            Label_0347: {
                                if (p4 == r6.c.r()) {
                                    this.e0(b2, e, b);
                                }
                                else {
                                    final F h = r6.c.h();
                                    final l l = null;
                                    Object o = null;
                                    F f = null;
                                    l k = null;
                                    Label_0281: {
                                        if (p4 == h) {
                                            if (andIncrement < this.I()) {
                                                e.b();
                                            }
                                            i i = h().get(this);
                                            while (!this.P()) {
                                                andIncrement = i().getAndIncrement(this);
                                                b = r6.c.b;
                                                final long n = andIncrement / b;
                                                b = (int)(andIncrement % b);
                                                final i j = i;
                                                if (i.q != n) {
                                                    e = this.B(n, i);
                                                    if (e == null) {
                                                        continue Label_0153_Outer;
                                                    }
                                                    break Label_0378;
                                                }
                                                else {
                                                    final Object p5 = this.r0(j, b, andIncrement, b2);
                                                    if (p5 == r6.c.r()) {
                                                        Object o2 = o;
                                                        if (b2 instanceof P0) {
                                                            o2 = b2;
                                                        }
                                                        if (o2 != null) {
                                                            this.e0((P0)o2, j, b);
                                                        }
                                                        break Label_0347;
                                                    }
                                                    else if (p5 == r6.c.h()) {
                                                        i = j;
                                                        if (andIncrement >= this.I()) {
                                                            continue Label_0153_Outer;
                                                        }
                                                        j.b();
                                                        i = j;
                                                    }
                                                    else {
                                                        if (p5 == r6.c.s()) {
                                                            throw new IllegalStateException("unexpected".toString());
                                                        }
                                                        j.b();
                                                        o = this.c;
                                                        f = (F)p5;
                                                        k = l;
                                                        if (o != null) {
                                                            k = x.a((l)o, p5, b2.getContext());
                                                            f = (F)p5;
                                                        }
                                                        break Label_0281;
                                                    }
                                                }
                                            }
                                            this.b0(b2);
                                            break Label_0347;
                                        }
                                        e.b();
                                        o = this.c;
                                        f = (F)p4;
                                        k = l;
                                        if (o != null) {
                                            k = x.a((l)o, p4, b2.getContext());
                                            f = (F)p4;
                                        }
                                    }
                                    b2.j(f, k);
                                }
                            }
                            final Object w = b2.w();
                            if (w == Y5.b.c()) {
                                Z5.h.c(d);
                            }
                            return w;
                            b2.I();
                            throw null;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                continue;
            }
        }
    }
    
    public final void i0(final i i) {
        final l c = this.c;
        O o = null;
        Object b = u6.l.b(null, 1, null);
        i j = i;
        i k;
        Object o2 = null;
        O o3 = null;
    Label_0350:
        do {
            int n = r6.c.b - 1;
            o2 = b;
            o3 = o;
            while (-1 < n) {
                final long n2 = j.q * r6.c.b + n;
                while (true) {
                    final Object w = j.w(n);
                    if (w != r6.c.f()) {
                        Label_0317: {
                            Label_0142: {
                                O o4;
                                Object c2;
                                if (w == r6.c.d) {
                                    if (n2 < this.G()) {
                                        break Label_0350;
                                    }
                                    if (!j.r(n, w, r6.c.z())) {
                                        continue;
                                    }
                                    o4 = o3;
                                    c2 = o2;
                                    if (c != null) {
                                        o4 = x.c(c, j.v(n), o3);
                                        c2 = o2;
                                    }
                                }
                                else if (w != r6.c.k() && w != null) {
                                    if (!(w instanceof P0) && !(w instanceof r6.o)) {
                                        if (w == r6.c.p()) {
                                            break Label_0350;
                                        }
                                        if (w == r6.c.q()) {
                                            break Label_0350;
                                        }
                                        if (w != r6.c.p()) {
                                            break Label_0317;
                                        }
                                        continue;
                                    }
                                    else {
                                        if (n2 < this.G()) {
                                            break Label_0350;
                                        }
                                        P0 a;
                                        if (w instanceof r6.o) {
                                            a = ((r6.o)w).a;
                                        }
                                        else {
                                            a = (P0)w;
                                        }
                                        if (!j.r(n, w, r6.c.z())) {
                                            continue;
                                        }
                                        o4 = o3;
                                        if (c != null) {
                                            o4 = x.c(c, j.v(n), o3);
                                        }
                                        c2 = u6.l.c(o2, a);
                                    }
                                }
                                else {
                                    if (j.r(n, w, r6.c.z())) {
                                        break Label_0142;
                                    }
                                    continue;
                                }
                                j.s(n);
                                o2 = c2;
                                o3 = o4;
                            }
                            j.p();
                        }
                        --n;
                        break;
                    }
                    break Label_0350;
                }
            }
            k = (i)j.g();
            o = o3;
            b = o2;
        } while ((j = k) != null);
        if (o2 != null) {
            if (!(o2 instanceof ArrayList)) {
                this.k0((P0)o2);
            }
            else {
                Intrinsics.c(o2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                final ArrayList<P0> list = (ArrayList<P0>)o2;
                for (int index = list.size() - 1; -1 < index; --index) {
                    this.k0(list.get(index));
                }
            }
        }
        if (o3 == null) {
            return;
        }
        throw o3;
    }
    
    @Override
    public e iterator() {
        return new a();
    }
    
    public final void j0(final P0 p) {
        this.l0(p, true);
    }
    
    public final void k0(final P0 p) {
        this.l0(p, false);
    }
    
    public final void l0(final P0 obj, final boolean b) {
        if (obj instanceof p6.l) {
            final X5.d d = (X5.d)obj;
            final V5.n.a o = V5.n.o;
            Throwable t;
            if (b) {
                t = this.F();
            }
            else {
                t = this.H();
            }
            d.resumeWith(V5.n.a(V5.o.a(t)));
            return;
        }
        if (obj instanceof a) {
            ((a)obj).j();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected waiter: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final boolean m0(final long n) {
        return !this.S(n) && (this.r(n & 0xFFFFFFFFFFFFFFFL) ^ true);
    }
    
    public final boolean n0(final Object obj, final Object o) {
        if (obj instanceof a) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a)obj).i(o);
        }
        if (obj instanceof p6.l) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            final p6.l l = (p6.l)obj;
            final l c = this.c;
            l a;
            if (c != null) {
                a = x.a(c, o, l.getContext());
            }
            else {
                a = null;
            }
            return r6.c.u(l, o, a);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected receiver type: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final boolean o0(final Object obj, final i i, final int n) {
        if (obj instanceof p6.l) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return r6.c.C((p6.l)obj, t.a, null, 2, null);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected waiter: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final boolean p0(final i i, final int n, final long n2) {
        final Object w = i.w(n);
        if (!(w instanceof P0) || n2 < r6.b.f.get(this) || !i.r(n, w, r6.c.p())) {
            return this.q0(i, n, n2);
        }
        if (this.o0(w, i, n)) {
            i.A(n, r6.c.d);
            return true;
        }
        i.A(n, r6.c.j());
        i.x(n, false);
        return false;
    }
    
    public final boolean q0(final i i, final int n, final long n2) {
        while (true) {
            final Object w = i.w(n);
            if (w instanceof P0) {
                if (n2 < r6.b.f.get(this)) {
                    if (i.r(n, w, new r6.o((P0)w))) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (!i.r(n, w, r6.c.p())) {
                        continue;
                    }
                    if (this.o0(w, i, n)) {
                        i.A(n, r6.c.d);
                        return true;
                    }
                    i.A(n, r6.c.j());
                    i.x(n, false);
                    return false;
                }
            }
            else {
                if (w == r6.c.j()) {
                    return false;
                }
                if (w == null) {
                    if (i.r(n, w, r6.c.k())) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (w == r6.c.d) {
                        return true;
                    }
                    if (w == r6.c.o() || w == r6.c.f()) {
                        return true;
                    }
                    if (w == r6.c.i()) {
                        return true;
                    }
                    if (w == r6.c.z()) {
                        return true;
                    }
                    if (w == r6.c.q()) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected cell state: ");
                    sb.append(w);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }
    }
    
    public final boolean r(final long n) {
        return n < this.D() || n < this.G() + this.b;
    }
    
    public final Object r0(final i i, final int n, final long n2, final Object o) {
        final Object w = i.w(n);
        if (w == null) {
            if (n2 >= (r6.b.e.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if (o == null) {
                    return r6.c.s();
                }
                if (i.r(n, w, o)) {
                    this.z();
                    return r6.c.r();
                }
            }
        }
        else if (w == r6.c.d && i.r(n, w, r6.c.f())) {
            this.z();
            return i.y(n);
        }
        return this.s0(i, n, n2, o);
    }
    
    public final void s(final i i, final long n) {
        final Object b = u6.l.b(null, 1, null);
        i j = i;
        Object o = b;
        Object o2 = null;
    Label_0215:
        while (true) {
            o2 = o;
            if (j == null) {
                break;
            }
            Object c;
            for (int n2 = r6.c.b - 1; -1 < n2; --n2, o = c) {
                o2 = o;
                if (j.q * r6.c.b + n2 < n) {
                    break Label_0215;
                }
                while (true) {
                    final Object w = j.w(n2);
                    if (w != null && w != r6.c.k()) {
                        Object a;
                        if (w instanceof r6.o) {
                            if (!j.r(n2, w, r6.c.z())) {
                                continue;
                            }
                            a = ((r6.o)w).a;
                        }
                        else {
                            c = o;
                            if (!(w instanceof P0)) {
                                break;
                            }
                            if (!j.r(n2, w, r6.c.z())) {
                                continue;
                            }
                            a = w;
                        }
                        c = u6.l.c(o, a);
                        j.x(n2, true);
                        break;
                    }
                    if (j.r(n2, w, r6.c.z())) {
                        j.p();
                        c = o;
                        break;
                    }
                }
            }
            j = (i)j.g();
        }
        if (o2 != null) {
            if (!(o2 instanceof ArrayList)) {
                this.j0((P0)o2);
                return;
            }
            Intrinsics.c(o2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            final ArrayList<P0> list = (ArrayList<P0>)o2;
            for (int index = list.size() - 1; -1 < index; --index) {
                this.j0(list.get(index));
            }
        }
    }
    
    public final Object s0(final i i, final int n, final long n2, Object a) {
        while (true) {
            final Object w = i.w(n);
            if (w != null && w != r6.c.k()) {
                if (w == r6.c.d) {
                    if (i.r(n, w, r6.c.f())) {
                        this.z();
                        return i.y(n);
                    }
                    continue;
                }
                else {
                    if (w == r6.c.j()) {
                        return r6.c.h();
                    }
                    if (w == r6.c.o()) {
                        return r6.c.h();
                    }
                    if (w == r6.c.z()) {
                        this.z();
                        return r6.c.h();
                    }
                    if (w == r6.c.p() || !i.r(n, w, r6.c.q())) {
                        continue;
                    }
                    final boolean b = w instanceof r6.o;
                    a = w;
                    if (b) {
                        a = ((r6.o)w).a;
                    }
                    if (this.o0(a, i, n)) {
                        i.A(n, r6.c.f());
                        this.z();
                        return i.y(n);
                    }
                    i.A(n, r6.c.j());
                    i.x(n, false);
                    if (b) {
                        this.z();
                    }
                    return r6.c.h();
                }
            }
            else if (n2 < (r6.b.e.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if (i.r(n, w, r6.c.o())) {
                    this.z();
                    return r6.c.h();
                }
                continue;
            }
            else {
                if (a == null) {
                    return r6.c.s();
                }
                if (i.r(n, w, a)) {
                    this.z();
                    return r6.c.r();
                }
                continue;
            }
        }
    }
    
    public final i t() {
        final i value = r6.b.k.get(this);
        final i i = r6.b.i.get(this);
        i j = value;
        if (i.q > value.q) {
            j = i;
        }
        final i k = r6.b.j.get(this);
        i l = j;
        if (k.q > j.q) {
            l = k;
        }
        return (i)u6.d.b(l);
    }
    
    public final int t0(final i i, final int n, final Object o, final long n2, final Object o2, final boolean b) {
        i.B(n, o);
        if (b) {
            return this.u0(i, n, o, n2, o2, b);
        }
        final Object w = i.w(n);
        if (w == null) {
            if (this.r(n2)) {
                if (i.r(n, null, r6.c.d)) {
                    return 1;
                }
            }
            else {
                if (o2 == null) {
                    return 3;
                }
                if (i.r(n, null, o2)) {
                    return 2;
                }
            }
        }
        else if (w instanceof P0) {
            i.s(n);
            if (this.n0(w, o)) {
                i.A(n, r6.c.f());
                this.c0();
                return 0;
            }
            if (i.t(n, r6.c.i()) != r6.c.i()) {
                i.x(n, true);
            }
            return 5;
        }
        return this.u0(i, n, o, n2, o2, b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final int n = (int)(r6.b.e.get(this) >> 60);
        Label_0058: {
            String str;
            if (n != 2) {
                if (n != 3) {
                    break Label_0058;
                }
                str = "cancelled,";
            }
            else {
                str = "closed,";
            }
            sb.append(str);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("capacity=");
        sb2.append(this.b);
        sb2.append(',');
        sb.append(sb2.toString());
        sb.append("data=[");
        final List list = W5.m.i(r6.b.j.get(this), r6.b.i.get(this), r6.b.k.get(this));
        final ArrayList<i> list2 = new ArrayList<i>();
        for (final i next : list) {
            if (next != r6.c.n()) {
                list2.add(next);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            i next2 = iterator2.next();
            i i;
            if (!iterator2.hasNext()) {
                i = next2;
            }
            else {
                long q = next2.q;
                do {
                    final i next3 = iterator2.next();
                    final long q2 = next3.q;
                    i = next2;
                    long n2 = q;
                    if (q > q2) {
                        i = next3;
                        n2 = q2;
                    }
                    next2 = i;
                    q = n2;
                } while (iterator2.hasNext());
            }
            i j = i;
            final long g = this.G();
            final long k = this.I();
        Label_0780:
            do {
                for (int b = r6.c.b, l = 0; l < b; ++l) {
                    final long n3 = j.q * r6.c.b + l;
                    final long n4 = lcmp(n3, k);
                    if (n4 >= 0 && n3 >= g) {
                        break Label_0780;
                    }
                    final Object w = j.w(l);
                    final Object v = j.v(l);
                    String s = null;
                    Label_0650: {
                        if (w instanceof p6.l) {
                            final long n5 = lcmp(n3, g);
                            if (n5 < 0 && n4 >= 0) {
                                s = "receive";
                            }
                            else if (n4 < 0 && n5 >= 0) {
                                s = "send";
                            }
                            else {
                                s = "cont";
                            }
                        }
                        else if (w instanceof r6.o) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("EB(");
                            sb3.append(w);
                            sb3.append(')');
                            s = sb3.toString();
                        }
                        else {
                            if (!Intrinsics.a(w, r6.c.q())) {
                                if (!Intrinsics.a(w, r6.c.p())) {
                                    if (w == null) {
                                        continue;
                                    }
                                    if (Intrinsics.a(w, r6.c.k())) {
                                        continue;
                                    }
                                    if (Intrinsics.a(w, r6.c.f())) {
                                        continue;
                                    }
                                    if (Intrinsics.a(w, r6.c.o())) {
                                        continue;
                                    }
                                    if (Intrinsics.a(w, r6.c.i())) {
                                        continue;
                                    }
                                    if (Intrinsics.a(w, r6.c.j())) {
                                        continue;
                                    }
                                    if (!Intrinsics.a(w, r6.c.z())) {
                                        s = w.toString();
                                        break Label_0650;
                                    }
                                    continue;
                                }
                            }
                            s = "resuming_sender";
                        }
                    }
                    String str2;
                    if (v != null) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append('(');
                        sb4.append(s);
                        sb4.append(',');
                        sb4.append(v);
                        sb4.append("),");
                        str2 = sb4.toString();
                    }
                    else {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append(s);
                        sb5.append(',');
                        str2 = sb5.toString();
                    }
                    sb.append(str2);
                }
                j = (i)j.e();
            } while (j != null);
            if (kotlin.text.i.h0(sb) == ',') {
                Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
            }
            sb.append("]");
            return sb.toString();
        }
        throw new NoSuchElementException();
    }
    
    public boolean u(final Throwable t, final boolean b) {
        if (b) {
            this.W();
        }
        final boolean a = b.a(b.l, this, r6.c.l(), t);
        if (b) {
            this.X();
        }
        else {
            this.Y();
        }
        this.x();
        this.a0();
        if (a) {
            this.M();
        }
        return a;
    }
    
    public final int u0(final i i, final int n, final Object o, final long n2, Object a, final boolean b) {
        while (true) {
            final Object w = i.w(n);
            if (w == null) {
                if (this.r(n2) && !b) {
                    if (i.r(n, null, r6.c.d)) {
                        return 1;
                    }
                    continue;
                }
                else if (b) {
                    if (i.r(n, null, r6.c.j())) {
                        i.x(n, false);
                        return 4;
                    }
                    continue;
                }
                else {
                    if (a == null) {
                        return 3;
                    }
                    if (i.r(n, null, a)) {
                        return 2;
                    }
                    continue;
                }
            }
            else if (w == r6.c.k()) {
                if (i.r(n, w, r6.c.d)) {
                    return 1;
                }
                continue;
            }
            else {
                if (w == r6.c.i()) {
                    i.s(n);
                    return 5;
                }
                if (w == r6.c.o()) {
                    i.s(n);
                    return 5;
                }
                final F z = r6.c.z();
                i.s(n);
                if (w == z) {
                    this.x();
                    return 4;
                }
                a = w;
                if (w instanceof r6.o) {
                    a = ((r6.o)w).a;
                }
                if (this.n0(a, o)) {
                    i.A(n, r6.c.f());
                    this.c0();
                    return 0;
                }
                if (i.t(n, r6.c.i()) != r6.c.i()) {
                    i.x(n, true);
                }
                return 5;
            }
        }
    }
    
    public final void v(final long n) {
        this.i0(this.w(n));
    }
    
    public final void v0(final long n) {
        final AtomicLongFieldUpdater f = r6.b.f;
        long value;
        do {
            value = f.get(this);
            if (value >= n) {
                return;
            }
        } while (!r6.b.f.compareAndSet(this, value, n));
    }
    
    public final i w(final long n) {
        final i t = this.t();
        if (this.T()) {
            final long v = this.V(t);
            if (v != -1L) {
                this.y(v);
            }
        }
        this.s(t, n);
        return t;
    }
    
    public final void w0(final long n) {
        final AtomicLongFieldUpdater e = r6.b.e;
        long value;
        long n2;
        do {
            value = e.get(this);
            n2 = (0xFFFFFFFFFFFFFFFL & value);
            if (n2 >= n) {
                return;
            }
        } while (!r6.b.e.compareAndSet(this, value, r6.c.b(n2, (int)(value >> 60))));
    }
    
    public final void x() {
        this.R();
    }
    
    public final void x0(long n) {
        if (this.U()) {
            return;
        }
        while (this.D() <= n) {}
        for (int g = r6.c.g(), i = 0; i < g; ++i) {
            n = this.D();
            if (n == (0x3FFFFFFFFFFFFFFFL & r6.b.h.get(this)) && n == this.D()) {
                return;
            }
        }
        final AtomicLongFieldUpdater h = r6.b.h;
        do {
            n = h.get(this);
        } while (!h.compareAndSet(this, n, r6.c.a(n & 0x3FFFFFFFFFFFFFFFL, true)));
        AtomicLongFieldUpdater h2;
        while (true) {
            n = this.D();
            h2 = r6.b.h;
            final long value = h2.get(this);
            final long n2 = value & 0x3FFFFFFFFFFFFFFFL;
            final boolean b = (0x4000000000000000L & value) != 0x0L;
            if (n == n2 && n == this.D()) {
                break;
            }
            if (b) {
                continue;
            }
            h2.compareAndSet(this, value, r6.c.a(n2, true));
        }
        do {
            n = h2.get(this);
        } while (!h2.compareAndSet(this, n, r6.c.a(n & 0x3FFFFFFFFFFFFFFFL, false)));
    }
    
    public final void y(final long n) {
        i i = r6.b.j.get(this);
        while (true) {
            final AtomicLongFieldUpdater f = r6.b.f;
            final long value = f.get(this);
            if (n < Math.max(this.b + value, this.D())) {
                return;
            }
            if (!f.compareAndSet(this, value, value + 1L)) {
                continue;
            }
            final int b = r6.c.b;
            final long n2 = value / b;
            final int n3 = (int)(value % b);
            i b2 = i;
            if (i.q != n2) {
                b2 = this.B(n2, i);
                if (b2 == null) {
                    continue;
                }
            }
            final Object r0 = this.r0(b2, n3, value, null);
            if (r0 == r6.c.h()) {
                i = b2;
                if (value >= this.I()) {
                    continue;
                }
                b2.b();
                i = b2;
            }
            else {
                b2.b();
                final l c = this.c;
                i = b2;
                if (c == null) {
                    continue;
                }
                final O d = x.d(c, r0, null, 2, null);
                if (d != null) {
                    throw d;
                }
                i = b2;
            }
        }
    }
    
    public final void z() {
        if (this.U()) {
            return;
        }
        i i = r6.b.k.get(this);
        while (true) {
            final long andIncrement = r6.b.g.getAndIncrement(this);
            final int b = r6.c.b;
            final long n = andIncrement / b;
            final long j = this.I();
            final long q = i.q;
            if (j <= andIncrement) {
                if (q < n && i.e() != null) {
                    this.Z(n, i);
                }
                L(this, 0L, 1, null);
                return;
            }
            i a = i;
            if (q != n) {
                a = this.A(n, i, andIncrement);
                if (a == null) {
                    continue;
                }
            }
            final boolean p0 = this.p0(a, (int)(andIncrement % b), andIncrement);
            L(this, 0L, 1, null);
            i = a;
            if (p0) {
                return;
            }
        }
    }
    
    public final class a implements e, P0
    {
        public Object o;
        public p6.m p;
        
        public a() {
            this.o = r6.c.m();
        }
        
        public static final /* synthetic */ void d(final a a, final p6.m p2) {
            a.p = p2;
        }
        
        public static final /* synthetic */ void e(final a a, final Object o) {
            a.o = o;
        }
        
        @Override
        public void a(final C c, final int n) {
            final p6.m p2 = this.p;
            if (p2 != null) {
                p2.a(c, n);
            }
        }
        
        @Override
        public Object b(final X5.d d) {
            final b q = r6.b.this;
            i i = r6.b.h().get(q);
            while (!q.P()) {
                final long andIncrement = r6.b.i().getAndIncrement(q);
                final int b = r6.c.b;
                final long n = andIncrement / b;
                final int n2 = (int)(andIncrement % b);
                if (i.q != n) {
                    final i e = q.B(n, i);
                    if (e == null) {
                        continue;
                    }
                    i = e;
                }
                final Object p = q.r0(i, n2, andIncrement, null);
                if (p == r6.c.r()) {
                    throw new IllegalStateException("unreachable".toString());
                }
                if (p == r6.c.h()) {
                    if (andIncrement >= q.I()) {
                        continue;
                    }
                    i.b();
                }
                else {
                    if (p == r6.c.s()) {
                        return this.f(i, n2, andIncrement, d);
                    }
                    i.b();
                    this.o = p;
                    final boolean g = true;
                    return Z5.b.a(g);
                }
            }
            final boolean g = this.g();
            return Z5.b.a(g);
        }
        
        public final Object f(i o, int b, long andIncrement, final X5.d d) {
        Label_0164_Outer:
            while (true) {
                Object obj = b.this;
                final p6.m b2 = p6.o.b(Y5.b.b(d));
                while (true) {
                    Label_0409: {
                        while (true) {
                            try {
                                d(this, b2);
                                final Object p4 = ((b)obj).r0((i)o, b, andIncrement, this);
                                Label_0378: {
                                    if (p4 == r6.c.r()) {
                                        ((b)obj).e0(this, (i)o, b);
                                    }
                                    else {
                                        Object o2 = r6.c.h();
                                        final l l = null;
                                        l i = null;
                                        Label_0294: {
                                            if (p4 == o2) {
                                                if (andIncrement < ((b)obj).I()) {
                                                    ((u6.e)o).b();
                                                }
                                                o = b.h().get(obj);
                                                while (!((b)obj).P()) {
                                                    andIncrement = b.i().getAndIncrement(obj);
                                                    b = r6.c.b;
                                                    final long n = andIncrement / b;
                                                    b = (int)(andIncrement % b);
                                                    o2 = o;
                                                    if (((C)o).q != n) {
                                                        o2 = ((b)obj).B(n, (i)o);
                                                        if (o2 == null) {
                                                            continue Label_0164_Outer;
                                                        }
                                                        break Label_0409;
                                                    }
                                                    else {
                                                        final Object p5 = ((b)obj).r0((i)o2, b, andIncrement, this);
                                                        if (p5 == r6.c.r()) {
                                                            ((b)obj).e0(this, (i)o2, b);
                                                            break Label_0378;
                                                        }
                                                        if (p5 == r6.c.h()) {
                                                            o = o2;
                                                            if (andIncrement >= ((b)obj).I()) {
                                                                continue Label_0164_Outer;
                                                            }
                                                            ((u6.e)o2).b();
                                                            o = o2;
                                                        }
                                                        else {
                                                            if (p5 == r6.c.s()) {
                                                                throw new IllegalStateException("unexpected".toString());
                                                            }
                                                            ((u6.e)o2).b();
                                                            e(this, p5);
                                                            d(this, null);
                                                            final Boolean a = Z5.b.a(true);
                                                            obj = ((b)obj).c;
                                                            i = l;
                                                            o2 = a;
                                                            if (obj != null) {
                                                                i = x.a((l)obj, p5, b2.getContext());
                                                                o2 = a;
                                                            }
                                                            break Label_0294;
                                                        }
                                                    }
                                                }
                                                this.h();
                                                break Label_0378;
                                            }
                                            ((u6.e)o).b();
                                            e(this, p4);
                                            d(this, null);
                                            final Boolean a2 = Z5.b.a(true);
                                            obj = ((b)obj).c;
                                            i = l;
                                            o2 = a2;
                                            if (obj != null) {
                                                i = x.a((l)obj, p4, b2.getContext());
                                                o2 = a2;
                                            }
                                        }
                                        b2.j(o2, i);
                                    }
                                }
                                final Object w = b2.w();
                                if (w == Y5.b.c()) {
                                    Z5.h.c(d);
                                }
                                return w;
                                b2.I();
                                throw;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    continue;
                }
            }
        }
        
        public final boolean g() {
            this.o = r6.c.z();
            final Throwable e = r6.b.this.E();
            if (e == null) {
                return false;
            }
            throw E.a(e);
        }
        
        public final void h() {
            final p6.m p = this.p;
            Intrinsics.b(p);
            this.p = null;
            this.o = r6.c.z();
            final Throwable e = r6.b.this.E();
            Object o2;
            if (e == null) {
                final V5.n.a o = V5.n.o;
                o2 = Boolean.FALSE;
            }
            else {
                final V5.n.a o3 = V5.n.o;
                o2 = V5.o.a(e);
            }
            p.resumeWith(V5.n.a(o2));
        }
        
        public final boolean i(final Object o) {
            final p6.m p = this.p;
            Intrinsics.b(p);
            l a = null;
            this.p = null;
            this.o = o;
            final Boolean true = Boolean.TRUE;
            final l c = r6.b.this.c;
            if (c != null) {
                a = x.a(c, o, p.getContext());
            }
            return r6.c.u(p, true, a);
        }
        
        public final void j() {
            final p6.m p = this.p;
            Intrinsics.b(p);
            this.p = null;
            this.o = r6.c.z();
            final Throwable e = r6.b.this.E();
            Object o2;
            if (e == null) {
                final V5.n.a o = V5.n.o;
                o2 = Boolean.FALSE;
            }
            else {
                final V5.n.a o3 = V5.n.o;
                o2 = V5.o.a(e);
            }
            p.resumeWith(V5.n.a(o2));
        }
        
        @Override
        public Object next() {
            final Object o = this.o;
            if (o == r6.c.m()) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.o = r6.c.m();
            if (o != r6.c.z()) {
                return o;
            }
            throw E.a(r6.b.this.F());
        }
    }
}
