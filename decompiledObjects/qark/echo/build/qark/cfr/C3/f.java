/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package C3;

import C3.o;
import C3.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class f
implements p.c {
    public final /* synthetic */ o a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TimeUnit e;

    public /* synthetic */ f(o o8, Runnable runnable, long l8, long l9, TimeUnit timeUnit) {
        this.a = o8;
        this.b = runnable;
        this.c = l8;
        this.d = l9;
        this.e = timeUnit;
    }

    @Override
    public final ScheduledFuture a(p.b b8) {
        return o.c(this.a, this.b, this.c, this.d, this.e, b8);
    }
}

