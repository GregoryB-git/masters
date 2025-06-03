// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u6.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import Z5.h;
import X5.d;
import g6.l;
import u6.F;
import kotlin.jvm.internal.u;
import java.util.Iterator;
import java.util.Set;
import V5.a;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import u.b;
import u6.p;
import u6.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class x0 implements q0, t, F0
{
    public static final AtomicReferenceFieldUpdater o;
    public static final AtomicReferenceFieldUpdater p;
    private volatile Object _parentHandle;
    private volatile Object _state;
    
    static {
        o = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state");
        p = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_parentHandle");
    }
    
    public x0(final boolean b) {
        Z state;
        if (b) {
            state = y0.c();
        }
        else {
            state = y0.d();
        }
        this._state = state;
    }
    
    public static /* synthetic */ CancellationException z0(final x0 x0, final Throwable t, String s, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x1) != 0x0) {
                s = null;
            }
            return x0.y0(t, s);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }
    
    public final boolean A(final Object o, final C0 c0, final w0 w0) {
        final q.a a = new q.a(w0) {
            public final /* synthetic */ x0 d;
            
            public Object f(final q q) {
                if (this.d.b0() == o) {
                    return null;
                }
                return p.a();
            }
        };
        boolean b;
        while (true) {
            final int u = c0.p().u(w0, c0, (q.a)a);
            b = true;
            if (u == 1) {
                break;
            }
            if (u != 2) {
                continue;
            }
            b = false;
            break;
        }
        return b;
    }
    
    public final String A0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.l0());
        sb.append('{');
        sb.append(this.x0(this.b0()));
        sb.append('}');
        return sb.toString();
    }
    
    public final boolean B0(final l0 l0, final Object o) {
        if (!u.b.a(x0.o, this, l0, y0.g(o))) {
            return false;
        }
        this.p0(null);
        this.q0(o);
        this.P(l0, o);
        return true;
    }
    
    public final boolean C0(final l0 l0, final Throwable t) {
        final C0 z = this.Z(l0);
        if (z == null) {
            return false;
        }
        if (!u.b.a(x0.o, this, l0, new c(z, false, t))) {
            return false;
        }
        this.n0(z, t);
        return true;
    }
    
    public final Object D0(final Object o, final Object o2) {
        if (!(o instanceof l0)) {
            return y0.a();
        }
        if ((!(o instanceof Z) && !(o instanceof w0)) || o instanceof s || o2 instanceof z) {
            return this.E0((l0)o, o2);
        }
        if (this.B0((l0)o, o2)) {
            return o2;
        }
        return y0.b();
    }
    
    public final void E(final Throwable t, final List list) {
        if (list.size() <= 1) {
            return;
        }
        final Set<Throwable> setFromMap = Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>(list.size()));
        for (final Throwable t2 : list) {
            if (t2 != t && t2 != t && !(t2 instanceof CancellationException) && setFromMap.add(t2)) {
                V5.a.a(t, t2);
            }
        }
    }
    
    public final Object E0(final l0 l0, final Object o) {
        final C0 z = this.Z(l0);
        if (z == null) {
            return y0.b();
        }
        final boolean b = l0 instanceof c;
        final Throwable t = null;
        c c;
        if (b) {
            c = (c)l0;
        }
        else {
            c = null;
        }
        c c2 = c;
        if (c == null) {
            c2 = new c(z, false, null);
        }
        final u u = new u();
        // monitorenter(c2)
        // monitorexit(c2)
        final c c3;
        Label_0248: {
            try {
                if (c2.h()) {
                    // monitorexit(c2)
                    return y0.a();
                }
            }
            finally {
                break Label_0248;
            }
            c2.k(true);
            if (c2 != c3 && !u.b.a(x0.o, this, c3, c2)) {
                // monitorexit(c2)
                return y0.b();
            }
            final boolean f = c2.f();
            z z2;
            if (o instanceof z) {
                z2 = (z)o;
            }
            else {
                z2 = null;
            }
            if (z2 != null) {
                c2.b(z2.a);
            }
            final Throwable e = c2.e();
            Throwable o2 = t;
            if (true ^ f) {
                o2 = e;
            }
            u.o = o2;
            final V5.t a2 = V5.t.a;
            if (o2 != null) {
                this.n0(z, o2);
            }
            final s t2 = this.T(c3);
            if (t2 != null && this.F0(c2, t2, o)) {
                return y0.b;
            }
            return this.S(c2, o);
        }
        // monitorexit(c2)
        throw c3;
    }
    
    public void F(final Object o) {
    }
    
    public final boolean F0(final c c, s m0, final Object o) {
        while (q0.a.d(m0.s, false, false, new b(this, c, m0, o), 1, null) == D0.o) {
            if ((m0 = this.m0(m0)) == null) {
                return false;
            }
        }
        return true;
    }
    
    public final Object G(final d d) {
        Object b0;
        do {
            b0 = this.b0();
            if (!(b0 instanceof l0)) {
                if (!(b0 instanceof z)) {
                    return y0.h(b0);
                }
                throw ((z)b0).a;
            }
        } while (this.w0(b0) < 0);
        return this.H(d);
    }
    
    public final Object H(final d d) {
        final a a = new a(Y5.b.b(d), this);
        a.z();
        p6.o.a(a, this.e(new G0(a)));
        final Object w = a.w();
        if (w == Y5.b.c()) {
            h.c(d);
        }
        return w;
    }
    
    public final boolean I(final Throwable t) {
        return this.J(t);
    }
    
    public final boolean J(final Object o) {
        Object o2 = y0.a();
        if (this.Y() && (o2 = this.L(o)) == y0.b) {
            return true;
        }
        Object h0;
        if ((h0 = o2) == y0.a()) {
            h0 = this.h0(o);
        }
        if (h0 == y0.a()) {
            return true;
        }
        if (h0 == y0.b) {
            return true;
        }
        if (h0 == y0.f()) {
            return false;
        }
        this.F(h0);
        return true;
    }
    
    public void K(final Throwable t) {
        this.J(t);
    }
    
    public final Object L(final Object o) {
        Object d0;
        do {
            final Object b0 = this.b0();
            if (!(b0 instanceof l0) || (b0 instanceof c && ((c)b0).h())) {
                return y0.a();
            }
            d0 = this.D0(b0, new z(this.R(o), false, 2, null));
        } while (d0 == y0.b());
        return d0;
    }
    
    public final boolean M(final Throwable t) {
        final boolean g0 = this.g0();
        boolean b = true;
        if (g0) {
            return true;
        }
        final boolean b2 = t instanceof CancellationException;
        final r a0 = this.a0();
        if (a0 == null) {
            return b2;
        }
        if (a0 == D0.o) {
            return b2;
        }
        if (!a0.d(t)) {
            if (b2) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public String N() {
        return "Job was cancelled";
    }
    
    public boolean O(final Throwable t) {
        return t instanceof CancellationException || (this.J(t) && this.X());
    }
    
    public final void P(final l0 obj, final Object o) {
        final r a0 = this.a0();
        if (a0 != null) {
            a0.b();
            this.v0(D0.o);
        }
        final boolean b = o instanceof z;
        Throwable a2 = null;
        z z;
        if (b) {
            z = (z)o;
        }
        else {
            z = null;
        }
        if (z != null) {
            a2 = z.a;
        }
        if (obj instanceof w0) {
            try {
                ((w0)obj).v(a2);
                return;
            }
            finally {
                final StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(obj);
                sb.append(" for ");
                sb.append(this);
                final Throwable t;
                this.d0(new C(sb.toString(), t));
                return;
            }
        }
        final C0 g = obj.g();
        if (g != null) {
            this.o0(g, a2);
        }
    }
    
    public final void Q(final c c, s m0, final Object o) {
        m0 = this.m0(m0);
        if (m0 != null && this.F0(c, m0, o)) {
            return;
        }
        this.F(this.S(c, o));
    }
    
    public final Throwable R(final Object o) {
        if (o != null) {
            if (!(o instanceof Throwable)) {
                Intrinsics.c(o, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
                return ((F0)o).q();
            }
        }
        Throwable q;
        if ((q = (Throwable)o) == null) {
            return new r0(this.N(), null, this);
        }
        return q;
    }
    
    public final Object S(final c c, Object o) {
        z z;
        if (o instanceof z) {
            z = (z)o;
        }
        else {
            z = null;
        }
        Throwable a;
        if (z != null) {
            a = z.a;
        }
        else {
            a = null;
        }
        // monitorenter(c)
        // monitorexit(c)
        Label_0188: {
            boolean f;
            Throwable w;
            try {
                f = c.f();
                final List j = c.j(a);
                w = this.W(c, j);
                if (w != null) {
                    this.E(w, j);
                }
            }
            finally {
                break Label_0188;
            }
            if (w != null) {
                if (w != a) {
                    o = new z(w, false, 2, null);
                }
            }
            if (w != null && (this.M(w) || this.c0(w))) {
                Intrinsics.c(o, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((z)o).b();
            }
            if (!f) {
                this.p0(w);
            }
            this.q0(o);
            u.b.a(x0.o, this, c, y0.g(o));
            this.P(c, o);
            return o;
        }
    }
    // monitorexit(c)
    
    public final s T(final l0 l0) {
        final boolean b = l0 instanceof s;
        final s s = null;
        s s2;
        if (b) {
            s2 = (s)l0;
        }
        else {
            s2 = null;
        }
        s s3;
        if (s2 == null) {
            final C0 g = l0.g();
            s3 = s;
            if (g != null) {
                return this.m0(g);
            }
        }
        else {
            s3 = s2;
        }
        return s3;
    }
    
    public final Object U() {
        final Object b0 = this.b0();
        if (!(b0 instanceof l0 ^ true)) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (!(b0 instanceof z)) {
            return y0.h(b0);
        }
        throw ((z)b0).a;
    }
    
    public final Throwable V(final Object o) {
        final boolean b = o instanceof z;
        Throwable a = null;
        z z;
        if (b) {
            z = (z)o;
        }
        else {
            z = null;
        }
        if (z != null) {
            a = z.a;
        }
        return a;
    }
    
    public final Throwable W(final c c, final List list) {
        final boolean empty = list.isEmpty();
        final Throwable t = null;
        if (empty) {
            if (c.f()) {
                return new r0(this.N(), null, this);
            }
            return null;
        }
        else {
            final Iterator<Object> iterator = ((List<Object>)list).iterator();
            Throwable next;
            do {
                next = t;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (!(next instanceof CancellationException ^ true));
            final Throwable t2 = next;
            if (t2 != null) {
                return t2;
            }
            return list.get(0);
        }
    }
    
    public boolean X() {
        return true;
    }
    
    public boolean Y() {
        return false;
    }
    
    public final C0 Z(final l0 obj) {
        final C0 g = obj.g();
        if (g != null) {
            return g;
        }
        if (obj instanceof Z) {
            return new C0();
        }
        if (obj instanceof w0) {
            this.t0((w0)obj);
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @Override
    public boolean a() {
        final Object b0 = this.b0();
        return b0 instanceof l0 && ((l0)b0).a();
    }
    
    public final r a0() {
        return x0.p.get(this);
    }
    
    @Override
    public g.b b(final g.c c) {
        return q0.a.c(this, c);
    }
    
    public final Object b0() {
        final AtomicReferenceFieldUpdater o = x0.o;
        y value;
        while (true) {
            value = o.get(this);
            if (!(value instanceof y)) {
                break;
            }
            value.a(this);
        }
        return value;
    }
    
    public boolean c0(final Throwable t) {
        return false;
    }
    
    public void d0(final Throwable t) {
        throw t;
    }
    
    @Override
    public final X e(final l l) {
        return this.v(false, true, l);
    }
    
    public final void e0(final q0 q0) {
        if (q0 == null) {
            this.v0(D0.o);
            return;
        }
        q0.start();
        final r r = q0.r(this);
        this.v0(r);
        if (this.f0()) {
            r.b();
            this.v0(D0.o);
        }
    }
    
    public final boolean f0() {
        return this.b0() instanceof l0 ^ true;
    }
    
    public boolean g0() {
        return false;
    }
    
    @Override
    public final g.c getKey() {
        return q0.n;
    }
    
    @Override
    public q0 getParent() {
        final r a0 = this.a0();
        if (a0 != null) {
            return a0.getParent();
        }
        return null;
    }
    
    public final Object h0(Object o) {
        final Throwable t = null;
        Throwable t2 = null;
        while (true) {
            final Object b0 = this.b0();
            if (b0 instanceof c) {
                // monitorenter(b0)
                // monitorexit(b0)
                Label_0131: {
                    try {
                        if (((c)b0).i()) {
                            // monitorexit(b0)
                            return y0.f();
                        }
                    }
                    finally {
                        break Label_0131;
                    }
                    final boolean f2 = ((c)b0).f();
                    final Throwable t3;
                    if (t3 != null || !f2) {
                        Throwable r;
                        if ((r = t2) == null) {
                            r = this.R(t3);
                        }
                        ((c)b0).b(r);
                    }
                    final Throwable e = ((c)b0).e();
                    Throwable t4 = t;
                    if (f2 ^ true) {
                        t4 = e;
                    }
                    if (t4 != null) {
                        this.n0(((c)b0).g(), t4);
                    }
                    return y0.a();
                }
            }
            // monitorexit(b0)
            else {
                if (!(b0 instanceof l0)) {
                    return y0.f();
                }
                Throwable r2;
                if ((r2 = t2) == null) {
                    r2 = this.R(o);
                }
                final c c = (c)b0;
                if (c.a()) {
                    t2 = r2;
                    if (this.C0(c, r2)) {
                        return y0.a();
                    }
                    continue;
                }
                else {
                    final Object d0 = this.D0(b0, new z(r2, false, 2, null));
                    if (d0 == y0.a()) {
                        o = new StringBuilder();
                        ((StringBuilder)o).append("Cannot happen in ");
                        ((StringBuilder)o).append(b0);
                        throw new IllegalStateException(((StringBuilder)o).toString().toString());
                    }
                    t2 = r2;
                    if (d0 != y0.b()) {
                        return d0;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean i0(final Object o) {
        Object d0;
        do {
            d0 = this.D0(this.b0(), o);
            if (d0 == y0.a()) {
                return false;
            }
            if (d0 == y0.b) {
                return true;
            }
        } while (d0 == y0.b());
        this.F(d0);
        return true;
    }
    
    public final Object j0(final Object obj) {
        Object d0;
        do {
            d0 = this.D0(this.b0(), obj);
            if (d0 != y0.a()) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Job ");
            sb.append(this);
            sb.append(" is already complete or completing, but is being completed with ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString(), this.V(obj));
        } while (d0 == y0.b());
        return d0;
    }
    
    @Override
    public g k(final g g) {
        return q0.a.f(this, g);
    }
    
    public final w0 k0(final l l, final boolean b) {
        w0 w0 = null;
        s0 s0 = null;
        if (b) {
            if (l instanceof s0) {
                s0 = (s0)l;
            }
            if ((w0 = s0) == null) {
                w0 = new o0(l);
            }
        }
        else {
            if (l instanceof w0) {
                w0 = (w0)l;
            }
            if (w0 == null) {
                w0 = new p0(l);
            }
        }
        w0.x(this);
        return w0;
    }
    
    public String l0() {
        return M.a(this);
    }
    
    public final s m0(q p) {
        q o;
        while (true) {
            o = p;
            if (!p.q()) {
                break;
            }
            p = p.p();
        }
        while (true) {
            p = (o = o.o());
            if (!p.q()) {
                if (p instanceof s) {
                    return (s)p;
                }
                o = p;
                if (p instanceof C0) {
                    return null;
                }
                continue;
            }
        }
    }
    
    public final void n0(final C0 c0, final Throwable t) {
        this.p0(t);
        final Object n = c0.n();
        Intrinsics.c(n, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        q o = (q)n;
        B b = null;
        while (!Intrinsics.a(o, c0)) {
            Object o2 = b;
            if (o instanceof s0) {
                B obj = (w0)o;
                try {
                    obj.v(t);
                    obj = b;
                }
                finally {
                    if (b != null) {
                        final Throwable t2;
                        V5.a.a((Throwable)b, t2);
                        o2 = b;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(obj);
                        sb.append(" for ");
                        sb.append(this);
                        final Throwable t2;
                        o2 = new C(sb.toString(), t2);
                        final V5.t a = V5.t.a;
                    }
                }
            }
            o = o.o();
            b = (B)o2;
        }
        if (b != null) {
            this.d0((Throwable)b);
        }
        this.M(t);
    }
    
    public final void o0(final C0 c0, final Throwable t) {
        final Object n = c0.n();
        Intrinsics.c(n, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        q o = (q)n;
        B b = null;
        while (!Intrinsics.a(o, c0)) {
            Object o2 = b;
            if (o instanceof w0) {
                B obj = (w0)o;
                try {
                    obj.v(t);
                    obj = b;
                }
                finally {
                    if (b != null) {
                        final Throwable t2;
                        V5.a.a((Throwable)b, t2);
                        o2 = b;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(obj);
                        sb.append(" for ");
                        sb.append(this);
                        final Throwable t2;
                        o2 = new C(sb.toString(), t2);
                        final V5.t a = V5.t.a;
                    }
                }
            }
            o = o.o();
            b = (B)o2;
        }
        if (b != null) {
            this.d0((Throwable)b);
        }
    }
    
    public void p0(final Throwable t) {
    }
    
    @Override
    public CancellationException q() {
        final Object b0 = this.b0();
        final boolean b2 = b0 instanceof c;
        CancellationException ex = null;
        Throwable t;
        if (b2) {
            t = ((c)b0).e();
        }
        else if (b0 instanceof z) {
            t = ((z)b0).a;
        }
        else {
            if (b0 instanceof l0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot be cancelling child in this state: ");
                sb.append(b0);
                throw new IllegalStateException(sb.toString().toString());
            }
            t = null;
        }
        if (t instanceof CancellationException) {
            ex = (CancellationException)t;
        }
        CancellationException ex2;
        if ((ex2 = ex) == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Parent job is ");
            sb2.append(this.x0(b0));
            ex2 = new r0(sb2.toString(), t, this);
        }
        return ex2;
    }
    
    public void q0(final Object o) {
    }
    
    @Override
    public final r r(final t t) {
        final X d = q0.a.d(this, true, false, new s(t), 2, null);
        Intrinsics.c(d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r)d;
    }
    
    public void r0() {
    }
    
    @Override
    public final CancellationException s() {
        final Object b0 = this.b0();
        if (b0 instanceof c) {
            final Throwable e = ((c)b0).e();
            if (e != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(M.a(this));
                sb.append(" is cancelling");
                final CancellationException y0 = this.y0(e, sb.toString());
                if (y0 != null) {
                    return y0;
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (b0 instanceof l0) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Job is still new or active: ");
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        }
        if (b0 instanceof z) {
            return z0(this, ((z)b0).a, null, 1, null);
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(M.a(this));
        sb4.append(" has completed normally");
        return new r0(sb4.toString(), null, this);
    }
    
    public final void s0(final Z z) {
        l0 l0 = new C0();
        if (!z.a()) {
            l0 = new k0((C0)l0);
        }
        u.b.a(x0.o, this, z, l0);
    }
    
    @Override
    public final boolean start() {
        while (true) {
            final int w0 = this.w0(this.b0());
            if (w0 == 0) {
                return false;
            }
            if (w0 != 1) {
                continue;
            }
            return true;
        }
    }
    
    @Override
    public final void t(final F0 f0) {
        this.J(f0);
    }
    
    public final void t0(final w0 w0) {
        w0.j(new C0());
        u.b.a(x0.o, this, w0, w0.o());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.A0());
        sb.append('@');
        sb.append(M.b(this));
        return sb.toString();
    }
    
    @Override
    public Object u(final Object o, final g6.p p2) {
        return q0.a.b(this, o, p2);
    }
    
    public final void u0(final w0 w0) {
        Object b0;
        do {
            b0 = this.b0();
            if (!(b0 instanceof w0)) {
                if (b0 instanceof l0 && ((w0)b0).g() != null) {
                    w0.r();
                }
                return;
            }
            if (b0 != w0) {
                return;
            }
        } while (!u.b.a(x0.o, this, b0, y0.c()));
    }
    
    @Override
    public final X v(final boolean b, final boolean b2, l l) {
        final w0 k0 = this.k0(l, b);
    Label_0247_Outer:
        while (true) {
            final Object b3 = this.b0();
            if (!(b3 instanceof Z)) {
                final boolean b4 = b3 instanceof l0;
                Object a = null;
                final Object o = null;
                // monitorenter(b3)
                C0 g;
                D0 o2;
                Object e;
                X x;
                V5.t a2;
                z z;
                final l i;
                Label_0326_Outer:Block_17_Outer:
                while (true) {
                    Label_0289: {
                        if (!b4) {
                            break Label_0289;
                        }
                        g = ((Z)b3).g();
                        if (g == null) {
                            Intrinsics.c(b3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                            this.t0((w0)b3);
                            continue Label_0247_Outer;
                        }
                        o2 = D0.o;
                        e = o;
                        x = o2;
                        Label_0252: {
                            if (!b) {
                                break Label_0252;
                            }
                            e = o;
                            x = o2;
                            if (!(b3 instanceof c)) {
                                break Label_0252;
                            }
                            try {
                                e = ((c)b3).e();
                                Label_0236: {
                                    if (e != null) {
                                        x = o2;
                                        if (!(l instanceof s)) {
                                            break Label_0236;
                                        }
                                        x = o2;
                                        if (((c)b3).h()) {
                                            break Label_0236;
                                        }
                                    }
                                    if (!this.A(b3, g, k0)) {
                                        // monitorexit(b3)
                                        continue Label_0247_Outer;
                                    }
                                    if (e == null) {
                                        // monitorexit(b3)
                                        return k0;
                                    }
                                    x = k0;
                                }
                                a2 = V5.t.a;
                                // monitorexit(b3)
                                if (e != null) {
                                    if (b2) {
                                        l.invoke(e);
                                    }
                                    return x;
                                }
                                if (this.A(b3, g, k0)) {
                                    return k0;
                                }
                                continue Label_0247_Outer;
                                // monitorexit(b3)
                                Label_0311: {
                                    z = null;
                                }
                                // iftrue(Label_0326:, z == null)
                                // iftrue(Label_0311:, !b3 instanceof z)
                                while (true) {
                                    while (true) {
                                    Block_19:
                                        while (true) {
                                            Label_0314: {
                                                break Label_0314;
                                                z = (z)b3;
                                                break Label_0314;
                                                l.invoke(a);
                                                return D0.o;
                                            }
                                            break Block_19;
                                            Label_0335:
                                            return D0.o;
                                            continue Label_0326_Outer;
                                        }
                                        a = z.a;
                                        continue Block_17_Outer;
                                    }
                                    continue;
                                }
                            }
                            // iftrue(Label_0335:, !b2)
                            finally {}
                        }
                    }
                    l = i;
                    continue;
                }
            }
            final Z z2 = (Z)b3;
            if (z2.a()) {
                if (b.a(x0.o, this, b3, k0)) {
                    break;
                }
                continue;
            }
            else {
                this.s0(z2);
            }
        }
        return k0;
    }
    
    public final void v0(final r r) {
        x0.p.set(this, r);
    }
    
    @Override
    public void w(final CancellationException ex) {
        CancellationException ex2 = ex;
        if (ex == null) {
            ex2 = new r0(this.N(), null, this);
        }
        this.K(ex2);
    }
    
    public final int w0(final Object o) {
        if (o instanceof Z) {
            if (((Z)o).a()) {
                return 0;
            }
            if (!u.b.a(x0.o, this, o, y0.c())) {
                return -1;
            }
            this.r0();
            return 1;
        }
        else {
            if (!(o instanceof k0)) {
                return 0;
            }
            if (!u.b.a(x0.o, this, o, ((k0)o).g())) {
                return -1;
            }
            this.r0();
            return 1;
        }
    }
    
    @Override
    public g x(final g.c c) {
        return q0.a.e(this, c);
    }
    
    public final String x0(final Object o) {
        final boolean b = o instanceof c;
        final String s = "Active";
        String s2;
        if (b) {
            final c c = (c)o;
            if (c.f()) {
                return "Cancelling";
            }
            s2 = s;
            if (c.h()) {
                return "Completing";
            }
        }
        else if (o instanceof l0) {
            if (((l0)o).a()) {
                return "Active";
            }
            return "New";
        }
        else {
            if (o instanceof z) {
                return "Cancelled";
            }
            s2 = "Completed";
        }
        return s2;
    }
    
    public final CancellationException y0(final Throwable t, final String s) {
        CancellationException ex;
        if (t instanceof CancellationException) {
            ex = (CancellationException)t;
        }
        else {
            ex = null;
        }
        CancellationException ex2 = ex;
        if (ex == null) {
            String y;
            if ((y = s) == null) {
                y = this.N();
            }
            ex2 = new r0(y, t, this);
        }
        return ex2;
    }
    
    public static final class a extends m
    {
        public final x0 w;
        
        public a(final d d, final x0 w) {
            super(d, 1);
            this.w = w;
        }
        
        @Override
        public String G() {
            return "AwaitContinuation";
        }
        
        @Override
        public Throwable u(final q0 q0) {
            final Object b0 = this.w.b0();
            if (b0 instanceof c) {
                final Throwable e = ((c)b0).e();
                if (e != null) {
                    return e;
                }
            }
            if (b0 instanceof z) {
                return ((z)b0).a;
            }
            return q0.s();
        }
    }
    
    public static final class b extends w0
    {
        public final x0 s;
        public final x0.c t;
        public final s u;
        public final Object v;
        
        public b(final x0 s, final x0.c t, final s u, final Object v) {
            this.s = s;
            this.t = t;
            this.u = u;
            this.v = v;
        }
        
        @Override
        public void v(final Throwable t) {
            this.s.Q(this.t, this.u, this.v);
        }
    }
    
    public static final class c implements l0
    {
        public static final AtomicIntegerFieldUpdater p;
        public static final AtomicReferenceFieldUpdater q;
        public static final AtomicReferenceFieldUpdater r;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        public final C0 o;
        
        static {
            p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
            q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
            r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        }
        
        public c(final C0 c0, final boolean b, final Throwable t) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        @Override
        public boolean a() {
            return this.e() == null;
        }
        
        public final void b(final Throwable t) {
            final Throwable e = this.e();
            if (e == null) {
                this.m(t);
                return;
            }
            if (t == e) {
                return;
            }
            final Object d = this.d();
            if (d == null) {
                this.l(t);
                return;
            }
            if (d instanceof Throwable) {
                if (t == d) {
                    return;
                }
                final ArrayList c = this.c();
                c.add(d);
                c.add(t);
                this.l(c);
            }
            else {
                if (d instanceof ArrayList) {
                    ((ArrayList<Throwable>)d).add(t);
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("State is ");
                sb.append(d);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        
        public final ArrayList c() {
            return new ArrayList(4);
        }
        
        public final Object d() {
            return c.r.get(this);
        }
        
        public final Throwable e() {
            return c.q.get(this);
        }
        
        public final boolean f() {
            return this.e() != null;
        }
        
        @Override
        public C0 g() {
            return this.o;
        }
        
        public final boolean h() {
            return c.p.get(this) != 0;
        }
        
        public final boolean i() {
            return this.d() == y0.e();
        }
        
        public final List j(final Throwable e) {
            final Object d = this.d();
            ArrayList<Object> list;
            if (d == null) {
                list = (ArrayList<Object>)this.c();
            }
            else if (d instanceof Throwable) {
                list = (ArrayList<Object>)this.c();
                list.add(d);
            }
            else {
                if (!(d instanceof ArrayList)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(d);
                    throw new IllegalStateException(sb.toString().toString());
                }
                list = (ArrayList<Object>)d;
            }
            final Throwable e2 = this.e();
            if (e2 != null) {
                list.add(0, e2);
            }
            if (e != null && !Intrinsics.a(e, e2)) {
                list.add(e);
            }
            this.l(y0.e());
            return list;
        }
        
        public final void k(final boolean b) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public final void l(final Object o) {
            c.r.set(this, o);
        }
        
        public final void m(final Throwable t) {
            c.q.set(this, t);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Finishing[cancelling=");
            sb.append(this.f());
            sb.append(", completing=");
            sb.append(this.h());
            sb.append(", rootCause=");
            sb.append(this.e());
            sb.append(", exceptions=");
            sb.append(this.d());
            sb.append(", list=");
            sb.append(this.g());
            sb.append(']');
            return sb.toString();
        }
    }
}
