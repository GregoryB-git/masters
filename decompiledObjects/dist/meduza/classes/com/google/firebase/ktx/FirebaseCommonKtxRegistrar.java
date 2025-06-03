package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import d8.b.a;
import d8.e;
import d8.k;
import d8.t;
import d8.u;
import ec.i;
import java.util.List;
import java.util.concurrent.Executor;
import nc.a0;
import y7.c;
import y7.d;

public final class FirebaseCommonKtxRegistrar
  implements ComponentRegistrar
{
  public List<d8.b<?>> getComponents()
  {
    Object localObject1 = d8.b.a(new t(y7.a.class, a0.class));
    ((b.a)localObject1).a(new k(new t(y7.a.class, Executor.class), 1, 0));
    f = a.a;
    localObject1 = ((b.a)localObject1).b();
    Object localObject2 = d8.b.a(new t(c.class, a0.class));
    ((b.a)localObject2).a(new k(new t(c.class, Executor.class), 1, 0));
    f = b.a;
    localObject2 = ((b.a)localObject2).b();
    b.a locala = d8.b.a(new t(y7.b.class, a0.class));
    locala.a(new k(new t(y7.b.class, Executor.class), 1, 0));
    f = c.a;
    d8.b localb = locala.b();
    locala = d8.b.a(new t(d.class, a0.class));
    locala.a(new k(new t(d.class, Executor.class), 1, 0));
    f = d.a;
    return va.a.g(new d8.b[] { localObject1, localObject2, localb, locala.b() });
  }
  
  public static final class a<T>
    implements e
  {
    public static final a<T> a = new a();
    
    public final Object g(u paramu)
    {
      paramu = paramu.e(new t(y7.a.class, Executor.class));
      i.d(paramu, "c.get(Qualified.qualifie…a, Executor::class.java))");
      return x6.b.W((Executor)paramu);
    }
  }
  
  public static final class b<T>
    implements e
  {
    public static final b<T> a = new b();
    
    public final Object g(u paramu)
    {
      paramu = paramu.e(new t(c.class, Executor.class));
      i.d(paramu, "c.get(Qualified.qualifie…a, Executor::class.java))");
      return x6.b.W((Executor)paramu);
    }
  }
  
  public static final class c<T>
    implements e
  {
    public static final c<T> a = new c();
    
    public final Object g(u paramu)
    {
      paramu = paramu.e(new t(y7.b.class, Executor.class));
      i.d(paramu, "c.get(Qualified.qualifie…a, Executor::class.java))");
      return x6.b.W((Executor)paramu);
    }
  }
  
  public static final class d<T>
    implements e
  {
    public static final d<T> a = new d();
    
    public final Object g(u paramu)
    {
      paramu = paramu.e(new t(d.class, Executor.class));
      i.d(paramu, "c.get(Qualified.qualifie…a, Executor::class.java))");
      return x6.b.W((Executor)paramu);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.ktx.FirebaseCommonKtxRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */