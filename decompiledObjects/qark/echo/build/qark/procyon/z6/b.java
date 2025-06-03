// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z6;

import java.util.concurrent.CancellationException;
import Z5.h;
import java.util.concurrent.Executor;
import V5.o;
import V5.n;
import p6.l;
import V2.e;
import p6.m;
import V2.a;
import X5.d;
import V2.j;

public abstract class b
{
    public static final Object a(final j j, final d d) {
        return b(j, null, d);
    }
    
    public static final Object b(final j obj, final a a, final d d) {
        if (!obj.m()) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            obj.c(a.o, new e() {
                @Override
                public final void a(final j j) {
                    final Exception i = j.i();
                    if (i != null) {
                        final l a = m;
                        final n.a o = n.o;
                        a.resumeWith(n.a(V5.o.a(i)));
                        return;
                    }
                    if (j.l()) {
                        l.a.a(m, null, 1, null);
                        return;
                    }
                    final l a2 = m;
                    final n.a o2 = n.o;
                    a2.resumeWith(n.a(j.j()));
                }
            });
            final Object w = m.w();
            if (w == Y5.b.c()) {
                h.c(d);
            }
            return w;
        }
        final Exception i = obj.i();
        if (i != null) {
            throw i;
        }
        if (!obj.l()) {
            return obj.j();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Task ");
        sb.append(obj);
        sb.append(" was cancelled normally.");
        throw new CancellationException(sb.toString());
    }
}
