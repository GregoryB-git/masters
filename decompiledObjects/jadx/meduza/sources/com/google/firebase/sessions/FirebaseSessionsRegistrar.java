package com.google.firebase.sessions;

import android.content.Context;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.t;
import d9.p;
import d9.q;
import d9.r;
import ea.b0;
import ea.e0;
import ea.j0;
import ea.k;
import ea.k0;
import ea.o;
import ea.v;
import ea.w;
import ga.h;
import h3.i;
import java.util.List;
import nc.a0;
import u7.f;
import u9.d;
import y7.b;

/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a();
    private static final t<f> firebaseApp = t.a(f.class);
    private static final t<d> firebaseInstallationsApi = t.a(d.class);
    private static final t<a0> backgroundDispatcher = new t<>(y7.a.class, a0.class);
    private static final t<a0> blockingDispatcher = new t<>(b.class, a0.class);
    private static final t<i> transportFactory = t.a(i.class);
    private static final t<h> sessionsSettings = t.a(h.class);
    private static final t<j0> sessionLifecycleServiceBinder = t.a(j0.class);

    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(c cVar) {
        Object e10 = cVar.e(firebaseApp);
        ec.i.d(e10, "container[firebaseApp]");
        Object e11 = cVar.e(sessionsSettings);
        ec.i.d(e11, "container[sessionsSettings]");
        Object e12 = cVar.e(backgroundDispatcher);
        ec.i.d(e12, "container[backgroundDispatcher]");
        Object e13 = cVar.e(sessionLifecycleServiceBinder);
        ec.i.d(e13, "container[sessionLifecycleServiceBinder]");
        return new o((f) e10, (h) e11, (ub.h) e12, (j0) e13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 getComponents$lambda$1(c cVar) {
        return new e0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ea.a0 getComponents$lambda$2(c cVar) {
        Object e10 = cVar.e(firebaseApp);
        ec.i.d(e10, "container[firebaseApp]");
        f fVar = (f) e10;
        Object e11 = cVar.e(firebaseInstallationsApi);
        ec.i.d(e11, "container[firebaseInstallationsApi]");
        d dVar = (d) e11;
        Object e12 = cVar.e(sessionsSettings);
        ec.i.d(e12, "container[sessionsSettings]");
        h hVar = (h) e12;
        t9.b c10 = cVar.c(transportFactory);
        ec.i.d(c10, "container.getProvider(transportFactory)");
        k kVar = new k(c10);
        Object e13 = cVar.e(backgroundDispatcher);
        ec.i.d(e13, "container[backgroundDispatcher]");
        return new b0(fVar, dVar, hVar, kVar, (ub.h) e13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h getComponents$lambda$3(c cVar) {
        Object e10 = cVar.e(firebaseApp);
        ec.i.d(e10, "container[firebaseApp]");
        Object e11 = cVar.e(blockingDispatcher);
        ec.i.d(e11, "container[blockingDispatcher]");
        Object e12 = cVar.e(backgroundDispatcher);
        ec.i.d(e12, "container[backgroundDispatcher]");
        Object e13 = cVar.e(firebaseInstallationsApi);
        ec.i.d(e13, "container[firebaseInstallationsApi]");
        return new h((f) e10, (ub.h) e11, (ub.h) e12, (d) e13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v getComponents$lambda$4(c cVar) {
        f fVar = (f) cVar.e(firebaseApp);
        fVar.a();
        Context context = fVar.f15084a;
        ec.i.d(context, "container[firebaseApp].applicationContext");
        Object e10 = cVar.e(backgroundDispatcher);
        ec.i.d(e10, "container[backgroundDispatcher]");
        return new w(context, (ub.h) e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 getComponents$lambda$5(c cVar) {
        Object e10 = cVar.e(firebaseApp);
        ec.i.d(e10, "container[firebaseApp]");
        return new k0((f) e10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<? extends Object>> getComponents() {
        b.a b10 = d8.b.b(o.class);
        b10.f3588a = LIBRARY_NAME;
        t<f> tVar = firebaseApp;
        b10.a(d8.k.c(tVar));
        t<h> tVar2 = sessionsSettings;
        b10.a(d8.k.c(tVar2));
        t<a0> tVar3 = backgroundDispatcher;
        b10.a(d8.k.c(tVar3));
        b10.a(d8.k.c(sessionLifecycleServiceBinder));
        int i10 = 2;
        b10.f = new r(i10);
        b10.c(2);
        b.a b11 = d8.b.b(e0.class);
        b11.f3588a = "session-generator";
        b11.f = new e0.d(i10);
        b.a b12 = d8.b.b(ea.a0.class);
        b12.f3588a = "session-publisher";
        b12.a(new d8.k(tVar, 1, 0));
        t<d> tVar4 = firebaseInstallationsApi;
        b12.a(d8.k.c(tVar4));
        b12.a(new d8.k(tVar2, 1, 0));
        b12.a(new d8.k(transportFactory, 1, 1));
        b12.a(new d8.k(tVar3, 1, 0));
        b12.f = new p(5);
        b.a b13 = d8.b.b(h.class);
        b13.f3588a = "sessions-settings";
        b13.a(new d8.k(tVar, 1, 0));
        b13.a(d8.k.c(blockingDispatcher));
        b13.a(new d8.k(tVar3, 1, 0));
        b13.a(new d8.k(tVar4, 1, 0));
        b13.f = new q(i10);
        int i11 = 3;
        b.a b14 = d8.b.b(v.class);
        b14.f3588a = "sessions-datastore";
        b14.a(new d8.k(tVar, 1, 0));
        b14.a(new d8.k(tVar3, 1, 0));
        b14.f = new r(i11);
        b.a b15 = d8.b.b(j0.class);
        b15.f3588a = "sessions-service-binder";
        b15.a(new d8.k(tVar, 1, 0));
        b15.f = new e0.d(i11);
        return va.a.g(b10.b(), b11.b(), b12.b(), b13.b(), b14.b(), b15.b(), e.a(LIBRARY_NAME, "2.0.8"));
    }
}
