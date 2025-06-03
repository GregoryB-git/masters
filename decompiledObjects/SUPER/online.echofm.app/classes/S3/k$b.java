package S3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k$b
{
  public final List a;
  public final Map b;
  public final c.a.a c;
  public j d;
  public j e;
  
  public k$b(List paramList, Map paramMap, c.a.a parama)
  {
    a = paramList;
    b = paramMap;
    c = parama;
  }
  
  public static k b(List paramList, Map paramMap, c.a.a parama, Comparator paramComparator)
  {
    parama = new b(paramList, paramMap, parama);
    Collections.sort(paramList, paramComparator);
    paramMap = new a(paramList.size()).iterator();
    int i = paramList.size();
    while (paramMap.hasNext())
    {
      paramList = (b)paramMap.next();
      int j = b;
      i -= j;
      if (a)
      {
        parama.c(h.a.p, j, i);
      }
      else
      {
        parama.c(h.a.p, j, i);
        j = b;
        i -= j;
        parama.c(h.a.o, j, i);
      }
    }
    paramMap = d;
    paramList = paramMap;
    if (paramMap == null) {
      paramList = g.j();
    }
    return new k(paramList, paramComparator, null);
  }
  
  public final h a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return g.j();
    }
    if (paramInt2 == 1)
    {
      localObject = a.get(paramInt1);
      return new f(localObject, d(localObject), null, null);
    }
    paramInt2 /= 2;
    int i = paramInt1 + paramInt2;
    h localh1 = a(paramInt1, paramInt2);
    h localh2 = a(i + 1, paramInt2);
    Object localObject = a.get(i);
    return new f(localObject, d(localObject), localh1, localh2);
  }
  
  public final void c(h.a parama, int paramInt1, int paramInt2)
  {
    h localh = a(paramInt2 + 1, paramInt1 - 1);
    Object localObject = a.get(paramInt2);
    if (parama == h.a.o) {
      parama = new i(localObject, d(localObject), null, localh);
    } else {
      parama = new f(localObject, d(localObject), null, localh);
    }
    if (d == null) {
      d = parama;
    }
    for (;;)
    {
      e = parama;
      break;
      e.u(parama);
    }
  }
  
  public final Object d(Object paramObject)
  {
    return b.get(c.a(paramObject));
  }
  
  public static class a
    implements Iterable
  {
    public long o;
    public final int p;
    
    public a(int paramInt)
    {
      int i = paramInt + 1;
      paramInt = (int)Math.floor(Math.log(i) / Math.log(2.0D));
      p = paramInt;
      o = (Math.pow(2.0D, paramInt) - 1L & i);
    }
    
    public Iterator iterator()
    {
      return new a();
    }
    
    public class a
      implements Iterator
    {
      public int o = k.b.a.a(k.b.a.this) - 1;
      
      public a() {}
      
      public k.b.b b()
      {
        long l1 = k.b.a.d(k.b.a.this);
        long l2 = 1 << o;
        k.b.b localb = new k.b.b();
        boolean bool;
        if ((l1 & l2) == 0L) {
          bool = true;
        } else {
          bool = false;
        }
        a = bool;
        b = ((int)Math.pow(2.0D, o));
        o -= 1;
        return localb;
      }
      
      public boolean hasNext()
      {
        boolean bool;
        if (o >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public void remove() {}
    }
  }
  
  public static class b
  {
    public boolean a;
    public int b;
  }
}

/* Location:
 * Qualified Name:     S3.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */