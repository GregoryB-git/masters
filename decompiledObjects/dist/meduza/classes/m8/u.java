package m8;

import a0.j;
import f;

public final class u
  extends f0.e.d.c
{
  public final Double a;
  public final int b;
  public final boolean c;
  public final int d;
  public final long e;
  public final long f;
  
  public u(Double paramDouble, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    a = paramDouble;
    b = paramInt1;
    c = paramBoolean;
    d = paramInt2;
    e = paramLong1;
    f = paramLong2;
  }
  
  public final Double a()
  {
    return a;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final long c()
  {
    return f;
  }
  
  public final int d()
  {
    return d;
  }
  
  public final long e()
  {
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.c))
    {
      f0.e.d.c localc = (f0.e.d.c)paramObject;
      paramObject = a;
      if ((paramObject == null ? localc.a() != null : !((Double)paramObject).equals(localc.a())) || (b != localc.b()) || (c != localc.f()) || (d != localc.d()) || (e != localc.e()) || (f != localc.c())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final boolean f()
  {
    return c;
  }
  
  public final int hashCode()
  {
    Double localDouble = a;
    int i;
    if (localDouble == null) {
      i = 0;
    } else {
      i = localDouble.hashCode();
    }
    int j = b;
    int k;
    if (c) {
      k = 1231;
    } else {
      k = 1237;
    }
    int m = d;
    long l = e;
    int n = (int)(l ^ l >>> 32);
    l = f;
    return (((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Device{batteryLevel=");
    localStringBuilder.append(a);
    localStringBuilder.append(", batteryVelocity=");
    localStringBuilder.append(b);
    localStringBuilder.append(", proximityOn=");
    localStringBuilder.append(c);
    localStringBuilder.append(", orientation=");
    localStringBuilder.append(d);
    localStringBuilder.append(", ramUsed=");
    localStringBuilder.append(e);
    localStringBuilder.append(", diskUsed=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.e.d.c.a
  {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;
    
    public final u a()
    {
      if (g != 31)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        if ((g & 0x1) == 0) {
          localStringBuilder.append(" batteryVelocity");
        }
        if ((g & 0x2) == 0) {
          localStringBuilder.append(" proximityOn");
        }
        if ((g & 0x4) == 0) {
          localStringBuilder.append(" orientation");
        }
        if ((g & 0x8) == 0) {
          localStringBuilder.append(" ramUsed");
        }
        if ((g & 0x10) == 0) {
          localStringBuilder.append(" diskUsed");
        }
        throw new IllegalStateException(j.l("Missing required properties:", localStringBuilder));
      }
      return new u(a, b, c, d, e, f);
    }
  }
}

/* Location:
 * Qualified Name:     m8.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */