/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ScheduledFuture
 */
package w2;

import V2.e;
import V2.j;
import java.util.concurrent.ScheduledFuture;
import w2.c;

public final class A
implements e {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ScheduledFuture c;

    public /* synthetic */ A(c c8, String string2, ScheduledFuture scheduledFuture) {
        this.a = c8;
        this.b = string2;
        this.c = scheduledFuture;
    }

    @Override
    public final void a(j j8) {
        this.a.e(this.b, this.c, j8);
    }
}

