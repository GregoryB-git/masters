package k0;

import g0.M;
import g0.a;

public final class q$b
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

/* Location:
 * Qualified Name:     k0.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */