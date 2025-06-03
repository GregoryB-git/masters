package X0;

import F0.s;
import d0.A;
import java.util.ArrayDeque;

public final class a
  implements c
{
  public final byte[] a = new byte[8];
  public final ArrayDeque b = new ArrayDeque();
  public final g c = new g();
  public b d;
  public int e;
  public int f;
  public long g;
  
  public static String g(s params, int paramInt)
  {
    if (paramInt == 0) {
      return "";
    }
    byte[] arrayOfByte = new byte[paramInt];
    params.readFully(arrayOfByte, 0, paramInt);
    while ((paramInt > 0) && (arrayOfByte[(paramInt - 1)] == 0)) {
      paramInt--;
    }
    return new String(arrayOfByte, 0, paramInt);
  }
  
  public final long a(s params)
  {
    params.h();
    for (;;)
    {
      params.n(a, 0, 4);
      int i = g.c(a[0]);
      if ((i != -1) && (i <= 4))
      {
        int j = (int)g.a(a, i, false);
        if (d.d(j))
        {
          params.i(i);
          return j;
        }
      }
      params.i(1);
    }
  }
  
  public void b()
  {
    e = 0;
    b.clear();
    c.e();
  }
  
  public boolean c(s params)
  {
    g0.a.h(d);
    for (;;)
    {
      b localb = (b)b.peek();
      if ((localb != null) && (params.p() >= b.a(localb)))
      {
        d.a(b.b((b)b.pop()));
        return true;
      }
      long l1;
      long l2;
      if (e == 0)
      {
        l1 = c.d(params, true, false, 4);
        l2 = l1;
        if (l1 == -2L) {
          l2 = a(params);
        }
        if (l2 == -1L) {
          return false;
        }
        f = ((int)l2);
        e = 1;
      }
      if (e == 1)
      {
        g = c.d(params, false, true, 8);
        e = 2;
      }
      int i = d.b(f);
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i == 5)
                {
                  l2 = g;
                  if ((l2 != 4L) && (l2 != 8L))
                  {
                    params = new StringBuilder();
                    params.append("Invalid float size: ");
                    params.append(g);
                    throw A.a(params.toString(), null);
                  }
                  d.c(f, e(params, (int)l2));
                  e = 0;
                  return true;
                }
                params = new StringBuilder();
                params.append("Invalid element type ");
                params.append(i);
                throw A.a(params.toString(), null);
              }
              d.e(f, (int)g, params);
              e = 0;
              return true;
            }
            l2 = g;
            if (l2 <= 2147483647L)
            {
              d.f(f, g(params, (int)l2));
              e = 0;
              return true;
            }
            params = new StringBuilder();
            params.append("String element size: ");
            params.append(g);
            throw A.a(params.toString(), null);
          }
          l2 = g;
          if (l2 <= 8L)
          {
            d.h(f, f(params, (int)l2));
            e = 0;
            return true;
          }
          params = new StringBuilder();
          params.append("Invalid integer size: ");
          params.append(g);
          throw A.a(params.toString(), null);
        }
        l2 = params.p();
        l1 = g;
        b.push(new b(f, l1 + l2, null));
        d.g(f, l2, g);
        e = 0;
        return true;
      }
      params.i((int)g);
      e = 0;
    }
  }
  
  public void d(b paramb)
  {
    d = paramb;
  }
  
  public final double e(s params, int paramInt)
  {
    long l = f(params, paramInt);
    double d1;
    if (paramInt == 4) {
      d1 = Float.intBitsToFloat((int)l);
    } else {
      d1 = Double.longBitsToDouble(l);
    }
    return d1;
  }
  
  public final long f(s params, int paramInt)
  {
    byte[] arrayOfByte = a;
    int i = 0;
    params.readFully(arrayOfByte, 0, paramInt);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | a[i] & 0xFF;
      i++;
    }
    return l;
  }
  
  public static final class b
  {
    public final int a;
    public final long b;
    
    public b(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     X0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */