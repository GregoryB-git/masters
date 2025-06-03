package com.google.firebase.auth;

import b.a0;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.k;
import d8.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(t tVar, t tVar2, t tVar3, t tVar4, t tVar5, d8.c cVar) {
        u7.f fVar = (u7.f) cVar.get(u7.f.class);
        t9.b b10 = cVar.b(a8.a.class);
        t9.b b11 = cVar.b(q9.e.class);
        return new c8.g(fVar, b10, b11, (Executor) cVar.e(tVar2), (Executor) cVar.e(tVar3), (ScheduledExecutorService) cVar.e(tVar4), (Executor) cVar.e(tVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        final t tVar = new t(y7.a.class, Executor.class);
        final t tVar2 = new t(y7.b.class, Executor.class);
        final t tVar3 = new t(y7.c.class, Executor.class);
        final t tVar4 = new t(y7.c.class, ScheduledExecutorService.class);
        final t tVar5 = new t(y7.d.class, Executor.class);
        b.a aVar = new b.a(FirebaseAuth.class, new Class[]{c8.b.class});
        aVar.a(k.d(u7.f.class));
        aVar.a(new k(1, 1, q9.e.class));
        aVar.a(new k((t<?>) tVar, 1, 0));
        aVar.a(new k((t<?>) tVar2, 1, 0));
        aVar.a(new k((t<?>) tVar3, 1, 0));
        aVar.a(new k((t<?>) tVar4, 1, 0));
        aVar.a(new k((t<?>) tVar5, 1, 0));
        aVar.a(k.b(a8.a.class));
        aVar.f = new d8.e() { // from class: b8.q0
            @Override // d8.e
            public final Object g(d8.u uVar) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(d8.t.this, tVar2, tVar3, tVar4, tVar5, uVar);
            }
        };
        a0 a0Var = new a0();
        b.a b10 = d8.b.b(q9.d.class);
        b10.f3592e = 1;
        b10.f = new d8.a(a0Var);
        return Arrays.asList(aVar.b(), b10.b(), ca.e.a("fire-auth", "23.2.0"));
    }
}
