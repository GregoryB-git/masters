// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import p6.M;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.Intrinsics;
import u.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class q
{
    public static final AtomicReferenceFieldUpdater o;
    public static final AtomicReferenceFieldUpdater p;
    public static final AtomicReferenceFieldUpdater q;
    private volatile Object _next;
    private volatile Object _prev;
    private volatile Object _removedRef;
    
    static {
        o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");
        p = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");
        q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    }
    
    public q() {
        this._next = this;
        this._prev = this;
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater i() {
        return u6.q.o;
    }
    
    public final boolean j(final q q) {
        q.p.lazySet(q, this);
        q.o.lazySet(q, this);
        while (this.n() == this) {
            if (b.a(q.o, this, this, q)) {
                q.m(this);
                return true;
            }
        }
        return false;
    }
    
    public final q k(final y y) {
    Label_0000:
        while (true) {
            while (true) {
                q q2;
                final q q = q2 = u6.q.p.get(this);
                while (true) {
                    q q3 = null;
                    while (true) {
                        final AtomicReferenceFieldUpdater o = u6.q.o;
                        final q value = o.get(q2);
                        if (value == this) {
                            if (q == q2) {
                                return q2;
                            }
                            if (!b.a(u6.q.p, this, q, q2)) {
                                continue Label_0000;
                            }
                            return q2;
                        }
                        else {
                            if (this.q()) {
                                return null;
                            }
                            if (value == y) {
                                return q2;
                            }
                            if (value instanceof y) {
                                ((y)value).a(q2);
                                continue Label_0000;
                            }
                            if (value instanceof z) {
                                if (q3 != null) {
                                    if (!b.a(o, q3, q2, ((z)value).a)) {
                                        continue Label_0000;
                                    }
                                    q2 = q3;
                                    break;
                                }
                                else {
                                    q2 = (q)u6.q.p.get(q2);
                                }
                            }
                            else {
                                Intrinsics.c(value, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                                final q q4 = value;
                                q3 = q2;
                                q2 = q4;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public final q l(q q) {
        while (q.q()) {
            q = q.p.get(q);
        }
        return q;
    }
    
    public final void m(final q q) {
        final AtomicReferenceFieldUpdater p = q.p;
        q q2;
        do {
            q2 = p.get(q);
            if (this.n() != q) {
                return;
            }
        } while (!b.a(q.p, q, q2, this));
        if (this.q()) {
            q.k(null);
        }
    }
    
    public final Object n() {
        final AtomicReferenceFieldUpdater o = u6.q.o;
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
    
    public final q o() {
        return u6.p.b(this.n());
    }
    
    public final q p() {
        q q;
        if ((q = this.k(null)) == null) {
            q = this.l(u6.q.p.get(this));
        }
        return q;
    }
    
    public boolean q() {
        return this.n() instanceof z;
    }
    
    public boolean r() {
        return this.s() == null;
    }
    
    public final q s() {
        Object n;
        q q;
        do {
            n = this.n();
            if (n instanceof z) {
                return ((z)n).a;
            }
            if (n == this) {
                return (q)n;
            }
            Intrinsics.c(n, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            q = (q)n;
        } while (!b.a(u6.q.o, this, n, q.t()));
        q.k(null);
        return null;
    }
    
    public final z t() {
        final AtomicReferenceFieldUpdater q = u6.q.q;
        z z;
        if ((z = q.get(this)) == null) {
            z = new z(this);
            q.lazySet(this, z);
        }
        return z;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(new o(this));
        sb.append('@');
        sb.append(M.b(this));
        return sb.toString();
    }
    
    public final int u(final q q, final q c, final a a) {
        q.p.lazySet(q, this);
        final AtomicReferenceFieldUpdater o = q.o;
        o.lazySet(q, c);
        a.c = c;
        if (!b.a(o, this, c, a)) {
            return 0;
        }
        if (a.a(this) == null) {
            return 1;
        }
        return 2;
    }
    
    public abstract static class a extends b
    {
        public final q b;
        public q c;
        
        public a(final q b) {
            this.b = b;
        }
        
        public void e(q b, final Object o) {
            final boolean b2 = o == null;
            q q;
            if (b2) {
                q = this.b;
            }
            else {
                q = this.c;
            }
            if (q != null && b.a(u6.q.i(), b, this, q) && b2) {
                b = this.b;
                final q c = this.c;
                Intrinsics.b(c);
                b.m(c);
            }
        }
    }
}
