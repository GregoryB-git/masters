/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.ScheduledExecutorService
 */
package V3;

import T3.d;
import V3.A;
import V3.f;
import java.util.concurrent.ScheduledExecutorService;

public final class d
implements T3.d {
    public final /* synthetic */ A a;
    public final /* synthetic */ ScheduledExecutorService b;

    public /* synthetic */ d(A a8, ScheduledExecutorService scheduledExecutorService) {
        this.a = a8;
        this.b = scheduledExecutorService;
    }

    @Override
    public final void a(boolean bl, d.a a8) {
        f.a(this.a, this.b, bl, a8);
    }
}

