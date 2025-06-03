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

import V2.G;
import V2.K;
import V2.b;
import V2.d;
import V2.f;
import V2.g;
import V2.j;
import V2.u;
import java.util.concurrent.Executor;

public final class v
implements g,
f,
d,
G {
    public final Executor a;
    public final b b;
    public final K c;

    public v(Executor executor, b b8, K k8) {
        this.a = executor;
        this.b = b8;
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
        this.a.execute((Runnable)new u(this, j8));
    }

    @Override
    public final void d(Exception exception) {
        this.c.q(exception);
    }
}

