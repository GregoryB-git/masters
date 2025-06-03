package l4;

import c4.i;
import c4.t;
import c4.t.a;
import c4.u;
import java.io.EOFException;
import java.io.IOException;
import v5.e0;
import x6.b;

public final class a
  implements f
{
  public final e a;
  public final long b;
  public final long c;
  public final h d;
  public int e;
  public long f;
  public long g;
  public long h;
  public long i;
  public long j;
  public long k;
  public long l;
  
  public a(h paramh, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    boolean bool;
    if ((paramLong1 >= 0L) && (paramLong2 > paramLong1)) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    d = paramh;
    b = paramLong1;
    c = paramLong2;
    if ((paramLong3 != paramLong2 - paramLong1) && (!paramBoolean))
    {
      e = 0;
    }
    else
    {
      f = paramLong4;
      e = 4;
    }
    a = new e();
  }
  
  public final t a()
  {
    a locala;
    if (f != 0L) {
      locala = new a();
    } else {
      locala = null;
    }
    return locala;
  }
  
  public final long b(i parami)
  {
    int m = e;
    long l2;
    long l3;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m == 4) {
              return -1L;
            }
            throw new IllegalStateException();
          }
        }
        else
        {
          if (i != j)
          {
            l1 = parami.getPosition();
            if (!a.b(parami, j))
            {
              l2 = i;
              if (l2 != l1) {
                break label341;
              }
              throw new IOException("No ogg page can be found.");
            }
            a.a(parami, false);
            parami.i();
            l3 = h;
            locale = a;
            l2 = b;
            l3 -= l2;
            m = d + e;
            if ((0L > l3) || (l3 >= 72000L)) {}
          }
          else
          {
            l2 = -1L;
            break label341;
          }
          boolean bool = l3 < 0L;
          if (bool)
          {
            j = l1;
            l = l2;
          }
          else
          {
            i = (parami.getPosition() + m);
            k = a.b;
          }
          long l1 = j;
          l2 = i;
          if (l1 - l2 < 100000L)
          {
            j = l2;
          }
          else
          {
            l1 = m;
            if (!bool) {
              l2 = 2L;
            } else {
              l2 = 1L;
            }
            long l4 = parami.getPosition();
            long l5 = j;
            long l6 = i;
            l2 = e0.j((l5 - l6) * l3 / (l - k) + (l4 - l1 * l2), l6, l5 - 1L);
          }
          label341:
          if (l2 != -1L) {
            return l2;
          }
          e = 3;
        }
        for (;;)
        {
          a.b(parami, -1L);
          a.a(parami, false);
          locale = a;
          if (b > h)
          {
            parami.i();
            e = 4;
            return -(k + 2L);
          }
          parami.j(d + e);
          i = parami.getPosition();
          k = a.b;
        }
      }
    }
    else
    {
      l3 = parami.getPosition();
      g = l3;
      e = 1;
      l2 = c - 65307L;
      if (l2 > l3) {
        return l2;
      }
    }
    e locale = a;
    a = 0;
    b = 0L;
    c = 0;
    d = 0;
    e = 0;
    if (locale.b(parami, -1L))
    {
      a.a(parami, false);
      locale = a;
      parami.j(d + e);
      do
      {
        locale = a;
        l2 = b;
        if (((a & 0x4) == 4) || (!locale.b(parami, -1L)) || (parami.getPosition() >= c) || (!a.a(parami, true))) {
          break;
        }
        locale = a;
        m = d;
        int n = e;
        try
        {
          parami.j(m + n);
          m = 1;
        }
        catch (EOFException localEOFException)
        {
          m = 0;
        }
      } while (m != 0);
      f = l2;
      e = 4;
      return g;
    }
    throw new EOFException();
  }
  
  public final void c(long paramLong)
  {
    h = e0.j(paramLong, 0L, f - 1L);
    e = 2;
    i = b;
    j = c;
    k = 0L;
    l = f;
  }
  
  public final class a
    implements t
  {
    public a() {}
    
    public final boolean e()
    {
      return true;
    }
    
    public final t.a g(long paramLong)
    {
      Object localObject = a.this;
      long l1 = d.i * paramLong / 1000000L;
      long l2 = b;
      long l3 = c;
      localObject = new u(paramLong, e0.j((l3 - l2) * l1 / f + l2 - 30000L, l2, l3 - 1L));
      return new t.a((u)localObject, (u)localObject);
    }
    
    public final long h()
    {
      a locala = a.this;
      h localh = d;
      return f * 1000000L / i;
    }
  }
}

/* Location:
 * Qualified Name:     l4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */