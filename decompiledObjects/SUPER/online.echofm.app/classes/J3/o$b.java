package J3;

public final class o$b
  extends B.e.d.a.b.a.a
{
  public Long a;
  public Long b;
  public String c;
  public String d;
  
  public B.e.d.a.b.a a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" baseAddress");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" size");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" name");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new o(a.longValue(), b.longValue(), c, d, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public B.e.d.a.b.a.a b(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
  
  public B.e.d.a.b.a.a c(String paramString)
  {
    if (paramString != null)
    {
      c = paramString;
      return this;
    }
    throw new NullPointerException("Null name");
  }
  
  public B.e.d.a.b.a.a d(long paramLong)
  {
    b = Long.valueOf(paramLong);
    return this;
  }
  
  public B.e.d.a.b.a.a e(String paramString)
  {
    d = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     J3.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */