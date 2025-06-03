package g9;

import android.util.Pair;
import f;
import j9.i;
import j9.k.c;
import j9.o;
import j9.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.d0;
import q0.g;

public final class k0
{
  public String a;
  public final List<e0> b;
  public final List<m> c;
  public final o d;
  public final String e;
  public final long f;
  public final e g;
  public final e h;
  
  public k0(o paramo, String paramString, List<m> paramList, List<e0> paramList1, long paramLong, e parame1, e parame2)
  {
    d = paramo;
    e = paramString;
    b = paramList1;
    c = paramList;
    f = paramLong;
    g = parame1;
    h = parame2;
  }
  
  public final Pair<d0, Boolean> a(k.c paramc, e parame)
  {
    Object localObject1 = s.c;
    Iterator localIterator = d(paramc.f()).iterator();
    int i = 1;
    boolean bool1 = true;
    int j;
    for (;;)
    {
      bool2 = localIterator.hasNext();
      j = -1;
      if (!bool2) {
        break;
      }
      l locall = (l)localIterator.next();
      d0 locald0 = s.c;
      int k = a.ordinal();
      if ((k != 0) && (k != 1))
      {
        if (k != 2)
        {
          localObject2 = locald0;
          if (k == 3) {
            break label340;
          }
          if (k != 4)
          {
            if ((k != 5) && (k != 8))
            {
              localObject2 = locald0;
              break label340;
            }
          }
          else
          {
            localObject2 = b;
            bool2 = false;
            break label343;
          }
        }
        localObject2 = b;
      }
      else
      {
        localObject2 = b;
        switch (g.c(((d0)localObject2).c0()))
        {
        default: 
          paramc = f.l("Unknown value type: ");
          paramc.append(f.s(((d0)localObject2).c0()));
          throw new IllegalArgumentException(paramc.toString());
        case 10: 
          if (s.l((d0)localObject2)) {
            localObject2 = s.g;
          } else {
            localObject2 = s.p;
          }
          break;
        case 9: 
          localObject2 = s.o;
          break;
        case 8: 
          localObject2 = s.n;
          break;
        case 7: 
          localObject2 = s.m;
          break;
        case 6: 
          localObject2 = s.l;
          break;
        case 5: 
          localObject2 = s.k;
          break;
        case 4: 
          localObject2 = s.j;
          break;
        case 2: 
        case 3: 
          localObject2 = s.i;
          break;
        case 1: 
          localObject2 = s.h;
          break;
        case 0: 
          localObject2 = s.b;
        }
      }
      label340:
      bool2 = true;
      label343:
      k = s.c((d0)localObject1, (d0)localObject2);
      if (k != 0) {
        j = k;
      } else if ((!bool1) || (bool2)) {
        if ((!bool1) && (bool2)) {
          j = 1;
        } else {
          j = 0;
        }
      }
      if (j < 0)
      {
        bool1 = bool2;
        localObject1 = localObject2;
      }
    }
    Object localObject2 = localObject1;
    boolean bool2 = bool1;
    if (parame != null) {
      for (j = 0;; j++)
      {
        localObject2 = localObject1;
        bool2 = bool1;
        if (j >= b.size()) {
          break;
        }
        if (b.get(j)).b.equals(paramc.f()))
        {
          paramc = (d0)b.get(j);
          bool2 = a;
          j = s.c((d0)localObject1, paramc);
          if (j == 0) {
            if ((bool1) && (!bool2)) {
              j = -1;
            } else if ((!bool1) && (bool2)) {
              j = i;
            } else {
              j = 0;
            }
          }
          localObject2 = localObject1;
          bool2 = bool1;
          if (j >= 0) {
            break;
          }
          bool2 = a;
          localObject2 = paramc;
          break;
        }
      }
    }
    return new Pair(localObject2, Boolean.valueOf(bool2));
  }
  
  public final String b()
  {
    Object localObject1 = a;
    if (localObject1 != null) {
      return (String)localObject1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(d.h());
    if (e != null)
    {
      localStringBuilder.append("|cg:");
      localStringBuilder.append(e);
    }
    localStringBuilder.append("|f:");
    localObject1 = c.iterator();
    while (((Iterator)localObject1).hasNext()) {
      localStringBuilder.append(((m)((Iterator)localObject1).next()).a());
    }
    localStringBuilder.append("|ob:");
    Object localObject2 = b.iterator();
    int i;
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      i = 1;
      if (!bool) {
        break;
      }
      localObject1 = (e0)((Iterator)localObject2).next();
      localStringBuilder.append(b.h());
      if (g.b(a, 1)) {
        localObject1 = "asc";
      } else {
        localObject1 = "desc";
      }
      localStringBuilder.append((String)localObject1);
    }
    if (f == -1L) {
      i = 0;
    }
    if (i != 0)
    {
      localStringBuilder.append("|l:");
      localStringBuilder.append(f);
    }
    localObject1 = g;
    localObject2 = "b:";
    if (localObject1 != null)
    {
      localStringBuilder.append("|lb:");
      if (g.a) {
        localObject1 = "b:";
      } else {
        localObject1 = "a:";
      }
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(g.b());
    }
    if (h != null)
    {
      localStringBuilder.append("|ub:");
      localObject1 = localObject2;
      if (h.a) {
        localObject1 = "a:";
      }
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(h.b());
    }
    localObject1 = localStringBuilder.toString();
    a = ((String)localObject1);
    return (String)localObject1;
  }
  
  public final Pair<d0, Boolean> c(k.c paramc, e parame)
  {
    Object localObject1 = s.e;
    Iterator localIterator = d(paramc.f()).iterator();
    int i = 1;
    boolean bool1 = true;
    int j;
    for (;;)
    {
      bool2 = localIterator.hasNext();
      j = -1;
      if (!bool2) {
        break;
      }
      Object localObject2 = (l)localIterator.next();
      d0 locald0 = s.e;
      int k = a.ordinal();
      if (k != 0)
      {
        if ((k != 1) && (k != 2))
        {
          localObject3 = locald0;
          if (k == 3) {
            break label322;
          }
          if ((k != 4) && (k != 5))
          {
            if (k != 8)
            {
              localObject3 = locald0;
              break label322;
            }
          }
          else
          {
            localObject2 = b;
            switch (g.c(((d0)localObject2).c0()))
            {
            default: 
              paramc = f.l("Unknown value type: ");
              paramc.append(f.s(((d0)localObject2).c0()));
              throw new IllegalArgumentException(paramc.toString());
            case 10: 
              localObject3 = locald0;
              if (!s.l((d0)localObject2)) {
                break;
              }
              localObject3 = s.p;
              break;
            case 9: 
              localObject3 = s.g;
              break;
            case 8: 
              localObject3 = s.o;
              break;
            case 7: 
              localObject3 = s.n;
              break;
            case 6: 
              localObject3 = s.m;
              break;
            case 5: 
              localObject3 = s.l;
              break;
            case 4: 
              localObject3 = s.k;
              break;
            case 2: 
            case 3: 
              localObject3 = s.j;
              break;
            case 1: 
              localObject3 = s.i;
              break;
            case 0: 
              localObject3 = s.h;
              break;
            }
          }
        }
        localObject3 = b;
        label322:
        bool2 = true;
        break label338;
      }
      else
      {
        localObject3 = b;
      }
      bool2 = false;
      label338:
      k = s.c((d0)localObject1, (d0)localObject3);
      if (k != 0) {
        j = k;
      } else if ((bool1) && (!bool2)) {
        j = 1;
      } else if ((bool1) || (!bool2)) {
        j = 0;
      }
      if (j > 0)
      {
        bool1 = bool2;
        localObject1 = localObject3;
      }
    }
    Object localObject3 = localObject1;
    boolean bool2 = bool1;
    if (parame != null) {
      for (j = 0;; j++)
      {
        localObject3 = localObject1;
        bool2 = bool1;
        if (j >= b.size()) {
          break;
        }
        if (b.get(j)).b.equals(paramc.f()))
        {
          paramc = (d0)b.get(j);
          bool2 = a;
          j = s.c((d0)localObject1, paramc);
          if (j == 0) {
            if ((bool1) && (!bool2)) {
              j = i;
            } else if ((!bool1) && (bool2)) {
              j = -1;
            } else {
              j = 0;
            }
          }
          localObject3 = localObject1;
          bool2 = bool1;
          if (j <= 0) {
            break;
          }
          bool2 = a;
          localObject3 = paramc;
          break;
        }
      }
    }
    return new Pair(localObject3, Boolean.valueOf(bool2));
  }
  
  public final ArrayList d(j9.l paraml)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (m)localIterator.next();
      if ((localObject instanceof l))
      {
        localObject = (l)localObject;
        if (c.equals(paraml)) {
          localArrayList.add(localObject);
        }
      }
    }
    return localArrayList;
  }
  
  public final boolean e()
  {
    boolean bool;
    if ((i.l(d)) && (e == null) && (c.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (k0.class == paramObject.getClass()))
    {
      paramObject = (k0)paramObject;
      Object localObject = e;
      if (localObject != null ? !((String)localObject).equals(e) : e != null) {
        return false;
      }
      if (f != f) {
        return false;
      }
      if (!b.equals(b)) {
        return false;
      }
      if (!c.equals(c)) {
        return false;
      }
      if (!d.equals(d)) {
        return false;
      }
      localObject = g;
      if (localObject != null ? !((e)localObject).equals(g) : g != null) {
        return false;
      }
      localObject = h;
      paramObject = h;
      if (localObject != null) {
        bool = ((e)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = b.hashCode();
    Object localObject = e;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    int m = c.hashCode();
    int n = d.hashCode();
    long l = f;
    int i1 = (int)(l ^ l >>> 32);
    localObject = g;
    int i2;
    if (localObject != null) {
      i2 = ((e)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = h;
    if (localObject != null) {
      j = ((e)localObject).hashCode();
    }
    return (((n + (m + (i * 31 + k) * 31) * 31) * 31 + i1) * 31 + i2) * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Query(");
    localStringBuilder.append(d.h());
    if (e != null)
    {
      localStringBuilder.append(" collectionGroup=");
      localStringBuilder.append(e);
    }
    boolean bool = c.isEmpty();
    int i = 0;
    int j;
    if (!bool)
    {
      localStringBuilder.append(" where ");
      for (j = 0; j < c.size(); j++)
      {
        if (j > 0) {
          localStringBuilder.append(" and ");
        }
        localStringBuilder.append(c.get(j));
      }
    }
    if (!b.isEmpty())
    {
      localStringBuilder.append(" order by ");
      for (j = i; j < b.size(); j++)
      {
        if (j > 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(b.get(j));
      }
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g9.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */