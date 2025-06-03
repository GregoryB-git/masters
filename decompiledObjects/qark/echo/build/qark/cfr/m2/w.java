/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package m2;

import U5.a;
import java.util.concurrent.Executor;
import m2.v;
import m2.x;
import n2.d;
import o2.b;

public final class w
implements h2.b {
    public final a a;
    public final a b;
    public final a c;
    public final a d;

    public w(a a8, a a9, a a10, a a11) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
    }

    public static w a(a a8, a a9, a a10, a a11) {
        return new w(a8, a9, a10, a11);
    }

    public static v c(Executor executor, d d8, x x8, b b8) {
        return new v(executor, d8, x8, b8);
    }

    public v b() {
        return w.c((Executor)this.a.get(), (d)this.b.get(), (x)this.c.get(), (b)this.d.get());
    }
}

