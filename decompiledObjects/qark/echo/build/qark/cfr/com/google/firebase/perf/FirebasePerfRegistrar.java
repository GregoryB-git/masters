/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package com.google.firebase.perf;

import B3.F;
import B3.c;
import B3.h;
import B3.r;
import D4.a;
import D4.b;
import E4.a;
import P4.x;
import R4.l;
import S4.b;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import s3.e;
import s3.n;
import s4.i;
import y3.d;

@Keep
public class FirebasePerfRegistrar
implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    static {
        S4.a.a.a(b.a.p);
    }

    public static /* synthetic */ A4.e a(B3.e e8) {
        return FirebasePerfRegistrar.providesFirebasePerformance(e8);
    }

    public static /* synthetic */ A4.b b(F f8, B3.e e8) {
        return FirebasePerfRegistrar.lambda$getComponents$0(f8, e8);
    }

    private static /* synthetic */ A4.b lambda$getComponents$0(F f8, B3.e e8) {
        return new A4.b((e)e8.a(e.class), (l)e8.a(l.class), (n)e8.g(n.class).get(), (Executor)e8.h(f8));
    }

    private static A4.e providesFirebasePerformance(B3.e e8) {
        e8.a(A4.b.class);
        return D4.a.b().b(new a((e)e8.a(e.class), (i)e8.a(i.class), e8.g(x.class), e8.g(g.class))).a().a();
    }

    @Keep
    public List<c> getComponents() {
        F f8 = F.a(d.class, Executor.class);
        return Arrays.asList((Object[])new c[]{c.e(A4.e.class).h("fire-perf").b(r.k(e.class)).b(r.m(x.class)).b(r.k(i.class)).b(r.m(g.class)).b(r.k(A4.b.class)).f(new A4.c()).d(), c.e(A4.b.class).h("fire-perf-early").b(r.k(e.class)).b(r.k(l.class)).b(r.i(n.class)).b(r.j(f8)).e().f(new A4.d(f8)).d(), O4.h.b("fire-perf", "20.5.0")});
    }
}

