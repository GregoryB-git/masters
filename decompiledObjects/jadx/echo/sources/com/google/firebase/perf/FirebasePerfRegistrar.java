package com.google.firebase.perf;

import A4.e;
import B3.C0342c;
import B3.F;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import P4.x;
import R4.l;
import S4.a;
import S4.b;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import s3.C1947e;
import s3.n;
import s4.i;
import y3.InterfaceC2274d;

@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    static {
        a.f5888a.a(b.a.PERFORMANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ A4.b lambda$getComponents$0(F f7, InterfaceC0344e interfaceC0344e) {
        return new A4.b((C1947e) interfaceC0344e.a(C1947e.class), (l) interfaceC0344e.a(l.class), (n) interfaceC0344e.g(n.class).get(), (Executor) interfaceC0344e.h(f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e providesFirebasePerformance(InterfaceC0344e interfaceC0344e) {
        interfaceC0344e.a(A4.b.class);
        return D4.a.b().b(new E4.a((C1947e) interfaceC0344e.a(C1947e.class), (i) interfaceC0344e.a(i.class), interfaceC0344e.g(x.class), interfaceC0344e.g(g.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0342c> getComponents() {
        final F a7 = F.a(InterfaceC2274d.class, Executor.class);
        return Arrays.asList(C0342c.e(e.class).h(LIBRARY_NAME).b(r.k(C1947e.class)).b(r.m(x.class)).b(r.k(i.class)).b(r.m(g.class)).b(r.k(A4.b.class)).f(new h() { // from class: A4.c
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                e providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(interfaceC0344e);
                return providesFirebasePerformance;
            }
        }).d(), C0342c.e(A4.b.class).h(EARLY_LIBRARY_NAME).b(r.k(C1947e.class)).b(r.k(l.class)).b(r.i(n.class)).b(r.j(a7)).e().f(new h() { // from class: A4.d
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                b lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(F.this, interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).d(), O4.h.b(LIBRARY_NAME, "20.5.0"));
    }
}
