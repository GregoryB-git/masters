package k0;

import W2.k;
import g0.a;

public final class y0
{
  public final long a;
  public final float b;
  public final long c;
  
  public y0(b paramb)
  {
    a = b.a(paramb);
    b = b.b(paramb);
    c = b.c(paramb);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof y0)) {
      return false;
    }
    paramObject = (y0)paramObject;
    if ((a != a) || (b != b) || (c != c)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return k.b(new Object[] { Long.valueOf(a), Float.valueOf(b), Long.valueOf(c) });
  }
  
  public static final class b
  {
    public long a = -9223372036854775807L;
    public float b = -3.4028235E38F;
    public long c = -9223372036854775807L;
    
    public y0 d()
    {
      return new y0(this, null);
    }
    
    public b e(long paramLong)
    {
      boolean bool;
      if ((paramLong < 0L) && (paramLong != -9223372036854775807L)) {
        bool = false;
      } else {
        bool = true;
      }
      a.a(bool);
      c = paramLong;
      return this;
    }
    
    public b f(long paramLong)
    {
      a = paramLong;
      return this;
    }
    
    public b g(float paramFloat)
    {
      boolean bool;
      if ((paramFloat <= 0.0F) && (paramFloat != -3.4028235E38F)) {
        bool = false;
      } else {
        bool = true;
      }
      a.a(bool);
      b = paramFloat;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     k0.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */