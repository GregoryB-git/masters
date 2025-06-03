package V3;

import d4.b;
import d4.c;
import d4.c.c;
import d4.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class u
{
  public n a = null;
  public Map b = null;
  
  public void a(c paramc)
  {
    Object localObject = b;
    if (localObject != null)
    {
      Iterator localIterator = ((Map)localObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        paramc.a((b)((Map.Entry)localObject).getKey(), (u)((Map.Entry)localObject).getValue());
      }
    }
  }
  
  public void b(final k paramk, final d paramd)
  {
    n localn = a;
    if (localn != null) {
      paramd.a(paramk, localn);
    } else {
      a(new b(paramk, paramd));
    }
  }
  
  public boolean c(final k paramk)
  {
    if (paramk.isEmpty())
    {
      a = null;
      b = null;
      return true;
    }
    Object localObject = a;
    if (localObject != null)
    {
      if (((n)localObject).B()) {
        return false;
      }
      localObject = (c)a;
      a = null;
      ((c)localObject).M(new a(paramk));
      return c(paramk);
    }
    if (b != null)
    {
      localObject = paramk.Z();
      paramk = paramk.c0();
      if ((b.containsKey(localObject)) && (((u)b.get(localObject)).c(paramk))) {
        b.remove(localObject);
      }
      if (b.isEmpty())
      {
        b = null;
        return true;
      }
      return false;
    }
    return true;
  }
  
  public void d(k paramk, n paramn)
  {
    if (paramk.isEmpty())
    {
      a = paramn;
      b = null;
    }
    else
    {
      Object localObject = a;
      if (localObject != null)
      {
        a = ((n)localObject).y(paramk, paramn);
      }
      else
      {
        if (b == null) {
          b = new HashMap();
        }
        localObject = paramk.Z();
        if (!b.containsKey(localObject)) {
          b.put(localObject, new u());
        }
        ((u)b.get(localObject)).d(paramk.c0(), paramn);
      }
    }
  }
  
  public class a
    extends c.c
  {
    public a(k paramk) {}
    
    public void b(b paramb, n paramn)
    {
      d(paramk.U(paramb), paramn);
    }
  }
  
  public class b
    implements u.c
  {
    public b(k paramk, u.d paramd) {}
    
    public void a(b paramb, u paramu)
    {
      paramu.b(paramk.U(paramb), paramd);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(b paramb, u paramu);
  }
  
  public static abstract interface d
  {
    public abstract void a(k paramk, n paramn);
  }
}

/* Location:
 * Qualified Name:     V3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */