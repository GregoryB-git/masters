package com.google.firebase.functions;

import android.content.Context;
import b1.v;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k3.y;
import o9.h;
import o9.l;
import p3.f;
import y7.d;

public final class FunctionsRegistrar
  implements ComponentRegistrar
{
  private static final a Companion = new a();
  private static final String LIBRARY_NAME = "fire-fn";
  
  private static final o9.i getComponents$lambda$0(t paramt1, t paramt2, d8.c paramc)
  {
    ec.i.e(paramt1, "$liteExecutor");
    ec.i.e(paramt2, "$uiExecutor");
    ec.i.e(paramc, "c");
    Object localObject1 = paramc.get(Context.class);
    ec.i.d(localObject1, "c.get(Context::class.java)");
    Object localObject2 = (Context)localObject1;
    localObject1 = paramc.get(u7.j.class);
    ec.i.d(localObject1, "c.get(FirebaseOptions::class.java)");
    localObject1 = (u7.j)localObject1;
    paramt1 = paramc.e(paramt1);
    ec.i.d(paramt1, "c.get(liteExecutor)");
    paramt1 = (Executor)paramt1;
    paramt2 = paramc.e(paramt2);
    ec.i.d(paramt2, "c.get(uiExecutor)");
    paramt2 = (Executor)paramt2;
    t9.b localb = paramc.b(c8.b.class);
    ec.i.d(localb, "c.getProvider(InternalAuthProvider::class.java)");
    Object localObject3 = paramc.b(s9.a.class);
    ec.i.d(localObject3, "c.getProvider(FirebaseIn…ceIdInternal::class.java)");
    Object localObject4 = paramc.f(a8.a.class);
    ec.i.d(localObject4, "c.getDeferred(InteropApp…okenProvider::class.java)");
    paramc = v.f(localObject2);
    localObject1 = new h(v.f(localObject1));
    localObject2 = v.f(localb);
    localObject3 = v.f(localObject3);
    localObject4 = v.f(localObject4);
    paramt1 = v.f(paramt1);
    return (o9.i)p9.a.a(new o9.j(v.f(new o9.k(new y(paramc, (qb.a)localObject1, p9.a.a(new f((qb.a)localObject2, (qb.a)localObject3, (qb.a)localObject4, paramt1, 1)), paramt1, v.f(paramt2), 2))))).get();
  }
  
  public List<d8.b<?>> getComponents()
  {
    t localt1 = new t(y7.c.class, Executor.class);
    t localt2 = new t(d.class, Executor.class);
    Object localObject = d8.b.b(o9.i.class);
    a = "fire-fn";
    ((b.a)localObject).a(d8.k.d(Context.class));
    ((b.a)localObject).a(d8.k.d(u7.j.class));
    ((b.a)localObject).a(d8.k.b(c8.b.class));
    ((b.a)localObject).a(new d8.k(1, 1, s9.a.class));
    ((b.a)localObject).a(d8.k.a(a8.a.class));
    ((b.a)localObject).a(new d8.k(localt1, 1, 0));
    ((b.a)localObject).a(new d8.k(localt2, 1, 0));
    f = new l(0, localt1, localt2);
    localObject = Arrays.asList(new d8.b[] { ((b.a)localObject).b(), e.a("fire-fn", "21.1.0") });
    ec.i.d(localObject, "asList(\n      Component.…onfig.VERSION_NAME)\n    )");
    return (List<d8.b<?>>)localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     com.google.firebase.functions.FunctionsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */