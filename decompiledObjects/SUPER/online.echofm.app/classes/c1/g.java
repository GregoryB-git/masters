package c1;

import X2.B;
import X2.P;
import X2.v;
import g0.M;
import g0.a;
import g0.o;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class g
  implements k
{
  public static final P q = P.d().f(new f());
  public final v o;
  public final long[] p;
  
  public g(List paramList)
  {
    long l1;
    if (paramList.size() == 1)
    {
      paramList = (e)B.g(paramList);
      l1 = f(b);
      if (c == -9223372036854775807L)
      {
        o = v.Z(a);
        p = new long[] { l1 };
      }
      else
      {
        o = v.a0(a, v.Y());
        p = new long[] { l1, c + l1 };
      }
      return;
    }
    Object localObject = new long[paramList.size() * 2];
    p = ((long[])localObject);
    Arrays.fill((long[])localObject, Long.MAX_VALUE);
    localObject = new ArrayList();
    paramList = v.g0(q, paramList);
    int j = 0;
    while (i < paramList.size())
    {
      e locale = (e)paramList.get(i);
      long l2 = f(b);
      l1 = c;
      if (j != 0)
      {
        long[] arrayOfLong = p;
        k = j - 1;
        long l3 = arrayOfLong[k];
        if (l3 >= l2)
        {
          if ((l3 == l2) && (((v)((ArrayList)localObject).get(k)).isEmpty())) {}
          for (;;)
          {
            ((ArrayList)localObject).set(k, a);
            k = j;
            break;
            o.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
            p[k] = l2;
          }
        }
      }
      p[j] = l2;
      ((ArrayList)localObject).add(a);
      int k = j + 1;
      j = k;
      if (c != -9223372036854775807L)
      {
        p[k] = (l1 + l2);
        ((ArrayList)localObject).add(v.Y());
        j = k + 1;
      }
      i++;
    }
    o = v.U((Collection)localObject);
  }
  
  public static long f(long paramLong)
  {
    long l = paramLong;
    if (paramLong == -9223372036854775807L) {
      l = 0L;
    }
    return l;
  }
  
  public v b(long paramLong)
  {
    int i = M.h(p, paramLong, true, false);
    v localv;
    if (i == -1) {
      localv = v.Y();
    } else {
      localv = (v)o.get(i);
    }
    return localv;
  }
  
  public int c(long paramLong)
  {
    int i = M.d(p, paramLong, false, false);
    if (i >= o.size()) {
      i = -1;
    }
    return i;
  }
  
  public long e(int paramInt)
  {
    boolean bool;
    if (paramInt < o.size()) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    return p[paramInt];
  }
  
  public int j()
  {
    return o.size();
  }
}

/* Location:
 * Qualified Name:     c1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */