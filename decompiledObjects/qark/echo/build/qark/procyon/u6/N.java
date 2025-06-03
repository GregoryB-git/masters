// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import kotlin.jvm.internal.Intrinsics;
import p6.K0;
import X5.g;

public final class N
{
    public final g a;
    public final Object[] b;
    public final K0[] c;
    public int d;
    
    public N(final g a, final int n) {
        this.a = a;
        this.b = new Object[n];
        this.c = new K0[n];
    }
    
    public final void a(final K0 k0, final Object o) {
        final Object[] b = this.b;
        final int d = this.d;
        b[d] = o;
        final K0[] c = this.c;
        this.d = d + 1;
        Intrinsics.c(k0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        c[d] = k0;
    }
    
    public final void b(final g g) {
        int n = this.c.length - 1;
        if (n >= 0) {
            while (true) {
                final int n2 = n - 1;
                final K0 k0 = this.c[n];
                Intrinsics.b(k0);
                k0.D(g, this.b[n]);
                if (n2 < 0) {
                    break;
                }
                n = n2;
            }
        }
    }
}
