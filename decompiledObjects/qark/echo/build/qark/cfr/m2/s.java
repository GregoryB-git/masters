/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package m2;

import android.content.Context;
import g2.e;
import java.util.concurrent.Executor;
import m2.r;
import m2.x;
import n2.c;
import n2.d;
import o2.b;
import p2.a;

public final class s
implements h2.b {
    public final U5.a a;
    public final U5.a b;
    public final U5.a c;
    public final U5.a d;
    public final U5.a e;
    public final U5.a f;
    public final U5.a g;
    public final U5.a h;
    public final U5.a i;

    public s(U5.a a8, U5.a a9, U5.a a10, U5.a a11, U5.a a12, U5.a a13, U5.a a14, U5.a a15, U5.a a16) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
        this.f = a13;
        this.g = a14;
        this.h = a15;
        this.i = a16;
    }

    public static s a(U5.a a8, U5.a a9, U5.a a10, U5.a a11, U5.a a12, U5.a a13, U5.a a14, U5.a a15, U5.a a16) {
        return new s(a8, a9, a10, a11, a12, a13, a14, a15, a16);
    }

    public static r c(Context context, e e8, d d8, x x8, Executor executor, b b8, a a8, a a9, c c8) {
        return new r(context, e8, d8, x8, executor, b8, a8, a9, c8);
    }

    public r b() {
        return s.c((Context)this.a.get(), (e)this.b.get(), (d)this.c.get(), (x)this.d.get(), (Executor)this.e.get(), (b)this.f.get(), (a)this.g.get(), (a)this.h.get(), (c)this.i.get());
    }
}

