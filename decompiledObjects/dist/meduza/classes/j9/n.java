package j9;

import f;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import k9.d;
import ka.d0;
import ka.d0.a;
import ka.u;
import ka.u.a;
import ma.m0;
import ma.w;
import ma.w.a;
import x6.b;

public final class n
  implements Cloneable
{
  public d0 a;
  public final HashMap b = new HashMap();
  
  public n()
  {
    this((d0)locala.k());
  }
  
  public n(d0 paramd0)
  {
    boolean bool;
    if (paramd0.c0() == 11) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("ObjectValues should be backed by a MapValue", bool, new Object[0]);
    b.Z("ServerTimestamps should not be used as an ObjectValue", p.c(paramd0) ^ true, new Object[0]);
    a = paramd0;
  }
  
  public static d c(u paramu)
  {
    HashSet localHashSet = new HashSet();
    paramu = paramu.J().entrySet().iterator();
    while (paramu.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramu.next();
      l locall = new l(Collections.singletonList((String)localEntry.getKey()));
      d0 locald0 = (d0)localEntry.getValue();
      Object localObject = s.a;
      int i;
      if ((locald0 != null) && (locald0.c0() == 11)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localObject = cgetValueYa;
        if (!((Set)localObject).isEmpty())
        {
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            localHashSet.add((l)locall.f((l)((Iterator)localObject).next()));
          }
          continue;
        }
      }
      localHashSet.add(locall);
    }
    return new d(localHashSet);
  }
  
  public static d0 d(l paraml, d0 paramd0)
  {
    if (paraml.o()) {
      return paramd0;
    }
    for (int i = 0;; i++)
    {
      int j = paraml.q();
      paramd0 = paramd0.Y();
      if (i >= j - 1) {
        break;
      }
      paramd0 = paramd0.K(paraml.n(i));
      d0 locald0 = s.a;
      if ((paramd0 != null) && (paramd0.c0() == 11)) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0) {
        return null;
      }
    }
    return paramd0.K(paraml.m());
  }
  
  public static n e(Map<String, d0> paramMap)
  {
    d0.a locala = d0.d0();
    u.a locala1 = u.M();
    locala1.m();
    u.G((u)b).putAll(paramMap);
    locala.t(locala1);
    return new n((d0)locala.k());
  }
  
  public final u a(l paraml, Map<String, Object> paramMap)
  {
    Object localObject1 = d(paraml, a);
    Object localObject2 = s.a;
    if ((localObject1 != null) && (((d0)localObject1).c0() == 11)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject1 = (u.a)((d0)localObject1).Y().E();
    } else {
      localObject1 = u.M();
    }
    localObject2 = paramMap.entrySet().iterator();
    int i = 0;
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
      paramMap = (String)((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      if ((localObject3 instanceof Map))
      {
        localObject3 = a((l)paraml.g(paramMap), (Map)localObject3);
        if (localObject3 == null) {
          continue;
        }
        d0.a locala = d0.d0();
        locala.u((u)localObject3);
        ((u.a)localObject1).p((d0)locala.k(), paramMap);
      }
      else if ((localObject3 instanceof d0))
      {
        ((u.a)localObject1).p((d0)localObject3, paramMap);
      }
      else
      {
        localObject1.getClass();
        paramMap.getClass();
        if (!((u)b).J().containsKey(paramMap)) {
          continue;
        }
        boolean bool;
        if (localObject3 == null) {
          bool = true;
        } else {
          bool = false;
        }
        b.Z("Expected entry to be a Map, a Value or null", bool, new Object[0]);
        ((w.a)localObject1).m();
        u.G((u)b).remove(paramMap);
      }
      i = 1;
    }
    if (i != 0) {
      paraml = (u)((w.a)localObject1).k();
    } else {
      paraml = null;
    }
    return paraml;
  }
  
  public final d0 b()
  {
    synchronized (b)
    {
      u localu = a(l.c, b);
      if (localu != null)
      {
        d0.a locala = d0.d0();
        locala.u(localu);
        a = ((d0)locala.k());
        b.clear();
      }
      return a;
    }
  }
  
  public final Object clone()
  {
    return new n(b());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof n)) {
      return s.g(b(), ((n)paramObject).b());
    }
    return false;
  }
  
  public final void f(l paraml, d0 paramd0)
  {
    b.Z("Cannot set field for empty path on ObjectValue", paraml.o() ^ true, new Object[0]);
    h(paraml, paramd0);
  }
  
  public final void g(HashMap paramHashMap)
  {
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramHashMap = (Map.Entry)localIterator.next();
      l locall = (l)paramHashMap.getKey();
      if (paramHashMap.getValue() == null)
      {
        b.Z("Cannot delete field for empty path on ObjectValue", locall.o() ^ true, new Object[0]);
        h(locall, null);
      }
      else
      {
        f(locall, (d0)paramHashMap.getValue());
      }
    }
  }
  
  public final void h(l paraml, d0 paramd0)
  {
    Object localObject1 = b;
    for (int i = 0; i < paraml.q() - 1; i++)
    {
      String str = paraml.n(i);
      Object localObject2 = ((Map)localObject1).get(str);
      if ((localObject2 instanceof Map))
      {
        localObject1 = (Map)localObject2;
      }
      else
      {
        if ((localObject2 instanceof d0))
        {
          localObject2 = (d0)localObject2;
          if (((d0)localObject2).c0() == 11)
          {
            localObject2 = new HashMap(((d0)localObject2).Y().J());
            ((Map)localObject1).put(str, localObject2);
            localObject1 = localObject2;
            continue;
          }
        }
        localObject2 = new HashMap();
        ((Map)localObject1).put(str, localObject2);
        localObject1 = localObject2;
      }
    }
    ((Map)localObject1).put(paraml.m(), paramd0);
  }
  
  public final int hashCode()
  {
    return b().hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ObjectValue{internalValue=");
    localStringBuilder.append(s.a(b()));
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j9.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */