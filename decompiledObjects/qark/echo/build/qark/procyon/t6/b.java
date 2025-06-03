// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t6;

import V5.t;
import V5.n;
import kotlin.jvm.internal.Intrinsics;
import java.util.Arrays;

public abstract class b
{
    public d[] o;
    public int p;
    public int q;
    
    public final d b() {
        // monitorenter(this)
        while (true) {
            try {
                final d[] o = this.o;
                d[] d;
                if (o == null) {
                    d = this.d(2);
                    this.o = d;
                }
                else {
                    d = o;
                    if (this.p >= o.length) {
                        final d[] copy = Arrays.copyOf(o, o.length * 2);
                        Intrinsics.checkNotNullExpressionValue(copy, "copyOf(this, newSize)");
                        this.o = copy;
                        d = copy;
                    }
                }
                int q = this.q;
                d c;
                int q2;
                do {
                    if ((c = d[q]) == null) {
                        c = this.c();
                        d[q] = c;
                    }
                    if ((q2 = q + 1) >= d.length) {
                        q2 = 0;
                    }
                    Intrinsics.c(c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    q = q2;
                } while (!c.a(this));
                this.q = q2;
                ++this.p;
                // monitorexit(this)
                return c;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public abstract d c();
    
    public abstract d[] d(final int p0);
    
    public final void e(final d d) {
        // monitorenter(this)
        while (true) {
            try {
                final int p = this.p - 1;
                this.p = p;
                int i = 0;
                if (p == 0) {
                    this.q = 0;
                }
                Intrinsics.c(d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                // monitorexit(this)
                for (X5.d[] b = d.b(this); i < b.length; ++i) {
                    final X5.d d2 = b[i];
                    if (d2 != null) {
                        final n.a o = n.o;
                        d2.resumeWith(n.a(t.a));
                    }
                }
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final d[] f() {
        return this.o;
    }
}
