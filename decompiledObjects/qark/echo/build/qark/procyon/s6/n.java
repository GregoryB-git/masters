// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s6;

import kotlin.jvm.internal.Intrinsics;
import u6.F;
import t6.c;
import Z5.h;
import V5.t;
import Y5.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t6.d;

public final class n extends d
{
    public static final AtomicReferenceFieldUpdater a;
    private volatile Object _state;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater c() {
        return n.a;
    }
    
    public boolean d(final l l) {
        final AtomicReferenceFieldUpdater a = n.a;
        if (a.get(this) != null) {
            return false;
        }
        a.set(this, m.b());
        return true;
    }
    
    public final Object e(final X5.d d) {
        final p6.m m = new p6.m(b.b(d), 1);
        m.z();
        if (!u.b.a(c(), this, s6.m.b(), m)) {
            final V5.n.a o = V5.n.o;
            m.resumeWith(V5.n.a(t.a));
        }
        final Object w = m.w();
        if (w == b.c()) {
            h.c(d);
        }
        if (w == b.c()) {
            return w;
        }
        return t.a;
    }
    
    public X5.d[] f(final l l) {
        n.a.set(this, null);
        return c.a;
    }
    
    public final void g() {
        final AtomicReferenceFieldUpdater a = n.a;
        while (true) {
            final F value = a.get(this);
            if (value == null) {
                return;
            }
            if (value == m.c()) {
                return;
            }
            if (value == m.b()) {
                if (u.b.a(n.a, this, value, m.c())) {
                    return;
                }
                continue;
            }
            else {
                if (u.b.a(n.a, this, value, m.b())) {
                    final p6.m m = (p6.m)value;
                    final V5.n.a o = V5.n.o;
                    m.resumeWith(V5.n.a(t.a));
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean h() {
        final F andSet = n.a.getAndSet(this, m.b());
        Intrinsics.b(andSet);
        return andSet == m.c();
    }
}
