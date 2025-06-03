package z0;

import X2.B;
import X2.v;
import c1.e;
import java.util.ArrayList;
import java.util.List;

public final class f
  implements a
{
  public final ArrayList a = new ArrayList();
  
  public v a(long paramLong)
  {
    int i = f(paramLong);
    if (i == 0) {
      return v.Y();
    }
    Object localObject = (e)a.get(i - 1);
    long l = d;
    if ((l != -9223372036854775807L) && (paramLong >= l)) {
      localObject = v.Y();
    } else {
      localObject = a;
    }
    return (v)localObject;
  }
  
  public long b(long paramLong)
  {
    boolean bool = a.isEmpty();
    long l1 = Long.MIN_VALUE;
    if (bool) {
      return Long.MIN_VALUE;
    }
    if (paramLong < a.get(0)).b) {
      return a.get(0)).b;
    }
    for (int i = 1; i < a.size(); i++)
    {
      e locale = (e)a.get(i);
      if (paramLong < b)
      {
        l2 = a.get(i - 1)).d;
        if ((l2 != -9223372036854775807L) && (l2 > paramLong) && (l2 < b)) {
          paramLong = l2;
        } else {
          paramLong = b;
        }
        return paramLong;
      }
    }
    long l3 = da)).d;
    long l2 = l1;
    if (l3 != -9223372036854775807L)
    {
      l2 = l1;
      if (paramLong < l3) {
        l2 = l3;
      }
    }
    return l2;
  }
  
  public boolean c(e parame, long paramLong)
  {
    if (b != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    if (b <= paramLong)
    {
      long l = d;
      if ((l == -9223372036854775807L) || (paramLong < l))
      {
        bool = true;
        break label65;
      }
    }
    boolean bool = false;
    label65:
    for (int i = a.size() - 1; i >= 0; i--)
    {
      if (b >= a.get(i)).b)
      {
        a.add(i + 1, parame);
        return bool;
      }
      if (a.get(i)).b <= paramLong) {
        bool = false;
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
    if ((!a.isEmpty()) && (paramLong >= a.get(0)).b))
    {
      long l1;
      for (int i = 1; i < a.size(); i++)
      {
        l1 = a.get(i)).b;
        boolean bool = paramLong < l1;
        if (!bool) {
          return l1;
        }
        if (bool)
        {
          locale = (e)a.get(i - 1);
          l1 = d;
          if ((l1 != -9223372036854775807L) && (l1 <= paramLong)) {
            paramLong = l1;
          } else {
            paramLong = b;
          }
          return paramLong;
        }
      }
      e locale = (e)B.d(a);
      long l2 = d;
      if (l2 != -9223372036854775807L)
      {
        l1 = l2;
        if (paramLong >= l2) {}
      }
      else
      {
        l1 = b;
      }
      return l1;
    }
    return -9223372036854775807L;
  }
  
  public void e(long paramLong)
  {
    int i = f(paramLong);
    if (i > 0) {
      a.subList(0, i).clear();
    }
  }
  
  public final int f(long paramLong)
  {
    for (int i = 0; i < a.size(); i++) {
      if (paramLong < a.get(i)).b) {
        return i;
      }
    }
    return a.size();
  }
}

/* Location:
 * Qualified Name:     z0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */