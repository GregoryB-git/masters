/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.FutureTask
 */
package R2;

import A2.n;
import R2.G2;
import R2.Y1;
import R2.a2;
import com.google.android.gms.internal.measurement.p0;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class L2
extends FutureTask
implements Comparable {
    public final long o;
    public final boolean p;
    public final String q;
    public final /* synthetic */ G2 r;

    public L2(G2 g22, Runnable runnable, boolean bl, String string2) {
        long l8;
        this.r = g22;
        super(p0.a().b(runnable), (Object)null);
        n.i(string2);
        this.o = l8 = G2.F().getAndIncrement();
        this.q = string2;
        this.p = bl;
        if (l8 == Long.MAX_VALUE) {
            g22.j().G().a("Tasks index overflow");
        }
    }

    public L2(G2 g22, Callable callable, boolean bl, String string2) {
        long l8;
        this.r = g22;
        super(p0.a().a(callable));
        n.i(string2);
        this.o = l8 = G2.F().getAndIncrement();
        this.q = string2;
        this.p = bl;
        if (l8 == Long.MAX_VALUE) {
            g22.j().G().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (L2)((Object)object);
        boolean bl = this.p;
        if (bl != object.p) {
            if (bl) {
                return -1;
            }
            return 1;
        }
        long l8 = this.o;
        long l9 = object.o;
        if (l8 < l9) {
            return -1;
        }
        if (l8 > l9) {
            return 1;
        }
        this.r.j().I().b("Two tasks share the same index. index", this.o);
        return 0;
    }

    public final void setException(Throwable throwable) {
        this.r.j().G().b(this.q, (Object)throwable);
        super.setException(throwable);
    }
}

