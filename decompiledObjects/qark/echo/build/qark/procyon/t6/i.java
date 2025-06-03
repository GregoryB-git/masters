// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t6;

import V5.n;
import V5.t;
import g6.q;
import Y5.b;
import kotlin.jvm.internal.Intrinsics;
import p6.u0;
import g6.p;
import X5.h;
import X5.g;
import Z5.e;
import s6.c;
import Z5.d;

public final class i extends d implements c, e
{
    public final c o;
    public final g p;
    public final int q;
    public g r;
    public X5.d s;
    
    public i(final c o, final g p2) {
        super(t6.g.o, h.o);
        this.o = o;
        this.p = p2;
        this.q = ((Number)p2.u(0, i$a.o)).intValue();
    }
    
    public final void a(final g g, final g g2, final Object o) {
        if (g2 instanceof t6.e) {
            this.h((t6.e)g2, o);
        }
        k.a(this, g);
    }
    
    public final Object b(final X5.d s, final Object o) {
        final g context = s.getContext();
        u0.d(context);
        final g r = this.r;
        if (r != context) {
            this.a(context, r, o);
            this.r = context;
        }
        this.s = s;
        final q a = j.a();
        final c o2 = this.o;
        Intrinsics.c(o2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        final Object c = a.c(o2, o, this);
        if (!Intrinsics.a(c, b.c())) {
            this.s = null;
        }
        return c;
    }
    
    @Override
    public Object emit(Object b, final X5.d d) {
        try {
            b = this.b(d, b);
            if (b == b.c()) {
                Z5.h.c(d);
            }
            if (b == b.c()) {
                return b;
            }
            return t.a;
        }
        finally {
            final Throwable t;
            this.r = new t6.e(t, d.getContext());
        }
    }
    
    @Override
    public e getCallerFrame() {
        final X5.d s = this.s;
        if (s instanceof e) {
            return (e)s;
        }
        return null;
    }
    
    @Override
    public g getContext() {
        g g;
        if ((g = this.r) == null) {
            g = h.o;
        }
        return g;
    }
    
    @Override
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    public final void h(final t6.e e, final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        sb.append(e.o);
        sb.append(", but then emission attempt of value '");
        sb.append(obj);
        sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(kotlin.text.i.e(sb.toString()).toString());
    }
    
    @Override
    public Object invokeSuspend(final Object o) {
        final Throwable b = n.b(o);
        if (b != null) {
            this.r = new t6.e(b, this.getContext());
        }
        final X5.d s = this.s;
        if (s != null) {
            s.resumeWith(o);
        }
        return Y5.b.c();
    }
    
    @Override
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
