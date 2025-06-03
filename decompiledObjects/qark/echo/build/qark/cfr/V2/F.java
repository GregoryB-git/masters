/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package V2;

import V2.E;
import V2.G;
import V2.K;
import V2.d;
import V2.f;
import V2.g;
import V2.i;
import V2.j;
import java.util.concurrent.Executor;

public final class F
implements g,
f,
d,
G {
    public final Executor a;
    public final i b;
    public final K c;

    public F(Executor executor, i i8, K k8) {
        this.a = executor;
        this.b = i8;
        this.c = k8;
    }

    @Override
    public final void a(Object object) {
        this.c.r(object);
    }

    @Override
    public final void b() {
        this.c.s();
    }

    @Override
    public final void c(j j8) {
        this.a.execute((Runnable)new E(this, j8));
    }

    @Override
    public final void d(Exception exception) {
        this.c.q(exception);
    }
}

