// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import kotlin.jvm.internal.Intrinsics;
import u6.F;
import g6.l;
import u6.x;
import p6.P0;
import X5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import u6.C;

public final class i extends C
{
    public final b s;
    public final AtomicReferenceArray t;
    
    public i(final long n, final i i, final b s, final int n2) {
        super(n, i, n2);
        this.s = s;
        this.t = new AtomicReferenceArray(c.b * 2);
    }
    
    public final void A(final int n, final Object newValue) {
        this.t.set(n * 2 + 1, newValue);
    }
    
    public final void B(final int n, final Object o) {
        this.z(n, o);
    }
    
    @Override
    public int n() {
        return c.b;
    }
    
    @Override
    public void o(final int n, final Throwable t, final g g) {
        final int b = c.b;
        final boolean b2 = n >= b;
        int n2 = n;
        if (b2) {
            n2 = n - b;
        }
        final Object v = this.v(n2);
        while (true) {
            final Object w = this.w(n2);
            if (!(w instanceof P0) && !(w instanceof o)) {
                if (w == c.j() || w == c.i()) {
                    this.s(n2);
                    if (b2) {
                        final l c = this.u().c;
                        if (c != null) {
                            x.b(c, v, g);
                        }
                    }
                    return;
                }
                if (w == c.p()) {
                    continue;
                }
                if (w == c.q()) {
                    continue;
                }
                if (w == c.f()) {
                    return;
                }
                if (w == c.d) {
                    return;
                }
                if (w == c.z()) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected state: ");
                sb.append(w);
                throw new IllegalStateException(sb.toString().toString());
            }
            else {
                F f;
                if (b2) {
                    f = c.j();
                }
                else {
                    f = c.i();
                }
                if (this.r(n2, w, f)) {
                    this.s(n2);
                    this.x(n2, b2 ^ true);
                    if (b2) {
                        final l c2 = this.u().c;
                        if (c2 != null) {
                            x.b(c2, v, g);
                        }
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean r(final int n, final Object o, final Object o2) {
        return h.a(this.t, n * 2 + 1, o, o2);
    }
    
    public final void s(final int n) {
        this.z(n, null);
    }
    
    public final Object t(final int n, final Object newValue) {
        return this.t.getAndSet(n * 2 + 1, newValue);
    }
    
    public final b u() {
        final b s = this.s;
        Intrinsics.b(s);
        return s;
    }
    
    public final Object v(final int n) {
        return this.t.get(n * 2);
    }
    
    public final Object w(final int n) {
        return this.t.get(n * 2 + 1);
    }
    
    public final void x(final int n, final boolean b) {
        if (b) {
            this.u().x0(super.q * c.b + n);
        }
        this.p();
    }
    
    public final Object y(final int n) {
        final Object v = this.v(n);
        this.s(n);
        return v;
    }
    
    public final void z(final int n, final Object newValue) {
        this.t.lazySet(n * 2, newValue);
    }
}
