package gb;

import eb.e1;
import eb.h1;
import eb.k0;
import eb.k0.b;
import eb.k0.b.a;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.h;
import eb.k0.i;
import eb.k0.j;
import eb.k0.k;
import eb.n;
import eb.o;
import f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.g.a;
import x6.b;

public final class q2
  extends k0
{
  public final k0.e f;
  public k0.i g;
  public n h = n.d;
  
  public q2(k0.e parame)
  {
    b.y(parame, "helper");
    f = parame;
  }
  
  public final e1 a(k0.h paramh)
  {
    final Object localObject1 = a;
    if (((List)localObject1).isEmpty())
    {
      localObject2 = e1.n;
      localObject1 = f.l("NameResolver returned no usable address. addrs=");
      ((StringBuilder)localObject1).append(a);
      ((StringBuilder)localObject1).append(", attrs=");
      ((StringBuilder)localObject1).append(b);
      paramh = ((e1)localObject2).g(((StringBuilder)localObject1).toString());
      c(paramh);
      return paramh;
    }
    Object localObject2 = c;
    paramh = (k0.h)localObject1;
    if ((localObject2 instanceof b))
    {
      localObject2 = (b)localObject2;
      Boolean localBoolean = a;
      paramh = (k0.h)localObject1;
      if (localBoolean != null)
      {
        paramh = (k0.h)localObject1;
        if (localBoolean.booleanValue())
        {
          localObject1 = new ArrayList((Collection)localObject1);
          if (b != null) {
            paramh = new Random(b.longValue());
          } else {
            paramh = new Random();
          }
          Collections.shuffle((List)localObject1, paramh);
          paramh = (k0.h)localObject1;
        }
      }
    }
    localObject1 = g;
    if (localObject1 == null)
    {
      localObject1 = f;
      localObject2 = new k0.b.a();
      ((k0.b.a)localObject2).b(paramh);
      localObject1 = ((k0.e)localObject1).a(new k0.b(a, b, c));
      ((k0.i)localObject1).h(new a((k0.i)localObject1));
      g = ((k0.i)localObject1);
      localObject2 = n.a;
      paramh = new c(k0.f.b((k0.i)localObject1, null));
      h = ((n)localObject2);
      f.f((n)localObject2, paramh);
      ((k0.i)localObject1).f();
    }
    else
    {
      ((k0.i)localObject1).i(paramh);
    }
    return e1.e;
  }
  
  public final void c(e1 parame1)
  {
    Object localObject = g;
    if (localObject != null)
    {
      ((k0.i)localObject).g();
      g = null;
    }
    localObject = n.c;
    parame1 = new c(k0.f.a(parame1));
    h = ((n)localObject);
    f.f((n)localObject, parame1);
  }
  
  public final void e()
  {
    k0.i locali = g;
    if (locali != null) {
      locali.f();
    }
  }
  
  public final void f()
  {
    k0.i locali = g;
    if (locali != null) {
      locali.g();
    }
  }
  
  public final class a
    implements k0.k
  {
    public a(k0.i parami) {}
    
    public final void a(o paramo)
    {
      q2 localq2 = q2.this;
      k0.i locali = localObject1;
      localq2.getClass();
      n localn1 = n.d;
      n localn2 = a;
      if (localn2 != n.e)
      {
        n localn3 = n.c;
        if ((localn2 == localn3) || (localn2 == localn1)) {
          f.e();
        }
        if (h == localn3)
        {
          if (localn2 == n.a) {
            return;
          }
          if (localn2 == localn1)
          {
            localq2.e();
            return;
          }
        }
        int i = localn2.ordinal();
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i == 3)
              {
                paramo = new q2.d(localq2, locali);
              }
              else
              {
                paramo = new StringBuilder();
                paramo.append("Unsupported state:");
                paramo.append(localn2);
                throw new IllegalArgumentException(paramo.toString());
              }
            }
            else {
              paramo = new q2.c(k0.f.a(b));
            }
          }
          else {
            paramo = new q2.c(k0.f.b(locali, null));
          }
        }
        else {
          paramo = new q2.c(k0.f.e);
        }
        h = localn2;
        f.f(localn2, paramo);
      }
    }
  }
  
  public static final class b
  {
    public final Boolean a;
    public final Long b;
    
    public b(Boolean paramBoolean)
    {
      a = paramBoolean;
      b = null;
    }
  }
  
  public static final class c
    extends k0.j
  {
    public final k0.f a;
    
    public c(k0.f paramf)
    {
      b.y(paramf, "result");
      a = paramf;
    }
    
    public final k0.f a(k0.g paramg)
    {
      return a;
    }
    
    public final String toString()
    {
      g.a locala = new g.a(c.class.getSimpleName());
      locala.a(a, "result");
      return locala.toString();
    }
  }
  
  public final class d
    extends k0.j
  {
    public final k0.i a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    
    public d(k0.i parami)
    {
      b.y(parami, "subchannel");
      a = parami;
    }
    
    public final k0.f a(k0.g paramg)
    {
      if (b.compareAndSet(false, true)) {
        f.d().execute(new a());
      }
      return k0.f.e;
    }
    
    public final class a
      implements Runnable
    {
      public a() {}
      
      public final void run()
      {
        a.f();
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.q2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */