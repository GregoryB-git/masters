package com.google.firebase.installations;

import b.a0;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import d8.t;
import d9.p;
import e8.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u7.f;

public class FirebaseInstallationsRegistrar
  implements ComponentRegistrar
{
  private static final String LIBRARY_NAME = "fire-installations";
  
  private static u9.d lambda$getComponents$0(d8.c paramc)
  {
    return new u9.c((f)paramc.get(f.class), paramc.b(q9.e.class), (ExecutorService)paramc.e(new t(y7.a.class, ExecutorService.class)), new j((Executor)paramc.e(new t(y7.b.class, Executor.class))));
  }
  
  public List<d8.b<?>> getComponents()
  {
    b.a locala = d8.b.b(u9.d.class);
    a = "fire-installations";
    locala.a(k.d(f.class));
    locala.a(k.b(q9.e.class));
    locala.a(new k(new t(y7.a.class, ExecutorService.class), 1, 0));
    locala.a(new k(new t(y7.b.class, Executor.class), 1, 0));
    f = new p(3);
    d8.b localb = locala.b();
    a0 locala0 = new a0();
    locala = d8.b.b(q9.d.class);
    e = 1;
    f = new d8.a(locala0);
    return Arrays.asList(new d8.b[] { localb, locala.b(), ca.e.a("fire-installations", "18.0.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.installations.FirebaseInstallationsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */