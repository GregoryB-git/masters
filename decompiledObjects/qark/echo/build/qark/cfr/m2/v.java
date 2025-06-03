/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package m2;

import f2.p;
import java.util.concurrent.Executor;
import m2.t;
import m2.u;
import m2.x;
import n2.d;
import o2.b;

public class v {
    public final Executor a;
    public final d b;
    public final x c;
    public final b d;

    public v(Executor executor, d d8, x x8, b b8) {
        this.a = executor;
        this.b = d8;
        this.c = x8;
        this.d = b8;
    }

    public static /* synthetic */ Object a(v v8) {
        return v8.d();
    }

    public static /* synthetic */ void b(v v8) {
        v8.e();
    }

    public void c() {
        this.a.execute((Runnable)new t(this));
    }

    public final /* synthetic */ Object d() {
        for (p p8 : this.b.o()) {
            this.c.a(p8, 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.d.a(new u(this));
    }
}

