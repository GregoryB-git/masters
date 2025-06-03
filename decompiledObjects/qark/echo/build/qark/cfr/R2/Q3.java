/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package R2;

import R2.C3;
import R2.Y1;
import R2.a2;
import R2.v5;
import b3.b;

public final class Q3
implements b {
    public final /* synthetic */ v5 a;
    public final /* synthetic */ C3 b;

    public Q3(C3 c32, v5 v52) {
        this.b = c32;
        this.a = v52;
    }

    @Override
    public final void a(Object object) {
        this.b.n();
        C3.N(this.b, false);
        this.b.r0();
        this.b.j().F().b("registerTriggerAsync ran. uri", this.a.o);
    }

    @Override
    public final void onFailure(Throwable throwable) {
        this.b.n();
        C3.N(this.b, false);
        this.b.r0();
        this.b.j().G().b("registerTriggerAsync failed with throwable", (Object)throwable);
    }
}

