package w5;

import java.util.Arrays;

public final class d$a
{
  public long a;
  public long b;
  public long c;
  public long d;
  public long e;
  public long f;
  public final boolean[] g = new boolean[15];
  public int h;
  
  public final boolean a()
  {
    boolean bool;
    if ((d > 15L) && (h == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b(long paramLong)
  {
    long l1 = d;
    if (l1 == 0L)
    {
      a = paramLong;
    }
    else if (l1 == 1L)
    {
      l1 = paramLong - a;
      b = l1;
      f = l1;
      e = 1L;
    }
    else
    {
      long l2 = paramLong - c;
      int i = (int)(l1 % 15L);
      boolean[] arrayOfBoolean;
      if (Math.abs(l2 - b) <= 1000000L)
      {
        e += 1L;
        f += l2;
        arrayOfBoolean = g;
        if (arrayOfBoolean[i] == 0) {
          break label169;
        }
        arrayOfBoolean[i] = false;
        i = h - 1;
      }
      else
      {
        arrayOfBoolean = g;
        if (arrayOfBoolean[i] != 0) {
          break label169;
        }
        arrayOfBoolean[i] = true;
        i = h + 1;
      }
      h = i;
    }
    label169:
    d += 1L;
    c = paramLong;
  }
  
  public final void c()
  {
    d = 0L;
    e = 0L;
    f = 0L;
    h = 0;
    Arrays.fill(g, false);
  }
}

/* Location:
 * Qualified Name:     w5.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */