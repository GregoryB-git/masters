package k0;

import a3.h;
import android.os.SystemClock;
import d0.u.g;
import g0.M;
import g0.a;

public final class q
  implements w0
{
  public final float a;
  public final float b;
  public final long c;
  public final float d;
  public final long e;
  public final long f;
  public final float g;
  public long h;
  public long i;
  public long j;
  public long k;
  public long l;
  public long m;
  public float n;
  public float o;
  public float p;
  public long q;
  public long r;
  public long s;
  
  public q(float paramFloat1, float paramFloat2, long paramLong1, float paramFloat3, long paramLong2, long paramLong3, float paramFloat4)
  {
    a = paramFloat1;
    b = paramFloat2;
    c = paramLong1;
    d = paramFloat3;
    e = paramLong2;
    f = paramLong3;
    g = paramFloat4;
    h = -9223372036854775807L;
    i = -9223372036854775807L;
    k = -9223372036854775807L;
    l = -9223372036854775807L;
    o = paramFloat1;
    n = paramFloat2;
    p = 1.0F;
    q = -9223372036854775807L;
    j = -9223372036854775807L;
    m = -9223372036854775807L;
    r = -9223372036854775807L;
    s = -9223372036854775807L;
  }
  
  public static long h(long paramLong1, long paramLong2, float paramFloat)
  {
    return ((float)paramLong1 * paramFloat + (1.0F - paramFloat) * (float)paramLong2);
  }
  
  public void a()
  {
    long l1 = m;
    if (l1 == -9223372036854775807L) {
      return;
    }
    long l2 = l1 + f;
    m = l2;
    l1 = l;
    if ((l1 != -9223372036854775807L) && (l2 > l1)) {
      m = l1;
    }
    q = -9223372036854775807L;
  }
  
  public void b(u.g paramg)
  {
    h = M.J0(a);
    k = M.J0(b);
    l = M.J0(c);
    float f1 = d;
    if (f1 == -3.4028235E38F) {
      f1 = a;
    }
    o = f1;
    float f2 = e;
    if (f2 == -3.4028235E38F) {
      f2 = b;
    }
    n = f2;
    if ((f1 == 1.0F) && (f2 == 1.0F)) {
      h = -9223372036854775807L;
    }
    g();
  }
  
  public float c(long paramLong1, long paramLong2)
  {
    if (h == -9223372036854775807L) {
      return 1.0F;
    }
    i(paramLong1, paramLong2);
    if ((q != -9223372036854775807L) && (SystemClock.elapsedRealtime() - q < c)) {
      return p;
    }
    q = SystemClock.elapsedRealtime();
    f(paramLong1);
    paramLong1 -= m;
    if (Math.abs(paramLong1) < e) {
      p = 1.0F;
    } else {
      p = M.o(d * (float)paramLong1 + 1.0F, o, n);
    }
    return p;
  }
  
  public void d(long paramLong)
  {
    i = paramLong;
    g();
  }
  
  public long e()
  {
    return m;
  }
  
  public final void f(long paramLong)
  {
    long l1 = r + s * 3L;
    if (m > l1)
    {
      paramLong = M.J0(c);
      float f1 = p;
      float f2 = (float)paramLong;
      long l2 = ((f1 - 1.0F) * f2);
      paramLong = ((n - 1.0F) * f2);
      m = h.c(new long[] { l1, j, m - (l2 + paramLong) });
    }
    else
    {
      paramLong = M.q(paramLong - (Math.max(0.0F, p - 1.0F) / d), m, l1);
      m = paramLong;
      l1 = l;
      if ((l1 != -9223372036854775807L) && (paramLong > l1)) {
        m = l1;
      }
    }
  }
  
  public final void g()
  {
    long l1 = h;
    long l2;
    if (l1 != -9223372036854775807L)
    {
      l2 = i;
      if (l2 == -9223372036854775807L)
      {
        long l3 = k;
        l2 = l1;
        if (l3 != -9223372036854775807L)
        {
          l2 = l1;
          if (l1 < l3) {
            l2 = l3;
          }
        }
        l1 = l;
        if ((l1 != -9223372036854775807L) && (l2 > l1)) {
          l2 = l1;
        }
      }
    }
    else
    {
      l2 = -9223372036854775807L;
    }
    if (j == l2) {
      return;
    }
    j = l2;
    m = l2;
    r = -9223372036854775807L;
    s = -9223372036854775807L;
    q = -9223372036854775807L;
  }
  
  public final void i(long paramLong1, long paramLong2)
  {
    paramLong1 -= paramLong2;
    paramLong2 = r;
    if (paramLong2 == -9223372036854775807L) {
      r = paramLong1;
    }
    for (paramLong1 = 0L;; paramLong1 = h(s, paramLong1, g))
    {
      s = paramLong1;
      break;
      paramLong2 = Math.max(paramLong1, h(paramLong2, paramLong1, g));
      r = paramLong2;
      paramLong1 = Math.abs(paramLong1 - paramLong2);
    }
  }
  
  public static final class b
  {
    public float a = 0.97F;
    public float b = 1.03F;
    public long c = 1000L;
    public float d = 1.0E-7F;
    public long e = M.J0(20L);
    public long f = M.J0(500L);
    public float g = 0.999F;
    
    public q a()
    {
      return new q(a, b, c, d, e, f, g, null);
    }
    
    public b b(float paramFloat)
    {
      boolean bool;
      if (paramFloat >= 1.0F) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      b = paramFloat;
      return this;
    }
    
    public b c(float paramFloat)
    {
      boolean bool;
      if ((0.0F < paramFloat) && (paramFloat <= 1.0F)) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      a = paramFloat;
      return this;
    }
    
    public b d(long paramLong)
    {
      boolean bool;
      if (paramLong > 0L) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      e = M.J0(paramLong);
      return this;
    }
    
    public b e(float paramFloat)
    {
      boolean bool;
      if ((paramFloat >= 0.0F) && (paramFloat < 1.0F)) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      g = paramFloat;
      return this;
    }
    
    public b f(long paramLong)
    {
      boolean bool;
      if (paramLong > 0L) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      c = paramLong;
      return this;
    }
    
    public b g(float paramFloat)
    {
      boolean bool;
      if (paramFloat > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      d = (paramFloat / 1000000.0F);
      return this;
    }
    
    public b h(long paramLong)
    {
      boolean bool;
      if (paramLong >= 0L) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      f = M.J0(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     k0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */