/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package C3;

import C3.o;
import C3.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class h
implements p.c {
    public final /* synthetic */ o a;
    public final /* synthetic */ Callable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;

    public /* synthetic */ h(o o8, Callable callable, long l8, TimeUnit timeUnit) {
        this.a = o8;
        this.b = callable;
        this.c = l8;
        this.d = timeUnit;
    }

    @Override
    public final ScheduledFuture a(p.b b8) {
        return o.a(this.a, this.b, this.c, this.d, b8);
    }
}

