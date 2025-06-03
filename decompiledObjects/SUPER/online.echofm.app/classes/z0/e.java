package z0;

import X2.P;
import X2.v;
import X2.v.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class e
  implements a
{
  public static final P b = P.d().f(new c()).a(P.d().g().f(new d()));
  public final List a = new ArrayList();
  
  public v a(long paramLong)
  {
    if (!a.isEmpty())
    {
      Object localObject1 = a;
      int i = 0;
      if (paramLong >= get0b)
      {
        localObject1 = new ArrayList();
        for (int j = 0; j < a.size(); j++)
        {
          localObject2 = (c1.e)a.get(j);
          if ((paramLong >= b) && (paramLong < d)) {
            ((List)localObject1).add(localObject2);
          }
          if (paramLong < b) {
            break;
          }
        }
        Object localObject2 = v.g0(b, (Iterable)localObject1);
        localObject1 = v.M();
        for (j = i; j < ((AbstractCollection)localObject2).size(); j++) {
          ((v.a)localObject1).j(geta);
        }
        return ((v.a)localObject1).k();
      }
    }
    return v.Y();
  }
  
  public long b(long paramLong)
  {
    int i = 0;
    long l2;
    for (long l1 = -9223372036854775807L;; l1 = l2)
    {
      l2 = l1;
      if (i >= a.size()) {
        break;
      }
      l2 = a.get(i)).b;
      long l3 = a.get(i)).d;
      if (paramLong < l2)
      {
        if (l1 == -9223372036854775807L) {
          break;
        }
        l2 = Math.min(l1, l2);
        break;
      }
      l2 = l1;
      if (paramLong < l3) {
        if (l1 == -9223372036854775807L) {
          l2 = l3;
        } else {
          l2 = Math.min(l1, l3);
        }
      }
      i++;
    }
    if (l2 == -9223372036854775807L) {
      l2 = Long.MIN_VALUE;
    }
    return l2;
  }
  
  public boolean c(c1.e parame, long paramLong)
  {
    boolean bool;
    if (b != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    if (c != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    if ((b <= paramLong) && (paramLong < d)) {
      bool = true;
    } else {
      bool = false;
    }
    for (int i = a.size() - 1; i >= 0; i--) {
      if (b >= a.get(i)).b)
      {
        a.add(i + 1, parame);
        return bool;
      }
    }
    a.add(0, parame);
    return bool;
  }
  
  public void clear()
  {
    a.clear();
  }
  
  public long d(long paramLong)
  {
    if (!a.isEmpty())
    {
      List localList = a;
      int i = 0;
      if (paramLong >= get0b)
      {
        long l1 = a.get(0)).b;
        while (i < a.size())
        {
          long l2 = a.get(i)).b;
          long l3 = a.get(i)).d;
          if (l3 <= paramLong)
          {
            l1 = Math.max(l1, l3);
          }
          else
          {
            if (l2 > paramLong) {
              break;
            }
            l1 = Math.max(l1, l2);
          }
          i++;
        }
        return l1;
      }
    }
    return -9223372036854775807L;
  }
  
  public void e(long paramLong)
  {
    for (int i = 0; i < a.size(); i++)
    {
      boolean bool = paramLong < a.get(i)).b;
      if ((bool) && (paramLong > a.get(i)).d))
      {
        a.remove(i);
        i--;
      }
      else
      {
        if (bool) {
          break;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     z0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */