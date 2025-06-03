// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf;

import java.util.Arrays;
import B3.h;
import B3.r;
import y3.d;
import B3.c;
import java.util.List;
import c2.g;
import P4.x;
import s4.i;
import java.util.concurrent.Executor;
import s3.n;
import R4.l;
import B3.F;
import B3.e;
import S4.b;
import S4.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar
{
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";
    
    static {
        a.a.a(b.a.p);
    }
    
    private static A4.e providesFirebasePerformance(final e e) {
        e.a(A4.b.class);
        return D4.a.b().b(new E4.a((s3.e)e.a(s3.e.class), (i)e.a(i.class), e.g(x.class), e.g(g.class))).a().a();
    }
    
    @Keep
    @Override
    public List<c> getComponents() {
        final F a = F.a(d.class, Executor.class);
        return Arrays.asList(c.e(A4.e.class).h("fire-perf").b(r.k(s3.e.class)).b(r.m(x.class)).b(r.k(i.class)).b(r.m(g.class)).b(r.k(A4.b.class)).f(new A4.c()).d(), c.e(A4.b.class).h("fire-perf-early").b(r.k(s3.e.class)).b(r.k(l.class)).b(r.i(n.class)).b(r.j(a)).e().f(new A4.d(a)).d(), O4.h.b("fire-perf", "20.5.0"));
    }
}
