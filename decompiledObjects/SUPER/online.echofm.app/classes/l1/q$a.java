package l1;

import F0.T;

public final class q$a
{
  public final T a;
  public long b;
  public boolean c;
  public int d;
  public long e;
  public boolean f;
  public boolean g;
  public boolean h;
  public boolean i;
  public boolean j;
  public long k;
  public long l;
  public boolean m;
  
  public q$a(T paramT)
  {
    a = paramT;
  }
  
  public static boolean c(int paramInt)
  {
    boolean bool;
    if (((32 <= paramInt) && (paramInt <= 35)) || (paramInt == 39)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean d(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 32) && (paramInt != 40)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void a(long paramLong)
  {
    m = c;
    e((int)(paramLong - b));
    k = b;
    b = paramLong;
    e(0);
    i = false;
  }
  
  public void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    if ((j) && (g))
    {
      m = c;
      j = false;
    }
    else if ((h) || (g))
    {
      if ((paramBoolean) && (i)) {
        e(paramInt + (int)(paramLong - b));
      }
      k = b;
      l = e;
      m = c;
      i = true;
    }
  }
  
  public final void e(int paramInt)
  {
    long l1 = l;
    if (l1 == -9223372036854775807L) {
      return;
    }
    int n = m;
    int i1 = (int)(b - k);
    a.b(l1, n, i1, paramInt, null);
  }
  
  public void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (f)
    {
      int n = d;
      int i1 = paramInt1 + 2 - n;
      if (i1 < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[i1] & 0x80) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        g = bool;
        f = false;
      }
      else
      {
        d = (n + (paramInt2 - paramInt1));
      }
    }
  }
  
  public void g()
  {
    f = false;
    g = false;
    h = false;
    i = false;
    j = false;
  }
  
  public void h(long paramLong1, int paramInt1, int paramInt2, long paramLong2, boolean paramBoolean)
  {
    boolean bool = false;
    g = false;
    h = false;
    e = paramLong2;
    d = 0;
    b = paramLong1;
    if (!d(paramInt2))
    {
      if ((i) && (!j))
      {
        if (paramBoolean) {
          e(paramInt1);
        }
        i = false;
      }
      if (c(paramInt2))
      {
        h = (j ^ true);
        j = true;
      }
    }
    if ((paramInt2 >= 16) && (paramInt2 <= 21)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    c = paramBoolean;
    if (!paramBoolean)
    {
      paramBoolean = bool;
      if (paramInt2 > 9) {}
    }
    else
    {
      paramBoolean = true;
    }
    f = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     l1.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */