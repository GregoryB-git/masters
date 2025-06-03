package n2;

public final class a
  extends e
{
  public final long b;
  public final int c;
  public final int d;
  public final long e;
  public final int f;
  
  public a(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3)
  {
    b = paramLong1;
    c = paramInt1;
    d = paramInt2;
    e = paramLong2;
    f = paramInt3;
  }
  
  public int b()
  {
    return d;
  }
  
  public long c()
  {
    return e;
  }
  
  public int d()
  {
    return c;
  }
  
  public int e()
  {
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof e))
    {
      paramObject = (e)paramObject;
      if ((b != ((e)paramObject).f()) || (c != ((e)paramObject).d()) || (d != ((e)paramObject).b()) || (e != ((e)paramObject).c()) || (f != ((e)paramObject).e())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long f()
  {
    return b;
  }
  
  public int hashCode()
  {
    long l = b;
    int i = (int)(l ^ l >>> 32);
    int j = c;
    int k = d;
    l = e;
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ f;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EventStoreConfig{maxStorageSizeInBytes=");
    localStringBuilder.append(b);
    localStringBuilder.append(", loadBatchSize=");
    localStringBuilder.append(c);
    localStringBuilder.append(", criticalSectionEnterTimeoutMs=");
    localStringBuilder.append(d);
    localStringBuilder.append(", eventCleanUpAge=");
    localStringBuilder.append(e);
    localStringBuilder.append(", maxBlobByteSizePerRow=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     n2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */