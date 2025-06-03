package v3;

import android.os.SystemClock;
import v5.e0;

public final class i
  implements m0
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
  
  public i(float paramFloat1, float paramFloat2, long paramLong1, float paramFloat3, long paramLong2, long paramLong3, float paramFloat4)
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
  
  public final float a(long paramLong1, long paramLong2)
  {
    if (h == -9223372036854775807L) {
      return 1.0F;
    }
    paramLong2 = paramLong1 - paramLong2;
    long l1 = r;
    float f1;
    float f2;
    if (l1 == -9223372036854775807L)
    {
      r = paramLong2;
      paramLong2 = 0L;
    }
    else
    {
      f1 = g;
      f2 = (float)l1;
      l1 = Math.max(paramLong2, ((1.0F - f1) * (float)paramLong2 + f2 * f1));
      r = l1;
      paramLong2 = Math.abs(paramLong2 - l1);
      l1 = s;
      f1 = g;
      f2 = (float)l1;
      paramLong2 = ((1.0F - f1) * (float)paramLong2 + f2 * f1);
    }
    s = paramLong2;
    if ((q != -9223372036854775807L) && (SystemClock.elapsedRealtime() - q < c)) {
      return p;
    }
    q = SystemClock.elapsedRealtime();
    paramLong2 = r;
    long l2 = s * 3L + paramLong2;
    if (m > l2)
    {
      paramLong2 = e0.I(c);
      f1 = p;
      f2 = (float)paramLong2;
      long l3 = ((f1 - 1.0F) * f2);
      long l4 = ((n - 1.0F) * f2);
      long l5 = j;
      int i1 = 1;
      long l6 = m;
      paramLong2 = l2;
      for (;;)
      {
        l1 = paramLong2;
        if (i1 >= 3) {
          break;
        }
        long l7 = new long[] { l2, l5, l6 - (l3 + l4) }[i1];
        paramLong2 = l1;
        if (l7 > l1) {
          paramLong2 = l7;
        }
        i1++;
      }
      m = l1;
    }
    else
    {
      l1 = e0.j(paramLong1 - (Math.max(0.0F, p - 1.0F) / d), m, l2);
      m = l1;
      paramLong2 = l;
      if ((paramLong2 != -9223372036854775807L) && (l1 > paramLong2)) {
        m = paramLong2;
      }
    }
    paramLong1 -= m;
    if (Math.abs(paramLong1) < e) {
      p = 1.0F;
    } else {
      p = e0.h(d * (float)paramLong1 + 1.0F, o, n);
    }
    return p;
  }
  
  public final long b()
  {
    return m;
  }
  
  public final void c()
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
  
  public final void d(o0.e parame)
  {
    h = e0.I(a);
    k = e0.I(b);
    l = e0.I(c);
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
    f();
  }
  
  public final void e(long paramLong)
  {
    i = paramLong;
    f();
  }
  
  public final void f()
  {
    long l1 = h;
    if (l1 != -9223372036854775807L)
    {
      long l2 = i;
      if (l2 != -9223372036854775807L) {
        l1 = l2;
      }
      long l3 = k;
      l2 = l1;
      if (l3 != -9223372036854775807L)
      {
        l2 = l1;
        if (l1 < l3) {
          l2 = l3;
        }
      }
      l3 = l;
      l1 = l2;
      if (l3 != -9223372036854775807L)
      {
        l1 = l2;
        if (l2 > l3) {
          l1 = l3;
        }
      }
    }
    else
    {
      l1 = -9223372036854775807L;
    }
    if (j == l1) {
      return;
    }
    j = l1;
    m = l1;
    r = -9223372036854775807L;
    s = -9223372036854775807L;
    q = -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     v3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */