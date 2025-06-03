package V3;

import S3.c;
import Y3.d;
import Y3.d.c;
import d4.n;
import d4.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements Iterable
{
  public static final b p = new b(new d(null));
  public final d o;
  
  public b(d paramd)
  {
    o = paramd;
  }
  
  public static b D(Map paramMap)
  {
    Object localObject = d.d();
    Iterator localIterator = paramMap.entrySet().iterator();
    d locald;
    for (paramMap = (Map)localObject; localIterator.hasNext(); paramMap = paramMap.X((k)((Map.Entry)localObject).getKey(), locald))
    {
      localObject = (Map.Entry)localIterator.next();
      locald = new d((n)((Map.Entry)localObject).getValue());
    }
    return new b(paramMap);
  }
  
  public static b M(Map paramMap)
  {
    d locald = d.d();
    Iterator localIterator = paramMap.entrySet().iterator();
    Map.Entry localEntry;
    for (paramMap = locald; localIterator.hasNext(); paramMap = paramMap.X(new k((String)localEntry.getKey()), locald))
    {
      localEntry = (Map.Entry)localIterator.next();
      locald = new d(o.a(localEntry.getValue()));
    }
    return new b(paramMap);
  }
  
  public static b s()
  {
    return p;
  }
  
  public List S()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    Object localObject2;
    if (o.getValue() != null)
    {
      localObject1 = ((n)o.getValue()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (d4.m)((Iterator)localObject1).next();
        localArrayList.add(new d4.m(((d4.m)localObject2).c(), ((d4.m)localObject2).d()));
      }
    }
    Iterator localIterator = o.M().iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = (d)((Map.Entry)localObject1).getValue();
      if (((d)localObject2).getValue() != null) {
        localArrayList.add(new d4.m((d4.b)((Map.Entry)localObject1).getKey(), (n)((d)localObject2).getValue()));
      }
    }
    return localArrayList;
  }
  
  public n T(k paramk)
  {
    k localk = o.g(paramk);
    if (localk != null) {
      return ((n)o.s(localk)).A(k.b0(localk, paramk));
    }
    return null;
  }
  
  public Map U(final boolean paramBoolean)
  {
    final HashMap localHashMap = new HashMap();
    o.q(new b(localHashMap, paramBoolean));
    return localHashMap;
  }
  
  public boolean V(k paramk)
  {
    boolean bool;
    if (T(paramk) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public b W(k paramk)
  {
    if (paramk.isEmpty()) {
      return p;
    }
    return new b(o.X(paramk, d.d()));
  }
  
  public n X()
  {
    return (n)o.getValue();
  }
  
  public b a(k paramk, n paramn)
  {
    if (paramk.isEmpty()) {
      return new b(new d(paramn));
    }
    k localk1 = o.g(paramk);
    if (localk1 != null)
    {
      k localk2 = k.b0(localk1, paramk);
      n localn = (n)o.s(localk1);
      paramk = localk2.X();
      if ((paramk != null) && (paramk.s()) && (localn.A(localk2.a0()).isEmpty())) {
        return this;
      }
      paramk = localn.y(localk2, paramn);
      return new b(o.W(localk1, paramk));
    }
    paramn = new d(paramn);
    return new b(o.X(paramk, paramn));
  }
  
  public b d(d4.b paramb, n paramn)
  {
    return a(new k(new d4.b[] { paramb }), paramn);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == b.class)) {
      return ((b)paramObject).U(true).equals(U(true));
    }
    return false;
  }
  
  public b f(final k paramk, b paramb)
  {
    return (b)o.k(this, new a(paramk));
  }
  
  public n g(n paramn)
  {
    return i(k.Y(), o, paramn);
  }
  
  public int hashCode()
  {
    return U(true).hashCode();
  }
  
  public final n i(k paramk, d paramd, n paramn)
  {
    if (paramd.getValue() != null) {
      return paramn.y(paramk, (n)paramd.getValue());
    }
    Object localObject1 = paramd.M().iterator();
    paramd = null;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      d locald = (d)((Map.Entry)localObject2).getValue();
      localObject2 = (d4.b)((Map.Entry)localObject2).getKey();
      if (((d4.b)localObject2).s())
      {
        boolean bool;
        if (locald.getValue() != null) {
          bool = true;
        } else {
          bool = false;
        }
        Y3.m.g(bool, "Priority writes must always be leaf nodes");
        paramd = (n)locald.getValue();
      }
      else
      {
        paramn = i(paramk.U((d4.b)localObject2), locald, paramn);
      }
    }
    localObject1 = paramn;
    if (!paramn.A(paramk).isEmpty())
    {
      localObject1 = paramn;
      if (paramd != null) {
        localObject1 = paramn.y(paramk.U(d4.b.o()), paramd);
      }
    }
    return (n)localObject1;
  }
  
  public boolean isEmpty()
  {
    return o.isEmpty();
  }
  
  public Iterator iterator()
  {
    return o.iterator();
  }
  
  public b k(k paramk)
  {
    if (paramk.isEmpty()) {
      return this;
    }
    n localn = T(paramk);
    if (localn != null) {
      return new b(new d(localn));
    }
    return new b(o.Y(paramk));
  }
  
  public Map q()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = o.M().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put((d4.b)localEntry.getKey(), new b((d)localEntry.getValue()));
    }
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CompoundWrite{");
    localStringBuilder.append(U(true).toString());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public class a
    implements d.c
  {
    public a(k paramk) {}
    
    public b b(k paramk, n paramn, b paramb)
    {
      return paramb.a(paramk.T(paramk), paramn);
    }
  }
  
  public class b
    implements d.c
  {
    public b(Map paramMap, boolean paramBoolean) {}
    
    public Void b(k paramk, n paramn, Void paramVoid)
    {
      localHashMap.put(paramk.d0(), paramn.L(paramBoolean));
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     V3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */