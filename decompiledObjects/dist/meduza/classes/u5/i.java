package u5;

import a0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import x6.b;

public final class i
{
  public final int a;
  public final String b;
  public final TreeSet<r> c;
  public final ArrayList<a> d;
  public m e;
  
  public i(int paramInt, String paramString, m paramm)
  {
    a = paramInt;
    b = paramString;
    e = paramm;
    c = new TreeSet();
    d = new ArrayList();
  }
  
  public final long a(long paramLong1, long paramLong2)
  {
    int i = 0;
    if (paramLong1 >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    if (paramLong2 >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    r localr = b(paramLong1, paramLong2);
    boolean bool = d;
    long l1 = Long.MAX_VALUE;
    if ((bool ^ true))
    {
      paramLong1 = c;
      if (paramLong1 == -1L) {
        i = 1;
      }
      if (i != 0) {
        paramLong1 = l1;
      }
      return -Math.min(paramLong1, paramLong2);
    }
    long l2 = paramLong1 + paramLong2;
    if (l2 >= 0L) {
      l1 = l2;
    }
    l2 = b + c;
    long l3 = l2;
    if (l2 < l1)
    {
      Iterator localIterator = c.tailSet(localr, false).iterator();
      do
      {
        l3 = l2;
        if (!localIterator.hasNext()) {
          break;
        }
        localr = (r)localIterator.next();
        l3 = b;
        if (l3 > l2)
        {
          l3 = l2;
          break;
        }
        l3 = Math.max(l2, l3 + c);
        l2 = l3;
      } while (l3 < l1);
    }
    return Math.min(l3 - paramLong1, paramLong2);
  }
  
  public final r b(long paramLong1, long paramLong2)
  {
    r localr1 = new r(b, paramLong1, -1L, -9223372036854775807L, null);
    r localr2 = (r)c.floor(localr1);
    if ((localr2 != null) && (b + c > paramLong1)) {
      return localr2;
    }
    localr1 = (r)c.ceiling(localr1);
    long l = paramLong2;
    if (localr1 != null)
    {
      l = b - paramLong1;
      if (paramLong2 == -1L) {
        paramLong2 = l;
      } else {
        l = Math.min(l, paramLong2);
      }
    }
    else
    {
      paramLong2 = l;
    }
    return new r(b, paramLong1, paramLong2, -9223372036854775807L, null);
  }
  
  public final boolean c(long paramLong1, long paramLong2)
  {
    for (int i = 0; i < d.size(); i++)
    {
      a locala = (a)d.get(i);
      long l1 = b;
      if (l1 == -1L) {
        if (paramLong1 < a) {}
      }
      int j;
      for (;;)
      {
        j = 1;
        break;
        long l2;
        do
        {
          do
          {
            j = 0;
            break;
          } while (paramLong2 == -1L);
          l2 = a;
        } while ((l2 > paramLong1) || (paramLong1 + paramLong2 > l2 + l1));
      }
      if (j != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      if ((a != a) || (!b.equals(b)) || (!c.equals(c)) || (!e.equals(e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    i = j.e(b, i * 31, 31);
    return e.hashCode() + i;
  }
  
  public static final class a
  {
    public final long a;
    public final long b;
    
    public a(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
  }
}

/* Location:
 * Qualified Name:     u5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */