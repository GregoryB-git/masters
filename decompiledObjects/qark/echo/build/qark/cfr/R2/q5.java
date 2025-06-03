/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import E2.e;
import R2.l2;
import R2.l5;
import R2.o2;
import R2.p5;

public final class q5 {
    public p5 a;
    public final /* synthetic */ l5 b;

    public q5(l5 l52) {
        this.b = l52;
    }

    public final void a() {
        this.b.n();
        if (this.a != null) {
            l5.B(this.b).removeCallbacks((Runnable)this.a);
        }
        this.b.i().s.a(false);
        this.b.D(false);
    }

    public final void b(long l8) {
        this.a = new p5(this, this.b.b().a(), l8);
        l5.B(this.b).postDelayed((Runnable)this.a, 2000L);
    }
}

