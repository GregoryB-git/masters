// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import g6.l;
import X5.b;
import u6.m;
import u6.n;
import u6.j;
import kotlin.jvm.internal.Intrinsics;
import X5.d;
import kotlin.jvm.internal.g;
import X5.e;
import X5.a;

public abstract class F extends X5.a implements e
{
    public static final a p;
    
    static {
        p = new a(null);
    }
    
    public F() {
        super(e.c);
    }
    
    @Override
    public final void C(final d d) {
        Intrinsics.c(d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((j)d).r();
    }
    
    public abstract void E(final g p0, final Runnable p1);
    
    public boolean F(final g g) {
        return true;
    }
    
    public F G(final int n) {
        n.a(n);
        return new m(this, n);
    }
    
    @Override
    public g.b b(final c c) {
        return e.a.a(this, c);
    }
    
    @Override
    public final d i(final d d) {
        return new j(this, d);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(M.a(this));
        sb.append('@');
        sb.append(M.b(this));
        return sb.toString();
    }
    
    @Override
    public g x(final c c) {
        return e.a.b(this, c);
    }
    
    public static final class a extends b
    {
        public a() {
            super(e.c, F$a$a.o);
        }
    }
}
