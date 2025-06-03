package nb;

import eb.a;
import eb.a.b;
import eb.k0;
import eb.k0.b;
import eb.k0.e;
import eb.k0.i;
import eb.k0.k;
import eb.o;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import x6.b;

public final class g
  extends c
{
  public final k0.e a;
  
  public g(k0.e parame)
  {
    b.y(parame, "helper");
    a = parame;
  }
  
  public final k0.i a(k0.b paramb)
  {
    Object localObject = k0.b;
    localObject = (k0.k)paramb.a();
    paramb = super.a(paramb);
    int i;
    if ((localObject != null) && (paramb.c().a(k0.d) == null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return paramb;
    }
    return new a(paramb, (k0.k)localObject);
  }
  
  public final k0.e g()
  {
    return a;
  }
  
  public static final class a
    extends d
  {
    public final k0.i a;
    public final k0.k b;
    
    public a(k0.i parami, k0.k paramk)
    {
      b.y(parami, "delegate");
      a = parami;
      b.y(paramk, "healthListener");
      b = paramk;
    }
    
    public final a c()
    {
      a locala = a.c();
      locala.getClass();
      Object localObject1 = k0.d;
      Object localObject2 = Boolean.TRUE;
      IdentityHashMap localIdentityHashMap = new IdentityHashMap(1);
      localIdentityHashMap.put(localObject1, localObject2);
      localObject2 = a.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        if (!localIdentityHashMap.containsKey(((Map.Entry)localObject1).getKey())) {
          localIdentityHashMap.put((a.b)((Map.Entry)localObject1).getKey(), ((Map.Entry)localObject1).getValue());
        }
      }
      return new a(localIdentityHashMap);
    }
    
    public final void h(final k0.k paramk)
    {
      a.h(new a(paramk));
    }
    
    public final k0.i j()
    {
      return a;
    }
    
    public final class a
      implements k0.k
    {
      public a(k0.k paramk) {}
      
      public final void a(o paramo)
      {
        paramk.a(paramo);
        b.a(paramo);
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */