package com.google.firebase.sessions;

import android.content.Context;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.c;
import d8.t;
import d9.p;
import d9.q;
import d9.r;
import ea.b0;
import ea.e0;
import ea.j0;
import ea.k0;
import ea.o;
import ea.v;
import ea.w;
import java.util.List;
import u7.f;

public final class FirebaseSessionsRegistrar
  implements ComponentRegistrar
{
  private static final a Companion = new a();
  private static final String LIBRARY_NAME = "fire-sessions";
  private static final t<nc.a0> backgroundDispatcher;
  private static final t<nc.a0> blockingDispatcher;
  private static final t<f> firebaseApp = t.a(f.class);
  private static final t<u9.d> firebaseInstallationsApi = t.a(u9.d.class);
  private static final t<j0> sessionLifecycleServiceBinder = t.a(j0.class);
  private static final t<ga.h> sessionsSettings;
  private static final t<h3.i> transportFactory;
  
  static
  {
    backgroundDispatcher = new t(y7.a.class, nc.a0.class);
    blockingDispatcher = new t(y7.b.class, nc.a0.class);
    transportFactory = t.a(h3.i.class);
    sessionsSettings = t.a(ga.h.class);
  }
  
  private static final o getComponents$lambda$0(c paramc)
  {
    Object localObject1 = paramc.e(firebaseApp);
    ec.i.d(localObject1, "container[firebaseApp]");
    localObject1 = (f)localObject1;
    Object localObject2 = paramc.e(sessionsSettings);
    ec.i.d(localObject2, "container[sessionsSettings]");
    localObject2 = (ga.h)localObject2;
    Object localObject3 = paramc.e(backgroundDispatcher);
    ec.i.d(localObject3, "container[backgroundDispatcher]");
    localObject3 = (ub.h)localObject3;
    paramc = paramc.e(sessionLifecycleServiceBinder);
    ec.i.d(paramc, "container[sessionLifecycleServiceBinder]");
    return new o((f)localObject1, (ga.h)localObject2, (ub.h)localObject3, (j0)paramc);
  }
  
  private static final e0 getComponents$lambda$1(c paramc)
  {
    return new e0(0);
  }
  
  private static final ea.a0 getComponents$lambda$2(c paramc)
  {
    Object localObject1 = paramc.e(firebaseApp);
    ec.i.d(localObject1, "container[firebaseApp]");
    localObject1 = (f)localObject1;
    Object localObject2 = paramc.e(firebaseInstallationsApi);
    ec.i.d(localObject2, "container[firebaseInstallationsApi]");
    localObject2 = (u9.d)localObject2;
    Object localObject3 = paramc.e(sessionsSettings);
    ec.i.d(localObject3, "container[sessionsSettings]");
    localObject3 = (ga.h)localObject3;
    Object localObject4 = paramc.c(transportFactory);
    ec.i.d(localObject4, "container.getProvider(transportFactory)");
    localObject4 = new ea.k((t9.b)localObject4);
    paramc = paramc.e(backgroundDispatcher);
    ec.i.d(paramc, "container[backgroundDispatcher]");
    return new b0((f)localObject1, (u9.d)localObject2, (ga.h)localObject3, (ea.k)localObject4, (ub.h)paramc);
  }
  
  private static final ga.h getComponents$lambda$3(c paramc)
  {
    Object localObject1 = paramc.e(firebaseApp);
    ec.i.d(localObject1, "container[firebaseApp]");
    localObject1 = (f)localObject1;
    Object localObject2 = paramc.e(blockingDispatcher);
    ec.i.d(localObject2, "container[blockingDispatcher]");
    localObject2 = (ub.h)localObject2;
    Object localObject3 = paramc.e(backgroundDispatcher);
    ec.i.d(localObject3, "container[backgroundDispatcher]");
    localObject3 = (ub.h)localObject3;
    paramc = paramc.e(firebaseInstallationsApi);
    ec.i.d(paramc, "container[firebaseInstallationsApi]");
    return new ga.h((f)localObject1, (ub.h)localObject2, (ub.h)localObject3, (u9.d)paramc);
  }
  
  private static final v getComponents$lambda$4(c paramc)
  {
    Object localObject = (f)paramc.e(firebaseApp);
    ((f)localObject).a();
    localObject = a;
    ec.i.d(localObject, "container[firebaseApp].applicationContext");
    paramc = paramc.e(backgroundDispatcher);
    ec.i.d(paramc, "container[backgroundDispatcher]");
    return new w((Context)localObject, (ub.h)paramc);
  }
  
  private static final j0 getComponents$lambda$5(c paramc)
  {
    paramc = paramc.e(firebaseApp);
    ec.i.d(paramc, "container[firebaseApp]");
    return new k0((f)paramc);
  }
  
  public List<d8.b<? extends Object>> getComponents()
  {
    Object localObject1 = d8.b.b(o.class);
    a = "fire-sessions";
    t localt = firebaseApp;
    ((b.a)localObject1).a(d8.k.c(localt));
    Object localObject2 = sessionsSettings;
    ((b.a)localObject1).a(d8.k.c((t)localObject2));
    Object localObject3 = backgroundDispatcher;
    ((b.a)localObject1).a(d8.k.c((t)localObject3));
    ((b.a)localObject1).a(d8.k.c(sessionLifecycleServiceBinder));
    f = new r(2);
    ((b.a)localObject1).c(2);
    localObject1 = ((b.a)localObject1).b();
    Object localObject4 = d8.b.b(e0.class);
    a = "session-generator";
    f = new e0.d(2);
    localObject4 = ((b.a)localObject4).b();
    Object localObject5 = d8.b.b(ea.a0.class);
    a = "session-publisher";
    ((b.a)localObject5).a(new d8.k(localt, 1, 0));
    Object localObject6 = firebaseInstallationsApi;
    ((b.a)localObject5).a(d8.k.c((t)localObject6));
    ((b.a)localObject5).a(new d8.k((t)localObject2, 1, 0));
    ((b.a)localObject5).a(new d8.k(transportFactory, 1, 1));
    ((b.a)localObject5).a(new d8.k((t)localObject3, 1, 0));
    f = new p(5);
    localObject2 = ((b.a)localObject5).b();
    localObject5 = d8.b.b(ga.h.class);
    a = "sessions-settings";
    ((b.a)localObject5).a(new d8.k(localt, 1, 0));
    ((b.a)localObject5).a(d8.k.c(blockingDispatcher));
    ((b.a)localObject5).a(new d8.k((t)localObject3, 1, 0));
    ((b.a)localObject5).a(new d8.k((t)localObject6, 1, 0));
    f = new q(2);
    localObject6 = ((b.a)localObject5).b();
    localObject5 = d8.b.b(v.class);
    a = "sessions-datastore";
    ((b.a)localObject5).a(new d8.k(localt, 1, 0));
    ((b.a)localObject5).a(new d8.k((t)localObject3, 1, 0));
    f = new r(3);
    localObject5 = ((b.a)localObject5).b();
    localObject3 = d8.b.b(j0.class);
    a = "sessions-service-binder";
    ((b.a)localObject3).a(new d8.k(localt, 1, 0));
    f = new e0.d(3);
    return va.a.g(new d8.b[] { localObject1, localObject4, localObject2, localObject6, localObject5, ((b.a)localObject3).b(), e.a("fire-sessions", "2.0.8") });
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     com.google.firebase.sessions.FirebaseSessionsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */