package xc;

import ec.i;
import java.io.Closeable;
import java.util.Arrays;

public final class f$a
  implements Closeable
{
  public f a;
  public boolean b;
  public t c;
  public long d = -1L;
  public byte[] e;
  public int f = -1;
  public int o = -1;
  
  public final void close()
  {
    int i;
    if (a != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      a = null;
      c = null;
      d = -1L;
      e = null;
      f = -1;
      o = -1;
      return;
    }
    throw new IllegalStateException("not attached to a buffer".toString());
  }
  
  public final int f(long paramLong)
  {
    f localf = a;
    if (localf != null)
    {
      boolean bool1 = paramLong < -1L;
      if (!bool1)
      {
        long l1 = b;
        boolean bool2 = paramLong < l1;
        if (!bool2)
        {
          int j = -1;
          if ((bool1) && (bool2))
          {
            long l2 = 0L;
            Object localObject1 = a;
            t localt = c;
            long l3;
            if (localt != null)
            {
              l3 = d - (f - b);
              if (l3 > paramLong)
              {
                localObject2 = localt;
              }
              else
              {
                l2 = l3;
                localObject2 = localObject1;
                localObject1 = localt;
                l3 = l1;
              }
            }
            else
            {
              localObject2 = localObject1;
              l3 = l1;
            }
            l1 = l3;
            if (l3 - paramLong > paramLong - l2) {
              for (;;)
              {
                i.b(localObject1);
                l3 = c - b + l2;
                localObject2 = localObject1;
                if (paramLong < l3) {
                  break;
                }
                localObject1 = f;
                l2 = l3;
              }
            }
            while (l1 > paramLong)
            {
              i.b(localObject2);
              localObject2 = g;
              i.b(localObject2);
              l1 -= c - b;
            }
            l2 = l1;
            localObject1 = localObject2;
            if (b)
            {
              i.b(localObject2);
              localObject1 = localObject2;
              if (d)
              {
                localObject1 = a;
                localObject1 = Arrays.copyOf((byte[])localObject1, localObject1.length);
                i.d(localObject1, "copyOf(this, size)");
                localObject1 = new t((byte[])localObject1, b, c, false, true);
                if (a == localObject2) {
                  a = ((t)localObject1);
                }
                ((t)localObject2).b((t)localObject1);
                localObject2 = g;
                i.b(localObject2);
                ((t)localObject2).a();
              }
            }
            c = ((t)localObject1);
            d = paramLong;
            i.b(localObject1);
            e = a;
            j = b + (int)(paramLong - l2);
            f = j;
            int i = c;
            o = i;
            j = i - j;
          }
          else
          {
            c = null;
            d = paramLong;
            e = null;
            f = -1;
            o = -1;
          }
          return j;
        }
      }
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("offset=");
      ((StringBuilder)localObject2).append(paramLong);
      ((StringBuilder)localObject2).append(" > size=");
      ((StringBuilder)localObject2).append(b);
      throw new ArrayIndexOutOfBoundsException(((StringBuilder)localObject2).toString());
    }
    throw new IllegalStateException("not attached to a buffer".toString());
  }
}

/* Location:
 * Qualified Name:     xc.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */