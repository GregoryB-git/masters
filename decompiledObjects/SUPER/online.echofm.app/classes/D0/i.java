package D0;

import java.util.Arrays;

public final class i
{
  public a a = new a();
  public a b = new a();
  public boolean c;
  public boolean d;
  public long e = -9223372036854775807L;
  public int f;
  
  public long a()
  {
    long l;
    if (e()) {
      l = a.a();
    } else {
      l = -9223372036854775807L;
    }
    return l;
  }
  
  public float b()
  {
    float f1;
    if (e()) {
      f1 = (float)(1.0E9D / a.a());
    } else {
      f1 = -1.0F;
    }
    return f1;
  }
  
  public int c()
  {
    return f;
  }
  
  public long d()
  {
    long l;
    if (e()) {
      l = a.b();
    } else {
      l = -9223372036854775807L;
    }
    return l;
  }
  
  public boolean e()
  {
    return a.e();
  }
  
  public void f(long paramLong)
  {
    a.f(paramLong);
    boolean bool = a.e();
    int i = 0;
    if ((bool) && (!d))
    {
      c = false;
    }
    else if (e != -9223372036854775807L)
    {
      if ((!c) || (b.d()))
      {
        b.g();
        b.f(e);
      }
      c = true;
      b.f(paramLong);
    }
    if ((c) && (b.e()))
    {
      a locala = a;
      a = b;
      b = locala;
      c = false;
      d = false;
    }
    e = paramLong;
    if (!a.e()) {
      i = f + 1;
    }
    f = i;
  }
  
  public void g()
  {
    a.g();
    b.g();
    c = false;
    e = -9223372036854775807L;
    f = 0;
  }
  
  public static final class a
  {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g = new boolean[15];
    public int h;
    
    public static int c(long paramLong)
    {
      return (int)(paramLong % 15L);
    }
    
    public long a()
    {
      long l1 = e;
      long l2 = 0L;
      if (l1 != 0L) {
        l2 = f / l1;
      }
      return l2;
    }
    
    public long b()
    {
      return f;
    }
    
    public boolean d()
    {
      long l = d;
      if (l == 0L) {
        return false;
      }
      return g[c(l - 1L)];
    }
    
    public boolean e()
    {
      boolean bool;
      if ((d > 15L) && (h == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void f(long paramLong)
    {
      long l1 = d;
      if (l1 == 0L)
      {
        a = paramLong;
      }
      else
      {
        long l2;
        if (l1 == 1L)
        {
          l2 = paramLong - a;
          b = l2;
          f = l2;
          e = 1L;
        }
        else
        {
          l2 = paramLong - c;
          int i = c(l1);
          boolean[] arrayOfBoolean;
          if (Math.abs(l2 - b) <= 1000000L)
          {
            e += 1L;
            f += l2;
            arrayOfBoolean = g;
            if (arrayOfBoolean[i] != 0) {
              arrayOfBoolean[i] = false;
            }
          }
          else
          {
            for (i = h - 1;; i = h + 1)
            {
              h = i;
              break;
              arrayOfBoolean = g;
              if (arrayOfBoolean[i] != 0) {
                break;
              }
              arrayOfBoolean[i] = true;
            }
          }
        }
      }
      d += 1L;
      c = paramLong;
    }
    
    public void g()
    {
      d = 0L;
      e = 0L;
      f = 0L;
      h = 0;
      Arrays.fill(g, false);
    }
  }
}

/* Location:
 * Qualified Name:     D0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */