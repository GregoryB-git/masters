package J3;

public final class s$b
  extends B.e.d.a.b.e.b.a
{
  public Long a;
  public String b;
  public String c;
  public Long d;
  public Integer e;
  
  public B.e.d.a.b.e.b a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" pc");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" symbol");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (d == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" offset");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (e == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" importance");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new s(a.longValue(), b, c, d.longValue(), e.intValue(), null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.e.d.a.b.e.b.a b(String paramString)
  {
    c = paramString;
    return this;
  }
  
  public B.e.d.a.b.e.b.a c(int paramInt)
  {
    e = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.e.d.a.b.e.b.a d(long paramLong)
  {
    d = Long.valueOf(paramLong);
    return this;
  }
  
  public B.e.d.a.b.e.b.a e(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
  
  public B.e.d.a.b.e.b.a f(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null symbol");
  }
}

/* Location:
 * Qualified Name:     J3.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */