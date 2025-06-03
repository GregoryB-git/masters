/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package V2;

import V2.G;
import V2.K;
import V2.b;
import V2.j;
import V2.s;
import java.util.concurrent.Executor;

public final class t
implements G {
    public final Executor a;
    public final b b;
    public final K c;

    public t(Executor executor, b b8, K k8) {
        this.a = executor;
        this.b = b8;
        this.c = k8;
    }

    @Override
    public final void c(j j8) {
        this.a.execute((Runnable)new s(this, j8));
    }
}

