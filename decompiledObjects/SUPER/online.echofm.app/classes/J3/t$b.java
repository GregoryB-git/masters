package J3;

public final class t$b
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

/* Location:
 * Qualified Name:     J3.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */