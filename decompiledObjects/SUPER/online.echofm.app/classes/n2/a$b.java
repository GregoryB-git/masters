package n2;

public final class a$b
  extends e.a
{
  public Long a;
  public Integer b;
  public Integer c;
  public Long d;
  public Integer e;
  
  public e a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" maxStorageSizeInBytes");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" loadBatchSize");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" criticalSectionEnterTimeoutMs");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (d == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" eventCleanUpAge");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (e == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" maxBlobByteSizePerRow");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new a(a.longValue(), b.intValue(), c.intValue(), d.longValue(), e.intValue(), null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public e.a b(int paramInt)
  {
    c = Integer.valueOf(paramInt);
    return this;
  }
  
  public e.a c(long paramLong)
  {
    d = Long.valueOf(paramLong);
    return this;
  }
  
  public e.a d(int paramInt)
  {
    b = Integer.valueOf(paramInt);
    return this;
  }
  
  public e.a e(int paramInt)
  {
    e = Integer.valueOf(paramInt);
    return this;
  }
  
  public e.a f(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     n2.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */