package e2;

public final class f$b
  extends l.a
{
  public Long a;
  public Integer b;
  public Long c;
  public byte[] d;
  public String e;
  public Long f;
  public o g;
  
  public l a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" eventTimeMs");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (c == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" eventUptimeMs");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (f == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" timezoneOffsetSeconds");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new f(a.longValue(), b, c.longValue(), d, e, f.longValue(), g, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public l.a b(Integer paramInteger)
  {
    b = paramInteger;
    return this;
  }
  
  public l.a c(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
  
  public l.a d(long paramLong)
  {
    c = Long.valueOf(paramLong);
    return this;
  }
  
  public l.a e(o paramo)
  {
    g = paramo;
    return this;
  }
  
  public l.a f(byte[] paramArrayOfByte)
  {
    d = paramArrayOfByte;
    return this;
  }
  
  public l.a g(String paramString)
  {
    e = paramString;
    return this;
  }
  
  public l.a h(long paramLong)
  {
    f = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     e2.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */