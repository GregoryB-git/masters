package com.google.firebase.installations;

import b.a0;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.k;
import d8.t;
import d9.p;
import e8.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q9.e;
import u7.f;
import u9.d;
import y7.a;
import y7.b;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new u9.c((f) cVar.get(f.class), cVar.b(e.class), (ExecutorService) cVar.e(new t(a.class, ExecutorService.class)), new j((Executor) cVar.e(new t(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        b.a b10 = d8.b.b(d.class);
        b10.f3588a = LIBRARY_NAME;
        b10.a(k.d(f.class));
        b10.a(k.b(e.class));
        b10.a(new k((t<?>) new t(a.class, ExecutorService.class), 1, 0));
        b10.a(new k((t<?>) new t(y7.b.class, Executor.class), 1, 0));
        b10.f = new p(3);
        a0 a0Var = new a0();
        b.a b11 = d8.b.b(q9.d.class);
        b11.f3592e = 1;
        b11.f = new d8.a(a0Var);
        return Arrays.asList(b10.b(), b11.b(), ca.e.a(LIBRARY_NAME, "18.0.0"));
    }
}
