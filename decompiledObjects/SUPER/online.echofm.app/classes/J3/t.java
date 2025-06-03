package J3;

public final class t
  extends B.e.d.c
{
  public final Double a;
  public final int b;
  public final boolean c;
  public final int d;
  public final long e;
  public final long f;
  
  public t(Double paramDouble, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    a = paramDouble;
    b = paramInt1;
    c = paramBoolean;
    d = paramInt2;
    e = paramLong1;
    f = paramLong2;
  }
  
  public Double b()
  {
    return a;
  }
  
  public int c()
  {
    return b;
  }
  
  public long d()
  {
    return f;
  }
  
  public int e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.c))
    {
      B.e.d.c localc = (B.e.d.c)paramObject;
      paramObject = a;
      if ((paramObject == null ? localc.b() != null : !((Double)paramObject).equals(localc.b())) || (b != localc.c()) || (c != localc.g()) || (d != localc.e()) || (e != localc.f()) || (f != localc.d())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long f()
  {
    return e;
  }
  
  public boolean g()
  {
    return c;
  }
  
  public int hashCode()
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Device{batteryLevel=");
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
  
  public static final class b
    extends B.e.d.c.a
  {
    public Double a;
    public Integer b;
    public Boolean c;
    public Integer d;
    public Long e;
    public Long f;
    
    public B.e.d.c a()
    {
      Object localObject1 = b;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" batteryVelocity");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (c == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" proximityOn");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (d == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" orientation");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (e == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" ramUsed");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (f == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" diskUsed");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new t(a, b.intValue(), c.booleanValue(), d.intValue(), e.longValue(), f.longValue(), null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.d.c.a b(Double paramDouble)
    {
      a = paramDouble;
      return this;
    }
    
    public B.e.d.c.a c(int paramInt)
    {
      b = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.d.c.a d(long paramLong)
    {
      f = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.c.a e(int paramInt)
    {
      d = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.d.c.a f(boolean paramBoolean)
    {
      c = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    public B.e.d.c.a g(long paramLong)
    {
      e = Long.valueOf(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */