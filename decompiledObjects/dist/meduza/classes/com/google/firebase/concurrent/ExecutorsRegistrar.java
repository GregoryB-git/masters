package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.e;
import d8.g;
import d8.o;
import d8.t;
import d9.p;
import d9.q;
import e8.f;
import e8.h;
import e8.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import y7.a;
import y7.c;

public class ExecutorsRegistrar
  implements ComponentRegistrar
{
  public static final o<ScheduledExecutorService> a = new o(new h());
  public static final o<ScheduledExecutorService> b = new o(new i());
  public static final o<ScheduledExecutorService> c = new o(new g(1));
  public static final o<ScheduledExecutorService> d = new o(new d8.r(1));
  
  public static f a(ExecutorService paramExecutorService)
  {
    return new f(paramExecutorService, (ScheduledExecutorService)d.get());
  }
  
  public final List<d8.b<?>> getComponents()
  {
    Object localObject1 = new t(a.class, ScheduledExecutorService.class);
    Object localObject2 = new t[2];
    localObject2[0] = new t(a.class, ExecutorService.class);
    localObject2[1] = new t(a.class, Executor.class);
    Object localObject3 = new HashSet();
    Object localObject4 = new HashSet();
    Object localObject5 = new HashSet();
    ((HashSet)localObject3).add(localObject1);
    int i = localObject2.length;
    int j = 0;
    while (j < i) {
      if (localObject2[j] != null) {
        j++;
      } else {
        throw new NullPointerException("Null interface");
      }
    }
    Collections.addAll((Collection)localObject3, (Object[])localObject2);
    localObject1 = new p(0);
    localObject5 = new d8.b(null, new HashSet((Collection)localObject3), new HashSet((Collection)localObject4), 0, 0, (e)localObject1, (Set)localObject5);
    localObject2 = new t(y7.b.class, ScheduledExecutorService.class);
    Object localObject6 = new t[2];
    localObject6[0] = new t(y7.b.class, ExecutorService.class);
    localObject6[1] = new t(y7.b.class, Executor.class);
    localObject1 = new HashSet();
    localObject3 = new HashSet();
    localObject4 = new HashSet();
    ((HashSet)localObject1).add(localObject2);
    i = localObject6.length;
    j = 0;
    while (j < i) {
      if (localObject6[j] != null) {
        j++;
      } else {
        throw new NullPointerException("Null interface");
      }
    }
    Collections.addAll((Collection)localObject1, (Object[])localObject6);
    localObject2 = new q(0);
    localObject4 = new d8.b(null, new HashSet((Collection)localObject1), new HashSet((Collection)localObject3), 0, 0, (e)localObject2, (Set)localObject4);
    t localt = new t(c.class, ScheduledExecutorService.class);
    localObject6 = new t[2];
    localObject6[0] = new t(c.class, ExecutorService.class);
    localObject6[1] = new t(c.class, Executor.class);
    localObject1 = new HashSet();
    localObject2 = new HashSet();
    localObject3 = new HashSet();
    ((HashSet)localObject1).add(localt);
    i = localObject6.length;
    j = 0;
    while (j < i) {
      if (localObject6[j] != null) {
        j++;
      } else {
        throw new NullPointerException("Null interface");
      }
    }
    Collections.addAll((Collection)localObject1, (Object[])localObject6);
    localObject6 = new d9.r(0);
    localObject3 = new d8.b(null, new HashSet((Collection)localObject1), new HashSet((Collection)localObject2), 0, 0, (e)localObject6, (Set)localObject3);
    localObject1 = d8.b.a(new t(y7.d.class, Executor.class));
    f = new e0.d(0);
    return Arrays.asList(new d8.b[] { localObject5, localObject4, localObject3, ((b.a)localObject1).b() });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.concurrent.ExecutorsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */