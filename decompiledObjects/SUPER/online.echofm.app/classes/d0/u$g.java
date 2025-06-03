package d0;

import g0.M;

public final class u$g
{
  public static final g f = new a().f();
  public static final String g = M.w0(0);
  public static final String h = M.w0(1);
  public static final String i = M.w0(2);
  public static final String j = M.w0(3);
  public static final String k = M.w0(4);
  public final long a;
  public final long b;
  public final long c;
  public final float d;
  public final float e;
  
  public u$g(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramLong3;
    d = paramFloat1;
    e = paramFloat2;
  }
  
  public u$g(a parama)
  {
    this(a.a(parama), a.b(parama), a.c(parama), a.d(parama), a.e(parama));
  }
  
  public a a()
  {
    return new a(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof g)) {
      return false;
    }
    paramObject = (g)paramObject;
    if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    long l = a;
    int m = (int)(l ^ l >>> 32);
    l = b;
    int n = (int)(l ^ l >>> 32);
    l = c;
    int i1 = (int)(l >>> 32 ^ l);
    float f1 = d;
    int i2 = 0;
    int i3;
    if (f1 != 0.0F) {
      i3 = Float.floatToIntBits(f1);
    } else {
      i3 = 0;
    }
    f1 = e;
    if (f1 != 0.0F) {
      i2 = Float.floatToIntBits(f1);
    }
    return (((m * 31 + n) * 31 + i1) * 31 + i3) * 31 + i2;
  }
  
  public static final class a
  {
    public long a;
    public long b;
    public long c;
    public float d;
    public float e;
    
    public a()
    {
      a = -9223372036854775807L;
      b = -9223372036854775807L;
      c = -9223372036854775807L;
      d = -3.4028235E38F;
      e = -3.4028235E38F;
    }
    
    public a(u.g paramg)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
    }
    
    public u.g f()
    {
      return new u.g(this, null);
    }
    
    public a g(long paramLong)
    {
      c = paramLong;
      return this;
    }
    
    public a h(float paramFloat)
    {
      e = paramFloat;
      return this;
    }
    
    public a i(long paramLong)
    {
      b = paramLong;
      return this;
    }
    
    public a j(float paramFloat)
    {
      d = paramFloat;
      return this;
    }
    
    public a k(long paramLong)
    {
      a = paramLong;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.u.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */