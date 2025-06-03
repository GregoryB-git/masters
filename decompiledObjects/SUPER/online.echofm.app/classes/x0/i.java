package x0;

import X2.v;
import X2.v.a;
import g0.a;
import java.util.AbstractCollection;
import java.util.List;
import k0.y0;

public final class i
  implements S
{
  public final v o;
  public long p;
  
  public i(List paramList1, List paramList2)
  {
    v.a locala = v.M();
    int i = paramList1.size();
    int j = paramList2.size();
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    while (k < paramList1.size())
    {
      locala.h(new a((S)paramList1.get(k), (List)paramList2.get(k)));
      k++;
    }
    o = locala.k();
    p = -9223372036854775807L;
  }
  
  public boolean b()
  {
    for (int i = 0; i < o.size(); i++) {
      if (((a)o.get(i)).b()) {
        return true;
      }
    }
    return false;
  }
  
  public long c()
  {
    int i = 0;
    for (long l1 = Long.MAX_VALUE; i < o.size(); l1 = l3)
    {
      long l2 = ((a)o.get(i)).c();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      i++;
    }
    long l3 = l1;
    if (l1 == Long.MAX_VALUE) {
      l3 = Long.MIN_VALUE;
    }
    return l3;
  }
  
  public long f()
  {
    int i = 0;
    long l1 = Long.MAX_VALUE;
    long l4;
    long l5;
    for (long l2 = l1; i < o.size(); l2 = l5)
    {
      a locala = (a)o.get(i);
      long l3 = locala.f();
      if ((!locala.a().contains(Integer.valueOf(1))) && (!locala.a().contains(Integer.valueOf(2))))
      {
        l4 = l1;
        if (!locala.a().contains(Integer.valueOf(4))) {}
      }
      else
      {
        l4 = l1;
        if (l3 != Long.MIN_VALUE) {
          l4 = Math.min(l1, l3);
        }
      }
      l5 = l2;
      if (l3 != Long.MIN_VALUE) {
        l5 = Math.min(l2, l3);
      }
      i++;
      l1 = l4;
    }
    if (l1 != Long.MAX_VALUE)
    {
      p = l1;
      return l1;
    }
    if (l2 != Long.MAX_VALUE)
    {
      l4 = p;
      if (l4 != -9223372036854775807L) {
        l2 = l4;
      }
      return l2;
    }
    return Long.MIN_VALUE;
  }
  
  public boolean g(y0 paramy0)
  {
    int i = 0;
    int k;
    int i2;
    do
    {
      long l1 = c();
      if (l1 == Long.MIN_VALUE) {
        break;
      }
      int j = 0;
      int i1;
      for (k = j; j < o.size(); k = i1)
      {
        long l2 = ((a)o.get(j)).c();
        int m;
        if ((l2 != Long.MIN_VALUE) && (l2 <= a)) {
          m = 1;
        } else {
          m = 0;
        }
        if (l2 != l1)
        {
          int n = k;
          if (m == 0) {}
        }
        else
        {
          i1 = k | ((a)o.get(j)).g(paramy0);
        }
        j++;
      }
      i2 = i | k;
      i = i2;
    } while (k != 0);
    i = i2;
    return i;
  }
  
  public void h(long paramLong)
  {
    for (int i = 0; i < o.size(); i++) {
      ((a)o.get(i)).h(paramLong);
    }
  }
  
  public static final class a
    implements S
  {
    public final S o;
    public final v p;
    
    public a(S paramS, List paramList)
    {
      o = paramS;
      p = v.U(paramList);
    }
    
    public v a()
    {
      return p;
    }
    
    public boolean b()
    {
      return o.b();
    }
    
    public long c()
    {
      return o.c();
    }
    
    public long f()
    {
      return o.f();
    }
    
    public boolean g(y0 paramy0)
    {
      return o.g(paramy0);
    }
    
    public void h(long paramLong)
    {
      o.h(paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     x0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */