package gb;

import b.d;
import eb.a.b;
import eb.e1;
import eb.h1;
import eb.u0;
import eb.u0.d;
import eb.u0.e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class c3
  extends s0
{
  public static final a.b<b> d = new a.b("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
  public final b3 b;
  public final h1 c;
  
  public c3(u0 paramu0, k paramk, h1 paramh1)
  {
    super(paramu0);
    b = paramk;
    c = paramh1;
  }
  
  public final void c()
  {
    super.c();
    k localk = (k)b;
    b.d();
    b.execute(new d(localk, 23));
  }
  
  public final void d(u0.d paramd)
  {
    super.d(new c(paramd));
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      b();
    }
  }
  
  public final class b
  {
    public b() {}
    
    public final void a(e1 parame1)
    {
      if (parame1.e())
      {
        parame1 = (k)b;
        b.d();
        b.execute(new d(parame1, 23));
      }
      else
      {
        Object localObject = c3.this;
        parame1 = b;
        localObject = new c3.a((c3)localObject);
        ((k)parame1).a((c3.a)localObject);
      }
    }
  }
  
  public final class c
    extends u0.d
  {
    public u0.d a;
    
    public c(u0.d paramd)
    {
      a = paramd;
    }
    
    public final void a(e1 parame1)
    {
      a.a(parame1);
      c.execute(new u.a(this, 20));
    }
    
    public final void b(u0.e parame)
    {
      Object localObject1 = b;
      Object localObject2 = c3.d;
      if (((eb.a)localObject1).a((a.b)localObject2) == null)
      {
        localObject1 = a;
        Collections.emptyList();
        Object localObject3 = eb.a.b;
        localObject3 = a;
        Object localObject4 = b;
        parame = c;
        localObject4.getClass();
        c3.b localb = new c3.b(c3.this);
        IdentityHashMap localIdentityHashMap = new IdentityHashMap(1);
        localIdentityHashMap.put(localObject2, localb);
        localObject2 = a.entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject2).next();
          if (!localIdentityHashMap.containsKey(((Map.Entry)localObject4).getKey())) {
            localIdentityHashMap.put((a.b)((Map.Entry)localObject4).getKey(), ((Map.Entry)localObject4).getValue());
          }
        }
        ((u0.d)localObject1).b(new u0.e((List)localObject3, new eb.a(localIdentityHashMap), parame));
        return;
      }
      throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
    }
  }
}

/* Location:
 * Qualified Name:     gb.c3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */