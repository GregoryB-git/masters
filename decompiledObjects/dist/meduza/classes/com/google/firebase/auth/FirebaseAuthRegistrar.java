package com.google.firebase.auth;

import b.a0;
import b8.q0;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.k;
import d8.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import u7.f;
import y7.c;

public class FirebaseAuthRegistrar
  implements ComponentRegistrar
{
  public List<d8.b<?>> getComponents()
  {
    t localt1 = new t(y7.a.class, Executor.class);
    t localt2 = new t(y7.b.class, Executor.class);
    Object localObject1 = new t(c.class, Executor.class);
    Object localObject2 = new t(c.class, ScheduledExecutorService.class);
    Object localObject3 = new t(y7.d.class, Executor.class);
    b.a locala = new b.a(FirebaseAuth.class, new Class[] { c8.b.class });
    locala.a(k.d(f.class));
    locala.a(new k(1, 1, q9.e.class));
    locala.a(new k(localt1, 1, 0));
    locala.a(new k(localt2, 1, 0));
    locala.a(new k((t)localObject1, 1, 0));
    locala.a(new k((t)localObject2, 1, 0));
    locala.a(new k((t)localObject3, 1, 0));
    locala.a(k.b(a8.a.class));
    f = new q0(localt1, localt2, (t)localObject1, (t)localObject2, (t)localObject3);
    localObject2 = locala.b();
    localObject1 = new a0();
    localObject3 = d8.b.b(q9.d.class);
    e = 1;
    f = new d8.a(localObject1);
    return Arrays.asList(new d8.b[] { localObject2, ((b.a)localObject3).b(), ca.e.a("fire-auth", "23.2.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.FirebaseAuthRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */