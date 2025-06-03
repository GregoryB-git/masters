/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package R2;

import R2.I;
import R2.R2;
import R2.u4;
import java.util.concurrent.Callable;

public final class h3
implements Callable {
    public final /* synthetic */ I o;
    public final /* synthetic */ String p;
    public final /* synthetic */ R2 q;

    public h3(R2 r22, I i8, String string2) {
        this.q = r22;
        this.o = i8;
        this.p = string2;
    }

    public final /* synthetic */ Object call() {
        R2.o(this.q).o0();
        return R2.o(this.q).j0().y(this.o, this.p);
    }
}

