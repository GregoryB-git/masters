/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package R2;

import R2.R2;
import R2.p;
import java.util.List;
import java.util.concurrent.Callable;

public final class b3
implements Callable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ R2 r;

    public b3(R2 r22, String string2, String string3, String string4) {
        this.r = r22;
        this.o = string2;
        this.p = string3;
        this.q = string4;
    }

    public final /* synthetic */ Object call() {
        R2.o(this.r).o0();
        return R2.o(this.r).e0().R(this.o, this.p, this.q);
    }
}

